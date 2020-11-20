import java.util.Scanner;

public class QuartoAndar {
static public void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quarto;
		double caract = Math.random()*3;
	System.out.println("Muito bem! Você chegou ao 4º andar!");
	
	do{
	System.out.println("Agora, para você chegar ao 3º andar precisará descobrir em qual das salas está a passagem dos dutos de ar. Existe em somente uma das 4 salas do andar. \n"
			+ "Após escolher a sala correta, você precisará completar o algoritmo escrito na entrada. Somente a resposta correta te permitirá acesso a passagem!! \n"
			+ "E ai, qual das salas você escolhe? \n"
			+ "1 - SALA A;\n"
			+ "2 - SALA B;\n"
			+ "3 - SALA C;\n"
			+ "4 - SALA D;");	   
	quarto = entrada.nextInt();
	
		if(quarto == 1 ||quarto == 2 ||quarto == 4) {
			System.out.println("Sala errada, tente outra.. Lembre que você está perdendo tempo. A qualquer momento um segurança pode te encontrar!\n");
		}
	}while(quarto != 3);
		
	System.out.println("Ok, agora que você encontrou o duto, preencha o algoritmo para liberar sua entrada!!\n");
	
	if(Math.ceil(caract) == 1) {
		//desafio 1
		System.out.println("Observe o algoritmo escrito e preencha o espaço com XXX com a opção correta!\n"
				+ "Questão: O algoritmo deve ler dois números e dizer qual deles é maior. \n");
		System.out.println(" ALGORITMO: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n1, n2; \n"
				+ "System.out.println(Digite o primeiro número: ); \n"
				+ "n1 = entrada.nextInt(); \n"
				+ "System.out.println(Digite o segundo número: ); \n"
				+ "n2 = entrada.nextInt(); \n"
				+ "XXX { \n "
				+ "O maior número é: + n1 \n"
				+ "} else { \n"
				+ "O maior número é: + n2 \n");
		System.out.println("Opção 1 =  if(n1 > n2) ;\n"
				+ "Opção 2 = if(n1 < n2) ;\n"
				+ "Opção 3 = for(n1 > n2) ; \n");
		System.out.println("Qual a opção correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.println("Muito bem! Você conseguiu acesso ao duto, entre que você irá para o 3º andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else if (Math.ceil(caract) == 2) {
		//desafio 2
		System.out.println("Observe o algoritmo escrito e preencha o espaço com XXX com a opção correta!\n"
				+ "Questão: O algoritmo deve ler dois números e dizer qual deles é a média deles. \n");
		System.out.println(" ALGORITMO: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n1, n2, media; \n"
				+ "System.out.println(Digite o primeiro número: ); \n"
				+ "n1 = entrada.nextInt(); \n"
				+ "System.out.println(Digite o segundo número: ); \n"
				+ "n2 = entrada.nextInt(); \n"
				+ "XXX \n"
				+ "System.out.println(A média dos números apresentados é: + media");
		System.out.println("Opção 1 =  media = (n1 + n2)/2 ;\n"
				+ "Opção 2 = media = (n1 * n2)/2 ;\n"
				+ "Opção 3 = int media = (n1 + n2)/2 ; \n");
		System.out.println("Qual a opção correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.println("Muito bem! Você conseguiu acesso ao duto, entre que você irá para o 3º andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else {
		//desafio 3
		System.out.println("Observe o algoritmo escrito e preencha o espaço com XXX com a opção correta!\n"
				+ "Questão: O algoritmo deve ler dois números e dizer qual deles é menor. \n");
		System.out.println(" ALGORITMO: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n1, n2; \n"
				+ "System.out.println(Digite o primeiro número: ); \n"
				+ "n1 = entrada.nextInt(); \n"
				+ "System.out.println(Digite o segundo número: ); \n"
				+ "n2 = entrada.nextInt(); \n"
				+ "XXX { \n "
				+ "O menor número é: + n1 \n"
				+ "} else { \n"
				+ "O menor número é: + n2 \n");
		System.out.println("Opção 1 =  if(n1 < n2) ;\n"
				+ "Opção 2 = if(n1 >= n2) ;\n"
				+ "Opção 3 = for(n1 > n2) ; \n");
		System.out.println("Qual a opção correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 1) {
			System.out.println("Muito bem! Você conseguiu acesso ao duto, entre que você irá para o 3º andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}
	
}

}
