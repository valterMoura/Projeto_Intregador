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

				boolean sex = true;
				do {
					System.out.print(
							"\n�timo. Para completar essa etapa s� temos mais uma perguntinha.. Qual o seu g�nero? ");
					System.out.println("M => Masculino  F => Feminino");
					sexo = entrada.next();

					if (sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("F")) {
						System.out.println("Ok, entendido!");
						sex = true;
					} else {
						System.out.println("Resposta inv�lida! Verifique.. ");
						sex = false;
					}
				} while (sex != true);

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
				menu();
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
					do {
						System.out.println(
								"\nEssa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
						System.out.println("Op��o 1 = For�a: 1, Intelig�ncia: 2, L�gica: 3");
						System.out.println("Op��o 2 = For�a: 2, Intelig�ncia: 3, L�gica: 1");
						System.out.println("Op��o 3 = For�a: 3, Intelig�ncia: 1, L�gica: 2");
						System.out.println("Escolha sua op��o:");
						caract = entrada.nextInt();
					} while (caract < 1 || caract > 3);
				}
			} else {
				do {
					System.out.println(
							"\nEssa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
					System.out.println("Op��o 1 = For�a: 1, Intelig�ncia: 2, L�gica: 3");
					System.out.println("Op��o 2 = For�a: 2, Intelig�ncia: 3, L�gica: 1");
					System.out.println("Op��o 3 = For�a: 3, Intelig�ncia: 1, L�gica: 2");
					System.out.println("Escolha sua op��o:");
					caract = entrada.nextInt();
				} while (caract < 1 || caract > 3);

			}

		} while (escolha != 1 && escolha != 2);
		return caract;

	}

	static void andar9(String nome, int caract) {
		// int reload=1;
		int numero1, numero2, numero3, tentativas = 5;
		System.out.println(" Ol� " + nome + "!!");
		System.out.println("Seja bem vindo ao jogo!!!\n");
		System.out.println("Seu celular toca: **Prinnn**, nova mensagem recebida! \n");
		System.out.println("Mensagem: SISTEMA DE SEGURAN�A ATIVADO! Por medida de seguran�a, permane�a onde est�!\n ");
		System.out.println(
				" A TI Universal encontrou provas contra voc� e bloqueou toda a empresa com o objetivo de te capturar. \n"
						+ "Voc� est� preso na sala de comando, e a �nica maneira de sair da sala � hackeando o sistema de seguran�a. \n"
						+ "Desta maneira voc� ir� desativar a trava das sa�das dispon�veis, e tamb�m desativar as c�meras para que ningu�m te encontre!");

		if (caract == 2) {
			System.out.println(
					"Para desativar o sistema de seguran�a, voc� precisar� da senha de acesso.\nA mesma � composta por "
							+ "tr�s digitos, e a soma dos tr�s digitos � igual a 20.\nsenha:__+__+__= 20\n"); // continuar
																												// com
																												// informa��es
																												// da
																												// senha
			do {
				if (tentativas == 0) {
					System.out.println("GAME OVER\n");
					fimdejogo();
				}
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
				} else if (numero1 == 9 && numero2 != 6 && numero3 == 5) {
					System.out.println(" 9+__+ 5= 20\n");
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
				

			} while (numero1 != 9 || numero2 != 6 || numero3 != 5);
		}else if(caract == 1) {
			System.out.println(
					"Para desativar o sistema de seguran�a, voc� precisar� da senha de acesso.\nA mesma � composta por  "
							+ " tr�s digitos, e a soma dos tr�s digito � igual a 10.\nsenha:__+__+__= 10\n"); // continuar
																												// com
																												// informa��es
																												// da
																												// senha
			do {if (tentativas == 0) {
					System.out.println("GAME OVER\n");
					fimdejogo();
				}
				
				System.out.println("digite o primeiro digito");
				numero1 = entrada.nextInt();
				System.out.println("digite o segundo digito");
				numero2 = entrada.nextInt();
				System.out.println("digite o terceiro digito");
				numero3 = entrada.nextInt();
				if (numero1 == 5 && numero2 != 3 && numero3 != 2) {
					System.out.println(" 5+__+__= 10");
				} else if (numero1 == 5 && numero2 == 3 && numero3 != 2) {
					System.out.println(" 5+ 3+__= 10\n");
				} else if (numero1 == 5 && numero2 == 3 && numero3 == 2) {
					System.out.println(" 5+ 3+ 2= 10\n");
				} else if (numero1 == 5 && numero2 != 3 && numero3 == 2) {
					System.out.println(" 5+__+ 2= 10\n");
				} else if (numero1 != 5 && numero2 == 3 && numero3 != 2) {
					System.out.println("__+ 3+__= 10\n");
				} else if (numero1 != 5 && numero2 != 3 && numero3 == 2) {
					System.out.println("__+__+ 2= 10\n");
				} else if (numero1 != 5 && numero2 == 3 && numero3 == 2) {
					System.out.println("__+ 3+ 2= 10\n");
				} else {
					System.out.println("__+__+__= 10\n");
				}
				tentativas--;
				

			} while (numero1 != 5 || numero2 != 3 || numero3 != 2);
			
		}else {
			System.out.println(
					"Para desativar o sistema de seguran�a, voc� precisar� da senha de acesso.\nA mesma � composta por  "
							+ " tr�s digitos, e a soma dos tr�s digito � igual a 15.\nsenha:__+__+__= 15\n"); // continuar
																												// com
																												// informa��es
																												// da
																												// senha
			do {if (tentativas == 0) {
					System.out.println("GAME OVER\n");
					fimdejogo();
				}
				System.out.println("digite o primeiro digito");
				numero1 = entrada.nextInt();
				System.out.println("digite o segundo digito");
				numero2 = entrada.nextInt();
				System.out.println("digite o terceiro digito");
				numero3 = entrada.nextInt();
				if (numero1 == 6 && numero2 != 5 && numero3 != 4) {
					System.out.println(" 6+__+__= 15");
				} else if (numero1 == 6 && numero2 == 5 && numero3 != 4) {
					System.out.println(" 6+ 5+__= 15\n");
				} else if (numero1 == 6 && numero2 == 5 && numero3 == 4) {
					System.out.println(" 6+ 5+ 4= 15\n");
				} else if (numero1 == 6 && numero2 != 5 && numero3 == 4) {
					System.out.println(" 6+__+ 4= 15\n");
				} else if (numero1 != 6 && numero2 == 5 && numero3 != 4) {
					System.out.println("__+ 5+__= 15\n");
				} else if (numero1 != 6 && numero2 != 5 && numero3 == 4) {
					System.out.println("__+__+ 4= 15\n");
				} else if (numero1 != 6 && numero2 == 5 && numero3 == 4) {
					System.out.println("__+ 5+ 4= 15\n");
				} else {
					System.out.println("__+__+__= 15\n");
				}
				tentativas--;
				

			} while (numero1 != 6 || numero2 != 5 || numero3 != 4);
			
		}

		int opcao = 0;

		System.out.println(
				"Muito bem! Voc� conseguiu a senha e agora tem a oportunidade de sair da sala de comando e tentar escapar. \n"
						+ "A sala possui tr�s sa�das: \n"
						+ "PORTA: Saindo pela porta voc� poder� descer pela escada ou pelo elevador, mas existe a chance de encontrar algum seguran�a que \n"
						+ "est� vindo te prender!\n"
						+ "JANELA: Saindo pela janela voc� encontrar� uma escada externa de sa�da de emerg�ncia. Com ela voc� pode acessar o andar abaixo, por�m\n"
						+ "devido as condi��es atuais do pr�dio n�o tem como saber o estado de conserva��o da mesma.\n"
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
		// return reload;
	}

	static void andar8(int caract) {
		int decisao;
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

				System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 7� andar.\n");

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
				fimdejogo();
			case 1:				
				break;
				default:
					System.out.println("Resposta inv�lida! GAME OVER!");
					fimdejogo();													
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
				fimdejogo();
			case 2:				
				break;
			   default:
				System.out.println("Resposta inv�lida! GAME OVER!");
				fimdejogo();
			}

		} else if(caract==3) {
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
				fimdejogo();
			case 2:				
				break;
			default:
				System.out.println("Resposta inv�lida! GAME OVER!");
				fimdejogo();
			}

		}

	}

	static void andar3(int caract) {
		int decisao;
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
				fimdejogo();
			case 1:
				System.out.println("Parab�ns! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!");
				break;
			default:
				System.out.println("Resposta inv�lida! GAME OVER!");
				fimdejogo();
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
				fimdejogo();
			case 1:
				System.out.println("Parab�ns! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!");
				break;
			default:
				System.out.println("Resposta inv�lida! GAME OVER!");
				fimdejogo();

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
				fimdejogo();
			case 2:
				System.out.println("Par�bens! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!");
				break;
			default:
				System.out.println("Resposta inv�lida! GAME OVER!");
				fimdejogo();
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
			} else if (quarto == 3) {
				System.out.println("Muito bom!\n");

			} else {
				System.out.println("Op��o inv�lida!!\n");
			}
		} while (quarto != 3);

		System.out.println("Agora que voc� encontrou o duto, preencha o algoritmo para liberar sua entrada!!\n");

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
				fimdejogo();
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
				fimdejogo();
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
				fimdejogo();
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
			} else if (quinto == 2) {
				System.out.println("Muito bom!");
				break;
			} else {
				System.out.println("Op��o inv�lida!!");
			}
		} while (quinto != 2);

		System.out.println(
				"Ok, agora que voc� sabe que s� conseguir� ter acesso ao pr�ximo andar pelo elevador, pode tentar acessar ao mesmo.Corre!!!\n");
		System.out.println("\n" + "________   o\n" + "    ___  </v\n" + "   ___   -\\\n" + "          /\n");
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
				fimdejogo();
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
				fimdejogo();
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
				fimdejogo();
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
			fimdejogo();

		}
	}

	static void andar2() {
		int escolhas[] = new int[4];

		// Possibilidade de Game Over no desafio 2
		int tentativas = 5;

		// gabarito: 2, 1, 1 e Todas

		// Chegada
		System.out.println("Muito bem! Voc� chegou ao 2� andar!");
		System.out
				.println("Voc� chega no refeit�rio do segundo andar. Ao passar pela porta de sa�da, voc� observa um ");
		System.out.println(
				"amplo sal�o de cub�culos. Voc� est� em um dos extremos, e no outro voc� o acesso: ao elevador, ");
		System.out.println(
				"�s escadas normais, e �s escadas de inc�ndio. Por�m, para chegar a qualquer uma dessas op��es, ");
		System.out.println("voc� deve passar pelos cub�culos.");
		System.out.println(
				"Em um dos corredores laterais, do lado no qual voc� est�, h� uma mesa do setor de seguran�a, ");
		System.out.println(
				"onde h� um guarda de costas para voc�. Um dos cub�culos � sua frente est� desocupado, e voc� ");
		System.out.println("entra nele para acessar o computador, e tentar obter o diagrama de rede do sal�o.");

		// Desafio 1 (correta: 1)
		do {
			System.out.println(
					"Ao tirar o computador de modo de espera, voc� v� na tela uma pergunta para liberar o acesso ao ");
			System.out.println("computador:");
			System.out.println("'Em uma linguagem estruturada, quais as tr�s principais estruturas de instru��es?'");

			System.out.println("1) Objetos, m�todos e atributos");
			System.out.println("2) Sequencial, decis�o e repeti��o");
			System.out.println("3) listas, pilhas e �rvores  ");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[0] = entrada.nextInt();

			if (escolhas[0] == 1) {
				System.out.println(
						"A resposta � uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println(
						"cub�culo em frente. Achando que � um colega, ele levanta para falar com voc� e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}
			if (escolhas[0] == 2) {
				System.out.println("Esta � a resposta certa, e voc� consegue acesso ao computador.");
			}
			if (escolhas[0] == 3) {
				System.out.println(
						"A resposta � uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println(
						"cub�culo em frente. Achando que � um colega, ele levanta para falar com voc� e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}

			if (escolhas[0] != 2)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 2);

		System.out
				.println("No computador voc� tenta acessar o servidor ou roteador que interliga esses computadores. ");

		System.out.println(
				"Voc� abre o navegador e digita '192.168.0.1' e para a sua surpresa, uma p�gina de administra��o ");
		System.out.println("se abre. Pelo jeito, nada de servidor, nem administrador profissional: sem senha.");
		System.out.println(
				"Voc� abre uma aba chamada chamada 'Clientes', e v� uma lista de clientes atualmente conectados. ");
		System.out.println(
				"A p�gina exibe 26 clientes, 13 ativos. Ap�s uma olhada, voc� observa que h� 5 filas de 5 cub�culos. ");
		System.out.println(
				"O computador no qual voc� est� � o ... .0.6. Com essas informa��es voc� monta duas matrizes.");
		System.out.println(
				"Em uma, o computador  ... .0.2 est� para a sua direita, e na outra, ele est� para sua frente.");
		System.out.println(
				"Na fila � sua frente, o caminho estaria livre. Na fila � sua direita n�o, al�m da mesa do seguran�a.");
		System.out.println(
				"Ao olhar de novo, voc� que na mesa do seguran�a n�o � um seguran�a sentado, mas alguem mexendo no ");
		System.out.println(
				"computador. Essa pessoa junta suas coisas, sai da mesa em dira��o � sa�da. Passa pelo seu cub�culo ");
		System.out.println("sem lhe notar e entra no elevador.");

		// Desafio 2 (correta: 1)
		do {
			System.out.println(
					"Imediatamente voc� se senta � mesa e tenta acessar o diagrama dos cub�culos. Por�m, percebe que o ");
			System.out.println(
					"c�digo do diagrama est� incompleto! Falta terminar o la�o que preenche a matriz com cub�culos ");
			System.out.println("cheios ou vazios.");
			System.out.println("Que op��o de estrutura de c�digo concluiria esse servi�o de modo simples?.");

			System.out.println("1) Dois la�os for com if's para verificar a ocupa��o.");
			System.out.println("2) Dois do-while com a condi��o de n�mero de cub�culos.");
			System.out.println("3) Um grande switch verificando ocupa��es.");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[1] = entrada.nextInt();

			if (escolhas[1] == 1) {
				System.out.println(
						"O computador roda o c�digo e o diagrama � desenhado na tela e voc� v� que o caminho a seguir ");
				System.out.println("� o entre os cub�culos. Voc� segue por esse caminho.");
			}
			if (escolhas[1] == 2) {
				System.out.println(
						"O computador roda o c�digo e o diagrama � desenhado na tela e voc� v� que o caminho a frente ");
				System.out.println(
						"do seu cub�culo est� livre. Ao segui por esse caminho, voc� � surpreendido por haver algu�m ");
				System.out.println(
						"em um dos cub�culos! Seu c�digo produziu um resultado errado. A pessoa grita, o seguran�a ");
				System.out.println("v� e det�m voc�.");
				System.out.println("Resposta errada.");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"O computador roda o c�digo, mas mensagens de erro s�o exibidas. Voc� tenta corrir o c�digo, mas nada ");
				System.out.println(
						"funciona. Ap�s algumas tentativas, voc� perde no��o do tempo e o seguran�a aparece atr�s de");
				System.out.println("voc� e det�m voc�!");
				System.out.println("Resposta errada.");
			}

			if (escolhas[1] != 1) {
				tentativas--;
			}
			if (tentativas == 1) {
				System.out.println("GAME OVER\n");
				menu();
			}

		} while (escolhas[1] != 1);

		System.out.println(
				"Voc� segue entre os cub�culos, mas algu�m faz barulho como se fosse se levantar, e voc� entra em ");
		System.out
				.println("um dos cub�culos. Enquanto isso, o t�cnico de TI volta e v� que algu�m completou o c�digo. ");
		System.out.println(
				"Imediatamente, ele comunica o fato ao seguran�a, que pergunta quanto tempo faz que a altera��o foi ");
		System.out.println("feita. O t�cnico procura a informa��o.");
		System.out.println(
				"Nisso, a pessoa que saiu do cub�culo passa pelo seguran�a, e quando perguntada, essa pessoa diz que ");
		System.out.println("n�o tinha visto ningu�m estranho por al�.");
		System.out.println(
				"Abaixado, voc� se desloca at� a sa�da da �rea de cub�culos. Por�m, voc� � surpreendido, pois n�o h� ");
		System.out.println(
				"passagem entre os dois cub�culos por onde voc� passaria; h� pilhas de caixas que n�o era vis�vel ");
		System.out.println("antes. E passar por cima seria algo notado.");
		System.out.println(
				"Os dois cub�culos perto de voc� est�o vagos. Voc� em um de decide usar suas habilidades para derubar ");
		System.out
				.println("a rede e tentar fazer algumas pessoas fazerem uma pausa e iram ao refeit�rio para um caf�.");
		System.out.println("No computador voc� acessa o roteador novamente. Bloqueia todos e coloca uma senha.");
		System.out.println(
				"Logo algumas pessoas reclamam com o t�cnico que estava al�, sem que ele conseguisse resolver, pois o ");
		System.out.println(
				"roteador na verdade � um software no servido de seguran�a que fica em outro local, e mexer nele seria ");
		System.out.println("complicado.");
		System.out.println(
				"V�rias pessoas se frustram com a situa��o e seguem para o refeit�rio, resmungando improp�rios ");
		System.out.println("relacionados ao t�cnico.");
		System.out.println("Com isso, h� menos gente nos cub�culos, mas n�o h� como saber quais est�o vazios.");

		// Desafio 3 (correta: 1)
		do {
			System.out.println(
					"Voc� observa que seria poss�vel mover uma das pilhas de modo a permitir passagem, mas as caixas ");
			System.out.println("est�o presas por uma trava eletr�nica.");
			System.out.println("Um post-it no monitor faz refer�ncia a essa senha, seguido de: ");
			System.out.println("'Incremente antes de retornar o valor'");
			System.out.println("e 'tr�s erros emite alarme sonoro'");

			System.out.println("Voc� pensa e considera tr�s op��es: ");
			System.out.println("1) ++i");
			System.out.println("2) i++");
			System.out.println("3) i+=1");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[2] = entrada.nextInt();

			if (escolhas[2] == 1) {
				System.out.println(
						"Senha correta! A trava libera as pilhas e voc� move lentamente uma delas at� ter um espa�o para passar. ");
			}
			if (escolhas[2] == 2) {
				System.out.println(
						"Voc� digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o seguran�a que vem at� as caixas e encontra voc�.");

			}
			if (escolhas[2] == 3) {
				System.out.println(
						"Voc� digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o seguran�a que vem at� as caixas e encontra voc�.");
			}

			if (escolhas[2] != 1)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[2] != 1);

		System.out.println(
				"Andando abaixado voc� chega at� as sa�das. � sua frente est� o elevador, � sua esquerda o acesso �s ");
		System.out.println("escadas normais, e � direita tem a janela que d� para a escada de inc�ndio.");

		// Sa�da (todas)

		System.out.println(
				"Voc� observa que seria poss�vel mover uma das pilhas de modo a permitir passagem, mas as caixas ");

		System.out.println("Qual dos tr�s caminhos voc� escolhe: ");
		System.out.println("1) Escadas normais");
		System.out.println("2) Elevador");
		System.out.println("3) Escada de inc�ndio");
		System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
		escolhas[3] = entrada.nextInt();

		if (escolhas[3] == 1) {
			System.out.println(
					"Ao se aproximar das escadas, voc� ouve passos. Voc� se encosta na parede entre a porta e o ");
			System.out.println("elevador. Um funcion�rio da limpeza sai das escadas sem ver voc�. Rapidamente, voc� ");
			System.out.println("entra nas escadas e desce para o 1o andar.");
		}
		if (escolhas[3] == 2) {
			System.out.println(
					"Ao se aproximas do elevador, voc� v� que ele j� estava descendo, e pode ter pessoas dentro. ");
			System.out.println(
					"Voc� fica entre o elevador e a janela, como se estivesse eperando e olhando o lado de fora. ");
			System.out.println(
					"Duas pessoas saem do elevador conversando e n�o percebem voc�. Voc� entra no elevador vazio e ");
			System.out.println("desce para o 1o andar.");

		}
		if (escolhas[3] == 3) {
			System.out.println(
					"Voc� olha para ver se tem algu�m vendo. O guarda e o t�cnico est�o distantes discutindo sobre ");
			System.out.println(
					"os problemas no servidor. Voc� aproveita, abre a janela e desce pela escada at� o 1o andar.");
		}

	}

	static void andar7() {
		int escolhas[] = new int[3];

		// Possibilidade de Game Over no desafio 3
		int tentativas = 5;

		// gabarito: 3, 3, e 2

		// Chegada
		System.out.println("Muito bem! Voc� chegou ao 7� andar!");

		// Desafio 1 (correta: 3)
		do {
			System.out.println("Ao sair das escadas, voc� se depara com um corredor de portas, ");
			System.out
					.println("um bilhete no ch�o e uma c�mera acima do acesso 'as escadas, que varre de lado a lado.");
			System.out.println("No bilhete l�-se:");
			System.out.println("'A porta que leva 'a sa�da � aquela em que o n�mero da porta est� ");
			System.out.println("associado ao resultado da seguinte pergunta:");
			System.out.println("Qual la�o de repeti��o pode ser usado para situa��es nas quais se tem que ");
			System.out.println("verificar a condi��o ap�s a execu��o do bloco de c�digo?");
			System.out.println("1) Porta1 : while");
			System.out.println("2) Porta2 : for");
			System.out.println("3) Porta3 : do-while'");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[0] = entrada.nextInt();

			if (escolhas[0] != 3)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 3);

		// Desafio 2
		do {
			System.out.println("A porta que voc� escolheu d� na cozinha. Na pia voc� v� a cafeteira com caf� pronto.");
			System.out.println("Voc� coloca um pouco em uma caneca, mas ouve algu�m se aproximando da cozinha.");
			System.out.println("Rapidamente, voc� procura para onde tentar ir. Voc� v�: ");
			System.out.println("1) compartimento abaixo da pia, com porta para fechar");
			System.out.println("2) Um arm�rio ao lado da pia");
			System.out.println("3) Em baixo de uma mesa com quatro cadeiras pr�xima a um canto da cozinha");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[1] = entrada.nextInt();

			if (escolhas[1] == 1) {
				System.out.println(
						"Ao tentar entrar de baixo da pia voc� percebe que n�o cabe, e o guarda que entra na cozinha o v�!");
			}
			if (escolhas[1] == 2) {
				System.out.println(
						"Voc� consegue entrar no arm�rio, mas os produtos de limpeza l� dentro fazem que voc� espirre, ");
				System.out.println("e o guarda que entrou na cozinha � alertado da sua presen�a!");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"Apesar de a mesa n�o ser um local muito protegido, o guarda que entrou na cozinha, passa por ela ");
				System.out.println("sem perceber a sua presen�a.");
			}

			if (escolhas[1] != 3)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[1] != 3);

		// Desafio 3 (correta : 3)
		do {
			System.out.println(
					"Ao sair da cozinha, voc� v� um sal�o com v�rios cub�culos. Em alguns parece haver gente trabalhando, ");
			System.out.println(" e bastante ocupados. Voc� deve manter-se depercebido.");
			System.out.println(
					"Duas das laterais desse sal�o s�o janelas. Algumas, pr�ximas a uma parede, h� um acesso � ");
			System.out.println(
					" escada de emerg�ncia. Por�m, para acess�-la, voc� teria que ser visto por alguns ocupantes ");
			System.out.println(
					" dos cub�culos. Voc� procura op��es para evitar isso. Uma mesa fora dos cub�culos, parece ser ");
			System.out.println(
					"do setor de seguran�a e est� desocupada. Provavelmente � o posto do guarda que passou pela cozinha. ");
			System.out.println(" Ao se aproximar da mesa, no monitor voc� observa que aparece uma mensagem");
			System.out.println("'Para acessar o diagrama de utiliza��o dos cub�culos responda: ");
			System.out.println("Em uma estrutura switch, qual declara��o, que quando presente, � executada quando "
					+ "nenhum dos casos ocorre?");
			System.out.println("1) Break");
			System.out.println("2) default");
			System.out.println("3) goto");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[2] = entrada.nextInt();

			if (escolhas[2] == 1) {
				System.out.println(
						"Esta resposta � uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende voc�.");
			}
			if (escolhas[2] == 2) {
				System.out.println(
						"Resposta certa. O diagrama aparece e voc� v� que os dois cub�culos voltados para a parede ");
				System.out.println(
						"no caminho da janela est�o desocupados, permitindo acesso. Voc� abre a janela e desce para ");
				System.out.println("o 6o andar.");
			}
			if (escolhas[2] == 3) {
				System.out.println(
						"Esta resposta � uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende voc�.");
			}
			if (escolhas[1] != 1) {
				tentativas--;
			}
			if (tentativas == 1) {
				System.out.println("GAME OVER\n");
				// menu();
				return;
			}

		} while (escolhas[2] != 2);

	}

	static void andar6() {

		int respost;

		System.out.println("Departamento de Recursos Humanos\n");
		System.out.println("Estavamos aguardando voc�, sua presen�a aqui N�O � BEM VINDA, por isso se prepare");
		System.out.println("Neste andar, nosso sistema de seguran�a, esta integrado ao sistema de combate a inc�ndio"
				+ "Para acessar o 5� andar tera que decidir entre os comandos de acesso, qual o correto.\n"
				+ "O sistema de combate a inc�ndio � dotado de Bombas de V�cuo que em caso de acionamento todo Oxig�nio do andar ser� sequestrado.\n"
				+ "Voc� ter� apenas uma chance para acertar a quest�o e n�o ficar sem oxig�nio. Analise bem a quest�o e boa sorte! RSRS	\n"
				+ "Se o c�digo escolhido estiver correto ser� disponibilizado, uma m�scara conectada a um cilindro de oxig�nio.\n"
				+ "Vamos ao que interessa? \n");
		System.out.println(
				"QUEST�O: Escolha a fun��o correta que some a idade do jogador + o n�mero deste andar; o c�digo sendo escolhido de forma correta o \n"
						+ "jogador ter� acesso ao 5� andar, caso erre o oxig�nio ser� sequestrado e voc� perder� o jogo! \n");

		// Comando 1
		do {
			System.out.println("De acordo com o enunciado, qual a op��o correta? \n");
			System.out.println("Op��o 1: Public static void main(String args[]){\n" + "int var1;\n" + "int var2;\n"
					+ "var1 = 18;\n" + "var2= 06;\n" + "int resul = var1 + var2;\n" + "System.out.println (resul);\n"); // resposta
																														// correta
			System.out.println("Op��o 2: Public static void main (String args[]){\n;" + "int var1\n" + "int var2\n"
					+ "var1 = 18\n" + "var2= O6\n" + "System.out.println (var1  + var2);\n");
			System.out.println("Op��o 3: Public static void main (String args[]){\n" + "int var1\n" + "int var2\n"
					+ "var1 = 18\n" + "var2 = 06\n" + "int resul = var1 + var2;\n" + "Systen.out.printlm (resul)\n");
			System.out.println("Op��o 4: Public static void maim(String args[]){\n" + "int var1\n" + "int var2\n"
					+ "var1 = 18\n" + "var2 = 06\n" + "resul = var1 + var2;" + "System.out.println (resul)\n");
			// em caso de uma escolha invalida, o jogador perder� o jogo!.
			System.out.println("Qual a op��o correta?");
			respost = entrada.nextInt();

			if (respost == 1) {
				System.out.println(
						"Voc� escapou dessa, parab�ns! Mas ainda n�o � sua salva��o.. muito te espera.. siga para o 5 andar!");
			} else if (respost == 2 || respost == 3 || respost == 4) {
				System.out.println("OXIG�NIO SEQUESTRADO.. GAME OVER!!");
				menu();
			} else {
				System.out.println("Resposta inv�lida, preste aten��o!");

			}

		} while (respost != 1 && respost == 2 && respost != 3 && respost != 4);
	}

	static void fimdejogo() {
		String nome = menu();
		int caract = caracteristica();
		andar9(nome, caract);
		andar8(caract);
		andar7();
		andar6();
		andar5(caract);
		andar4();
		andar3(caract);
		andar2();
		terreo(nome);
	}

	public static void main(String[] args) {
		String nome = menu();
		int caract = caracteristica();
		andar9(nome, caract);
		andar8(caract);
		andar7();
		andar6();
		andar5(caract);
		andar4();
		andar3(caract);
		andar2();
		terreo(nome);
	}
}
