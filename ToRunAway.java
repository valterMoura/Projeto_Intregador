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
		System.out.print("Digite a sua escolha, voc� ser� um jogador ou desistir� sem tentar?");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("\n Gostei de ver, temos algu�m disposto a enfrentar desafios pelo visto. Como devo chamar a pessoa que ganhar� o jogo? (ou n�o!) ");
			nome = entrada.next();
			System.out.print("\n �timo. Para completar essa etapa s� temos mais uma perguntinha.. Qual o seu g�nero? ");
			System.out.println("M => Masculino  F => Feminino");
			sexo = entrada.next();
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("\n �timo, agora vamos ao jogo!! Para iniciar, conhe�a sua hist�ria: \n");
				System.out.println("Um jovem programador, chamado " + nome + " trabalha h� pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informa��es sigilosas \n por hackers,\n" + nome + " por ser novato, foi utilizado como laranja pelos hackers."
								+ " Os hackers, que tamb�m trabalhavam na mesma empresa, implantaram muitas provas no usu�rio do sistema no qual " + nome + " trabalhava, \n sem que o mesmo soubesse.\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informa��es da empresa e divulgando-as,\n ao descobrir as provas implantadas no nome de "+
								nome+", o presidente da empresa aciona a seguran�a para que localize e capture o jovem programador. \n Nesse exato momento o sistema de seguran�a do predio � acionado para que "+
						"ele n�o fuja. O sistema de seguran�a,\n bloqueia os elevadores que s� podem descer um andar, portas e janela s�o trancadas automaticamente,\n"+
								"e para o "+nome+" fugir, ter� que hackear o sistema de seguran�a e fugir de todos os seguran�as da empresa,\n que est�o localizados em pontos estrat�gios para que ningu�m saia sem ser visto.");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("\\n �timo, agora vamos ao jogo!! Para iniciar, conhe�a sua hist�ria: \\n");
				System.out.println("Uma jovem programadora, chamada " + nome + " trabalha h� pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informa��es sigilosas \n por hackers,\n" + nome + " por ser novata, foi utilizada como laranja pelos hackers."
						+ " Os hackers, que tamb�m trabalhavam na mesma empresa, implantaram muitas provas no usu�rio do sistema no qual " + nome + " trabalhava, \n sem que a mesma soubesse.\n"+
				"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informa��es da empresa e divulgando-as,\n ao descobrir as provas implantadas no nome de "+
						nome+", o presidente da empresa aciona a seguran�a para que localize e capture a jovem programadora. \n Nesse exato momento o sistema de seguran�a do predio � acionado para que "+
				"ela n�o fuja. O sistema de seguran�a,\n bloqueia os elevadores que s� podem descer um andar, portas e janela s�o trancadas automaticamente,\n"+
						"e para o "+nome+" fugir, ter� que hackear o sistema de seguran�a e fugir de todos os seguran�as da empresa,\n que est�o localizados em pontos estrat�gios para que ningu�m saia sem ser visto.");
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
			System.out.println("\n Voc� saiu do jogo!");
			break;
			default:
				System.out.println("Op��o inv�lida, renda-se e venha testar suas habilidades de jogador!");
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
        		System.out.println("Vejo que temos algu�m com medo, ops, digo, interessado(a) em seu futuro!");
        		System.out.println("� muito bom mesmo conhecer o caminho, assim voc� estar� mais apto(a) a vencer os desafios. N�o esque�a, voc� precisar� de uma mente afiada para despistar" + 
        		" os seguran�as e conseguir fugir do pr�dio sem ser capturado(a). Em cada andar, al�m de despistar os seguran�as, voc� precisar� resolver algumas escolhas objetivas e tomar uma decis�o envolvendo l�gica " + 
        		"Mas para te auxiliar nesses desafios, voc� poder� escolher seu perfil. Ele ser� formado por caracter�sticas escolhidas por voc�, mas n�o se empolgue, voc� precisar� priorizar algumas. � meu(inha) caro(a), n�o podemos ter tudo na vida n�?" + 
        		" Entendeu o que espera voc� pela frente? Podemos ir para a parte onde voc� monta seu perfil que ir� perder... ops! ganhar o jogo? ");
        		System.out.println(" 1 - SIM");
        		System.out.println(" 2 - N�O, estou com medo e quero desistir!");
        		int perfil = entrada.nextInt();
        		
        		if( perfil == 1) {
        			System.out.println("Essa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
        			System.out.println("Op��o 1 = For�a: 2, Intelig�ncia: 3, L�gica: 3");
        			System.out.println("Op��o 2 = For�a: 0, Intelig�ncia: 4, L�gica: 3");
        			System.out.println("Op��o 3 = For�a: 4, Intelig�ncia: 1, L�gica: 2");
        			System.out.println("Escolha sua op��o:");
        			int caract = entrada.nextInt();
        		}else {
        			System.out.println("Achei que voc� fosse mais corajoso(a). Quer desistir mesmo? 1 Sim, 2 N�o.");
        			int desistir = entrada.nextInt();
        			if (desistir == 1) {
        				System.out.println("Que pena, quem sabe outro dia voc� volta! Foi um prazer te conhecer, at� logo!");
        			}else if(desistir ==2) {
        				System.out.println("Que bom que voc� reconsiderou!");
        				System.out.println("Essa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
            			System.out.println("Op��o 1 = For�a: 2, Intelig�ncia: 3, L�gica: 3");
            			System.out.println("Op��o 2 = For�a: 0, Intelig�ncia: 4, L�gica: 3");
            			System.out.println("Op��o 3 = For�a: 4, Intelig�ncia: 1, L�gica: 2");
            			System.out.println("Escolha sua op��o:");
            			int caract = entrada.nextInt();
        			}else {
        				System.out.println("Op��o inv�lida!");
        			}
        			System.out.println("teste");//victor
        		}
        	}else if(escolha == 2) {
        		System.out.println("Ok, eu entendo que voc� quer jogar logo. Mas precisamos escolher suas caracter�sticas antes!");
				System.out.println("Essa � uma hora importante, analise bem as op��es e fa�a a sua escolha. Lembrando que ela afetar� em cada desafio!");
    			System.out.println("Op��o 1 = For�a: 2, Intelig�ncia: 3, L�gica: 3");
    			System.out.println("Op��o 2 = For�a: 0, Intelig�ncia: 4, L�gica: 3");
    			System.out.println("Op��o 3 = For�a: 4, Intelig�ncia: 1, L�gica: 2");
    			System.out.println("Escolha sua op��o:");
    			int caract = entrada.nextInt();
        	} else {
        		System.out.println("Op��o inv�lida!!");
        	}
        }while(escolha!=1 && escolha!=2);
        //Daimon
	}
	public static void main(String[] args) {
		menu ();
		caracteristica();
		
       
	}

}
