package principal.modelos;

import java.util.ArrayList;
import java.util.List;

public class Sorvete extends Produto{
	
	//---------------------------------------------------------//
	
	//CONSTRUCT
	
	public Sorvete(String nome, String sabor, double preco) {
		super(nome, sabor, preco);		
	}
	
	//---------------------------------------------------------//
	
	
	// LIST
	
	private List<Adicional> adicional = new ArrayList<Adicional>();
	
	public void adicionar(Adicional adicional) {
		this.adicional.add(adicional);
	}
	
	public void remover(Adicional adicional) {
		this.adicional.remove(adicional);
	}
}
