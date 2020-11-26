package PI.Projeto_Intregador;

public class Teste3andar {
	static int numero=9;
	static void TesteDecisao3andar() {
		System.out.println(
				"Parab�ns, voc� chegou ao 3� andar, Voc� est� quase saindo, falta pouco! Agora voc� ter� que tomar mais uma importante decis�o.\n");
		System.out.println("Para acessar o 2� andar precisar� escolher por onde vai continuar sua fuga."
				+ " Apenas uma das op��es abaixo � a correta. \nAp�s escolher a op��o correta voc� ter� um desafio "
				+ "a cumprir para garantir sua passagem para o 2� andar. \n");
		
		for (int decisao=0; decisao<=numero; decisao++) {
			System.out.println("Teste decis�o com a op��o: " + decisao);
			do {
				// Decis�o
				System.out.println("Escolha sua op��o: \n" + "1 - Refeit�rio\n" + "2 - Banheiro\n"
						+ "3 - Sala de comunica��o\n" + "4 - Sala de seguran�a");

				if (decisao == 1) {

					System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 2� andar.\n");
					break;

				} else if (decisao == 2) {

					System.out.println(
							"O banheiro est� interditado! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando!\n");
					break;

				} else if (decisao == 3) {

					System.out.println(
							"A sala de comunica��o foi fechada pelos seguran�as! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando! \n");
					break;

				} else if ( decisao==4){
					System.out.println(
							"A sala de seguran�a est� trancada! tente outra rota de fuga, se apresse porque os seguran�as est�o chegando! \n");
					break;

				}else {
					System.out.println("Op��o inv�lida! Tente outra\n");
					break;
				}

			} while (decisao != 1);
		}
			
	}
	static void TesteDesafio3andar() { //teste possibilidades repostas ao desafio
		int caract=1;
		int tentativa=1;
		System.out.println(
				"Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n"
				+ "Voc� ter� APENAS 2 TENTATIVAS, por isso preste muita aten��o! \\n\n");
		for (int resposta=0; resposta<=numero; resposta++) {
			System.out.println("Teste desafio com a op��o: " + resposta);
			
			if (caract == 1) {
			
			do {
				System.out.println("ALGORITMO: \n" + "int N=10 \n" + "for(int i=1; i<=N; i++){\n"
						+ "      if (N%i==0 && i%2==0){\n" + "          System.out.println(i)\n " + "  } \n" + "}\n");
				System.out.println("1) Dever� ser impresso os divisores pares de N.\n"
						+ "2) Dever� ser impresso os m�ltiplos pares de N.\n"
						+ "3) Dever� ser impresso os m�ltiplos �mpares de N.\n");

				System.out.println("Qual a op��o correta?");
				tentativa++;
				
				
				switch (resposta) {
				case 2:
				case 3:
					System.out.println("Resposta errada!\n");
					break;				
				case 1:
					System.out.println("Parab�ns! Voc� acertou o desafio, entre que voc� ir� para o 2� andar!\n");
					break;
				default:
					System.out.println("Resposta inv�lida!\n");
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
