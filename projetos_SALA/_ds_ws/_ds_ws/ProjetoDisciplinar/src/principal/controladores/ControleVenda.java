package principal.controladores;

import principal.db.Banco;
import principal.modelos.Venda;
import principal.modelos.Bebida;
import principal.modelos.Produto;

public class ControleVenda {
	
	public static Venda venda;

	public static void adicionar(Venda venda) {
		Banco.vendas.add(venda);
	}
	
	public static void adicionar(Produto produto) {
		ControleVenda.venda.addProduto(produto);
	}

	public static Venda buscar(Integer codigo) {
		for (Venda venda : Banco.vendas) {
			if (venda.codigo == codigo) {
				return venda;
			}
		}
		return null;
	}

	public static Integer getNovoCodigo() {
		Integer novoCodigo = 0;
		for (Venda venda : Banco.vendas) {
			if (venda.codigo > novoCodigo) {
				novoCodigo = venda.codigo;
			}
		}
		return novoCodigo + 1;
	}

	public static void cancelar(Integer codigo, Venda vendaCancelar) {
		for (int i = 0; i < Banco.vendas.size(); i++) {
			Venda venda = Banco.vendas.get(i);
			if (venda.codigo == codigo) {
				Banco.vendas.set(i, vendaCancelar);
				break;
			}
		}
	}
}

