import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToRunAway {
	static Scanner entrada = new Scanner(System.in);

	static void menu() {
		// variaveis.
		int opcao;
		String nome, sexo;
		// Menu
		do {
			System.out.println("\t\t     TO RUN AWAY \n");
					
			System.out.println(
					  "                         |\r\n"
					+ "                     _|__|__|_\r\n"
					+ "     ___________    _|  | |  |_    ___________\r\n"
					+ "    (__IXIXIXIXI___|_|__|_|__|_|___IXIXIXIXI__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n"
					+ "    (__|\"|\"|\"|\"| [=][=] [=] [=][=] |\"|\"|\"|\"|__)\r\n");
			System.out.println(
					"Voc� esta preparado(a) para provar seu potencial e suas habilidades em um jogo totalmente diferenciado?");
			System.out.println(
					"Apresentamos TO RUN AWAY! O jogo que faltava para voc� testar seus conhecimentos como programador.");
			System.out.println("Voc� topa esse desafio?");
			System.out.println(" Op��es \n");
			System.out.println("1 - Jogar");
			System.out.println("2 - Creditos"); 
			System.out.println("3 - Sair \n");	
			System.out.print("Digite a sua escolha, voc� ser� um jogador ou desistir� sem tentar? \n");
			
			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(
						"\nGostei de ver, temos algu�m disposto a enfrentar desafios pelo visto. Como devo chamar a pessoa que ganhar� o jogo? (ou n�o!) ");
				nome = entrada.next();
				System.out.print(
						"\n�timo. Para completar essa etapa s� temos mais uma perguntinha.. Qual o seu g�nero? ");
				System.out.println("M => Masculino  F => Feminino");
				sexo = entrada.next();
				if (sexo.equalsIgnoreCase("M")) {
					System.out.println("\n�timo, agora vamos ao jogo!! Para iniciar, conhe�a sua hist�ria: \n");
					System.out.println("Um jovem programador, chamado " + nome
							+ " trabalha h� pouco tempo na empresa TI Universal,"
							+ " empresa que estava sofrendo roubo de informa��es sigilosas por \nhackers, " + nome
							+ " por ser novato, foi utilizado como laranja pelos hackers."
							+ " Os hackers, que tamb�m trabalhavam na mesma empresa, implantaram muitas \nprovas no usu�rio do sistema no qual "
							+ nome + " trabalhava, sem que o mesmo soubesse.\n\n"
							+ "A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informa��es da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "
							+ nome
							+ ", o presidente da empresa aciona a seguran�a para que localize e capture o jovem programador. \n\nNesse exato momento o sistema de seguran�a do predio � acionado para que "
							+ "ele n�o fuja. O sistema de seguran�a, bloqueia os elevadores que s� podem \ndescer um andar, portas e janela s�o trancadas automaticamente, "
							+ "e para o " + nome
							+ " fugir, ter� que hackear o sistema de seguran�a e fugir de todos os \nseguran�as da empresa, que est�o localizados em pontos estrat�gios para que ningu�m saia sem ser visto.\n");
				} else if (sexo.equalsIgnoreCase("F")) {
					System.out.println("\n�timo, agora vamos ao jogo!! Para iniciar, conhe�a sua hist�ria: \n");
					System.out.println("Uma jovem programadora, chamada " + nome
							+ " trabalha h� pouco tempo na empresa TI Universal,"
							+ " empresa que estava sofrendo roubo de informa��es sigilosas por \nhackers, " + nome
							+ " por ser novata, foi utilizada como laranja pelos hackers."
							+ " Os hackers, que tamb�m trabalhavam na mesma empresa, implantaram muitas \nprovas no usu�rio do sistema na qual "
							+ nome + " trabalhava, sem que a mesma soubesse.\n\n"
							+ "A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informa��es da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "
							+ nome
							+ ", o presidente da empresa aciona a seguran�a para que localize e capture a jovem programadora. \n\nNesse exato momento o sistema de seguran�a do predio � acionado para que "
							+ "ela n�o fuja. O sistema de seguran�a, bloqueia os elevadores que s� podem \ndescer um andar, portas e janela s�o trancadas automaticamente, "
							+ "e para a " + nome
							+ " fugir, ter� que hackear o sistema de seguran�a e fugir de todos os \nseguran�as da empresa, que est�o localizados em pontos estrat�gios para que ningu�m saia sem ser visto.\n");
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
		} while (opcao == 3 || opcao == 2);
	}

	static void caracteristica() {
		int escolha;

		do {
			System.out.println("1 - Conte-me mais sobre o que vou vivenciar, por favor!!");

			escolha = entrada.nextInt();

			if (escolha == 1) {
				System.out.println("\nVejo que temos algu�m com medo, ops, digo, interessado(a) em seu futuro!");
				System.out.println(
						"� muito bom mesmo conhecer o caminho, assim voc� estar� mais apto(a) a vencer os desafios. N�o esque�a, voc� precisar� de uma mente afiada para despistar\n"
								+ "os seguran�as e conseguir fugir do pr�dio sem ser capturado(a). Em cada andar, al�m de despistar os seguran�as, voc� precisar� resolver algumas escolhas \nobjetivas e tomar uma decis�o envolvendo l�gica "
								+ "Mas para te auxiliar nesses desafios, voc� poder� escolher seu perfil. Ele ser� formado por caracter�sticas escolhidas /npor voc�, mas n�o se empolgue, voc� precisar� priorizar algumas. � meu(inha) caro(a), n�o podemos ter tudo na vida n�?"
								+ " Entendeu o que espera voc� pela frente? Podemos ir para a parte onde voc� monta seu perfil que ir� perder... ops! ganhar o jogo? ");
				System.out.println("1 - Continuar");

				int perfil = entrada.nextInt();

				if (perfil == 1) {
					System.out.println(
							"\nEssa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
					System.out.println("Op��o 1 = For�a: 2, Intelig�ncia: 3, L�gica: 3");
					System.out.println("Op��o 2 = For�a: 0, Intelig�ncia: 4, L�gica: 3");
					System.out.println("Op��o 3 = For�a: 4, Intelig�ncia: 1, L�gica: 2");
					System.out.println("Escolha sua op��o:");
					int caract = entrada.nextInt();
				}
			}

		} while (escolha != 1 && escolha != 2);

	}

	static void andar9() {
		String nome = "Jo�o";
		int numero1 = 9, numero2 = 6, numero3 = 5, tentativas = 5;
		System.out.println(" Ol� " + nome + "!!");
		System.out.println("Seja bem vindo ao jogo!!!\n");
		System.out.println("Seu celular toca: **Prinnn**, nova mensagem recebida! \n");// sugestao de tentativa de
																						// inclusao de som
		System.out.println("Mensagem: SISTEMA DE SEGURAN�A ATIVADO! Por medida de seguran�a, permane�a onde est�!\n ");
		System.out.println(
				" A TI Universal encontrou provas contra voc� e bloqueou toda a empresa com o objetivo de te capturar. \n"
						+ "Voc� est� preso na sala de comando, e a �nica maneira de sair da sala � hackeando o sistema de seguran�a. \n"
						+ "Desta maneira voc� ir� desativar a trava das sa�das dispon�veis, e tamb�m desativar as c�meras para que ningu�m te encontre!");

		System.out.println(
				"Para desativar o sistema de seguran�a, voc� precisar� da senha de acesso.\nA mesma � composta por  "
						+ " tr�s digitos, e a soma dos tr�s digito � igual a 20.\nsenha:__+__+__= 20\n"); // continuar
																											// com
																											// informa��es
																											// da senha
		do {
			System.out.println("digite o primeiro digito");
			numero1 = entrada.nextInt();
			System.out.println("digite o segundo digito");
			numero2 = entrada.nextInt();
			System.out.println("digite o terceiro digito");
			numero3 = entrada.nextInt();
			if (numero1 == 9 && numero2 != 6 && numero3 != 5) {
				System.out.println(" 9+__+__= 20");
			} else if (numero1 == 9 && numero2 == 6 && numero3 != 5) {
				System.out.println(" 9+ 6+__= 20\n");
			} else if (numero1 == 9 && numero2 == 6 && numero3 == 5) {
				System.out.println(" 9+ 6+ 5= 20\n");
			} else if (numero1 == 9 && numero2 != 6 && numero3 != 5) {
				System.out.println(" 9+__+__= 20\n");
			} else if (numero1 != 9 && numero2 == 6 && numero3 != 5) {
				System.out.println("__+ 6+__= 20\n");
			} else if (numero1 != 9 && numero2 != 6 && numero3 == 5) {
				System.out.println("__+__+ 5= 20\n");
			} else if (numero1 != 9 && numero2 == 6 && numero3 == 5) {
				System.out.println("__+ 6+ 5= 20\n");
			} else {
				System.out.println("__+__+__= 20\n");
			}
			tentativas--;
			if (tentativas == 1) {
				System.out.println("GAME OVER\n");
				menu();
			}

		} while (numero1 != 9 || numero2 != 6 || numero3 != 5);

		int opcao = 0;

		System.out.println(
				"Muito bem! Voc� conseguiu a senha e agora tem a oportunidade de sair da sala de comando e tentar escapar. \n"
						+ "A sala possui tr�s sa�das: \n"
						+ "PORTA: Saindo pela porta voc� poder� descer pela escada ou pelo elevador, mas existe a chance de encontrar algum seguran�a que \n"
						+ "est� vindo te prender!\n"
						+ "JANELA: Saindo pela janela voc� encontrar� uma escada externa de sa�da de emerg�ncia. Com ela voc� pode acessar o andar abaixo, por�m\n"
						+ " devido as condi��es atuais do pr�dio n�o tem como saber o estado de conserva��o da mesma.\n"
						+ "DUTO DE AR: Saindo pelo duto de ar voc� poder� acessar as salas vizinhas ou a central de ar, que d� acesso ao andar de baixo. Por�m \n"
						+ "teria que passar por um corredor, aonde os seguran�as est�o te procurando!");
		System.out.println("S� uma sa�da te permitir� acessar o 8� andar, qual voc� ir� arriscar? \n" + "1 - Janela;\n"
				+ "2 - Porta;\n" + "3 - Duto de ar;");

		System.out.println("Escolha a op�ao desejada: ");
		opcao = entrada.nextInt();
		if (opcao == 1) {// op�ao Janela
			System.out.println(
					"Ao abrir a janela voc� descobre que a escada est� em p�ssimas condi��es de conserva��o, a mesma est� desmoronando.\n"
							+ "O melhor a fazer � escolher outra op��o para sair da sala, voc� ainda tem duas op��es\n"
							+ "1 - Porta; \n2 - Duto de ar;");
			System.out.println("Escolha a op�ao desejada: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {// op�ao Porta
				System.out.println(
						"Voc� abre a porta, com cautela, ao avista que o corredor est� livre, voc� sai da sala, agora voc� tem duas op��es:\n"
								+ "1 - Seguir reto pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();

				if (opcao == 1) {// Seguir reto pelo corredor
					System.out.println(
							"Olha voc� chegou ao elevador, mais, por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a, agora � com voc� boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo, \n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				} else {// sala da sua direita
					System.out.println(
							"Essa sala s� abre com a digital do respons�vel da tesouraria, ent�o essa n�o � uma op��o\n"
									+ "Ent�o voc� segue em frente pelo corredor");
					System.out.println(
							"Olha voc� chegou ao elevador, mais, por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar de abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra no elevador e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				}
			} else {// Duto de ar
				System.out.println(
						"Ao chegar pr�ximo da entrada voc� repara que a entrada do duto de ar est� parafusada, e que na sala n�o tem uma chave apropriada para abri-la\n"
								+ "o ideal ent�o � sair pela porta, pois voc� n�o tem tempo a perder para procurar uma chave de fenda.");
				System.out.println(
						"Voc� abre a porta, com cautela, ao avista que o corredor est� livre, voc� sai da sala, agora voc� tem duas op��es:\n"
								+ "1 - Seguir reto pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();

				if (opcao == 1) {// Seguir reto pelo corredor
					System.out.println(
							"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a, agora � com voc� boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				} else {// sala da sua direita
					System.out.println(
							"Essa sala s� abre com a digital do respons�vel da tesouraria, ent�o essa n�o � uma op��o\n"
									+ "Ent�o voc� segue em frente pelo corredor");
					System.out.println(
							"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar de abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar de abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ai ent�o que voc� entra no elevador e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				}
			}
		} else if (opcao == 2) {// op��o Porta
			System.out.println(
					"Voc� abre a porta, com cautela, ao avista que o corredor est� livre, voc� sai da sala, agora voc� tem duas op��es:\n"
							+ "1 - Seguir em frente pelo corredor\n2 - Entra na sala da sua direita");
			opcao = entrada.nextInt();

			if (opcao == 1) {// Seguir em frente pelo corredor
				System.out.println(
						"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar abaixo.\n"
								+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
								+ "Se escolher a escada poder� dar de cara com um seguran�a, agora � com voc� boa sorte\n"
								+ "1 - Descer as escadas\n2 - Esperar o elevador");
				opcao = entrada.nextInt();

				if (opcao == 1) {// Descer as escadas
					System.out.println(
							"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
									+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
									+ "� ent�o que voc� entra e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
				} else {// Esperar o elevador
					System.out.println(
							"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
									+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
				}
			} else {// sala da sua direita
				System.out.println(
						"Essa sala s� abre com a digital do respons�vel da tesouraria, ent�o essa n�o � uma op��o\n"
								+ "Ent�o voc� segue em frente pelo corredor");
				System.out.println(
						"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar de abaixo.\n"
								+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
								+ "Se escolher a escada poder� dar de cara com um seguran�a\n"
								+ "1 - Descer as escadas\n2 - Esperar o elevador");
				opcao = entrada.nextInt();
				if (opcao == 1) {// Descer as escadas
					System.out.println(
							"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
									+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
									+ "� ent�o que voc� entra no elevador e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
				} else {// Esperar o elevador
					System.out.println(
							"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
									+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
				}
			}
		} else {// op��o Duto de ar
			System.out.println(
					"Ao chegar pr�ximo da entrada voc� repara que a entrada do duto de ar est� parafusada,\n e que na sala n�o tem uma chave apropriada para abri-la\n"
							+ "o ideal ent�o � sair pela porta ou pela janela, pois voc� n�o tem tempo a perder para procurar uma chave de fenda.\n"
							+ "1 - Sair pela janela\n2 - Sair pela porta");
			opcao = entrada.nextInt();
			if (opcao == 1) {// Sair pela janela
				System.out.println(
						"Ao abrir a janela voc� descobre que a escada est� em p�ssimas condi��es de conserva��o, a mesma est� desmoronando.\n"
								+ "O melhor a fazer � sair pela porta");
				System.out.println(
						"Voc� abre a porta, com cautela, ao avista que o corredor est� livre, voc� sai da sala, agora voc� tem duas op��es:\n"
								+ "1 - Seguir reto pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();
				if (opcao == 1) {// Seguir reto pelo corredor
					System.out.println(
							"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a, agora � com voc� boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				} else {// Entra na sala da sua direita
					System.out.println(
							"Essa sala s� abre com a digital do respons�vel da tesouraria, ent�o essa n�o � uma op��o\n"
									+ "Ent�o voc� segue em frente pelo corredor");
					System.out.println(
							"Olha voc� chegou ao elevador, mais, por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar de abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra no elevador e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				}

			} else {// op��o Porta
				System.out.println(
						"Voc� abre a porta, com cautela, ao avista que o corredor est� livre, voc� sai da sala, agora voc� tem duas op��es:\n"
								+ "1 - Seguir em frente pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();
				if (opcao == 1) {
					System.out.println(
							"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a, agora � com voc� boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				} else {// Entra na sala da sua direita
					System.out.println(
							"Essa sala s� abre com a digital do respons�vel da tesouraria, ent�o essa n�o � uma op��o\n"
									+ "Ent�o voc� segue em frente pelo corredor");
					System.out.println(
							"Olha voc� chegou ao elevador, mais por�m a sua esquerda tem uma escada, que tamb�m levar� para o andar de abaixo.\n"
									+ "Agora � com voc�, se voc� chamar o elevador poder� correr o risco de encontrar um seguran�a dentro do mesmo\n"
									+ "Se escolher a escada poder� dar de cara com um seguran�a\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Voc� come�a a descer as escadas, por�m nesse momento ouve o barulho do elevador, e tamb�m vozes dos seguran�as vindo do andar abaixo,\n"
										+ "ent�o voc� percebe que o melhor a fazer � voltar, voc� sobe a escada rapidamente ao chegar no elevador, observa que o mesmo est� vazio\n"
										+ "� ent�o que voc� entra no elevador e segue para o andar de baixo, rezando para n�o dar de frente com algum seguran�a");
					} else {// Esperar o elevador
						System.out.println(
								"Voc� chama o elevador, e espera escondido, quando o elevador chega, voc� corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para n�o dar de frente com algum seguran�a.");
					}
				}
			}
		}
		System.out.println("");
	}

	static void andar4() {
		int quarto;
		int caract = 3;
		System.out.println("Muito bem! Voc� chegou ao 4� andar!");

		do {
			System.out.println(
					"Agora, para voc� chegar ao 3� andar precisar� descobrir em qual das salas est� a passagem dos dutos de ar. Existe em somente uma das 4 salas do andar. \n"
							+ "Ap�s escolher a sala correta, voc� precisar� completar o algoritmo escrito na entrada. Somente a resposta correta te permitir� acesso a passagem!! \n"
							+ "E ai, qual das salas voc� escolhe? \n" + "1 - SALA A;\n" + "2 - SALA B;\n"
							+ "3 - SALA C;\n" + "4 - SALA D;");
			quarto = entrada.nextInt();

			if (quarto == 1 || quarto == 2 || quarto == 4) {
				System.out.println(
						"Sala errada, tente outra.. Lembre que voc� est� perdendo tempo. A qualquer momento um seguran�a pode te encontrar!\n");
			}
		} while (quarto != 3);

		System.out.println("Ok, agora que voc� encontrou o duto, preencha o algoritmo para liberar sua entrada!!\n");

		if (caract == 1) {
			// desafio 1
			System.out.println("Observe o algoritmo escrito e preencha o espa�o com XXX com a op��o correta!\n"
					+ "Quest�o: O algoritmo deve ler dois n�meros e dizer qual deles � maior. \n");
			System.out.println(" ALGORITMO: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n1, n2; \n"
					+ "System.out.println(Digite o primeiro n�mero: ); \n" + "n1 = entrada.nextInt(); \n"
					+ "System.out.println(Digite o segundo n�mero: ); \n" + "n2 = entrada.nextInt(); \n" + "XXX { \n "
					+ "O maior n�mero �: + n1 \n" + "} else { \n" + "O maior n�mero �: + n2 \n");
			System.out.println(
					"Op��o 1 =  if(n1 > n2) ;\n" + "Op��o 2 = if(n1 < n2) ;\n" + "Op��o 3 = for(n1 > n2) ; \n");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println("Muito bem! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		} else if (caract == 2) {
			// desafio 2
			System.out.println("Observe o algoritmo escrito e preencha o espa�o com XXX com a op��o correta!\n"
					+ "Quest�o: O algoritmo deve ler dois n�meros e dizer qual deles � a m�dia deles. \n");
			System.out
					.println(" ALGORITMO: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n1, n2, media; \n"
							+ "System.out.println(Digite o primeiro n�mero: ); \n" + "n1 = entrada.nextInt(); \n"
							+ "System.out.println(Digite o segundo n�mero: ); \n" + "n2 = entrada.nextInt(); \n"
							+ "XXX \n" + "System.out.println(A m�dia dos n�meros apresentados �: + media");
			System.out.println("Op��o 1 =  media = (n1 + n2)/2 ;\n" + "Op��o 2 = media = (n1 * n2)/2 ;\n"
					+ "Op��o 3 = int media = (n1 + n2)/2 ; \n");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println("Muito bem! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		} else {
			// desafio 3
			System.out.println("Observe o algoritmo escrito e preencha o espa�o com XXX com a op��o correta!\n"
					+ "Quest�o: O algoritmo deve ler dois n�meros e dizer qual deles � menor. \n");
			System.out.println(" ALGORITMO: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n1, n2; \n"
					+ "System.out.println(Digite o primeiro n�mero: ); \n" + "n1 = entrada.nextInt(); \n"
					+ "System.out.println(Digite o segundo n�mero: ); \n" + "n2 = entrada.nextInt(); \n" + "XXX { \n "
					+ "O menor n�mero �: + n1 \n" + "} else { \n" + "O menor n�mero �: + n2 \n");
			System.out.println(
					"Op��o 1 =  if(n1 < n2) ;\n" + "Op��o 2 = if(n1 >= n2) ;\n" + "Op��o 3 = for(n1 > n2) ; \n");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println("Muito bem! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		}
	}

	static void andar5() {
		int quinto;
		int caract = 3;
		System.out.println("Muito bem! Voc� chegou ao 5� andar!");

		do {
			System.out.println(
					"Para descer mais um andar voc� precisa decidir qual sentido pegar. Essa sala s� possui uma sa�da, ent�o � inevit�vel \n"
							+ "voc� passar pelo corredor. Por�m, se voc� sair da sala e ir para a direita voc� ter� a op��o da escada, e do elevador. E se voc� ir para a esquerda voc� \n"
							+ "ter� acesso a outras duas salas. A sala A te d� acesso ao duto de ar condicionado, que voc� n�o sabe com qual sala faz liga��o. E a sala B � integrada com o \n"
							+ "andar de baixo na sala de descanso dos seguran�as. S� um te permitir� avan�ar.. E ai, qual dessas op��es voc� escolhe? \n"
							+ "1 - Lado direito, escada;\n" + "2 - Lado direito, elevador;\n"
							+ "3 - Lado esquerdo, Sala A;\n" + "4 - Lado esquerdo, Sala B;");
			quinto = entrada.nextInt();

			if (quinto == 1 || quinto == 3 || quinto == 4) {
				System.out.println("Esse n�o � o melhor caminho, tente outra vez!\n");
			}
		} while (quinto != 2);

		System.out.println(
				"Ok, agora que voc� sabe que s� conseguir� ter acesso ao pr�ximo andar pelo elevador, pode tentar acessar ao mesmo.Corre!!!\n");
		// incluir desenhos de caminhada
		System.out
				.println("Ok, voc� chegou ao elevador! Para abrir a porta, voc� precisa responder a quest�o abaixo:\n");

		if (caract == 1) {
			// desafio 1
			System.out.println("Observe o enunciado abaixo e escolha o c�digo que foi utilizado corretamente: \n"
					+ "Quest�o: Desenvolva um algoritmo em Java que leia um n�mero inteiro. Caso o n� seja par imprima o seu antecessor, \n"
					+ "e se ele for �mpar, imprima seu sucessor. \n");
			System.out.println(" Op��o 1: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 != 0){ \n "
					+ "int ant = n - 1;" + "Seu antecessor �: + ant \n" + "} else { \n" + "int suc = n +1;"
					+ "Seu sucessor �: + suc }\n");
			System.out.println(" Op��o 2: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 == 0){ \n "
					+ "int ant = n - 1;" + "Seu antecessor �: + ant \n" + "} else { \n" + "int suc = n +1;"
					+ "Seu sucessor �: + suc }\n");
			System.out.println(" Op��o 3: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = input.next(); \n" + "if(n % 2 == 0){ \n "
					+ "int ant = n - 1;" + "Seu sucessor �: + ant \n" + "} else { \n" + "int suc = n +1;"
					+ "Seu antecessor �: + suc}");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 2) {
				System.out.println("Muito bem! Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		} else if (caract == 2) {
			// desafio 2
			System.out.println("Observe o enunciado abaixo e escolha o c�digo que foi utilizado corretamente: \n"
					+ "Quest�o: Desenvolva um algoritmo em Java que leia um n�mero inteiro. Caso o n� seja par apresenta a mensagem PAR, \n"
					+ "e se ele for �mpar, apresente a mensagem IMPAR. \n");
			System.out.println(" Op��o 1: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 != 0){ \n "
					+ "PAR! \n" + "} else { \n" + "IMPAR! }\n");
			System.out.println(" Op��o 2: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 == 0){ \n "
					+ "PAR! \n" + "} else { \n" + "IMPAR!} \n");
			System.out.println(" Op��o 3: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = input.next(); \n" + "if(n % 2 == 0){ \n "
					+ "IMPAR! \n" + "} else { \n" + "PAR!}");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 2) {
				System.out.println("Muito bem! Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		} else {
			// desafio 3
			System.out.println("Observe o enunciado abaixo e escolha o c�digo que foi utilizado corretamente: \n"
					+ "Quest�o: Desenvolva um algoritmo em Java que leia um n�mero inteiro. Caso o n� seja par imprima PAR, \n"
					+ "se ele for �mpar, imprima IMPAR, e se ele for 0, imprima ZERO!. \n");
			System.out.println(" Op��o 1: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 != 0){ \n "
					+ "PAR! \n" + "} else if ( n % 3 != 0){ \n" + "IMPAR!\n" + "} else { " + "ZERO!\n");
			System.out.println(" Op��o 2: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 == 0){ \n "
					+ "PAR! \n" + "} else if (n % 3 == 0){ \n" + "IMPAR! \n" + "} else{ " + "ZERO!\n");
			System.out.println(" Op��o 3: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um n�mero: ); \n" + "n = input.next(); \n" + "if(n % 2 == 0){ \n "
					+ "IMPAR! \n" + "} else if ( n % 2 == 0) { \n" + "PAR! \n" + "} else {" + "ZERO!\n");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 2) {
				System.out.println("Muito bem! Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		}
	}

    static void terreo() {
		int terreo;
		String nome = "Joao";
		
	System.out.println("Muito bem! Agora voc� ja est� no TERREO!\n"
			+ "Mas o jogo ainda n�o acabou! Esse � o andar mais protegido pelos seguran�as, e sair daqui n�o ser� t�o f�cil!!\n"
			+ "Em todas as sa�das h� dois seguran�as que n�o deixam ningu�m sair at� voc� ser capturado, e todas as pessoas est�o sendo vistoriadas.\n"
			+ "Para conseguir sair do pr�dio, voc� precisar� despistar os seguran�as e abrir as portas que est�o travadas! E a�? J� sabe como fazer isso?\n");
	System.out.println("Primeiro passo ser� destravar as portas, para depois pensar em despistar os seguran�as. Mas para isso voc� precisar� hackear o sistema de ilumina��o \n"
			+ "� nessa hora que voc� testar� suas habilidades com a l�gica. E a partir desse momentos suas for�as e caracter�sticas, escolhidas no in�cio do jogo, n�o ter�o \n"
			+ "mais validade. Voc� est� sozinho(a) nessa " + nome + "!! Vamos ao desafio? 1 - SIM; ");
	terreo = entrada.nextInt();
	
	if(terreo == 1) {
		System.out.println("Muito bem, deixa eu te explicar! ");
	}
	
	ArrayList<String> alternativas = new ArrayList<String>();
	alternativas.add("Verdadeiro (true);"); // alternativa correta
	alternativas.add("Falso (false);");
	alternativas.add("6;");
	alternativas.add("9;");
	
	boolean acertou = false;
	
	do {
		
		Collections.shuffle(alternativas);
	
	System.out.println("O sistema de ilumina��o � protegido por um c�digo, e para ter acesso ao c�digo voc� precisar� decifrar a quest�o abaixo: ");
	System.out.println("Considerando a l�gica de programa��o e seus operadores l�gicos utilizados nas linguagens de programa��o, atente-se para a express�o abaixo.\n" + 
			"C * (B - A) <= D - B / C \n" + 
			"Qual seria o resultado da execu��o dessa express�o, caso o valor das vari�veis fossem: A=3; B=6; C=2 e D=9 ?");
	System.out.println("a) " + alternativas.get(0));
	System.out.println("b) " + alternativas.get(1));
	System.out.println("c) " + alternativas.get(2));
	System.out.println("d) " + alternativas.get(3));
	System.out.println("Escolha uma alternativa: ");
	String resposta = entrada.next();
	
	switch(resposta) {
	case "a":
	case "A":
		if (alternativas.get(0).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
	case "b":
	case "B":
		if (alternativas.get(1).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
	case "c":
	case "C":
		if (alternativas.get(2).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
	case "d":
	case "D":
		if (alternativas.get(3).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
			default:
				System.out.println("Resposta inv�lida!");
	}
	
	}while(!acertou);
	
	int[] vetor = new int[5];
	int[] vetorCorreto = {2, 6, 11, 16, 18};
	
	System.out.println("Muito bem, o sistema de ilumina��o foi desativado e as portas est�o destravadas! Agora s� falta despistar os seguran�as..\n"
			+ "Para isso voc� precisar� ativar o alarme de inc�ndio. Dessa maneira haver� tumulto, e ser� sua oportunidade de escapar sem sem visto!\n"
			+ "O sistema de inc�ndio ser� ativado assim que voc� completar o c�digo abaixo conforme as instru��es. \n\n");
	System.out.println("Considere os seguintes valores para as vari�veis. A = 10; B = 12; C = -2; D = 6; Agora responda as quest�es a seguir. Todas as \n"
			+ "respostas corretas formar�o um vetor que ativar� o sistema de inc�ndio. Mas preste muita aten��o, se errar uma quest�o o sistema de inc�ncio \n"
			+ "n�o ativa e os seguran�as receber�o uma mensagem alertando da tentativa. � a quest�o que te libertar� ou prender�. Depende apenas de voc�! \n"
			+ "Quest�o 1: \n"
			+ "Considerando os valores j� informados, qual seria o retorno da opera��o a seguir: A * C - B / D \n"
			+ "1 - 10 positivo; \n"
			+ "2 - 22 negativo; \n" // RESPOSTA CORRETA
			+ "3 - 22 positivo; \n"
			+ "4 - 18 positivo; \n");
        vetor[0]= entrada.nextInt();
        System.out.println("Quest�o 2: \n"
    			+ "Usando o la�o WHILE, qual op��o abaixo corresponde ao enunciado: Fa�a um programa que mostre todos os n�meros inteiros de 1 a 50.\n"
    			+ "5 - int i = 1;\n" + 
    			"    	while( i = 50) {\n" + 
    			"    	System.out.println(\"Inteiro \" + i );\n" + 
    			"    	i = i + 1;\n" + 
    			"    	}; \n\n"
    			+ "6 - int i = 1;\n" + //RESPOSTA CORRETA
    			"		while( i <= 50) {\n" + 
    			"		System.out.println(\"Inteiro \" + i );\n" + 
    			"		i = i + 1;\n" + 
    			"	    }; \n\n"
    			+ "7 - int i = 1;\n" + 
    			"    	while( i >= 50) {\n" + 
    			"    	System.out.println(\"Inteiro \" + i );\n" + 
    			"    	i = i + 1;\n" + 
    			"    	}; \n\n"
    			+ "8 - int i = 1;\n" + 
    			"    	while( i <= 50) {\n" + 
    			"    	System.out.println(\"Inteiro \" + i );\n" + 
    			"    	i = i - 1;\n" + 
    			"    	}; \n\n"
    			+ "Qual a op��o correta? \n");
            vetor[1]= entrada.nextInt();
            System.out.println("Quest�o 3: \n"
        			+ "Considerando os valores j� informados, qual seria o retorno da opera��o a seguir: A + C - B / D \n"
        			+ "9 - 6 negativo; \n"
        			+ "10 - 0 zero; \n"
        			+ "11 - 6 positivo; \n" // RESPOSTA CORRETA
        			+ "12 - 1 positivo; \n");
                vetor[2]= entrada.nextInt();
                System.out.println("Quest�o 4: \n"
            			+ "Qual dos programas abaixo gera a seguinte s�rie: 10, 20, 30, 40, ..., at� 1000 utilizando o la�o FOR.\n"
            			+ "13 - int i;\n" + 
            			"        for(i = 10; i = 1000; i = i + 10){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n"
            			+ "14 - int i;\n" + 
            			"        for(i = 10; i >= 1000; i = i++){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n"
            			+ "15 - int i;\n" + 
            			"        for(i = 10; i <= 1000; i = i++){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n"
            			+ "16 - int i;\n" + // RESPOSTA CORRETA
            			"        for(i = 10; i <= 1000; i = i + 10){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n");
                    vetor[3]= entrada.nextInt();
                    System.out.println("Quest�o 5: \n"
                			+ "Qual dos programas abaixo imprime todos os m�ltiplos de 7 menores que 200 utilizando o la�o WHILE?\n"
                			+ "17 - int i = 7;\n" + 
                			"        while(i<200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i * 7;\n" + 
                			"        }; \n\n"
                			+ "18 - int i = 7;\n" + //RESPOSTA CORRETA
                			"        while(i<200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n"
                			+ "19 - int i = 0;\n" + 
                			"        while(i<=200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n"
                			+ "20 - int i = 7;\n" + 
                			"        while(i<=200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n");
                        vetor[4]= entrada.nextInt();
        
                        System.out.println("Suas respostas criaram o vetor: vetor[" + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4] + "]." );
                        
                        if(vetor == vetorCorreto) {
                        	System.out.println("Sistema de inc�ndio ativado. Seguran�as foram distra�dos e voc� escapou!!!\n"
                        			+ "Parab�ns! Voc� conseguiu provar suas habilidades!!! Agora � s� comemorar!! \n\n"
                        			+ "   .* *.               `o`o`\r\n" + 
                        			"         *. .*              o`o`o`o      ^,^,^\r\n" + 
                        			"           * \\               `o`o`     ^,^,^,^,^\r\n" + 
                        			"              \\     ***        |       ^,^,^,^,^\r\n" + 
                        			"               \\   *****       |        /^,^,^\r\n" + 
                        			"                \\   ***        |       /\r\n" + 
                        			"    ~@~*~@~      \\   \\         |      /\r\n" + 
                        			"  ~*~@~*~@~*~     \\   \\        |     /\r\n" + 
                        			"  ~*~@smd@~*~      \\   \\       |    /     #$#$#        .`'.;.\r\n" + 
                        			"  ~*~@~*~@~*~       \\   \\      |   /     #$#$#$#   00  .`,.',\r\n" + 
                        			"    ~@~*~@~ \\        \\   \\     |  /      /#$#$#   /|||  `.,'\r\n" + 
                        			"_____________\\________\\___\\____|_/______/_________|\\/\\___||______");
                        	
                        }else {
                        	System.out.println("SENHA ERRADA! Seguran�as foram alarmados e voc� est� preso(a)!!!\n\n"
                        			+ "MM'\"\"\"\"\"`MM                              \r\n" + 
                        			"M' .mmm. `M                              \r\n" + 
                        			"M  MMMMMMMM .d8888b. 88d8b.d8b. .d8888b. \r\n" + 
                        			"M  MMM   `M 88'  `88 88'`88'`88 88ooood8 \r\n" + 
                        			"M. `MMM' .M 88.  .88 88  88  88 88.  ... \r\n" + 
                        			"MM.     .MM `88888P8 dP  dP  dP `88888P' \r\n" + 
                        			"MMMMMMMMMMM                              \r\n" + 
                        			"                                         \r\n" + 
                        			"MMP\"\"\"\"\"YMM                            dP \r\n" + 
                        			"M' .mmm. `M                            88 \r\n" + 
                        			"M  MMMMM  M dP   .dP .d8888b. 88d888b. 88 \r\n" + 
                        			"M  MMMMM  M 88   d8' 88ooood8 88'  `88 dP \r\n" + 
                        			"M. `MMM' .M 88 .88'  88.  ... 88          \r\n" + 
                        			"MMb     dMM 8888P'   `88888P' dP       oo \r\n" + 
                        			"MMMMMMMMMMM                               \r\n" + 
                        			"                                          ");
                        	
                        }
    }
    
	public static void main(String[] args) {
		menu();
		caracteristica();
		andar9();
		andar5();
		andar4();
		terreo();			

	}

}
