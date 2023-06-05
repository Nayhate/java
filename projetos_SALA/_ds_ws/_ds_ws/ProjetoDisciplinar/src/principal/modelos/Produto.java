package principal.modelos;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Nome;
	private String Sabor;
	private double Preco;
	
	//---------------------------------------------------------//
	
	//CONSTRUCT
	
	public Produto(String nome, String sabor, double preco) {
		this.Nome = nome;
		this.Sabor = sabor;
		this.Preco = preco;
		
	}
	
	//---------------------------------------------------------//
	
	// GETTERS 
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return Nome;
	}
	public String getSabor() {
		return Sabor;
	}
	public double getPreco() {
		return Preco;
	}
	
	//---------------------------------------------------------//
	
	//SETTERS
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public void setSabor(String sabor) {
		Sabor = sabor;
	}
	
	public void setPreco(double preco) {
		Preco = preco;
	}

	public String toJS() {
		// TODO Auto-generated method stub
		return null;
	}	
}
