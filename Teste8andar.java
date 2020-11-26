package PI.Projeto_Intregador;

public class Teste8andar {
	static int numero=9; // Variável global número de testes
	static void TesteDecisao8andar() {	//Teste de possibilidades de decisão do jogador			
		System.out.println(
				"Parabéns, você chegou ao 8º andar, agora se prepare porque ainda tem muito caminho pela frente!\n");
		System.out.println(
				"Agora você terá que tomar uma importante decisão, para acessar o 7º andar precisará escolher por \nonde vai continuar sua fuga."
						+ " Apenas uma das opções abaixo é a correta. Após escolher a opção \ncorreta você terá um desafio "
						+ "a cumprir para garantir sua passagem para o 7º andar. \n");
		
		for (int decisao=0; decisao<=numero; decisao++) {
			System.out.println("Teste decisão com a opção: " + decisao);
			
				do {
					// Decisão do jogador
					System.out.println(
							"Escolha sua opção: \n" + "1 - Elevador\n" + "2 - Escada\n" + "3 - Duto de ar\n" + "4 - Janela");
					

					if (decisao == 1) {

						System.out.println(
								"Os elevadores foram desativados nesse andar! tente outra rota de fuga, se apresse porque os seguranças estão chegando! \n");
						break;

					} else if (decisao == 2) {

						System.out.println("Muito bem! Agora complete o desafio para liberar sua passagem para o 7º andar.\n");
						break;

					} else if (decisao == 3) {

						System.out.println(
								"Os dutos de ar estão bloqueados nesse andar! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando! \n");
						break;

					} else if (decisao==4){

						System.out.println(
								"A janela deste andar está emperrada! tente outra rota de fuga, mas se apresse porque os seguranças estão chegando! \n");
						break;
					}else {
						System.out.println("Opção inválida! Tente outra\n");
						break;
					}
			
				}while (decisao != 2);				
			
       }
	}
	
	
	static void TesteDesafio8andar() { //teste possibilidades repostas ao desafio
		int caract=1;
		int tentativa=1;
		System.out.println("Observe o algoritmo escrito em java e escolha a opção correta do que deverá ser impresso na tela do programador.\n"
				+"Você terá APENAS 2 TENTATIVAS, por isso preste muita atenção! \n");
		for (int resposta=0; resposta<=numero; resposta++) {
			System.out.println("Teste desafio com a opção: " + resposta);	
			
			
			if (caract == 1) {			
				// Desafio caso o jogador escolha a opção de habilidade 1	
								
				do {
				System.out.println("ALGORITMO: \n" + "int N=14; \n" + "if (N%2==0){\n" + "   System.out.println('X') \n"
						+ "}else{ \n" + "   System.out.println('Y')\n" + "}\n");
				
				System.out.println("1) X\n" + "2) Y\n" + "3) Z\n");
				System.out.println("Qual é a opção correta?");
				tentativa++;
				
				switch (resposta) {
				case 2:
				case 3:
					System.out.println("Resposta errada!\n");												
					break;				
				case 1:		
					System.out.println("Parabéns, você acertou o desafio!\n");	
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
	public static void main(String args[]) {		
		TesteDecisao8andar();
		TesteDesafio8andar();
		
	}
}
	

	


