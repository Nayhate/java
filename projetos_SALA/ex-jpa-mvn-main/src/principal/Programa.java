package principal;

import java.util.List;

import jakarta.persistence.*;
import principal.modelos.Pessoa;

public class Programa {
	
	static EntityManagerFactory emf;
	static EntityManager em;

	public static void main(String[] args) {
		
		//Configuração do JPA
				emf = Persistence.createEntityManagerFactory("ex_mysql");
				em = emf.createEntityManager();
				
		//Criação do objeto pessoa
		Pessoa p = new Pessoa("Paulo", "789712");
		//salvar(p);
		
		//Buscar pessoa no banco:	
				
		Pessoa p2 = buscarPorId(2);
		
		System.out.println("---------------");
		System.out.println("ID: " + p2.getId() + " Nome: " + p2.getNome() + " CPF: " + p2.getCpf());
		System.out.println("---------------");
		
		//Atualizar por ID:
		
		p2.setNome("Paulo Alberto");
		atualizar(p2);
		
		//Excluir do Banco de Dados:
		//apagar(5);
		
		System.out.println("LISTA E PESSOAS");		
		//Listar pessoas no banco:
		List<Pessoa> lista = listar();
		for (Pessoa pessoa : lista) {
			System.out.println("ID: " + pessoa.getId() + " Nome: " + pessoa.getNome() + " CPF: " + pessoa.getCpf());
		}
		
		
		//Encerrar a conexão
		em.close();
		emf.close();
		
	}
	
	public static Integer salvar(Pessoa pessoa) {
		
		//Gravação da pessoa no banco de dados
				em.getTransaction().begin();
				em.persist(pessoa);
				em.getTransaction().commit();
				return pessoa.getId();
		
	}
	public static Integer atualizar(Pessoa pessoa) {
		
		//Atualização da pessoa no banco de dados
				em.getTransaction().begin();
				em.merge(pessoa);
				em.getTransaction().commit();
				return pessoa.getId();
		
	}
	
	public static List<Pessoa> listar(){
		//Listar pessoas
		List<Pessoa> lista = em.createQuery("from Pessoa", Pessoa.class).getResultList();
		
		return lista;
		
	}
	
	public static Pessoa buscarPorId(Integer id) {
		//Buscar pessoa por ID
		Pessoa pessoa = em.find(Pessoa.class, id);
		return pessoa;
	}
	
	public static void apagar(Integer id) {
		
		Pessoa pessoa = em.find(Pessoa.class, id);
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
	}	
}
