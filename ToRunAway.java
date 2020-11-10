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
		System.out.println(" Opções \n");
		System.out.println("1 - Jogar");
		System.out.println("2 - Creditos");
		System.out.println("3 - Sair \n");
		System.out.print("Digite a opção: ");
		opcao = entrada.nextInt();
		switch (opcao) {
		case 1:
			System.out.println("\nDigiter o seu nome: ");
			nome = entrada.next();
			System.out.print("\nDigiter o seu sexo: ");
			System.out.println("M => Masculino  F => Feminino");
			sexo = entrada.next();
			if(sexo.equalsIgnoreCase("M")) {
				System.out.println("\nA historia\n");
				System.out.println("Um jovem programador, chamado "+nome+" trabalha a pouca tempo na empresa chamada TI Universal,"
						+ " empresa que estava sofrendo um grande roubo de informações sigilosas \npor hackers,\n"+nome+" por ser novato foi utilizado como laranja pelos hackers"
								+ " que também trabalhavam na mesma empresa, foram implatadas muitas provas em seu sistema no qual trabalhava, \nsem que o mesmo soubesse.\n"+
						"A empresa contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as,\nao descobrir as provas implantadas no nome do "+
								nome+", o presidente da impresa aciona seu seguranças para que localize e capture o jovem programador,\nnesse mesmo exato momento aciona o sistema de segurança do predio para que "+
						"ele não fuja, esse sistema de segurança,\nbloqueia os elevadores que só podem descer de um em um andar, portas e janela são trancadas automaticamente,\n"+
								"para o "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os seguranças da empresa,\nque se localizam em pontos estrategios para que "+nome+" não sai sem ser visto.");
			}else if(sexo.equalsIgnoreCase("F")) {
				System.out.println("\nA historia\n");
				System.out.println("Uma jovem programadora, chamado "+nome+" trabalha a pouca tempo na empresa chamada TI Universal,"
						+ " empresa que estava sofrendo um grande roubo de informações sigilosas \npor hackers,\n"+nome+" por ser novata foi utilizada como laranja pelos hackers"
								+ " que também trabalhavam na mesma empresa, foram implatadas muitas provas em seu sistema no qual trabalhava, \nsem que a mesma soubesse.\n"+
						"A empresa contratou uma equipe de hackers para descobrir quem estava roubando essas informações da empresa e divulgando-as,\nao descobrir as provas implantadas no nome da "+
								nome+", o presidente da impresa aciona seu seguranças para que localize e capture a jovem programadora,\nnesse mesmo exato momento aciona o sistema de segurança do predio para que "+
						"ela não fuja, esse sistema de segurança,\nbloqueia os elevadores que só podem descer de um em um andar, portas e janela são trancadas automaticamente,\n"+
								"para a "+nome+" fugir, terá que hackear o sistema de segurança e fugir de todos os seguranças da empresa,\nque se localizam em pontos estrategios para que "+nome+" não sai sem ser visto.");
			}
			break;
			
		case 2:
			System.out.println(" CREDITOS ");
			System.out.println("Desenvolvedor: VALTER DE MOURA PEREIRA");
			System.out.println("Desenvolvedor: DAIMON DA SILVA");
			System.out.println("Desenvolvedor: KÁTIA SCHVABE");
			System.out.println("Desenvolvedor: RENATO BERTONI LARDOSA SANTOS");
			System.out.println("Desenvolvedor: VICTOR RODRIGUES ROCHA");
			System.out.println("\n Opção");
			System.out.print("2 - Voltar ");
			opcao = entrada.nextInt();			
			break;
		case 3:
			System.out.println("\nVocê saiu do jogo");
			break;
		}
        }while(opcao == 2);

	}

}
