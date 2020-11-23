package code;

import java.util.Scanner;

public class Andar2_e_Andar7 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		//andar2();
		//andar7();

	}

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
			}
		} while (opcao == 3 || opcao == 2);
		return nome;
	}
	
	static void andar2() {
		int escolhas[] = new int[4];
		
		// Possibilidade de Game Over no desafio 2
		int tentativas = 5;
		
		// gabarito: 2, 1, 1 e Todas

		// Chegada
		System.out.println("Muito bem! Você chegou ao 2º andar!");
		System.out.println("Você chega no refeitório do segundo andar. Ao passar pela porta de saída, você observa um ");
		System.out.println("amplo salão de cubículos. Você está em um dos extremos, e no outro você o acesso: ao elevador, ");
		System.out.println("às escadas normais, e às escadas de incêndio. Porém, para chegar a qualquer uma dessas opções, ");
		System.out.println("você deve passar pelos cubículos.");
		System.out.println("Em um dos corredores laterais, do lado no qual você está, há uma mesa do setor de segurança, ");
		System.out.println("onde há um guarda de costas para você. Um dos cubículos à sua frente está desocupado, e você ");
		System.out.println("entra nele para acessar o computador, e tentar obter o diagrama de rede do salão.");
		
		// Desafio 1 (correta: 1)
		do {
			System.out.println("Ao tirar o computador de modo de espera, você vê na tela uma pergunta para liberar o acesso ao ");
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
				System.out.println("cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}
			if (escolhas[0] == 2) {
				System.out.println("Esta é a resposta certa, e você consegue acesso ao computador.");
			}
			if (escolhas[0] == 3) {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println("cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}

			if (escolhas[0] != 2)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 2);
		
		
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
		
		
		
		// Desafio 2 (correta: 1)
		do {
			System.out.println("Imediatamente você se senta à mesa e tenta acessar o diagrama dos cubículos. Porém, percebe que o ");
			System.out.println("código do diagrama está incompleto! Falta terminar o laço que preenche a matriz com cubículos ");
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
				System.out.println("O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a frente ");
				System.out.println("do seu cubículo está livre. Ao segui por esse caminho, você é surpreendido por haver alguém ");
				System.out.println("em um dos cubículos! Seu código produziu um resultado errado. A pessoa grita, o segurança ");
				System.out.println("vê e detém você.");
				System.out.println("Resposta errada.");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"O computador roda o código, mas mensagens de erro são exibidas. Você tenta corrir o código, mas nada ");
				System.out.println("funciona. Após algumas tentativas, você perde noção do tempo e o segurança aparece atrás de");
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
		
		
		// Desafio 3 (correta: 1)
		do {
			System.out.println("Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
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
				System.out.println("Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
				
			}
			if (escolhas[2] == 3) {
				System.out.println("Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
			}

			if (escolhas[2] != 1)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[2] != 1);
		
		
		System.out.println("Andando abaixado você chega até as saídas. À sua frente está o elevador, à sua esquerda o acesso às ");
		System.out.println("escadas normais, e à direita tem a janela que dá para a escada de incêndio.");
	
		// Saída (todas)
		
			System.out.println("Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
				
			System.out.println("Qual dos três caminhos você escolhe: ");
			System.out.println("1) Escadas normais");
			System.out.println("2) Elevador");
			System.out.println("3) Escada de incêndio");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			escolhas[3] = entrada.nextInt();

			if (escolhas[3] == 1) {
				System.out.println("Ao se aproximar das escadas, você ouve passos. Você se encosta na parede entre a porta e o ");
				System.out.println("elevador. Um funcionário da limpeza sai das escadas sem ver você. Rapidamente, você ");
				System.out.println("entra nas escadas e desce para o 1o andar.");
			}
			if (escolhas[3] == 2) {
				System.out.println("Ao se aproximas do elevador, você vê que ele já estava descendo, e pode ter pessoas dentro. ");
				System.out.println("Você fica entre o elevador e a janela, como se estivesse eperando e olhando o lado de fora. ");
				System.out.println("Duas pessoas saem do elevador conversando e não percebem você. Você entra no elevador vazio e ");
				System.out.println("desce para o 1o andar.");
				
			}
			if (escolhas[3] == 3) {
				System.out.println("Você olha para ver se tem alguém vendo. O guarda e o técnico estão distantes discutindo sobre ");
				System.out.println("os problemas no servidor. Você aproveita, abre a janela e desce pela escada até o 1o andar.");
			}

		
		
	}
	
	static void andar7() {
		int escolhas[] = new int[3];
		
		// Possibilidade de Game Over no desafio 3
		int tentativas = 5;
		
		//gabarito: 3, 3, e 2
		
		// Chegada
		System.out.println("Muito bem! Você chegou ao 7º andar!");

		// Desafio 1 (correta: 3)
		do {
			System.out.println("Ao sair das escadas, você se depara com um corredor de portas, ");
			System.out.println("um bilhete no chão e uma câmera acima do acesso 'as escadas, que varre de lado a lado.");
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
				System.out.println("Você consegue entrar no armário, mas os produtos de limpeza lá dentro fazem que você espirre, ");
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
			System.out.println("Ao sair da cozinha, você vê um salão com vários cubículos. Em alguns arece haver gente trabalhando, ");
			System.out.println(" e bastante ocupados. Você deve manter-se depercebido.");
			System.out.println("Duas das laterais desse salão são janelas. Algumas, próximas a uma parede, há um acesso à ");
			System.out.println(" escada de emergência. Porém, para acessá-la, você teria que ser visto por alguns ocupantes ");
			System.out.println(" dos cubículos. Você procura opções para evitar isso. Uma mesa fora dos cubículos, parece ser ");
			System.out.println("do setor de segurança e está desocupada. Provavelmente é o posto do guarda que passou pela cozinha. ");
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
				System.out.println("no caminho da janela estão desocupados, permitindo acesso. Você abre a janela e desce para ");
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
				//menu();
				return;
			}

		} while (escolhas[2] != 2);

	}
	
	
	
}