package Projeto_Intregador;

public class HistoriaJogo {
	
	static public void main(String[] args) {
		
		String nome = "JOSE";
		
	System.out.println(" Olá " + nome + "!!");
	System.out.println("Seja bem vindo ao jogo!!!\n");
	System.out.println("Seu celular toca: **Prinnn**, nova mensagem recebida! \n");//sugestao de tentativa de inclusao de som
	System.out.println("Mensagem: SISTEMA DE SEGURANÇA ATIVADO! Por medida de segurança, permaneça onde está!\n ");
	System.out.println(" A TI Universal encontrou provas contra você e bloqueou toda a empresa com o objetivo de te capturar. \n" + 
			"Você está preso na sala de comando, e a única maneira de sair da sala é hackeando o sistema de segurança. \n" + 
			"Desta maneira você irá desativar a trava das saídas disponíveis, e também desativar as câmeras para que ninguém te encontre!");
	
	System.out.println("Para desativar o sistema de segurança, você precisará da senha de acesso. A mesma é composta por \n " +
	 " continuar...."); //continuar com informações da senha
	
	// desenvolver desafio
	
	System.out.println("Muito bem! Você conseguiu a senha e agora tem a oportunidade de sair da sala de comando e tentar escapar. \n"
			+ "A sala possui três saídas: \n"
			+ "PORTA: Saindo pela porta você poderá descer pela escada ou pelo elevador, mas existe a chance de encontrar algum segurança que \n"
			+ "está vindo te prender!\n"
			+ "JANELA: Saindo pela janela você encontrará uma escada externa de saída de emergência. Com ela você pode acessar o andar abaixo, porém\n"
			+ " devido as condições atuais do prédio não tem como saber o estado de conservação da mesma.\n"
			+ "DUTO DE AR: Saindo pelo duto de ar você poderá acessar as salas vizinhas ou a central de ar, que dá acesso ao andar de baixo. Porém \n"
			+ "teria que passar por um corredor, aonde os seguranças estão te procurando!");
	System.out.println("Só uma saída te permitirá acessar o 8º andar, qual você irá arriscar? \n"
			+ "1 - Porta;\n"
			+ "2 - Janela;\n"
			+ "3 - Duto de ar;");
	
	//se escolher a porta
	System.out.println("GAME OVER!")
}
}