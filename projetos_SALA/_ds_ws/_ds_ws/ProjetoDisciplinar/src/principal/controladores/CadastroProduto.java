package principal.controladores;

import principal.db.Banco;
import principal.modelos.Produto;
import principal.modelos.Sorvete;
import principal.modelos.Adicional;
import principal.modelos.Bebida;


public class CadastroProduto {
	
//Funções Sorvete <------------------------------------------->

	public static void adicionar(Sorvete sorvete) {
		Banco.sorvetes.add(sorvete);
	}

	public static void atualizar(int indexAlterar, Sorvete sorveteAlterado) {
		Banco.sorvetes.set(indexAlterar, sorveteAlterado);
	}
	
	public static void atualizar(String nomeOriginal, Sorvete sorveteAlterado) {
		for (int i = 0; i < Banco.sorvetes.size(); i++) {
			Sorvete sorvete = Banco.sorvetes.get(i);
			if (sorvete.getNome().equalsIgnoreCase(nomeOriginal)) {
				Banco.sorvetes.set(i, sorveteAlterado);
				break;
			}
		}
	}

	public static Sorvete buscar(String nome) {
		Sorvete sorveteRetorno = null;
		for (Sorvete sorvete : Banco.sorvetes) {
			if (sorvete.getNome().equalsIgnoreCase(nome)) {
				sorveteRetorno = sorvete;
				break;
			}
		}
		return sorveteRetorno;
	}

	public static boolean excluir(String nome) {
		boolean sorveteExcluido = false;
		for (int i = 0; i < Banco.sorvetes.size(); i++) {
			Sorvete sorvete = Banco.sorvetes.get(i);
			if (sorvete.getNome().equalsIgnoreCase(nome)) {
				Banco.sorvetes.remove(i);
				sorveteExcluido = true;
				break;
			}
		}
		return sorveteExcluido;
	}

//Funções Bebidas <------------------------------------------->

	public static void adicionar(Bebida bebida) {
		Banco.bebidas.add(bebida);
	}

	public static void atualizar(int indexAlterar, Bebida bebidaAlterado) {
		Banco.bebidas.set(indexAlterar, bebidaAlterado);
	}

	public static void atualizar(String nomeOriginal, Bebida bebidaAlterado) {
		for (int i = 0; i < Banco.bebidas.size(); i++) {
				Bebida bebida = Banco.bebidas.get(i);
			if (bebida.getNome().equalsIgnoreCase(nomeOriginal)) {
				Banco.bebidas.set(i, bebidaAlterado);
			break;
		}
	}
}

	public static Bebida buscar2(String nome) {
			Bebida bebidaRetorno = null;
		for (Bebida bebida : Banco.bebidas) {
			if (bebida.getNome().equalsIgnoreCase(nome)) {
				bebidaRetorno = bebida;
			break;
		}
	}
	return bebidaRetorno;
}

	public static boolean excluir2(String nome) {
		boolean bebidaExcluido = false;
		for (int i = 0; i < Banco.bebidas.size(); i++) {
				Bebida bebida = Banco.bebidas.get(i);
			if (bebida.getNome().equalsIgnoreCase(nome)) {
				Banco.bebidas.remove(i);
				bebidaExcluido = true;
			break;
		}
	}
	return bebidaExcluido;
}


// Funções Adicionais<------------------------------------------------->


	public static void adicionar(Adicional adicional) {
		Banco.adicionais.add(adicional);
	}

	public static void atualizar(int indexAlterar, Adicional adicionalAlterado) {
		Banco.adicionais.set(indexAlterar, adicionalAlterado);
	}

	public static void atualizar(String nomeOriginal, Adicional adicionalAlterado) {
		for (int i = 0; i < Banco.adicionais.size(); i++) {
				Adicional adicional = Banco.adicionais.get(i);
			if (adicional.getNome().equalsIgnoreCase(nomeOriginal)) {
				Banco.adicionais.set(i, adicionalAlterado);
			break;
		}
	}
}

	public static Adicional buscar3(String nome) {
			Adicional adicionalRetorno = null;
		for (Adicional adicional : Banco.adicionais) {
			if (adicional.getNome().equalsIgnoreCase(nome)) {
				adicionalRetorno = adicional;
			break;
		}
	}
	return adicionalRetorno;
}

	public static boolean excluir3(String nome) {
		boolean adicionalExcluido = false;
		for (int i = 0; i < Banco.adicionais.size(); i++) {
				Adicional adicional = Banco.adicionais.get(i);
			if (adicional.getNome().equalsIgnoreCase(nome)) {
				Banco.adicionais.remove(i);
				adicionalExcluido = true;
			break;
		}
	}
	return adicionalExcluido;
	}
}