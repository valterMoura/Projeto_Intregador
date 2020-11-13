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
		System.out.println("Você esta preparado(a) para provar seu potencial e suas habilidades em um jogo totalmente diferenciado?");
		System.out.println("Apresentamos TO RUN AWAY! O jogo que faltava para você testar seus conhecimentos como programador.");
		System.out.println("Você topa esse desafio?");
		System.out.println(" Opções \n");
		System.out.println("1 - Jogar");
		System.out.println("2 - Creditos");
		System.out.println("3 - Sair \n");
		System.out.print("Digite a sua escolha, você será um jogador ou desistirá sem tentar?");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("\n Gostei de ver, temos alguém disposto a enfrentar desafios pelo visto. Como devo chamar a pessoa que ganhará o jogo? (ou não!) ");
			nome = entrada.next();
			System.out.print("\n Ótimo. Para completar essa etapa só temos mais uma perguntinha.. Qual o seu gênero? ");
			System.out.println("M => Masculino  F => Feminino");
			sexo = entrada.next();
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("\n Ótimo, agora vamos ao jogo!! Para iniciar, conheça sua história: \n");
				System.out.println("Um jovem programador, chamado " + nome + " trabalha há pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informações sigilosas \n por hackers,\n" + nome + " por ser novato, foi utilizado como laranja pelos hackers."
								+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas provas no usuário do sistema no qual " + nome + " trabalhava, \n sem que o mesmo soubesse.\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as,\n ao descobrir as provas implantadas no nome de "+
								nome+", o presidente da empresa aciona a segurança para que localize e capture o jovem programador. \n Nesse exato momento o sistema de segurança do predio é acionado para que "+
						"ele não fuja. O sistema de segurança,\n bloqueia os elevadores que só podem descer um andar, portas e janela são trancadas automaticamente,\n"+
								"e para o "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os seguranças da empresa,\n que estão localizados em pontos estratégios para que ninguém saia sem ser visto.");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("\\n Ótimo, agora vamos ao jogo!! Para iniciar, conheça sua história: \\n");
				System.out.println("Uma jovem programadora, chamada " + nome + " trabalha há pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informações sigilosas \n por hackers,\n" + nome + " por ser novata, foi utilizada como laranja pelos hackers."
						+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas provas no usuário do sistema no qual " + nome + " trabalhava, \n sem que a mesma soubesse.\n"+
				"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as,\n ao descobrir as provas implantadas no nome de "+
						nome+", o presidente da empresa aciona a segurança para que localize e capture a jovem programadora. \n Nesse exato momento o sistema de segurança do predio é acionado para que "+
				"ela não fuja. O sistema de segurança,\n bloqueia os elevadores que só podem descer um andar, portas e janela são trancadas automaticamente,\n"+
						"e para o "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os seguranças da empresa,\n que estão localizados em pontos estratégios para que ninguém saia sem ser visto.");
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
			System.out.println("\n Você saiu do jogo!");
			break;
			default:
				System.out.println("Opção inválida, renda-se e venha testar suas habilidades de jogador!");
		}
        }while(opcao == 2);
	}
	static void caracteristica() {
		 int escolha;

        do {
        	System.out.println("1 - Conte-me mais sobre o que vou vivenciar, por favor!!");
        	System.out.println("2 - Chega de papo furado e vamos jogar logo?!");
        	escolha = entrada.nextInt();
        	
        	if(escolha == 1) {
        		System.out.println("Vejo que temos alguém com medo, ops, digo, interessado(a) em seu futuro!");
        		System.out.println("É muito bom mesmo conhecer o caminho, assim você estará mais apto(a) a vencer os desafios. Não esqueça, você precisará de uma mente afiada para despistar" + 
        		" os seguranças e conseguir fugir do prédio sem ser capturado(a). Em cada andar, além de despistar os seguranças, você precisará resolver algumas escolhas objetivas e tomar uma decisão envolvendo lógica " + 
        		"Mas para te auxiliar nesses desafios, você poderá escolher seu perfil. Ele será formado por características escolhidas por você, mas não se empolgue, você precisará priorizar algumas. É meu(inha) caro(a), não podemos ter tudo na vida né?" + 
        		" Entendeu o que espera você pela frente? Podemos ir para a parte onde você monta seu perfil que irá perder... ops! ganhar o jogo? ");
        		System.out.println(" 1 - SIM");
        		System.out.println(" 2 - NÃO, estou com medo e quero desistir!");
        		int perfil = entrada.nextInt();
        		
        		if( perfil == 1) {
        			System.out.println("Essa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
        			System.out.println("Opção 1 = Força: 2, Inteligência: 3, Lógica: 3");
        			System.out.println("Opção 2 = Força: 0, Inteligência: 4, Lógica: 3");
        			System.out.println("Opção 3 = Força: 4, Inteligência: 1, Lógica: 2");
        			System.out.println("Escolha sua opção:");
        			int caract = entrada.nextInt();
        		}else {
        			System.out.println("Achei que você fosse mais corajoso(a). Quer desistir mesmo? 1 Sim, 2 Não.");
        			int desistir = entrada.nextInt();
        			if (desistir == 1) {
        				System.out.println("Que pena, quem sabe outro dia você volta! Foi um prazer te conhecer, até logo!");
        			}else if(desistir ==2) {
        				System.out.println("Que bom que você reconsiderou!");
        				System.out.println("Essa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
            			System.out.println("Opção 1 = Força: 2, Inteligência: 3, Lógica: 3");
            			System.out.println("Opção 2 = Força: 0, Inteligência: 4, Lógica: 3");
            			System.out.println("Opção 3 = Força: 4, Inteligência: 1, Lógica: 2");
            			System.out.println("Escolha sua opção:");
            			int caract = entrada.nextInt();
        			}else {
        				System.out.println("Opção inválida!");
        			}
        			System.out.println("teste");//victor
        		}
        	}else if(escolha == 2) {
        		System.out.println("Ok, eu entendo que você quer jogar logo. Mas precisamos escolher suas características antes!");
				System.out.println("Essa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
    			System.out.println("Opção 1 = Força: 2, Inteligência: 3, Lógica: 3");
    			System.out.println("Opção 2 = Força: 0, Inteligência: 4, Lógica: 3");
    			System.out.println("Opção 3 = Força: 4, Inteligência: 1, Lógica: 2");
    			System.out.println("Escolha sua opção:");
    			int caract = entrada.nextInt();
        	} else {
        		System.out.println("Opção inválida!!");
        	}
        }while(escolha!=1 && escolha!=2);
        //Daimon
	}
	public static void main(String[] args) {
		menu ();
		caracteristica();
		
       
	}

}
