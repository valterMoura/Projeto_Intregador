package PI.Projeto_Intregador;

public class Teste3andar {
	static int numero=9;
	static void TesteDecisao3andar() {
		System.out.println(
				"Parabéns, você chegou ao 3º andar, Você está quase saindo, falta pouco! Agora você terá que tomar mais uma importante decisão.\n");
		System.out.println("Para acessar o 2º andar precisará escolher por onde vai continuar sua fuga."
				+ " Apenas uma das opções abaixo é a correta. \nApós escolher a opção correta você terá um desafio "
				+ "a cumprir para garantir sua passagem para o 2º andar. \n");
		
		for (int decisao=0; decisao<=numero; decisao++) {
			System.out.println("Teste decisão com a opção: " + decisao);
			do {
				// Decisão
				System.out.println("Escolha sua opção: \n" + "1 - Refeitório\n" + "2 - Banheiro\n"
						+ "3 - Sala de comunicação\n" + "4 - Sala de segurança");

				if (decisao == 1) {

					System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 2º andar.\n");
					break;

				} else if (decisao == 2) {

					System.out.println(
							"O banheiro está interditado! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando!\n");
					break;

				} else if (decisao == 3) {

					System.out.println(
							"A sala de comunicação foi fechada pelos seguranças! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando! \n");
					break;

				} else if ( decisao==4){
					System.out.println(
							"A sala de segurança está trancada! tente outra rota de fuga, se apresse porque os seguranças estão chegando! \n");
					break;

				}else {
					System.out.println("Opção inválida! Tente outra\n");
					break;
				}

			} while (decisao != 1);
		}
			
	}
	static void TesteDesafio3andar() { //teste possibilidades repostas ao desafio
		int caract=1;
		int tentativa=1;
		System.out.println(
				"Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n"
				+ "Você terá APENAS 2 TENTATIVAS, por isso preste muita atenção! \\n\n");
		for (int resposta=0; resposta<=numero; resposta++) {
			System.out.println("Teste desafio com a opção: " + resposta);
			
			if (caract == 1) {
			
			do {
				System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n"
						+ "      if (N%i==0 && i%2==0){\n" + "          System.out.println(i)\n " + "  } \n" + "}\n");
				System.out.println("1) Deverá ser impresso os divisores pares de N.\n"
						+ "2) Deverá ser impresso os múltiplos pares de N.\n"
						+ "3) Deverá ser impresso os múltiplos ímpares de N.\n");

				System.out.println("Qual a opção correta?");
				tentativa++;
				
				
				switch (resposta) {
				case 2:
				case 3:
					System.out.println("Resposta errada!\n");
					break;				
				case 1:
					System.out.println("Parabéns! Você acertou o desafio, entre que você irá para o 2º andar!\n");
					break;
				default:
					System.out.println("Resposta inválida!\n");
					break;
				}
				
			 }while(tentativa<=1 && resposta!=1);	
				
				if(resposta!=1) {
					System.out.println("GAME OVER!!\n");
				}
		}
	 }
		
	}
	public static void main (String args[]) {
		TesteDecisao3andar();
		TesteDesafio3andar();
		
	}

}
