package Projeto_Intregador;

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
					"Você esta preparado(a) para provar seu potencial e suas habilidades em um jogo totalmente diferenciado?");
			System.out.println(
					"Apresentamos TO RUN AWAY! O jogo que faltava para você testar seus conhecimentos como programador.");
			System.out.println("Você topa esse desafio?");
			System.out.println(" Opções \n");
			System.out.println("1 - Jogar");
			System.out.println("2 - Creditos");
			System.out.println("3 - Sair \n");
			System.out.print("Digite a sua escolha, você será um jogador ou desistirá sem tentar? \n");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1:
				System.out.println(
						"\nGostei de ver, temos alguém disposto a enfrentar desafios pelo visto. Como devo chamar a pessoa que ganhará o jogo? (ou não!) ");
				nome = entrada.next();

				System.out.print(
						"\nÓtimo. Para completar essa etapa só temos mais uma perguntinha.. Qual o seu gênero? ");
				System.out.println("M => Masculino  F => Feminino");
				sexo = entrada.next();
				if (sexo.equalsIgnoreCase("M")) {
					System.out.println("\nÓtimo, agora vamos ao jogo!! Para iniciar, conheça sua história: \n");
					System.out.println("Um jovem programador, chamado " + nome
							+ " trabalha há pouco tempo na empresa TI Universal,"
							+ " empresa que estava sofrendo roubo de informações sigilosas por \nhackers, " + nome
							+ " por ser novato, foi utilizado como laranja pelos hackers."
							+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas \nprovas no usuário do sistema no qual "
							+ nome + " trabalhava, sem que o mesmo soubesse.\n\n"
							+ "A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "
							+ nome
							+ ", o presidente da empresa aciona a segurança para que localize e capture o jovem programador. \n\nNesse exato momento o sistema de segurança do predio é acionado para que "
							+ "ele não fuja. O sistema de segurança, bloqueia os elevadores que só podem \ndescer um andar, portas e janela são trancadas automaticamente, "
							+ "e para o " + nome
							+ " fugir, terá que hackear o sistema de segurança e fugir de todos os \nseguranças da empresa, que estão localizados em pontos estratégios para que ninguém saia sem ser visto.\n");
				} else if (sexo.equalsIgnoreCase("F")) {
					System.out.println("\nÓtimo, agora vamos ao jogo!! Para iniciar, conheça sua história: \n");
					System.out.println("Uma jovem programadora, chamada " + nome
							+ " trabalha há pouco tempo na empresa TI Universal,"
							+ " empresa que estava sofrendo roubo de informações sigilosas por \nhackers, " + nome
							+ " por ser novata, foi utilizada como laranja pelos hackers."
							+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas \nprovas no usuário do sistema na qual "
							+ nome + " trabalhava, sem que a mesma soubesse.\n\n"
							+ "A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "
							+ nome
							+ ", o presidente da empresa aciona a segurança para que localize e capture a jovem programadora. \n\nNesse exato momento o sistema de segurança do predio é acionado para que "
							+ "ela não fuja. O sistema de segurança, bloqueia os elevadores que só podem \ndescer um andar, portas e janela são trancadas automaticamente, "
							+ "e para a " + nome
							+ " fugir, terá que hackear o sistema de segurança e fugir de todos os \nseguranças da empresa, que estão localizados em pontos estratégios para que ninguém saia sem ser visto.\n");
				}

				break;

			case 2:
				System.out.println(" CREDITOS ");
				System.out.println("Desenvolvedor: DAIMON DA SILVA");
				System.out.println("Desenvolvedor: KATIA SCHVABE");
				System.out.println("Desenvolvedor: VALTER DE MOURA PEREIRA");
				System.out.println("Desenvolvedor: VICTOR RODRIGUES ROCHA");
				System.out.println("Desenvolvedor: RENATO BERTONI LARDOSA SANTOS");
				System.out.println("\n Opção");
				System.out.print("2 - Voltar ");
				opcao = entrada.nextInt();
				break;
			case 3:
				System.out.println("\nVocê saiu do jogo!");
				break;
			default:
				System.out.println("Opção inválida, renda-se e venha testar suas habilidades de jogador!");
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
				System.out.println("\nVejo que temos alguém com medo, ops, digo, interessado(a) em seu futuro!");
				System.out.println(
						"É muito bom mesmo conhecer o caminho, assim você estará mais apto(a) a vencer os desafios. Não esqueça, você precisará de uma mente afiada para despistar\n"
								+ "os seguranças e conseguir fugir do prédio sem ser capturado(a). Em cada andar, além de despistar os seguranças, você precisará resolver algumas escolhas \nobjetivas e tomar uma decisão envolvendo lógica "
								+ "Mas para te auxiliar nesses desafios, você poderá escolher seu perfil. Ele será formado por características escolhidas /npor você, mas não se empolgue, você precisará priorizar algumas. É meu(inha) caro(a), não podemos ter tudo na vida né?"
								+ " Entendeu o que espera você pela frente? Podemos ir para a parte onde você monta seu perfil que irá perder... ops! ganhar o jogo? ");
				System.out.println("1 - Continuar");

				int perfil = entrada.nextInt();

				if (perfil == 1) {
					do {
						System.out.println(
								"\nEssa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
						System.out.println("Opção 1 = Força: 1, Inteligência: 2, Lógica: 3");
						System.out.println("Opção 2 = Força: 2, Inteligência: 3, Lógica: 1");
						System.out.println("Opção 3 = Força: 3, Inteligência: 1, Lógica: 2");
						System.out.println("Escolha sua opção:");
						caract = entrada.nextInt();
					} while (caract < 1 || caract > 3);
				}
			} else {
				do {
					System.out.println(
							"\nEssa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
					System.out.println("Opção 1 = Força: 1, Inteligência: 2, Lógica: 3");
					System.out.println("Opção 2 = Força: 2, Inteligência: 3, Lógica: 1");
					System.out.println("Opção 3 = Força: 3, Inteligência: 1, Lógica: 2");
					System.out.println("Escolha sua opção:");
					caract = entrada.nextInt();
				} while (caract < 1 || caract > 3);

			}

		} while (escolha != 1 && escolha != 2);
		return caract;

	}

	static void andar9(String nome, int caract) {

		int numero1 = 9, numero2 = 6, numero3 = 5, tentativas = 5;
		System.out.println(" Olá " + nome + "!!");
		System.out.println("Seja bem vindo ao jogo!!!\n");
		System.out.println("Seu celular toca: **Prinnn**, nova mensagem recebida! \n");
		System.out.println("Mensagem: SISTEMA DE SEGURANÇA ATIVADO! Por medida de segurança, permaneça onde está!\n ");
		System.out.println(
				" A TI Universal encontrou provas contra você e bloqueou toda a empresa com o objetivo de te capturar. \n"
						+ "Você está preso na sala de comando, e a única maneira de sair da sala é hackeando o sistema de segurança. \n"
						+ "Desta maneira você irá desativar a trava das saídas disponíveis, e também desativar as câmeras para que ninguém te encontre!");

		System.out.println(
				"Para desativar o sistema de segurança, você precisará da senha de acesso.\nA mesma é composta por  "
						+ " três digitos, e a soma dos três digito é igual a 20.\nsenha:__+__+__= 20\n"); // continuar
																											// com
																											// informações
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
				"Muito bem! Você conseguiu a senha e agora tem a oportunidade de sair da sala de comando e tentar escapar. \n"
						+ "A sala possui três saídas: \n"
						+ "PORTA: Saindo pela porta você poderá descer pela escada ou pelo elevador, mas existe a chance de encontrar algum segurança que \n"
						+ "está vindo te prender!\n"
						+ "JANELA: Saindo pela janela você encontrará uma escada externa de saída de emergência. Com ela você pode acessar o andar abaixo, porém\n"
						+ " devido as condições atuais do prédio não tem como saber o estado de conservação da mesma.\n"
						+ "DUTO DE AR: Saindo pelo duto de ar você poderá acessar as salas vizinhas ou a central de ar, que dá acesso ao andar de baixo. Porém \n"
						+ "teria que passar por um corredor, aonde os seguranças estão te procurando!");
		System.out.println("Só uma saída te permitirá acessar o 8º andar, qual você irá arriscar? \n" + "1 - Janela;\n"
				+ "2 - Porta;\n" + "3 - Duto de ar;");

		System.out.println("Escolha a opçao desejada: ");
		opcao = entrada.nextInt();
		if (opcao == 1) {// opçao Janela
			System.out.println(
					"Ao abrir a janela você descobre que a escada está em péssimas condições de conservação, a mesma está desmoronando.\n"
							+ "O melhor a fazer é escolher outra opção para sair da sala, você ainda tem duas opções\n"
							+ "1 - Porta; \n2 - Duto de ar;");
			System.out.println("Escolha a opçao desejada: ");
			opcao = entrada.nextInt();

			if (opcao == 1) {// opçao Porta
				System.out.println(
						"Você abre a porta, com cautela, ao avista que o corredor está livre, você sai da sala, agora você tem duas opções:\n"
								+ "1 - Seguir reto pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();

				if (opcao == 1) {// Seguir reto pelo corredor
					System.out.println(
							"Olha você chegou ao elevador, mais, porém a sua esquerda tem uma escada, que também levará para o andar abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança, agora é com você boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo, \n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				} else {// sala da sua direita
					System.out.println(
							"Essa sala só abre com a digital do responsável da tesouraria, então essa não é uma opção\n"
									+ "Então você segue em frente pelo corredor");
					System.out.println(
							"Olha você chegou ao elevador, mais, porém a sua esquerda tem uma escada, que também levará para o andar de abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra no elevador e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				}
			} else {// Duto de ar
				System.out.println(
						"Ao chegar próximo da entrada você repara que a entrada do duto de ar está parafusada, e que na sala não tem uma chave apropriada para abri-la\n"
								+ "o ideal então é sair pela porta, pois você não tem tempo a perder para procurar uma chave de fenda.");
				System.out.println(
						"Você abre a porta, com cautela, ao avista que o corredor está livre, você sai da sala, agora você tem duas opções:\n"
								+ "1 - Seguir reto pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();

				if (opcao == 1) {// Seguir reto pelo corredor
					System.out.println(
							"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança, agora é com você boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				} else {// sala da sua direita
					System.out.println(
							"Essa sala só abre com a digital do responsável da tesouraria, então essa não é uma opção\n"
									+ "Então você segue em frente pelo corredor");
					System.out.println(
							"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar de abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();

					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar de abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é ai então que você entra no elevador e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				}
			}
		} else if (opcao == 2) {// opção Porta
			System.out.println(
					"Você abre a porta, com cautela, ao avista que o corredor está livre, você sai da sala, agora você tem duas opções:\n"
							+ "1 - Seguir em frente pelo corredor\n2 - Entra na sala da sua direita");
			opcao = entrada.nextInt();

			if (opcao == 1) {// Seguir em frente pelo corredor
				System.out.println(
						"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar abaixo.\n"
								+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
								+ "Se escolher a escada poderá dar de cara com um segurança, agora é com você boa sorte\n"
								+ "1 - Descer as escadas\n2 - Esperar o elevador");
				opcao = entrada.nextInt();

				if (opcao == 1) {// Descer as escadas
					System.out.println(
							"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
									+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
									+ "é então que você entra e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
				} else {// Esperar o elevador
					System.out.println(
							"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
									+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
				}
			} else {// sala da sua direita
				System.out.println(
						"Essa sala só abre com a digital do responsável da tesouraria, então essa não é uma opção\n"
								+ "Então você segue em frente pelo corredor");
				System.out.println(
						"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar de abaixo.\n"
								+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
								+ "Se escolher a escada poderá dar de cara com um segurança\n"
								+ "1 - Descer as escadas\n2 - Esperar o elevador");
				opcao = entrada.nextInt();
				if (opcao == 1) {// Descer as escadas
					System.out.println(
							"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
									+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
									+ "é então que você entra no elevador e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
				} else {// Esperar o elevador
					System.out.println(
							"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
									+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
				}
			}
		} else {// opção Duto de ar
			System.out.println(
					"Ao chegar próximo da entrada você repara que a entrada do duto de ar está parafusada,\n e que na sala não tem uma chave apropriada para abri-la\n"
							+ "o ideal então é sair pela porta ou pela janela, pois você não tem tempo a perder para procurar uma chave de fenda.\n"
							+ "1 - Sair pela janela\n2 - Sair pela porta");
			opcao = entrada.nextInt();
			if (opcao == 1) {// Sair pela janela
				System.out.println(
						"Ao abrir a janela você descobre que a escada está em péssimas condições de conservação, a mesma está desmoronando.\n"
								+ "O melhor a fazer é sair pela porta");
				System.out.println(
						"Você abre a porta, com cautela, ao avista que o corredor está livre, você sai da sala, agora você tem duas opções:\n"
								+ "1 - Seguir reto pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();
				if (opcao == 1) {// Seguir reto pelo corredor
					System.out.println(
							"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança, agora é com você boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				} else {// Entra na sala da sua direita
					System.out.println(
							"Essa sala só abre com a digital do responsável da tesouraria, então essa não é uma opção\n"
									+ "Então você segue em frente pelo corredor");
					System.out.println(
							"Olha você chegou ao elevador, mais, porém a sua esquerda tem uma escada, que também levará para o andar de abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra no elevador e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				}

			} else {// opção Porta
				System.out.println(
						"Você abre a porta, com cautela, ao avista que o corredor está livre, você sai da sala, agora você tem duas opções:\n"
								+ "1 - Seguir em frente pelo corredor\n2 - Entra na sala da sua direita");
				opcao = entrada.nextInt();
				if (opcao == 1) {
					System.out.println(
							"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança, agora é com você boa sorte\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				} else {// Entra na sala da sua direita
					System.out.println(
							"Essa sala só abre com a digital do responsável da tesouraria, então essa não é uma opção\n"
									+ "Então você segue em frente pelo corredor");
					System.out.println(
							"Olha você chegou ao elevador, mais porém a sua esquerda tem uma escada, que também levará para o andar de abaixo.\n"
									+ "Agora é com você, se você chamar o elevador poderá correr o risco de encontrar um segurança dentro do mesmo\n"
									+ "Se escolher a escada poderá dar de cara com um segurança\n"
									+ "1 - Descer as escadas\n2 - Esperar o elevador");
					opcao = entrada.nextInt();
					if (opcao == 1) {// Descer as escadas
						System.out.println(
								"Você começa a descer as escadas, porém nesse momento ouve o barulho do elevador, e também vozes dos seguranças vindo do andar abaixo,\n"
										+ "então você percebe que o melhor a fazer é voltar, você sobe a escada rapidamente ao chegar no elevador, observa que o mesmo está vazio\n"
										+ "é então que você entra no elevador e segue para o andar de baixo, rezando para não dar de frente com algum segurança");
					} else {// Esperar o elevador
						System.out.println(
								"Você chama o elevador, e espera escondido, quando o elevador chega, você corre e entra,\n"
										+ "seguindo para o andar de baixo, rezando para não dar de frente com algum segurança.");
					}
				}
			}
		}
		System.out.println("");
	}

	static void andar8(int caract) {
		int decisao;
		System.out.println(
				"Parabéns, você chegou ao 8º andar, agora se prepare porque ainda tem muito caminho pela frente!\n");
		System.out.println(
				"Agora você terá que tomar uma importante decisão, para acessar o 7º andar precisará escolher por \nonde vai continuar sua fuga."
						+ " Apenas uma das opções abaixo é a correta. Após escolher a opção \ncorreta você terá um desafio "
						+ "a cumprir para garantir sua passagem para o 7º andar \n");

		do {
			// Decisão
			System.out.println(
					"Escolha sua opção: \n" + "1 - Elevador\n" + "2 - Escada\n" + "3 - Duto de ar\n" + "4 - Janela");

			decisao = entrada.nextInt();

			if (decisao == 1) {

				System.out.println(
						"Os elevadores foram desativados nesse andar! tente outra rota de fuga, se apresse porque os seguranças estão chegando! \n");

			} else if (decisao == 2) {

				System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem\n");

			} else if (decisao == 3) {

				System.out.println(
						"Os dutos de ar estão bloqueados nesse andar! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando! \n");

			} else {

				System.out.println(
						"A janela deste andar está emperrada! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando! \n");

			}

		} while (decisao != 2);

		if (caract == 1) {
			// Primeiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=14; \n" + "if (N%2==0){\n" + "   System.out.println('X') \n"
					+ "}else{ \n" + "   System.out.println('Y')\n" + "}\n");

			System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
			System.out.println("Qual é a opção correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 2:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			case 1:
				System.out.println("Muito bem! Você acertou o desafio, entre que você irá para o 7º andar!");
			}

		} else if (caract == 2) {
			// Segundo desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=-13; \n" + "if (N<0 && N%2==0){\n"
					+ "   System.out.println('X')\n" + "}else{ \n" + "   System.out.println('Y')\n" + "{\n");
			System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
			System.out.println("Qual é a opção correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 1:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			case 2:
				System.out.println("Muito bem! Você acertou o desafio, entre que você irá para o 7º andar!");
			}

		} else {
			// Terceiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=-14; \n" + "if (N>0){\n" + "   System.out.println('X') \n"
					+ "}else{ \n" + "   System.out.println('Y')\n" + "}\n");

			System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
			System.out.println("Qual é opção correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 1:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			case 2:
				System.out.println("Muito bem! Você acertou o desafio, entre que você irá para o 7º andar!");
			}

		}

	}

	static void andar3(int caract) {
		int decisao;
		System.out.println(
				"Parabéns, você chegou ao 3º andar, Você está quase saindo, falta pouco! Agora você terá que tomar mais uma importante decisão.\n");
		System.out.println("Para acessar o 2º andar precisará escolher por onde vai continuar sua fuga."
				+ " Apenas uma das opções abaixo é a correta. \nApós escolher a opção correta você terá um desafio "
				+ "a cumprir para garantir sua passagem para o 2º andar. \n");

		do {
			// Decisão
			System.out.println("Escolha sua opção: \n" + "1 - Refeitório\n" + "2 - Banheiro\n"
					+ "3 - Sala de comunicação\n" + "4 - Sala de segurança");

			decisao = entrada.nextInt();

			if (decisao == 1) {

				System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 2º andar.\n");

			} else if (decisao == 2) {

				System.out.println(
						"O banheiro está interditado! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando!\n");

			} else if (decisao == 3) {

				System.out.println(
						"A sala de comunicação foi fechada pelos seguranças! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando! \n");

			} else {
				System.out.println(
						"A sala de segurança está trancada! tente outra rota de fuga, se apresse porque os seguranças estão chegando! \n");

			}

		} while (decisao != 1);

		if (caract == 1) {
			// Primeiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n");
			System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n"
					+ "      if (N%i==0 && i%2==0){\n" + "          System.out.println(i)\n " + "  } \n" + "}\n");
			System.out.println("1) Deverá ser impresso os divisores pares de N.\n"
					+ "2) Deverá ser impresso os múltiplos pares de N.\n"
					+ "3) Deverá ser impresso os múltiplos ímpares de N.\n");

			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 2:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 1:
				System.out.println("Parabéns! Você acertou o desafio, entre que você irá para o 2º andar!");
			}

		} else if (caract == 2) {
			// Segundo Desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n"
					+ "      if (N%i==0 && i%2!=0){\n" + "          System.out.println(i)\n " + "  } \n" + "}\n");
			System.out.println("1) Deverá ser impresso os divisores ímpares de N.\n"
					+ "2) Deverá ser impresso os divisores pares de N.\n"
					+ "3) Deverá ser impresso os múltiplos ímpares de N.\n");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 2:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 1:
				System.out.println("Parabéns! Você acertou o desafio, entre que você irá para o 2º andar!");

			}

		} else {
			// Terceiro desafio
			System.out.println(
					"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n");

			System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n" + "    if (N%i==0){\n"
					+ "      System.out.println(i)\n " + "  } \n" + "}\n");

			System.out.println("1) Devera ser impresso os múltiplos de N.\n"
					+ "2) Deverá ser impresso os divisores de N.\n" + "3) Deverá ser impresso o fatorial  de N.\n");

			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();

			switch (resposta) {
			case 1:
			case 3:
				System.out.println("Resposta errada! GAME OVER!");
				break;
			case 2:
				System.out.println("Parábens! Você acertou o desafio, entre que você irá para o 2º andar!");
			}

		}
	}

	static void andar4() {
		int quarto;
		double caract = Math.random() * 3;
		System.out.println("Você está surpreendendo,  já está no 4º andar!");

		do {
			System.out.println(
					"Agora, para você chegar ao 3º andar precisará descobrir em qual das salas está a passagem dos dutos de ar. Existe em somente uma das 4 salas do andar. \n"
							+ "Após escolher a sala correta, você precisará completar o algoritmo escrito na entrada. Somente a resposta correta te permitirá acesso a passagem!! \n"
							+ "E ai, qual das salas você escolhe? \n" + "1 - SALA A;\n" + "2 - SALA B;\n"
							+ "3 - SALA C;\n" + "4 - SALA D;");
			quarto = entrada.nextInt();

			if (quarto == 1 || quarto == 2 || quarto == 4) {
				System.out.println(
						"Sala errada, tente outra.. Lembre que você está perdendo tempo. A qualquer momento um segurança pode te encontrar!\n");
				break;
			}else if (quarto == 3) {
				System.out.println("Muito bom!\n");
				break;
			}else {
				System.out.println("Op��o inv�lida!!\n");
				break;
		} }while (quarto != 3);

		System.out.println("Agora que você encontrou o duto, preencha o algoritmo para liberar sua entrada!!\n");

		if (Math.ceil(caract) == 1) {
			// desafio 1
			System.out.println("Observe o algoritmo escrito e preencha o espaço com XXX com a opção correta!\n"
					+ "Questão: O algoritmo deve ler dois números e dizer qual deles é maior. \n");
			System.out.println(" ALGORITMO: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n1, n2; \n"
					+ "System.out.println(Digite o primeiro número: ); \n" + "n1 = entrada.nextInt(); \n"
					+ "System.out.println(Digite o segundo número: ); \n" + "n2 = entrada.nextInt(); \n" + "XXX { \n "
					+ "O maior número é: + n1 \n" + "} else { \n" + "O maior número é: + n2 \n");
			System.out.println(
					"Opção 1 =  if(n1 > n2) ;\n" + "Opção 2 = if(n1 < n2) ;\n" + "Opção 3 = for(n1 > n2) ; \n");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println(
						"Se continuar assim, logo você estará no térreo!! Você conseguiu acesso ao duto, entre que você irá para o 3º andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			}
		} else if (Math.ceil(caract) == 2) {
			// desafio 2
			System.out.println("Observe o algoritmo escrito e preencha o espaço com XXX com a opção correta!\n"
					+ "Questão: O algoritmo deve ler dois números e dizer qual deles é a média deles. \n");
			System.out
					.println(" ALGORITMO: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n1, n2, media; \n"
							+ "System.out.println(Digite o primeiro número: ); \n" + "n1 = entrada.nextInt(); \n"
							+ "System.out.println(Digite o segundo número: ); \n" + "n2 = entrada.nextInt(); \n"
							+ "XXX \n" + "System.out.println(A média dos números apresentados é: + media");
			System.out.println("Opção 1 =  media = (n1 + n2)/2 ;\n" + "Opção 2 = media = (n1 * n2)/2 ;\n"
					+ "Opção 3 = int media = (n1 + n2)/2 ; \n");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println(
						"Se continuar assim, logo você estará no térreo!! Você conseguiu acesso ao duto, entre que você irá para o 3º andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			}
		} else {
			// desafio 3
			System.out.println("Observe o algoritmo escrito e preencha o espaço com XXX com a opção correta!\n"
					+ "Questão: O algoritmo deve ler dois números e dizer qual deles é menor. \n");
			System.out.println(" ALGORITMO: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n1, n2; \n"
					+ "System.out.println(Digite o primeiro número: ); \n" + "n1 = entrada.nextInt(); \n"
					+ "System.out.println(Digite o segundo número: ); \n" + "n2 = entrada.nextInt(); \n" + "XXX { \n "
					+ "O menor número é: + n1 \n" + "} else { \n" + "O menor número é: + n2 \n");
			System.out.println(
					"Opção 1 =  if(n1 < n2) ;\n" + "Opção 2 = if(n1 >= n2) ;\n" + "Opção 3 = for(n1 > n2) ; \n");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 1) {
				System.out.println(
						"Se continuar assim, logo você estará no térreo!! Você conseguiu acesso ao duto, entre que você irá para o 3º andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			}
		}
		}
			
	static void andar5(int caract) {
		int quinto;
		System.out.println("Eu não achava que seria possível, mas você chegou ao 5º andar!");

		do {
			System.out.println(
					"Agora, para descer mais um andar você precisa decidir qual sentido pegar. Essa sala só possui uma saída, então é inevitável \n"
							+ "você passar pelo corredor. Porém, se você sair da sala e ir para a direita você terá a opção da escada, e do elevador. E se você ir para a esquerda você \n"
							+ "terá acesso a outras duas salas. A sala A te dá acesso ao duto de ar condicionado, que você não sabe com qual sala faz ligação. E a sala B é integrada com o \n"
							+ "andar de baixo na sala de descanso dos seguranças. Só um te permitirá avançar.. E ai, qual dessas opções você escolhe? \n"
							+ "1 - Lado direito, escada;\n" + "2 - Lado direito, elevador;\n"
							+ "3 - Lado esquerdo, Sala A;\n" + "4 - Lado esquerdo, Sala B;");
			quinto = entrada.nextInt();

			if (quinto == 1 || quinto == 3 || quinto == 4) {
				System.out.println("Esse não é o melhor caminho, tente outra vez!\n");
			}
		} while (quinto != 2);

		System.out.println(
				"Ok, agora que você sabe que só conseguirá ter acesso ao próximo andar pelo elevador, pode tentar acessar ao mesmo.Corre!!!\n");
		System.out.println("\n" + "________ o\n" + "    ___  </v\n" + "   ___   -\\\n" + "          /\n");
		// desenho do personagem correndo

		System.out
				.println("Ok, você chegou ao elevador! Para abrir a porta, você precisa responder a questão abaixo:\n");

		if (caract == 1) {
			// desafio 1
			System.out.println("Observe o enunciado abaixo e escolha o código que foi utilizado corretamente: \n"
					+ "Questão: Desenvolva um algoritmo em Java que leia um número inteiro. Caso o nº seja par imprima o seu antecessor, \n"
					+ "e se ele for ímpar, imprima seu sucessor. \n");
			System.out.println(" Opção 1: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 != 0){ \n "
					+ "int ant = n - 1;" + "Seu antecessor é: + ant \n" + "} else { \n" + "int suc = n +1;"
					+ "Seu sucessor é: + suc }\n");
			System.out.println(" Opção 2: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 == 0){ \n "
					+ "int ant = n - 1;" + "Seu antecessor é: + ant \n" + "} else { \n" + "int suc = n +1;"
					+ "Seu sucessor é: + suc }\n");
			System.out.println(" Opção 3: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = input.next(); \n" + "if(n % 2 == 0){ \n "
					+ "int ant = n - 1;" + "Seu sucessor é: + ant \n" + "} else { \n" + "int suc = n +1;"
					+ "Seu antecessor é: + suc}");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 2) {
				System.out.println(
						"Você está com muita sorte hein? Você abriu a porta do elevador, entre que você irá para o 4º andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			}
		} else if (caract == 2) {
			// desafio 2
			System.out.println("Observe o enunciado abaixo e escolha o código que foi utilizado corretamente: \n"
					+ "Questão: Desenvolva um algoritmo em Java que leia um número inteiro. Caso o nº seja par apresenta a mensagem PAR, \n"
					+ "e se ele for ímpar, apresente a mensagem IMPAR. \n");
			System.out.println(" Opção 1: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 != 0){ \n "
					+ "PAR! \n" + "} else { \n" + "IMPAR! }\n");
			System.out.println(" Opção 2: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 == 0){ \n "
					+ "PAR! \n" + "} else { \n" + "IMPAR!} \n");
			System.out.println(" Opção 3: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = input.next(); \n" + "if(n % 2 == 0){ \n "
					+ "IMPAR! \n" + "} else { \n" + "PAR!}");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 2) {
				System.out.println(
						"Você está com muita sorte hein? Você abriu a porta do elevador, entre que você irá para o 4º andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			}
		} else {
			// desafio 3
			System.out.println("Observe o enunciado abaixo e escolha o código que foi utilizado corretamente: \n"
					+ "Questão: Desenvolva um algoritmo em Java que leia um número inteiro. Caso o nº seja par imprima PAR, \n"
					+ "se ele for ímpar, imprima IMPAR, e se ele for 0, imprima ZERO!. \n");
			System.out.println(" Opção 1: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 != 0){ \n "
					+ "PAR! \n" + "} else if ( n % 3 != 0){ \n" + "IMPAR!\n" + "} else { " + "ZERO!\n");
			System.out.println(" Opção 2: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = entrada.nextInt(); \n" + "if(n % 2 == 0){ \n "
					+ "PAR! \n" + "} else if (n % 3 == 0){ \n" + "IMPAR! \n" + "} else{ " + "ZERO!\n");
			System.out.println(" Opção 3: \n" + "Scanner entrada = new Scanner(System.in); \n" + "int n; \n"
					+ "System.out.println(Digite um número: ); \n" + "n = input.next(); \n" + "if(n % 2 == 0){ \n "
					+ "IMPAR! \n" + "} else if ( n % 2 == 0) { \n" + "PAR! \n" + "} else {" + "ZERO!\n");
			System.out.println("Qual a opção correta? ");
			int resposta = entrada.nextInt();
			if (resposta == 2) {
				System.out.println(
						"Você está com muita sorte hein? Você abriu a porta do elevador, entre que você irá para o 4º andar!!");
			} else {
				System.out.println("Resposta errada! GAME OVER!");
				menu();
			}
		}
	}

	static void terreo(String nome) {
		int terreo;

		System.out.println("Até agora foi sorte.. Agora quero ver você sair dessa!! Você chegou no TERREO!\n"
				+ "Mas o jogo ainda não acabou! Esse é o andar mais protegido pelos seguranças, e sair daqui não será tão fácil!!\n"
				+ "Em todas as saídas há dois seguranças que não deixam ninguém sair até você ser capturado, e todas as pessoas estão sendo vistoriadas.\n"
				+ "Para conseguir sair do prédio, você precisará despistar os seguranças e abrir as portas que estão travadas! E aí? Já sabe como fazer isso?\n");
		System.out.println(
				"Primeiro passo será destravar as portas, para depois pensar em despistar os seguranças. Mas para isso você precisará hackear o sistema de iluminação \n"
						+ "É nessa hora que você testará suas habilidades com a lógica. E a partir desse momentos suas forças e características, escolhidas no início do jogo, não terão \n"
						+ "mais validade. Você está sozinho(a) nessa " + nome + "!! Vamos ao desafio? 1 - SIM; ");
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
					"O sistema de iluminação é protegido por um código, e para ter acesso ao código você precisará decifrar a questão abaixo: ");
			System.out.println(
					"Considerando a lógica de programação e seus operadores lógicos utilizados nas linguagens de programação, atente-se para a expressão abaixo.\n"
							+ "C * (B - A) <= D - B / C \n"
							+ "Qual seria o resultado da execução dessa expressão, caso o valor das variáveis fossem: A=3; B=6; C=2 e D=9 ?");
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
				System.out.println("Resposta inválida!");
			}

		} while (!acertou);

		int[] vetor = new int[5];
		int[] vetorCorreto = { 2, 6, 11, 16, 18 };

		System.out.println(
				"Mais um ponto para você, o sistema de iluminação foi desativado e as portas estão destravadas! Agora só falta despistar os seguranças..\n"
						+ "Para isso você precisará ativar o alarme de incêndio. Dessa maneira haverá tumulto, e será sua oportunidade de escapar sem sem visto!\n"
						+ "O sistema de incêndio será ativado assim que você completar o código abaixo conforme as instruções. \n\n");
		System.out.println(
				"Considere os seguintes valores para as variáveis. A = 10; B = 12; C = -2; D = 6; Agora responda as questões a seguir. Todas as \n"
						+ "respostas corretas formarão um vetor que ativará o sistema de incêndio. Mas preste muita atenção, se errar uma questão o sistema de incêncio \n"
						+ "não ativa e os seguranças receberão uma mensagem alertando da tentativa. É a questão que te libertará ou prenderá. Depende apenas de você! \n"
						+ "Questão 1: \n"
						+ "Considerando os valores já informados, qual seria o retorno da operação a seguir: A * C - B / D \n"
						+ "1 - 10 positivo; \n" + "2 - 22 negativo; \n" // RESPOSTA CORRETA
						+ "3 - 22 positivo; \n" + "4 - 18 positivo; \n");
		vetor[0] = entrada.nextInt();
		System.out.println("Questão 2: \n"
				+ "Usando o laço WHILE, qual opção abaixo corresponde ao enunciado: Faça um programa que mostre todos os números inteiros de 1 a 50.\n"
				+ "5 - int i = 1;\n" + "    	while( i = 50) {\n" + "    	System.out.println(\"Inteiro \" + i );\n"
				+ "    	i = i + 1;\n" + "    	}; \n\n" + "6 - int i = 1;\n" + // RESPOSTA CORRETA
				"		while( i <= 50) {\n" + "		System.out.println(\"Inteiro \" + i );\n"
				+ "		i = i + 1;\n" + "	    }; \n\n" + "7 - int i = 1;\n" + "    	while( i >= 50) {\n"
				+ "    	System.out.println(\"Inteiro \" + i );\n" + "    	i = i + 1;\n" + "    	}; \n\n"
				+ "8 - int i = 1;\n" + "    	while( i <= 50) {\n"
				+ "    	System.out.println(\"Inteiro \" + i );\n" + "    	i = i - 1;\n" + "    	}; \n\n"
				+ "Qual a opção correta? \n");
		vetor[1] = entrada.nextInt();
		System.out.println("Questão 3: \n"
				+ "Considerando os valores já informados, qual seria o retorno da operação a seguir: A + C - B / D \n"
				+ "9 - 6 negativo; \n" + "10 - 0 zero; \n" + "11 - 6 positivo; \n" // RESPOSTA CORRETA
				+ "12 - 1 positivo; \n");
		vetor[2] = entrada.nextInt();
		System.out.println("Questão 4: \n"
				+ "Qual dos programas abaixo gera a seguinte série: 10, 20, 30, 40, ..., até 1000 utilizando o laço FOR.\n"
				+ "13 - int i;\n" + "        for(i = 10; i = 1000; i = i + 10){\n"
				+ "            System.out.println(\"Sequencia\" + i);\n" + "            }; \n\n" + "14 - int i;\n"
				+ "        for(i = 10; i >= 1000; i = i++){\n" + "            System.out.println(\"Sequencia\" + i);\n"
				+ "            }; \n\n" + "15 - int i;\n" + "        for(i = 10; i <= 1000; i = i++){\n"
				+ "            System.out.println(\"Sequencia\" + i);\n" + "            }; \n\n" + "16 - int i;\n" + // RESPOSTA
																														// CORRETA
				"        for(i = 10; i <= 1000; i = i + 10){\n" + "            System.out.println(\"Sequencia\" + i);\n"
				+ "            }; \n\n");
		vetor[3] = entrada.nextInt();
		System.out.println("Questão 5: \n"
				+ "Qual dos programas abaixo imprime todos os múltiplos de 7 menores que 200 utilizando o laço WHILE?\n"
				+ "17 - int i = 7;\n" + "        while(i<200){\n"
				+ "            System.out.println(i + \" é múltiplo de 7\");\n" + "            i = i * 7;\n"
				+ "        }; \n\n" + "18 - int i = 7;\n" + // RESPOSTA CORRETA
				"        while(i<200){\n" + "            System.out.println(i + \" é múltiplo de 7\");\n"
				+ "            i = i + 7;\n" + "        }; \n\n" + "19 - int i = 0;\n" + "        while(i<=200){\n"
				+ "            System.out.println(i + \" é múltiplo de 7\");\n" + "            i = i + 7;\n"
				+ "        }; \n\n" + "20 - int i = 7;\n" + "        while(i<=200){\n"
				+ "            System.out.println(i + \" é múltiplo de 7\");\n" + "            i = i + 7;\n"
				+ "        }; \n\n");
		vetor[4] = entrada.nextInt();

		System.out.println("Suas respostas criaram o vetor: vetor[" + vetor[0] + ", " + vetor[1] + ", " + vetor[2]
				+ ", " + vetor[3] + ", " + vetor[4] + "].");

		if (Arrays.equals(vetor, vetorCorreto)) {
			System.out.println("Sistema de incêndio ativado. Seguranças foram distraídos e você escapou!!!\n"
					+ "Parabéns! Você conseguiu provar suas habilidades!!! Agora é só comemorar!! \n\n"
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
			System.out.println("SENHA ERRADA! Seguranças foram alarmados e você está preso(a)!!!\n\n"
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
			menu();

		}
	}

	static void andar2() {
		int escolhas[] = new int[4];

		// Possibilidade de Game Over no desafio 2
		int tentativas = 5;

		// gabarito: 2, 1, 1 e Todas

		// Chegada
		System.out.println("Muito bem! Você chegou ao 2º andar!");
		System.out
				.println("Você chega no refeitório do segundo andar. Ao passar pela porta de saída, você observa um ");
		System.out.println(
				"amplo salão de cubículos. Você está em um dos extremos, e no outro você o acesso: ao elevador, ");
		System.out.println(
				"às escadas normais, e às escadas de incêndio. Porém, para chegar a qualquer uma dessas opções, ");
		System.out.println("você deve passar pelos cubículos.");
		System.out.println(
				"Em um dos corredores laterais, do lado no qual você está, há uma mesa do setor de segurança, ");
		System.out.println(
				"onde há um guarda de costas para você. Um dos cubículos à sua frente está desocupado, e você ");
		System.out.println("entra nele para acessar o computador, e tentar obter o diagrama de rede do salão.");

		// Desafio 1 (correta: 1)
		do {
			System.out.println(
					"Ao tirar o computador de modo de espera, você vê na tela uma pergunta para liberar o acesso ao ");
			System.out.println("computador:");
			System.out.println("'Em uma linguagem estruturada, quais as três principais estruturas de instruções?'");

			System.out.println("1) Objetos, métodos e atributos");
			System.out.println("2) Sequencial, decisão e repetição");
			System.out.println("3) listas, pilhas e árvores  ");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[0] = entrada.nextInt();

			if (escolhas[0] == 1) {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println(
						"cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}
			if (escolhas[0] == 2) {
				System.out.println("Esta é a resposta certa, e você consegue acesso ao computador.");
			}
			if (escolhas[0] == 3) {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println(
						"cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}

			if (escolhas[0] != 2)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 2);

		System.out
				.println("No computador você tenta acessar o servidor ou roteador que interliga esses computadores. ");

		System.out.println(
				"Você abre o navegador e digita '192.168.0.1' e para a sua surpresa, uma página de administração ");
		System.out.println("se abre. Pelo jeito, nada de servidor, nem administrador profissional: sem senha.");
		System.out.println(
				"Você abre uma aba chamada chamada 'Clientes', e vê uma lista de clientes atualmente conectados. ");
		System.out.println(
				"A página exibe 26 clientes, 13 ativos. Após uma olhada, você observa que há 5 filas de 5 cubículos. ");
		System.out.println(
				"O computador no qual você está é o ... .0.6. Com essas informações você monta duas matrizes.");
		System.out.println(
				"Em uma, o computador  ... .0.2 está para a sua direita, e na outra, ele está para sua frente.");
		System.out.println(
				"Na fila à sua frente, o caminho estaria livre. Na fila à sua direita não, além da mesa do segurança.");
		System.out.println(
				"Ao olhar de novo, você que na mesa do segurança não é um segurança sentado, mas alguem mexendo no ");
		System.out.println(
				"computador. Essa pessoa junta suas coisas, sai da mesa em diração à saída. Passa pelo seu cubículo ");
		System.out.println("sem lhe notar e entra no elevador.");

		// Desafio 2 (correta: 1)
		do {
			System.out.println(
					"Imediatamente você se senta à mesa e tenta acessar o diagrama dos cubículos. Porém, percebe que o ");
			System.out.println(
					"código do diagrama está incompleto! Falta terminar o laço que preenche a matriz com cubículos ");
			System.out.println("cheios ou vazios.");
			System.out.println("Que opção de estrutura de código concluiria esse serviço de modo simples?.");

			System.out.println("1) Dois laços for com if's para verificar a ocupação.");
			System.out.println("2) Dois do-while com a condição de número de cubículos.");
			System.out.println("3) Um grande switch verificando ocupações.");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[1] = entrada.nextInt();

			if (escolhas[1] == 1) {
				System.out.println(
						"O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a seguir ");
				System.out.println("é o entre os cubículos. Você segue por esse caminho.");
			}
			if (escolhas[1] == 2) {
				System.out.println(
						"O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a frente ");
				System.out.println(
						"do seu cubículo está livre. Ao segui por esse caminho, você é surpreendido por haver alguém ");
				System.out.println(
						"em um dos cubículos! Seu código produziu um resultado errado. A pessoa grita, o segurança ");
				System.out.println("vê e detém você.");
				System.out.println("Resposta errada.");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"O computador roda o código, mas mensagens de erro são exibidas. Você tenta corrir o código, mas nada ");
				System.out.println(
						"funciona. Após algumas tentativas, você perde noção do tempo e o segurança aparece atrás de");
				System.out.println("você e detém você!");
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
				"Você segue entre os cubículos, mas alguém faz barulho como se fosse se levantar, e você entra em ");
		System.out
				.println("um dos cubículos. Enquanto isso, o técnico de TI volta e vê que alguém completou o código. ");
		System.out.println(
				"Imediatamente, ele comunica o fato ao segurança, que pergunta quanto tempo faz que a alteração foi ");
		System.out.println("feita. O técnico procura a informação.");
		System.out.println(
				"Nisso, a pessoa que saiu do cubículo passa pelo segurança, e quando perguntada, essa pessoa diz que ");
		System.out.println("não tinha visto ninguém estranho por alí.");
		System.out.println(
				"Abaixado, você se desloca até a saída da área de cubículos. Porém, você é surpreendido, pois não há ");
		System.out.println(
				"passagem entre os dois cubículos por onde você passaria; há pilhas de caixas que não era visível ");
		System.out.println("antes. E passar por cima seria algo notado.");
		System.out.println(
				"Os dois cubículos perto de você estão vagos. Você em um de decide usar suas habilidades para derubar ");
		System.out
				.println("a rede e tentar fazer algumas pessoas fazerem uma pausa e iram ao refeitório para um café.");
		System.out.println("No computador você acessa o roteador novamente. Bloqueia todos e coloca uma senha.");
		System.out.println(
				"Logo algumas pessoas reclamam com o técnico que estava alí, sem que ele conseguisse resolver, pois o ");
		System.out.println(
				"roteador na verdade é um software no servido de segurança que fica em outro local, e mexer nele seria ");
		System.out.println("complicado.");
		System.out.println(
				"Várias pessoas se frustram com a situação e seguem para o refeitório, resmungando impropérios ");
		System.out.println("relacionados ao técnico.");
		System.out.println("Com isso, há menos gente nos cubículos, mas não há como saber quais estão vazios.");

		// Desafio 3 (correta: 1)
		do {
			System.out.println(
					"Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
			System.out.println("estão presas por uma trava eletrônica.");
			System.out.println("Um post-it no monitor faz referência a essa senha, seguido de: ");
			System.out.println("'Incremente antes de retornar o valor'");
			System.out.println("e 'três erros emite alarme sonoro'");

			System.out.println("Você pensa e considera três opções: ");
			System.out.println("1) ++i");
			System.out.println("2) i++");
			System.out.println("3) i+=1");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[2] = entrada.nextInt();

			if (escolhas[2] == 1) {
				System.out.println(
						"Senha correta! A trava libera as pilhas e você move lentamente uma delas até ter um espaço para passar. ");
			}
			if (escolhas[2] == 2) {
				System.out.println(
						"Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");

			}
			if (escolhas[2] == 3) {
				System.out.println(
						"Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
			}

			if (escolhas[2] != 1)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[2] != 1);

		System.out.println(
				"Andando abaixado você chega até as saídas. À sua frente está o elevador, à sua esquerda o acesso às ");
		System.out.println("escadas normais, e à direita tem a janela que dá para a escada de incêndio.");

		// Saída (todas)

		System.out.println(
				"Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");

		System.out.println("Qual dos três caminhos você escolhe: ");
		System.out.println("1) Escadas normais");
		System.out.println("2) Elevador");
		System.out.println("3) Escada de incêndio");
		System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
		escolhas[3] = entrada.nextInt();

		if (escolhas[3] == 1) {
			System.out.println(
					"Ao se aproximar das escadas, você ouve passos. Você se encosta na parede entre a porta e o ");
			System.out.println("elevador. Um funcionário da limpeza sai das escadas sem ver você. Rapidamente, você ");
			System.out.println("entra nas escadas e desce para o 1o andar.");
		}
		if (escolhas[3] == 2) {
			System.out.println(
					"Ao se aproximas do elevador, você vê que ele já estava descendo, e pode ter pessoas dentro. ");
			System.out.println(
					"Você fica entre o elevador e a janela, como se estivesse eperando e olhando o lado de fora. ");
			System.out.println(
					"Duas pessoas saem do elevador conversando e não percebem você. Você entra no elevador vazio e ");
			System.out.println("desce para o 1o andar.");

		}
		if (escolhas[3] == 3) {
			System.out.println(
					"Você olha para ver se tem alguém vendo. O guarda e o técnico estão distantes discutindo sobre ");
			System.out.println(
					"os problemas no servidor. Você aproveita, abre a janela e desce pela escada até o 1o andar.");
		}

	}

	static void andar7() {
		int escolhas[] = new int[3];

		// Possibilidade de Game Over no desafio 3
		int tentativas = 5;

		// gabarito: 3, 3, e 2

		// Chegada
		System.out.println("Muito bem! Você chegou ao 7º andar!");

		// Desafio 1 (correta: 3)
		do {
			System.out.println("Ao sair das escadas, você se depara com um corredor de portas, ");
			System.out
					.println("um bilhete no chão e uma câmera acima do acesso 'as escadas, que varre de lado a lado.");
			System.out.println("No bilhete lê-se:");
			System.out.println("'A porta que leva 'a saída é aquela em que o número da porta está ");
			System.out.println("associado ao resultado da seguinte pergunta:");
			System.out.println("Qual laço de repetição pode ser usado para situações nas quais se tem que ");
			System.out.println("verificar a condição após a execução do bloco de código?");
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
			System.out.println("A porta que você escolheu dá na cozinha. Na pia você vê a cafeteira com café pronto.");
			System.out.println("Você coloca um pouco em uma caneca, mas ouve alguém se aproximando da cozinha.");
			System.out.println("Rapidamente, você procura para onde tentar ir. Você vê: ");
			System.out.println("1) compartimento abaixo da pia, com porta para fechar");
			System.out.println("2) Um armário ao lado da pia");
			System.out.println("3) Em baixo de uma mesa com quatro cadeiras próxima a um canto da cozinha");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[1] = entrada.nextInt();

			if (escolhas[1] == 1) {
				System.out.println(
						"Ao tentar entrar de baixo da pia você percebe que não cabe, e o guarda que entra na cozinha o vê!");
			}
			if (escolhas[1] == 2) {
				System.out.println(
						"Você consegue entrar no armário, mas os produtos de limpeza lá dentro fazem que você espirre, ");
				System.out.println("e o guarda que entrou na cozinha é alertado da sua presença!");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"Apesar de a mesa não ser um local muito protegido, o guarda que entrou na cozinha, passa por ela ");
				System.out.println("sem perceber a sua presença.");
			}

			if (escolhas[1] != 3)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[1] != 3);

		// Desafio 3 (correta : 3)
		do {
			System.out.println(
					"Ao sair da cozinha, você vê um salão com vários cubículos. Em alguns arece haver gente trabalhando, ");
			System.out.println(" e bastante ocupados. Você deve manter-se depercebido.");
			System.out.println(
					"Duas das laterais desse salão são janelas. Algumas, próximas a uma parede, há um acesso à ");
			System.out.println(
					" escada de emergência. Porém, para acessá-la, você teria que ser visto por alguns ocupantes ");
			System.out.println(
					" dos cubículos. Você procura opções para evitar isso. Uma mesa fora dos cubículos, parece ser ");
			System.out.println(
					"do setor de segurança e está desocupada. Provavelmente é o posto do guarda que passou pela cozinha. ");
			System.out.println(" Ao se aproximar da mesa, no monitor você observa que aparece uma mensagem");
			System.out.println("'Para acessar o diagrama de utilização dos cubículos responda: ");
			System.out.println("Em uma estrutura switch, qual declaração, que quando presente, é executada quando "
					+ "nenhum dos casos ocorre?");
			System.out.println("1) Break");
			System.out.println("2) default");
			System.out.println("3) goto");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[2] = entrada.nextInt();

			if (escolhas[2] == 1) {
				System.out.println(
						"Esta resposta é uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende você.");
			}
			if (escolhas[2] == 2) {
				System.out.println(
						"Resposta certa. O diagrama aparece e você vê que os dois cubículos voltados para a parede ");
				System.out.println(
						"no caminho da janela estão desocupados, permitindo acesso. Você abre a janela e desce para ");
				System.out.println("o 6o andar.");
			}
			if (escolhas[2] == 3) {
				System.out.println(
						"Esta resposta é uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende você.");
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
    System.out.println ("Neste andar, nosso sistema de seguran�a, esta integrado ao sistema de combate a inc�ndio"
    + "Para acessar o 5� andar tera que decidir entre os comandos de acesso, qual o correto.\n"
    + "O sistema de combate a inc�ndio � dotado de Bombas de V�cuo que em caso de acionamento todo Oxig�nio do andar ser� sequestrado.\n"
    + "Voc� ter� apenas uma chance para acertar a quest�o e n�o ficar sem oxig�nio. Analise bem a quest�o e boa sorte! RSRS	\n"
    + "Se o c�digo escolhido estiver correto ser� disponibilizado, uma m�scara conectada a um cilindro de oxig�nio.\n"
    + "Vamos ao que interessa? \n");
    System.out.println("QUEST�O: Escolha a fun��o correta que some a idade do jogador + o n�mero deste andar; o c�digo sendo escolhido de forma correta o \n"
    		+ "jogador ter� acesso ao 5� andar, caso erre o oxig�nio ser� sequestrado e voc� perder� o jogo! \n");

    
    	// Comando 1
    	do{System.out.println("De acordo com o enunciado, qual a op��o correta? \n");
        System.out.println("Op��o 1: Public static void main(String args[]){\n"
        		+ "int var1;\n"
        		+ "int var2;\n"
        		+ "var1 = 18;\n"
        		+ "var2= 06;\n"
        		+ "int resul = var1 + var2;\n"
        		+ "System.out.println (resul);\n"); //resposta correta
        System.out.println("Op��o 2: Public static void main (String args[]){\n;"
                + "int var1\n"
                + "int var2\n"
                + "var1 = 18\n"
                + "var2= O6\n"
                + "System.out.println (var1  + var2);\n");
        System.out.println("Op��o 3: Public static void main (String args[]){\n"
                + "int var1\n"
                + "int var2\n"
                + "var1 = 18\n"
                + "var2 = 06\n"
                + "int resul = var1 + var2;\n"
                + "Systen.out.printlm (resul)\n");
        System.out.println("Op��o 4: Public static void maim(String args[]){\n"
        		+ "int var1\n"
           		+ "int var2\n"
        		+ "var1 = 18\n"
           		+ "var2 = 06\n"
           		+ "resul = var1 + var2;"
        		+ "System.out.println (resul)\n");
                // em caso de uma escolha invalida, o jogador perder� o jogo!.	   
        System.out.println("Qual a op��o correta?");
        respost = entrada.nextInt();
        
        if(respost == 1) {
        	System.out.println("Voc� escapou dessa, parab�ns! Mas ainda n�o � sua salva��o.. muito te espera.. siga para o 5 andar!");
        }else if(respost == 2 || respost == 3 ||respost == 4) {
        	System.out.println("OXIG�NIO SEQUESTRADO.. GAME OVER!!");
        	menu();
        }else {
        	System.out.println("Resposta inv�lida, preste aten��o!");

        }
       
    	}while(respost != 1 && respost == 2 && respost != 3 && respost != 4 );
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
