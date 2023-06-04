package principal.telas;

import principal.controladores.ControleAcesso;
import principal.util.Prompt;

public class TelaLogin {
	public static void mostrar() {
		
		Prompt.imprimir("Coloque suas credências abaixo.");
		Prompt.imprimir("Informe seu Login: ");
		String login = Prompt.lerLinha();
		Prompt.imprimir("Informe sua Senha: ");
		String senha = Prompt.lerLinha();

		ControleAcesso.autenticar(login, senha);
		
		if (ControleAcesso.isFuncionarioLogado()) {
			TelaDeGerenciamento.mostrar();
		} else {
			Prompt.linhaEmBranco();
			Prompt.imprimir("Login invalido.");
			Prompt.linhaEmBranco();
			Prompt.imprimir("Verifique suas Credenciais.");
			Prompt.linhaEmBranco();
			Prompt.pressionarEnter();
			TelaLogin.mostrar();
		}
	}
}
