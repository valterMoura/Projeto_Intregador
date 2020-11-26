package PI.Projeto_Intregador;

public class Teste8andar {
	static int numero=9; // Vari�vel global n�mero de testes
	static void TesteDecisao8andar() {	//Teste de possibilidades de decis�o do jogador			
		System.out.println(
				"Parab�ns, voc� chegou ao 8� andar, agora se prepare porque ainda tem muito caminho pela frente!\n");
		System.out.println(
				"Agora voc� ter� que tomar uma importante decis�o, para acessar o 7� andar precisar� escolher por \nonde vai continuar sua fuga."
						+ " Apenas uma das op��es abaixo � a correta. Ap�s escolher a op��o \ncorreta voc� ter� um desafio "
						+ "a cumprir para garantir sua passagem para o 7� andar. \n");
		
		for (int decisao=0; decisao<=numero; decisao++) {
			System.out.println("Teste decis�o com a op��o: " + decisao);
			
				do {
					// Decis�o do jogador
					System.out.println(
							"Escolha sua op��o: \n" + "1 - Elevador\n" + "2 - Escada\n" + "3 - Duto de ar\n" + "4 - Janela");
					

					if (decisao == 1) {

						System.out.println(
								"Os elevadores foram desativados nesse andar! tente outra rota de fuga, se apresse porque os seguran�as est�o chegando! \n");
						break;

					} else if (decisao == 2) {

						System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 7� andar.\n");
						break;

					} else if (decisao == 3) {

						System.out.println(
								"Os dutos de ar est�o bloqueados nesse andar! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando! \n");
						break;

					} else if (decisao==4){

						System.out.println(
								"A janela deste andar est� emperrada! tente outra rota de fuga, mas se apresse porque os seguran�as est�o chegando! \n");
						break;
					}else {
						System.out.println("Op��o inv�lida! Tente outra\n");
						break;
					}
			
				}while (decisao != 2);				
			
       }
	}
	
	
	static void TesteDesafio8andar() { //teste possibilidades repostas ao desafio
		int caract=1;
		int tentativa=1;
		System.out.println("Observe o algoritmo escrito em java e escolha a op��o correta do que dever� ser impresso na tela do programador.\n"
				+"Voc� ter� APENAS 2 TENTATIVAS, por isso preste muita aten��o! \n");
		for (int resposta=0; resposta<=numero; resposta++) {
			System.out.println("Teste desafio com a op��o: " + resposta);	
			
			
			if (caract == 1) {			
				// Desafio caso o jogador escolha a op��o de habilidade 1	
								
				do {
				System.out.println("ALGORITMO: \n" + "int N=14; \n" + "if (N%2==0){\n" + "   System.out.println('X') \n"
						+ "}else{ \n" + "   System.out.println('Y')\n" + "}\n");
				
				System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
				System.out.println("Qual � a op��o correta?");
				tentativa++;
				
				switch (resposta) {
				case 2:
				case 3:
					System.out.println("Resposta errada!\n");												
					break;				
				case 1:		
					System.out.println("Parab�ns, voc� acertou o desafio!\n");	
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
	public static void main(String args[]) {		
		TesteDecisao8andar();
		TesteDesafio8andar();
		
	}
}
	

	


