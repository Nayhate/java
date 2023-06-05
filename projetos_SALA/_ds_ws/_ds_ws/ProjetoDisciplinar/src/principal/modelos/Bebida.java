package principal.modelos;

public class Bebida  extends Produto{
	
	//TIPO = Refrigerante, FABRICANTE = Coca-Cola, MARCA = Fanta, TAMANHO = Lata(350ml), SABOR = Laranja.
	
	private TipoBebida tipo;
	private String fabricante;
	private String marca;
	private String tamanho;	
	
	public Bebida(String nome, String sabor, double preco, TipoBebida tipo, String fabricante, String marca, String tamanho) {
		super(nome, sabor, preco);
		this.tipo = tipo;
		this.fabricante = fabricante;
		this.marca = marca;
		this.tamanho = tamanho;
		// TODO Auto-generated constructor stub
	}
	
	//---------------------------------------------------------//
	
	//GETTERS
	
	public TipoBebida getTipo() {
		return tipo;
	}	
	public String getFabricante() {
		return fabricante;
	}	
	public String getMarca() {
		return marca;
	}	
	
	public String getTamanho() {
		return tamanho;
	}	

	
	//---------------------------------------------------------//
	
	//SETTERS
	
	public void setTipo(TipoBebida tipo) {
		this.tipo = tipo;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
}
	

	



