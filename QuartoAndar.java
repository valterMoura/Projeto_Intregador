import java.util.Scanner;

public class QuartoAndar {
static public void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quarto;
		double caract = Math.random()*3;
	System.out.println("Muito bem! Voc� chegou ao 4� andar!");
	
	do{
	System.out.println("Agora, para voc� chegar ao 3� andar precisar� descobrir em qual das salas est� a passagem dos dutos de ar. Existe em somente uma das 4 salas do andar. \n"
			+ "Ap�s escolher a sala correta, voc� precisar� completar o algoritmo escrito na entrada. Somente a resposta correta te permitir� acesso a passagem!! \n"
			+ "E ai, qual das salas voc� escolhe? \n"
			+ "1 - SALA A;\n"
			+ "2 - SALA B;\n"
			+ "3 - SALA C;\n"
			+ "4 - SALA D;");	   
	quarto = entrada.nextInt();
	
		if(quarto == 1 ||quarto == 2 ||quarto == 4) {
			System.out.println("Sala errada, tente outra.. Lembre que voc� est� perdendo tempo. A qualquer momento um seguran�a pode te encontrar!\n");
		}
	}while(quarto != 3);
		
	System.out.println("Ok, agora que voc� encontrou o duto, preencha o algoritmo para liberar sua entrada!!\n");
	
	if(Math.ceil(caract) == 1) {
		//desafio 1
		System.out.println("Observe o algoritmo escrito e preencha o espa�o com XXX com a op��o correta!\n"
				+ "Quest�o: O algoritmo deve ler dois n�meros e dizer qual deles � maior. \n");
		System.out.println(" ALGORITMO: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n1, n2; \n"
				+ "System.out.println(Digite o primeiro n�mero: ); \n"
				+ "n1 = entrada.nextInt(); \n"
				+ "System.out.println(Digite o segundo n�mero: ); \n"
				+ "n2 = entrada.nextInt(); \n"
				+ "XXX { \n "
				+ "O maior n�mero �: + n1 \n"
				+ "} else { \n"
				+ "O maior n�mero �: + n2 \n");
		System.out.println("Op��o 1 =  if(n1 > n2) ;\n"
				+ "Op��o 2 = if(n1 < n2) ;\n"
				+ "Op��o 3 = for(n1 > n2) ; \n");
		System.out.println("Qual a op��o correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.println("Muito bem! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else if (Math.ceil(caract) == 2) {
		//desafio 2
		System.out.println("Observe o algoritmo escrito e preencha o espa�o com XXX com a op��o correta!\n"
				+ "Quest�o: O algoritmo deve ler dois n�meros e dizer qual deles � a m�dia deles. \n");
		System.out.println(" ALGORITMO: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n1, n2, media; \n"
				+ "System.out.println(Digite o primeiro n�mero: ); \n"
				+ "n1 = entrada.nextInt(); \n"
				+ "System.out.println(Digite o segundo n�mero: ); \n"
				+ "n2 = entrada.nextInt(); \n"
				+ "XXX \n"
				+ "System.out.println(A m�dia dos n�meros apresentados �: + media");
		System.out.println("Op��o 1 =  media = (n1 + n2)/2 ;\n"
				+ "Op��o 2 = media = (n1 * n2)/2 ;\n"
				+ "Op��o 3 = int media = (n1 + n2)/2 ; \n");
		System.out.println("Qual a op��o correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.println("Muito bem! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else {
		//desafio 3
		System.out.println("Observe o algoritmo escrito e preencha o espa�o com XXX com a op��o correta!\n"
				+ "Quest�o: O algoritmo deve ler dois n�meros e dizer qual deles � menor. \n");
		System.out.println(" ALGORITMO: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n1, n2; \n"
				+ "System.out.println(Digite o primeiro n�mero: ); \n"
				+ "n1 = entrada.nextInt(); \n"
				+ "System.out.println(Digite o segundo n�mero: ); \n"
				+ "n2 = entrada.nextInt(); \n"
				+ "XXX { \n "
				+ "O menor n�mero �: + n1 \n"
				+ "} else { \n"
				+ "O menor n�mero �: + n2 \n");
		System.out.println("Op��o 1 =  if(n1 < n2) ;\n"
				+ "Op��o 2 = if(n1 >= n2) ;\n"
				+ "Op��o 3 = for(n1 > n2) ; \n");
		System.out.println("Qual a op��o correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.println("Muito bem! Voc� conseguiu acesso ao duto, entre que voc� ir� para o 3� andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}
	
}

}
