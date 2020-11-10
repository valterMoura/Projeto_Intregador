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
		System.out.print("Digite a opção: ");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("\nDigite o seu nome: ");
			nome = entrada.next();
			System.out.print("\nDigite o seu sexo: ");
			System.out.println("M => Masculino  F => Feminino");
			sexo = entrada.next();
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("\n A historia\n");
				System.out.println("Um jovem programador, chamado " + nome + " trabalha há pouco tempo na empresa TI Universal,"
						+ " empresa que estava sofrendo roubo de informações sigilosas \n por hackers,\n" + nome + " por ser novato, foi utilizado como laranja pelos hackers."
								+ " Os hackers, que também trabalhavam na mesma empresa, implantaram muitas provas no usuário do sistema no qual " + nome + " trabalhava, \n sem que o mesmo soubesse.\n"+
						"A TI Universal contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as,\n ao descobrir as provas implantadas no nome de "+
								nome+", o presidente da empresa aciona a segurança para que localize e capture o jovem programador. \n Nesse exato momento o sistema de segurança do predio é acionado para que "+
						"ele não fuja. O sistema de segurança,\n bloqueia os elevadores que só podem descer um andar, portas e janela são trancadas automaticamente,\n"+
								"e para o "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os seguranças da empresa,\n que estão localizados em pontos estratégios para que ninguém saia sem ser visto.");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("\nA historia\n");
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
			System.out.println("\n Você saiu do jogo");
			break;
		}
        }while(opcao == 2);

	}

}
