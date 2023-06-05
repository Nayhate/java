package principal.controladores;

import principal.db.Banco;
import principal.modelos.Funcionario;


public class CadastroFuncionario {

public static void adicionar(Funcionario funcionario) {
		Banco.funcionarios.add(funcionario);
	}
	
public static Funcionario buscar(String nome) {
	Funcionario funcionarioRetorno = null;
	for (Funcionario funcionario : Banco.funcionarios) {
		if (funcionario.getNome().equalsIgnoreCase(nome)) {
			funcionarioRetorno = funcionario;
			break;
		}
	}
	return funcionarioRetorno;
}

	public static void atualizar(int indexAlterar, Funcionario funcionarioAlterado) {
		Banco.funcionarios.set(indexAlterar, funcionarioAlterado);
	}
	
	public static void atualizar(String nomeOriginal, Funcionario funcionarioAlterado) {
		for (int i = 0; i < Banco.funcionarios.size(); i++) {
			Funcionario funcionario = Banco.funcionarios.get(i);
			if (funcionario.getNome().equalsIgnoreCase(nomeOriginal)) {
				Banco.funcionarios.set(i, funcionarioAlterado);
				break;
			}
		}
	}

	

	public static boolean excluir(String nome) {
		boolean funcionarioExcluido = false;
		for (int i = 0; i < Banco.funcionarios.size(); i++) {
			Funcionario funcionario = Banco.funcionarios.get(i);
			if (funcionario.getNome().equalsIgnoreCase(nome)) {
				Banco.funcionarios.remove(i);
				funcionarioExcluido = true;
				break;
			}
		}
		return funcionarioExcluido;
	}
}


