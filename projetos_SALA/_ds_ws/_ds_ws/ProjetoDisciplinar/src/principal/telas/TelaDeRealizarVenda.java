package principal.telas;

import principal.controladores.CadastroProduto;
import principal.controladores.ControleVenda;
import principal.db.Banco;
import principal.modelos.Bebida;
import principal.modelos.Venda;
import principal.modelos.Venda.Status;
import principal.util.Prompt;

public class TelaDeRealizarVenda {
	public static void mostrar() {
		Prompt.linhaEmBranco();
		
		Prompt.imprimir("[1] Realizar nova Venda.");
		Prompt.imprimir("[2] Finalizar Venda.");
		Prompt.imprimir("[3] Voltar para a tela de gerenciamento.");
		
		
		Integer opcao = Prompt.lerInteiro();
		
		switch(opcao){
			case 1:{
				TelaDeRealizarVenda.selecionarProdutos();
				break;
			}
			case 2: {
				TelaDeRealizarVenda.finalizarVenda();
				break;
			}
			case 3:{
				TelaDeGerenciamento.mostrar();
				break;
			}
		}
	}

		private static void selecionarProdutos() {

			Prompt.linhaEmBranco();
			Prompt.imprimir("Lista de Produtos");
			
			if (Banco.bebidas.isEmpty()) {
				Prompt.imprimir("Item não Encontrado"); 
			} else {
				for (Bebida bebida : Banco.bebidas) {
					Prompt.imprimir(bebida.getNome());
				}
			}
			
			Prompt.linhaEmBranco();
			String nome = Prompt.lerLinha("Informe o Nome do Produto");	
			
			if (!nome.isEmpty()) {
				Bebida bebida = CadastroProduto.buscar2(nome);
				
				if (bebida != null) {
					ControleVenda.adicionar(bebida);
					Prompt.linhaEmBranco();
					Prompt.imprimir("Produto Selecionado");
					Prompt.linhaEmBranco();
					Prompt.imprimir("Deseja selecionar mais Bebida?");
					Prompt.imprimir("[1] Sim");
					Prompt.imprimir("[2] Não");
					int opcao = Prompt.lerInteiro();
					if (opcao == 1) {
						TelaDeRealizarVenda.selecionarProdutos();
					}
				} else {
					Prompt.linhaEmBranco();
					Prompt.imprimir("Não Encontrado");
					Prompt.linhaEmBranco();
					Prompt.pressionarEnter();
				}
			}
			TelaDeRealizarVenda.mostrar();
		}

		private static void finalizarVenda() {
			Venda venda = ControleVenda.venda;
			venda.Status = Status.CONCLUIDO;
			ControleVenda.adicionar(venda);
			ControleVenda.venda = null;
			TelaDeGerenciamentoDeVenda.listar();
		}
	}
