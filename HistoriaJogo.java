package Projeto_Intregador;

public class HistoriaJogo {
	
	static public void main(String[] args) {
		
		String nome = "JOSE";
		
	System.out.println(" Ol� " + nome + "!!");
	System.out.println("Seja bem vindo ao jogo!!!\n");
	System.out.println("Seu celular toca: **Prinnn**, nova mensagem recebida! \n");//sugestao de tentativa de inclusao de som
	System.out.println("Mensagem: SISTEMA DE SEGURAN�A ATIVADO! Por medida de seguran�a, permane�a onde est�!\n ");
	System.out.println(" A TI Universal encontrou provas contra voc� e bloqueou toda a empresa com o objetivo de te capturar. \n" + 
			"Voc� est� preso na sala de comando, e a �nica maneira de sair da sala � hackeando o sistema de seguran�a. \n" + 
			"Desta maneira voc� ir� desativar a trava das sa�das dispon�veis, e tamb�m desativar as c�meras para que ningu�m te encontre!");
	
	System.out.println("Para desativar o sistema de seguran�a, voc� precisar� da senha de acesso. A mesma � composta por \n " +
	 " continuar...."); //continuar com informa��es da senha
	
	// desenvolver desafio
	
	System.out.println("Muito bem! Voc� conseguiu a senha e agora tem a oportunidade de sair da sala de comando e tentar escapar. \n"
			+ "A sala possui tr�s sa�das: \n"
			+ "PORTA: Saindo pela porta voc� poder� descer pela escada ou pelo elevador, mas existe a chance de encontrar algum seguran�a que \n"
			+ "est� vindo te prender!\n"
			+ "JANELA: Saindo pela janela voc� encontrar� uma escada externa de sa�da de emerg�ncia. Com ela voc� pode acessar o andar abaixo, por�m\n"
			+ " devido as condi��es atuais do pr�dio n�o tem como saber o estado de conserva��o da mesma.\n"
			+ "DUTO DE AR: Saindo pelo duto de ar voc� poder� acessar as salas vizinhas ou a central de ar, que d� acesso ao andar de baixo. Por�m \n"
			+ "teria que passar por um corredor, aonde os seguran�as est�o te procurando!");
	System.out.println("S� uma sa�da te permitir� acessar o 8� andar, qual voc� ir� arriscar? \n"
			+ "1 - Porta;\n"
			+ "2 - Janela;\n"
			+ "3 - Duto de ar;");
	
	//se escolher a porta
	System.out.println("GAME OVER!")
}
}