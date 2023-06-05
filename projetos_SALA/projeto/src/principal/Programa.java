package principal;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import principal.modelos.Pessoa;

public class Programa {
	
	
	public static void main(String[] args) {
		
		//Criação do Objeto Pessoa:
		
		Pessoa p = new Pessoa("Ana", "12345");
		
		//Configuração do JPA:
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exe_mysql");
		EntityManager em = emf.createEntityManager();
		
		//Gravação da Pessoa no B.D:
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();	
		
		//Encerrar a Conexão:
		
		em.close();
		emf.close();
	}

}
