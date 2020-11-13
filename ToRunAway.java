import java.util.Scanner;

public class ToRunAway {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
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
		System.out.print("Digite a sua escolha, você será um jogador ou desistirá sem tentar? \n");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("\nGostei de ver, temos alguém disposto a enfrentar desafios pelo visto. Como devo chamar a pessoa que ganhará o jogo? (ou não!) ");
			nome = entrada.next();
			System.out.print("\nÓtimo. Para completar essa etapa só temos mais uma perguntinha.. Qual o seu gênero? ");
			System.out.println("M => Masculino  F => Feminino");
			sexo = entrada.next();
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("\nÓtimo, agora vamos ao jogo!! Para iniciar, conheça sua história: \n");
				System.out.println("Um jovem programador, chamado " + nome + " trabalha há pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informações sigilosas por \nhackers, " + nome + " por ser novato, foi utilizado como laranja pelos hackers."
								+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas \nprovas no usuário do sistema no qual " + nome + " trabalhava, sem que o mesmo soubesse.\n\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "+
								nome+", o presidente da empresa aciona a segurança para que localize e capture o jovem programador. \n\nNesse exato momento o sistema de segurança do predio é acionado para que "+
						"ele não fuja. O sistema de segurança, bloqueia os elevadores que só podem \ndescer um andar, portas e janela são trancadas automaticamente, "+
								"e para o "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os \nseguranças da empresa, que estão localizados em pontos estratégios para que ninguém saia sem ser visto.\n");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("\nÓtimo, agora vamos ao jogo!! Para iniciar, conheça sua história: \n");
				System.out.println("Um jovem programador, chamado " + nome + " trabalha há pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informações sigilosas por \nhackers, " + nome + " por ser novato, foi utilizado como laranja pelos hackers."
								+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas \nprovas no usuário do sistema no qual " + nome + " trabalhava, sem que a mesma soubesse.\n\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as, ao descobrir as \nprovas implantadas no nome de "+
								nome+", o presidente da empresa aciona a segurança para que localize e capture o jovem programador. \n\nNesse exato momento o sistema de segurança do predio é acionado para que "+
						"ele não fuja. O sistema de segurança, bloqueia os elevadores que só podem \ndescer um andar, portas e janela são trancadas automaticamente, "+
								"e para o "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os \nseguranças da empresa, que estão localizados em pontos estratégios para que ninguém saia sem ser vista.\n");
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
        }while(opcao == 2);
        int escolha;

        do {
        	System.out.println("1 - Conte-me mais sobre o que vou vivenciar, por favor!!");
        	System.out.println("2 - Chega de papo furado e vamos jogar logo?!");
        	escolha = entrada.nextInt();
        	
        	if(escolha == 1) {
        		System.out.println("\nVejo que temos alguém com medo, ops, digo, interessado(a) em seu futuro!");
        		System.out.println("É muito bom mesmo conhecer o caminho, assim você estará mais apto(a) a vencer os desafios. Não esqueça, você precisará de uma mente afiada para despistar\n" + 
        		"os seguranças e conseguir fugir do prédio sem ser capturado(a). Em cada andar, além de despistar os seguranças, você precisará resolver algumas escolhas \nobjetivas e tomar uma decisão envolvendo lógica " + 
        		"Mas para te auxiliar nesses desafios, você poderá escolher seu perfil. Ele será formado por características escolhidas /npor você, mas não se empolgue, você precisará priorizar algumas. É meu(inha) caro(a), não podemos ter tudo na vida né?" + 
        		" Entendeu o que espera você pela frente? Podemos ir para a parte onde você monta seu perfil que irá perder... ops! ganhar o jogo? ");
        		System.out.println("1 - SIM");
        		System.out.println("2 - NÃO, estou com medo e quero desistir!");
        		int perfil = entrada.nextInt();
        		
        		if( perfil == 1) {
        			System.out.println("\nEssa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
        			System.out.println("Opção 1 = Força: 2, Inteligência: 3, Lógica: 3");
        			System.out.println("Opção 2 = Força: 0, Inteligência: 4, Lógica: 3");
        			System.out.println("Opção 3 = Força: 4, Inteligência: 1, Lógica: 2");
        			System.out.println("Escolha sua opção:");
        			int caract = entrada.nextInt();
        		}else {
        			System.out.println("Achei que você fosse mais corajoso(a). Quer desistir mesmo? 1 Sim, 2 Não.");
        			int desistir = entrada.nextInt();
        			if (desistir == 1) {
        				System.out.println("\nQue pena, quem sabe outro dia você volta! Foi um prazer te conhecer, até logo!");
        			}else if(desistir ==2) {
        				System.out.println("\nQue bom que você reconsiderou!");
        				System.out.println("Essa é uma hora importante, analise bem as opções e faça a sua escolha. Lembrando que ela afetará em cada desafio!");
            			System.out.println("Opção 1 = Força: 2, Inteligência: 3, Lógica: 3");
            			System.out.println("Opção 2 = Força: 0, Inteligência: 4, Lógica: 3");
            			System.out.println("Opção 3 = Força: 4, Inteligência: 1, Lógica: 2");
            			System.out.println("Escolha sua opção:");
            			int caract = entrada.nextInt();
        			}else {
        				System.out.println("Opção inválida!");
        			}
        			
        		}
        	}else if(escolha == 2) {
        		System.out.println("\nOk, eu entendo que você quer jogar logo. Mas precisamos escolher suas características antes!");
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

}
