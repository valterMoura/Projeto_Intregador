import java.util.Scanner;

public class ToRunAway {
	static Scanner entrada = new Scanner(System.in);
	static void menu () {
		// variaveis.
		int opcao;
		String nome, sexo;
		// Menu
        do {
		System.out.println("TO RUN AWAY \n");
		System.out.println("Voc� esta preparado(a) para provar seu potencial e suas habilidades em um jogo totalmente diferenciado?");
		System.out.println("Apresentamos TO RUN AWAY! O jogo que faltava para voc� testar seus conhecimentos como programador.");
		System.out.println("Voc� topa esse desafio?");
		System.out.println(" Op��es \n");
		System.out.println("1 - Jogar");
		System.out.println("2 - Creditos");
		System.out.println("3 - Sair \n");
		System.out.print("Digite a sua escolha, voc� ser� um jogador ou desistir� sem tentar? \n");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("\nGostei de ver, temos algu�m disposto a enfrentar desafios pelo visto. Como devo chamar a pessoa que ganhar� o jogo? (ou n�o!) ");
			nome = entrada.next();
			System.out.print("\n�timo. Para completar essa etapa s� temos mais uma perguntinha.. Qual o seu g�nero? ");
			System.out.println("M => Masculino  F => Feminino");
			sexo = entrada.next();
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("\n�timo, agora vamos ao jogo!! Para iniciar, conhe�a sua hist�ria: \n");
				System.out.println("Um jovem programador, chamado " + nome + " trabalha h� pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informa��es sigilosas por \nhackers, " + nome + " por ser novato, foi utilizado como laranja pelos hackers."
								+ " Os hackers, que tamb�m trabalhavam na mesma empresa, implantaram muitas \nprovas no usu�rio do sistema no qual " + nome + " trabalhava, sem que o mesmo soubesse.\n\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informa��es da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "+
								nome+", o presidente da empresa aciona a seguran�a para que localize e capture o jovem programador. \n\nNesse exato momento o sistema de seguran�a do predio � acionado para que "+
						"ele n�o fuja. O sistema de seguran�a, bloqueia os elevadores que s� podem \ndescer um andar, portas e janela s�o trancadas automaticamente, "+
								"e para o "+nome+" fugir, ter� que hackear o sistema de seguran�a e fugir de todos os \nseguran�as da empresa, que est�o localizados em pontos estrat�gios para que ningu�m saia sem ser visto.\n");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("\n�timo, agora vamos ao jogo!! Para iniciar, conhe�a sua hist�ria: \n");
				System.out.println("Uma jovem programadora, chamada " + nome + " trabalha h� pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informa��es sigilosas por \nhackers, " + nome + " por ser novata, foi utilizada como laranja pelos hackers."
								+ " Os hackers, que tamb�m trabalhavam na mesma empresa, implantaram muitas \nprovas no usu�rio do sistema na qual " + nome + " trabalhava, sem que a mesma soubesse.\n\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informa��es da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "+
								nome+", o presidente da empresa aciona a seguran�a para que localize e capture a jovem programadora. \n\nNesse exato momento o sistema de seguran�a do predio � acionado para que "+
						"ela n�o fuja. O sistema de seguran�a, bloqueia os elevadores que s� podem \ndescer um andar, portas e janela s�o trancadas automaticamente, "+
								"e para a "+nome+" fugir, ter� que hackear o sistema de seguran�a e fugir de todos os \nseguran�as da empresa, que est�o localizados em pontos estrat�gios para que ningu�m saia sem ser visto.\n");
			}
			break;
			
		case 2:
			System.out.println(" CREDITOS ");
			System.out.println("Desenvolvedor: DAIMON DA SILVA");
			System.out.println("Desenvolvedor: KATIA SCHVABE");
			System.out.println("Desenvolvedor: VALTER DE MOURA PEREIRA");
			System.out.println("Desenvolvedor: VICTOR RODRIGUES ROCHA");
			System.out.println("Desenvolvedor: RENATO BERTONI LARDOSA SANTOS");
			System.out.println("\n Op��o");
			System.out.print("2 - Voltar ");
			opcao = entrada.nextInt();			
			break;
		case 3:
			System.out.println("\nVoc� saiu do jogo!");
			break;
			default:
				System.out.println("Op��o inv�lida, renda-se e venha testar suas habilidades de jogador!");
		}
        }while(opcao == 3 || opcao == 2);
	}
	static void caracteristica() {
		 int escolha;

        do {
        	System.out.println("1 - Conte-me mais sobre o que vou vivenciar, por favor!!");
        	
        	escolha = entrada.nextInt();
        	
        	if(escolha == 1) {
        		System.out.println("\nVejo que temos algu�m com medo, ops, digo, interessado(a) em seu futuro!");
        		System.out.println("� muito bom mesmo conhecer o caminho, assim voc� estar� mais apto(a) a vencer os desafios. N�o esque�a, voc� precisar� de uma mente afiada para despistar\n" + 
        		"os seguran�as e conseguir fugir do pr�dio sem ser capturado(a). Em cada andar, al�m de despistar os seguran�as, voc� precisar� resolver algumas escolhas \nobjetivas e tomar uma decis�o envolvendo l�gica " + 
        		"Mas para te auxiliar nesses desafios, voc� poder� escolher seu perfil. Ele ser� formado por caracter�sticas escolhidas /npor voc�, mas n�o se empolgue, voc� precisar� priorizar algumas. � meu(inha) caro(a), n�o podemos ter tudo na vida n�?" + 
        		" Entendeu o que espera voc� pela frente? Podemos ir para a parte onde voc� monta seu perfil que ir� perder... ops! ganhar o jogo? ");
        		System.out.println("1 - Continuar");
        		
        		int perfil = entrada.nextInt();
        		
        		if( perfil == 1) {
        			System.out.println("\nEssa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
        			System.out.println("Op��o 1 = For�a: 2, Intelig�ncia: 3, L�gica: 3");
        			System.out.println("Op��o 2 = For�a: 0, Intelig�ncia: 4, L�gica: 3");
        			System.out.println("Op��o 3 = For�a: 4, Intelig�ncia: 1, L�gica: 2");
        			System.out.println("Escolha sua op��o:");
        			int caract = entrada.nextInt();
        		}	
        		}
        	
        }while(escolha!=1 && escolha!=2);
       
	}
	static void andar9() {
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
				+ "1 - Janela;\n"
				+ "2 - Porta;\n"
				+ "3 - Duto de ar;");	    
		
		System.out.println("Escolha a op�ao deseja da: ");
		int opcao = entrada.nextInt();		
		//1�decis�o		
		if(opcao == 2) {			
			System.out.println("Sair para o corredor");	
			//2�decis�o
			System.out.println("As opc�es\n 1 - entra na sala a direita\n 2 - ir at� o final do corredor\n 3 - sala esquerda");
			System.out.println("Escolha a op�ao deseja da: ");
			if(opcao == 2) {			
				System.out.println("Acontece algo");
				//3�decis�o
				if(opcao == 3) {			
					System.out.println("Acontece algo");	
					//4�decis�o
					if(opcao == 4) {			
						System.out.println("Acontece algo");							
						}
					}else if(opcao == 3) {
						System.out.println("Acontece algo");				
					}else {
						System.out.println("Acontece algo");
					}
				}else if(opcao == 3) {
					System.out.println("Acontece algo");				
				}else {
					System.out.println("Acontece algo");
				}				
			}else if(opcao == 1) {
				System.out.println("Acontece algo");				
			}else {
				System.out.println("Acontece algo");
			}
		}/*else if(opcao == 1) {
			System.out.println("cair");				
		}else {
			System.out.println("parafusado");
		}*/
	
	public static void main(String[] args) {
		menu ();
		caracteristica();
		andar9();
		
       
	}

}
