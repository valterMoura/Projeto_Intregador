//package Projeto_Intregador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ToRunAway {
	static Scanner entrada = new Scanner(System.in);

	static String menu() {
		// variaveis.
		int opcao;
		String nome = "", sexo;
		// Menu
		do {
			System.out.println("\t\t     TO RUN AWAY \n");

			System.out.println("                         |\r\n" + "                     _|__|__|_\r\n"
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
		return nome;
	}

	static int caracteristica() {
		int escolha;
		int caract = 0;

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
					System.out.println("Op��o 1 = For�a: 1, Intelig�ncia: 2, L�gica: 3");
					System.out.println("Op��o 2 = For�a: 2, Intelig�ncia: 3, L�gica: 1");
					System.out.println("Op��o 3 = For�a: 3, Intelig�ncia: 1, L�gica: 2");
					System.out.println("Escolha sua op��o:");
					caract = entrada.nextInt();
				}
			}

		} while (escolha != 1 && escolha != 2);
		return caract;

	}

	static void andar9(String nome, int caract) {

		int numero1 = 9, numero2 = 6, numero3 = 5, tentativas = 5;
		System.out.println(" Ol� " + nome + "!!");
		System.out.println("Seja bem vindo ao jogo!!!\n");
		System.out.println("Seu celular toca: **Prinnn**, nova mensagem recebida! \n");
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

	static void andar8() {
		int decisao;
		int caract = 1;
		System.out.println(
				"Parab�ns, voc� chegou ao 8� andar, agora se prepare porque ainda tem muito caminho pela frente!\n");
		System.out.println(
				"Agora voc� ter� que tomar uma importante decis�o, para acessar o 7� andar precisar� escolher por \nonde vai continuar sua fuga."
						+ " Apenas uma das op��es abaixo � a correta. Ap�s escolher a op��o \ncorreta voc� ter� um desafio "
						+ "a cumprir para garantir sua passagem para o 7� andar \n");

		do {
			// Decis�o
			System.out.println(
					"Escolha sua op��o: \n" + "1 - Elevador\n" + "2 - Escada\n" + "3 - Duto de ar\n" + "4 - Janela");

			decisao = entrada.nextInt();

			if (decisao == 1) {

				System.out.println(
						"Os elevadores foram desativados nesse andar! tente outra rota de fuga, se apresse porque os seguran�as est�o chegando! \n");

			} else if (decisao == 2) {

				System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem\n");

			} else if (decisao == 3) {

				System.out.println(
						"Os dutos de ar est�o bloqueados nesse andar! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando! \n");

			} else {

				System.out.println(
						"A janela deste andar est� emperrada! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando! \n");

			}

		} while (decisao != 2);

		if (caract == 1) {
			// Primeiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=14; \n" + "if (N%2==0){\n" + "   System.out.println('X') \n"
					+ "}else{ \n" + "   System.out.println('Y')\n" + "}\n");

			System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
			System.out.println("Qual � a op��o correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 2:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 1:
				System.out.println("Muito bem! Voc� acertou o desafio, entre que voc� ir� para o 7� andar!");
			}

		} else if (caract == 2) {
			// Segundo desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=-13; \n" + "if (N<0 && N%2==0){\n"
					+ "   System.out.println('X')\n" + "}else{ \n" + "   System.out.println('Y')\n" + "{\n");
			System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
			System.out.println("Qual � a op��o correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 1:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 2:
				System.out.println("Muito bem! Voc� acertou o desafio, entre que voc� ir� para o 7� andar!");
			}

		} else {
			// Terceiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=-14; \n" + "if (N>0){\n" + "   System.out.println('X') \n"
					+ "}else{ \n" + "   System.out.println('Y')\n" + "}\n");

			System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
			System.out.println("Qual � op��o correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 1:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 2:
				System.out.println("Muito bem! Voc� acertou o desafio, entre que voc� ir� para o 7� andar!");
			}

		}

	}

	static void andar3() {
		int decisao;
		int caract = 1;
		System.out.println(
				"Parab�ns, voc� chegou ao 3� andar, Voc� est� quase saindo, falta pouco! Agora voc� ter� que tomar mais uma importante decis�o.\n");
		System.out.println("Para acessar o 2� andar precisar� escolher por onde vai continuar sua fuga."
				+ " Apenas uma das op��es abaixo � a correta. \nAp�s escolher a op��o correta voc� ter� um desafio "
				+ "a cumprir para garantir sua passagem para o 2� andar. \n");

		do {
			// Decis�o
			System.out.println("Escolha sua op��o: \n" + "1 - Refeit�rio\n" + "2 - Banheiro\n"
					+ "3 - Sala de comunica��o\n" + "4 - Sala de seguran�a");

			decisao = entrada.nextInt();

			if (decisao == 1) {

				System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 2� andar.\n");

			} else if (decisao == 2) {

				System.out.println(
						"O banheiro est� interditado! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando!\n");

			} else if (decisao == 3) {

				System.out.println(
						"A sala de comunica��o foi fechada pelos seguran�as! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando! \n");

			} else {
				System.out.println(
						"A sala de seguran�a est� trancada! tente outra rota de fuga, se apresse porque os seguran�as est�o chegando! \n");

			}

		} while (decisao != 1);

		if (caract == 1) {
			// Primeiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n");
			System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n"
					+ "      if (N%i==0 && i%2==0){\n" + "          System.out.println(i)\n " + "  } \n" + "}\n");
			System.out.println("1) Dever� ser impresso os divisores pares de N.\n"
					+ "2) Dever� ser impresso os m�ltiplos pares de N.\n"
					+ "3) Dever� ser impresso os m�ltiplos �mpares de N.\n");

			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 2:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 1:
				System.out.println("Parab�ns! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!");
			}

		} else if (caract == 2) {
			// Segundo Desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n"
					+ "      if (N%i==0 && i%2!=0){\n" + "          System.out.println(i)\n " + "  } \n" + "}\n");
			System.out.println("1) Dever� ser impresso os divisores �mpares de N.\n"
					+ "2) Dever� ser impresso os divisores pares de N.\n"
					+ "3) Dever� ser impresso os m�ltiplos �mpares de N.\n");
			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 2:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 1:
				System.out.println("Parab�ns! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!");

			}

		} else {
			// Terceiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n" + "    if (N%i==0){\n"
					+ "      System.out.println(i)\n " + "  } \n" + "}\n");

			System.out.println("1) Devera ser impresso os m�ltiplos de N.\n"
					+ "2) Dever� ser impresso os divisores de N.\n" + "3) Dever� ser impresso o fatorial  de N.\n");

			System.out.println("Qual a op��o correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 1:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 2:
				System.out.println("Par�bens! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!");
			}

		}
	}

	static void andar4() {
		int quarto;
		double caract = Math.random() * 3;
		System.out.println("Voc� est� surpreendendo,  j� est� no 4� andar!");

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

		if (Math.ceil(caract) == 1) {
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
				System.out.println(
						"Se continuar assim, logo voc� estar� no t�rreo!! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		} else if (Math.ceil(caract) == 2) {
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
				System.out.println(
						"Se continuar assim, logo voc� estar� no t�rreo!! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
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
				System.out.println(
						"Se continuar assim, logo voc� estar� no t�rreo!! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		}
	}

	static void andar5(int caract) {
		int quinto;
		System.out.println("Eu n�o achava que seria poss�vel, mas voc� chegou ao 5� andar!");

		do {
			System.out.println(
					"Agora, para descer mais um andar voc� precisa decidir qual sentido pegar. Essa sala s� possui uma sa�da, ent�o � inevit�vel \n"
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
		System.out.println("\n" + "________ o\n" + "    ___  </v\n" + "   ___   -\\\n" + "          /\n");
		// desenho do personagem correndo

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
				System.out.println(
						"Voc� est� com muita sorte hein? Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
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
				System.out.println(
						"Voc� est� com muita sorte hein? Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
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
				System.out.println(
						"Voc� est� com muita sorte hein? Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
			}
		}
	}

	static void terreo(String nome) {
		int terreo;

		System.out.println("At� agora foi sorte.. Agora quero ver voc� sair dessa!! Voc� chegou no TERREO!\n"
				+ "Mas o jogo ainda n�o acabou! Esse � o andar mais protegido pelos seguran�as, e sair daqui n�o ser� t�o f�cil!!\n"
				+ "Em todas as sa�das h� dois seguran�as que n�o deixam ningu�m sair at� voc� ser capturado, e todas as pessoas est�o sendo vistoriadas.\n"
				+ "Para conseguir sair do pr�dio, voc� precisar� despistar os seguran�as e abrir as portas que est�o travadas! E a�? J� sabe como fazer isso?\n");
		System.out.println(
				"Primeiro passo ser� destravar as portas, para depois pensar em despistar os seguran�as. Mas para isso voc� precisar� hackear o sistema de ilumina��o \n"
						+ "� nessa hora que voc� testar� suas habilidades com a l�gica. E a partir desse momentos suas for�as e caracter�sticas, escolhidas no in�cio do jogo, n�o ter�o \n"
						+ "mais validade. Voc� est� sozinho(a) nessa " + nome + "!! Vamos ao desafio? 1 - SIM; ");
		terreo = entrada.nextInt();

		if (terreo == 1) {
			System.out.println("Ok, deixa eu te explicar! ");
		}

		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("Verdadeiro (true);"); // alternativa correta
		alternativas.add("Falso (false);");
		alternativas.add("6;");
		alternativas.add("9;");

		boolean acertou = false;

		do {

			Collections.shuffle(alternativas);

			System.out.println(
					"O sistema de ilumina��o � protegido por um c�digo, e para ter acesso ao c�digo voc� precisar� decifrar a quest�o abaixo: ");
			System.out.println(
					"Considerando a l�gica de programa��o e seus operadores l�gicos utilizados nas linguagens de programa��o, atente-se para a express�o abaixo.\n"
							+ "C * (B - A) <= D - B / C \n"
							+ "Qual seria o resultado da execu��o dessa express�o, caso o valor das vari�veis fossem: A=3; B=6; C=2 e D=9 ?");
			System.out.println("a) " + alternativas.get(0));
			System.out.println("b) " + alternativas.get(1));
			System.out.println("c) " + alternativas.get(2));
			System.out.println("d) " + alternativas.get(3));
			System.out.println("Escolha uma alternativa: ");
			String resposta = entrada.next();

			switch (resposta) {
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

		} while (!acertou);

		int[] vetor = new int[5];
		int[] vetorCorreto = { 2, 6, 11, 16, 18 };

		System.out.println(
				"Mais um ponto para voc�, o sistema de ilumina��o foi desativado e as portas est�o destravadas! Agora s� falta despistar os seguran�as..\n"
						+ "Para isso voc� precisar� ativar o alarme de inc�ndio. Dessa maneira haver� tumulto, e ser� sua oportunidade de escapar sem sem visto!\n"
						+ "O sistema de inc�ndio ser� ativado assim que voc� completar o c�digo abaixo conforme as instru��es. \n\n");
		System.out.println(
				"Considere os seguintes valores para as vari�veis. A = 10; B = 12; C = -2; D = 6; Agora responda as quest�es a seguir. Todas as \n"
						+ "respostas corretas formar�o um vetor que ativar� o sistema de inc�ndio. Mas preste muita aten��o, se errar uma quest�o o sistema de inc�ncio \n"
						+ "n�o ativa e os seguran�as receber�o uma mensagem alertando da tentativa. � a quest�o que te libertar� ou prender�. Depende apenas de voc�! \n"
						+ "Quest�o 1: \n"
						+ "Considerando os valores j� informados, qual seria o retorno da opera��o a seguir: A * C - B / D \n"
						+ "1 - 10 positivo; \n" + "2 - 22 negativo; \n" // RESPOSTA CORRETA
						+ "3 - 22 positivo; \n" + "4 - 18 positivo; \n");
		vetor[0] = entrada.nextInt();
		System.out.println("Quest�o 2: \n"
				+ "Usando o la�o WHILE, qual op��o abaixo corresponde ao enunciado: Fa�a um programa que mostre todos os n�meros inteiros de 1 a 50.\n"
				+ "5 - int i = 1;\n" + "    	while( i = 50) {\n" + "    	System.out.println(\"Inteiro \" + i );\n"
				+ "    	i = i + 1;\n" + "    	}; \n\n" + "6 - int i = 1;\n" + // RESPOSTA CORRETA
				"		while( i <= 50) {\n" + "		System.out.println(\"Inteiro \" + i );\n"
				+ "		i = i + 1;\n" + "	    }; \n\n" + "7 - int i = 1;\n" + "    	while( i >= 50) {\n"
				+ "    	System.out.println(\"Inteiro \" + i );\n" + "    	i = i + 1;\n" + "    	}; \n\n"
				+ "8 - int i = 1;\n" + "    	while( i <= 50) {\n"
				+ "    	System.out.println(\"Inteiro \" + i );\n" + "    	i = i - 1;\n" + "    	}; \n\n"
				+ "Qual a op��o correta? \n");
		vetor[1] = entrada.nextInt();
		System.out.println("Quest�o 3: \n"
				+ "Considerando os valores j� informados, qual seria o retorno da opera��o a seguir: A + C - B / D \n"
				+ "9 - 6 negativo; \n" + "10 - 0 zero; \n" + "11 - 6 positivo; \n" // RESPOSTA CORRETA
				+ "12 - 1 positivo; \n");
		vetor[2] = entrada.nextInt();
		System.out.println("Quest�o 4: \n"
				+ "Qual dos programas abaixo gera a seguinte s�rie: 10, 20, 30, 40, ..., at� 1000 utilizando o la�o FOR.\n"
				+ "13 - int i;\n" + "        for(i = 10; i = 1000; i = i + 10){\n"
				+ "            System.out.println(\"Sequencia\" + i);\n" + "            }; \n\n" + "14 - int i;\n"
				+ "        for(i = 10; i >= 1000; i = i++){\n" + "            System.out.println(\"Sequencia\" + i);\n"
				+ "            }; \n\n" + "15 - int i;\n" + "        for(i = 10; i <= 1000; i = i++){\n"
				+ "            System.out.println(\"Sequencia\" + i);\n" + "            }; \n\n" + "16 - int i;\n" + // RESPOSTA
																														// CORRETA
				"        for(i = 10; i <= 1000; i = i + 10){\n" + "            System.out.println(\"Sequencia\" + i);\n"
				+ "            }; \n\n");
		vetor[3] = entrada.nextInt();
		System.out.println("Quest�o 5: \n"
				+ "Qual dos programas abaixo imprime todos os m�ltiplos de 7 menores que 200 utilizando o la�o WHILE?\n"
				+ "17 - int i = 7;\n" + "        while(i<200){\n"
				+ "            System.out.println(i + \" � m�ltiplo de 7\");\n" + "            i = i * 7;\n"
				+ "        }; \n\n" + "18 - int i = 7;\n" + // RESPOSTA CORRETA
				"        while(i<200){\n" + "            System.out.println(i + \" � m�ltiplo de 7\");\n"
				+ "            i = i + 7;\n" + "        }; \n\n" + "19 - int i = 0;\n" + "        while(i<=200){\n"
				+ "            System.out.println(i + \" � m�ltiplo de 7\");\n" + "            i = i + 7;\n"
				+ "        }; \n\n" + "20 - int i = 7;\n" + "        while(i<=200){\n"
				+ "            System.out.println(i + \" � m�ltiplo de 7\");\n" + "            i = i + 7;\n"
				+ "        }; \n\n");
		vetor[4] = entrada.nextInt();

		System.out.println("Suas respostas criaram o vetor: vetor[" + vetor[0] + ", " + vetor[1] + ", " + vetor[2]
				+ ", " + vetor[3] + ", " + vetor[4] + "].");

		if (Arrays.equals(vetor, vetorCorreto)) {
			System.out.println("Sistema de inc�ndio ativado. Seguran�as foram distra�dos e voc� escapou!!!\n"
					+ "Parab�ns! Voc� conseguiu provar suas habilidades!!! Agora � s� comemorar!! \n\n"
					+ "   .* *.               `o`o`\r\n" + "         *. .*              o`o`o`o      ^,^,^\r\n"
					+ "           * \\               `o`o`     ^,^,^,^,^\r\n"
					+ "              \\     ***        |       ^,^,^,^,^\r\n"
					+ "               \\   *****       |        /^,^,^\r\n"
					+ "                \\   ***        |       /\r\n" + "    ~@~*~@~      \\   \\         |      /\r\n"
					+ "  ~*~@~*~@~*~     \\   \\        |     /\r\n"
					+ "  ~*~@smd@~*~      \\   \\       |    /     #$#$#        .`'.;.\r\n"
					+ "  ~*~@~*~@~*~       \\   \\      |   /     #$#$#$#   00  .`,.',\r\n"
					+ "    ~@~*~@~ \\        \\   \\     |  /      /#$#$#   /|||  `.,'\r\n"
					+ "_____________\\________\\___\\____|_/______/_________|\\/\\___||______");

		} else {
			System.out.println("SENHA ERRADA! Seguran�as foram alarmados e voc� est� preso(a)!!!\n\n"
					+ "MM'\"\"\"\"\"`MM                              \r\n"
					+ "M' .mmm. `M                              \r\n" + "M  MMMMMMMM .d8888b. 88d8b.d8b. .d8888b. \r\n"
					+ "M  MMM   `M 88'  `88 88'`88'`88 88ooood8 \r\n" + "M. `MMM' .M 88.  .88 88  88  88 88.  ... \r\n"
					+ "MM.     .MM `88888P8 dP  dP  dP `88888P' \r\n" + "MMMMMMMMMMM                              \r\n"
					+ "                                         \r\n"
					+ "MMP\"\"\"\"\"YMM                            dP \r\n"
					+ "M' .mmm. `M                            88 \r\n"
					+ "M  MMMMM  M dP   .dP .d8888b. 88d888b. 88 \r\n"
					+ "M  MMMMM  M 88   d8' 88ooood8 88'  `88 dP \r\n"
					+ "M. `MMM' .M 88 .88'  88.  ... 88          \r\n"
					+ "MMb     dMM 8888P'   `88888P' dP       oo \r\n"
					+ "MMMMMMMMMMM                               \r\n" + "                                          ");

		}
	}
	static void andar2() {
		char escolhas[] = new char[4];
		// gabarito: B, A, A e Todas

		// Chegada
		System.out.println("Muito bem! Você chegou ao 2º andar!");
		System.out.println("Você chega no refeitório do segundo andar. Ao passar pela porta de saída, você observa um ");
		System.out.println("amplo salão de cubículos. Você está em um dos extremos, e no outro você o acesso: ao elevador, ");
		System.out.println("às escadas normais, e às escadas de incêndio. Porém, para chegar a qualquer uma dessas opções, ");
		System.out.println("você deve passar pelos cubículos.");
		System.out.println("Em um dos corredores laterais, do lado no qual você está, há uma mesa do setor de segurança, ");
		System.out.println("onde há um guarda de costas para você. Um dos cubículos à sua frente está desocupado, e você ");
		System.out.println("entra nele para acessar o computador, e tentar obter o diagrama de rede do salão.");
		
		// Desafio 1 (correta: b)
		do {
			System.out.println("Ao tirar o computador de modo de espera, você vê na tela uma pergunta para liberar o acesso ao ");
			System.out.println("computador:");
			System.out.println("'Em uma linguagem estruturada, quais as três principais estruturas de instruções?'");
			
			System.out.println("a) Objetos, métodos e atributos");
			System.out.println("b) Sequencial, decisão e repetição");
			System.out.println("c) listas, pilhas e árvores  ");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[0] = escolha.charAt(0);

			if (escolhas[0] == 'a') {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println("cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}
			if (escolhas[0] == 'b') {
				System.out.println("Esta é a resposta certa, e você consegue acesso ao computador.");
			}
			if (escolhas[0] == 'c') {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println("cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}

			if (escolhas[0] != 'b')
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 'b');
		
		
		System.out.println("No computador você tenta acessar o servidor ou roteador que interliga esses computadores. ");
		
		System.out.println("Você abre o navegador e digita '192.168.0.1' e para a sua surpresa, uma página de administração ");
		System.out.println("se abre. Pelo jeito, nada de servidor, nem administrador profissional: sem senha.");
		System.out.println("Você abre uma aba chamada chamada 'Clientes', e vê uma lista de clientes atualmente conectados. ");
		System.out.println("A página exibe 26 clientes, 13 ativos. Após uma olhada, você observa que há 5 filas de 5 cubículos. ");
		System.out.println("O computador no qual você está é o ... .0.6. Com essas informações você monta duas matrizes.");
		System.out.println("Em uma, o computador  ... .0.2 está para a sua direita, e na outra, ele está para sua frente.");
		System.out.println("Na fila à sua frente, o caminho estaria livre. Na fila à sua direita não, além da mesa do segurança.");
		System.out.println("Ao olhar de novo, você que na mesa do segurança não é um segurança sentado, mas alguem mexendo no ");
		System.out.println("computador. Essa pessoa junta suas coisas, sai da mesa em diração à saída. Passa pelo seu cubículo ");
		System.out.println("sem lhe notar e entra no elevador.");
		
		
		
		// Desafio 2 (correta: a)
		do {
			System.out.println("Imediatamente você se senta à mesa e tenta acessar o diagrama dos cubículos. Porém, percebe que o ");
			System.out.println("código do diagrama está incompleto! Falta terminar o laço que preenche a matriz com cubículos ");
			System.out.println("cheios ou vazios.");
			System.out.println("Que opção de estrutura de código concluiria esse serviço de modo simples?.");

			System.out.println("a) Dois laços for com if's para verificar a ocupação.");
			System.out.println("b) Dois do-while com a condição de número de cubículos.");
			System.out.println("c) Um grande switch verificando ocupações.");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[1] = escolha.charAt(0);

			if (escolhas[1] == 'a') {
				System.out.println(
						"O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a seguir ");
				System.out.println("é o entre os cubículos. Você segue por esse caminho.");
			}
			if (escolhas[1] == 'b') {
				System.out.println("O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a frente ");
				System.out.println("do seu cubículo está livre. Ao segui por esse caminho, você é surpreendido por haver alguém ");
				System.out.println("em um dos cubículos! Seu código produziu um resultado errado. A pessoa grita, o segurança ");
				System.out.println("vê e detém você.");
			}
			if (escolhas[1] == 'c') {
				System.out.println(
						"O computador roda o código, mas mensagens de erro são exibidas. Você tenta corrir o código, mas nada ");
				System.out.println("funciona. Após algumas tentativas, você perde noção do tempo e o segurança aparece atrás de");
				System.out.println("você e detém você!");
			}

			if (escolhas[1] != 'a')
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[1] != 'a');
		
		
		System.out.println("Você segue entre os cubículos, mas alguém faz barulho como se fosse se levantar, e você entra em ");
		System.out.println("um dos cubículos. Enquanto isso, o técnico de TI volta e vê que alguém completou o código. ");
		System.out.println("Imediatamente, ele comunica o fato ao segurança, que pergunta quanto tempo faz que a alteração foi ");
		System.out.println("feita. O técnico procura a informação.");
		System.out.println("Nisso, a pessoa que saiu do cubículo passa pelo segurança, e quando perguntada, essa pessoa diz que ");
		System.out.println("não tinha visto ninguém estranho por alí.");
		System.out.println("Abaixado, você se desloca até a saída da área de cubículos. Porém, você é surpreendido, pois não há ");
		System.out.println("passagem entre os dois cubículos por onde você passaria; há pilhas de caixas que não era visível ");
		System.out.println("antes. E passar por cima seria algo notado.");
		System.out.println("Os dois cubículos perto de você estão vagos. Você em um de decide usar suas habilidades para derubar ");
		System.out.println("a rede e tentar fazer algumas pessoas fazerem uma pausa e iram ao refeitório para um café.");
		System.out.println("No computador você acessa o roteador novamente. Bloqueia todos e coloca uma senha.");
		System.out.println("Logo algumas pessoas reclamam com o técnico que estava alí, sem que ele conseguisse resolver, pois o ");
		System.out.println("roteador na verdade é um software no servido de segurança que fica em outro local, e mexer nele seria ");
		System.out.println("complicado.");
		System.out.println("Várias pessoas se frustram com a situação e seguem para o refeitório, resmungando impropérios ");
		System.out.println("relacionados ao técnico.");
		System.out.println("Com isso, há menos gente nos cubículos, mas não há como saber quais estão vazios.");
		
		
		// Desafio 3 (correta: a)
		do {
			System.out.println("Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
			System.out.println("estão presas por uma trava eletrônica.");
			System.out.println("Um post-it no monitor faz referência a essa senha, seguido de: ");
			System.out.println("'Incremente antes de retornar o valor'");
			System.out.println("e 'três erros emite alarme sonoro'");
			
			System.out.println("Você pensa e considera três opções: ");
			System.out.println("a) ++i");
			System.out.println("b) i++");
			System.out.println("c) i+=1");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[2] = escolha.charAt(0);

			if (escolhas[2] == 'a') {
				System.out.println(
						"Senha correta! A trava libera as pilhas e você move lentamente uma delas até ter um espaço para passar. ");
			}
			if (escolhas[2] == 'b') {
				System.out.println("Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
				
			}
			if (escolhas[2] == 'c') {
				System.out.println("Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
			}

			if (escolhas[2] != 'a')
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[2] != 'a');
		
		
		System.out.println("Andando abaixado você chega até as saídas. À sua frente está o elevador, à sua esquerda o acesso às ");
		System.out.println("escadas normais, e à direita tem a janela que dá para a escada de incêndio.");
	
		// Saída (todas)
		
			System.out.println("Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
				
			System.out.println("Qual dos três caminhos você escolhe: ");
			System.out.println("a) Escadas normais");
			System.out.println("b) Elevador");
			System.out.println("c) Escada de incêndio");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[3] = escolha.charAt(0);

			if (escolhas[3] == 'a') {
				System.out.println("Ao se aproximar das escadas, você ouve passos. Você se encosta na parede entre a porta e o ");
				System.out.println("elevador. Um funcionário da limpeza sai das escadas sem ver você. Rapidamente, você ");
				System.out.println("entra nas escadas e desce para o 1o andar.");
			}
			if (escolhas[3] == 'b') {
				System.out.println("Ao se aproximas do elevador, você vê que ele já estava descendo, e pode ter pessoas dentro. ");
				System.out.println("Você fica entre o elevador e a janela, como se estivesse eperando e olhando o lado de fora. ");
				System.out.println("Duas pessoas saem do elevador conversando e não percebem você. Você entra no elevador vazio e ");
				System.out.println("desce para o 1o andar.");
				
			}
			if (escolhas[3] == 'c') {
				System.out.println("Você olha para ver se tem alguém vendo. O guarda e o técnico estão distantes discutindo sobre ");
				System.out.println("os problemas no servidor. Você aproveita, abre a janela e desce pela escada até o 1o andar.");
			}

		
		
	}
	static void andar7() {
		char escolhas[] = new char[3];
		//gabarito: C, C, e B
		
		// Chegada
		System.out.println("Muito bem! Você chegou ao 7º andar!");

		// Desafio 1 (correta: c)
		do {
			System.out.println("Ao sair das escadas, você se depara com um corredor de portas, ");
			System.out.println("um bilhete no chão e uma câmera acima do acesso 'as escadas, que varre de lado a lado.");
			System.out.println("No bilhete lê-se:");
			System.out.println("'A porta que leva 'a saída é aquela em que o número da porta está ");
			System.out.println("associado ao resultado da seguinte pergunta:");
			System.out.println("Qual laço de repetição pode ser usado para situações nas quais se tem que ");
			System.out.println("verificar a condição após a execução do bloco de código?");
			System.out.println("a) Porta1 : while");
			System.out.println("b) Porta2 : for");
			System.out.println("c) Porta3 : do-while'");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[0] = escolha.charAt(0);

			if (escolhas[0] != 'c')
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 'c');

		// Desafio 2
		do {
			System.out.println("A porta que você escolheu dá na cozinha. Na pia você vê a cafeteira com café pronto.");
			System.out.println("Você coloca um pouco em uma caneca, mas ouve alguém se aproximando da cozinha.");
			System.out.println("Rapidamente, você procura para onde tentar ir. Você vê: ");
			System.out.println("a) compartimento abaixo da pia, com porta para fechar");
			System.out.println("b) Um armário ao lado da pia");
			System.out.println("c) Em baixo de uma mesa com quatro cadeiras próxima a um canto da cozinha");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[1] = escolha.charAt(0);

			if (escolhas[1] == 'a') {
				System.out.println(
						"Ao tentar entrar de baixo da pia você percebe que não cabe, e o guarda que entra na cozinha o vê!");
			}
			if (escolhas[1] == 'b') {
				System.out.println("Você consegue entrar no armário, mas os produtos de limpeza lá dentro fazem que você espirre, ");
				System.out.println("e o guarda que entrou na cozinha é alertado da sua presença!");
			}
			if (escolhas[1] == 'c') {
				System.out.println(
						"Apesar de a mesa não ser um local muito protegido, o guarda que entrou na cozinha, passa por ela ");
				System.out.println("sem perceber a sua presença.");
			}

			if (escolhas[1] != 'c')
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[1] != 'c');

		// Desafio 3
		do {
			System.out.println("Ao sair da cozinha, você vê um salão com vários cubículos. Em alguns arece haver gente trabalhando, ");
			System.out.println(" e bastante ocupados. Você deve manter-se depercebido.");
			System.out.println("Duas das laterais desse salão são janelas. Algumas, próximas a uma parede, há um acesso à ");
			System.out.println(" escada de emergência. Porém, para acessá-la, você teria que ser visto por alguns ocupantes ");
			System.out.println(" dos cubículos. Você procura opções para evitar isso. Uma mesa fora dos cubículos, parece ser ");
			System.out.println("do setor de segurança e está desocupada. Provavelmente é o posto do guarda que passou pela cozinha. ");
			System.out.println(" Ao se aproximar da mesa, no monitor você observa que aparece uma mensagem"); 
			System.out.println("'Para acessar o diagrama de utilização dos cubículos responda: ");
			System.out.println("Em uma estrutura switch, qual declaração, que quando presente, é executada quando"
					+ "nenhum dos casos ocorre?");
			System.out.println("a) Break");
			System.out.println("b) default");
			System.out.println("c) goto");
			System.out.println("Qual a sua escolha?(a, b ou c): ");
			String escolha = entrada.next();
			escolhas[1] = escolha.charAt(0);

			if (escolhas[1] == 'a')
				System.out.println(
						"Esta resposta é uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende você.");
			if (escolhas[1] == 'b')
				System.out.println(
						"Resposta certa. O diagrama aparece e você vê que os dois cubículos voltados para a parede ");
				System.out.println("no caminho da janela estão desocupados, permitindo acesso. Você abre a janela e desce para ");
				System.out.println("o 6o andar.");
			if (escolhas[1] == 'c')
				System.out.println(
						"Esta resposta é uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende você.");

			if (escolhas[1] != 'b')
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[1] != 'b');

	}

	public static void main(String[] args) {
		String nome = menu();
		int caract = caracteristica();
		andar9(nome, caract);
		andar8();
		andar7();
		andar5(caract);
		andar4();
		andar3();
		andar2();
		terreo(nome);
	}
}
