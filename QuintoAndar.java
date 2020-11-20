package Projeto_Intregador;

import java.util.Scanner;

public class QuintoAndar {
	
	static public void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quinto;
		int caract = 3;
	System.out.println("Muito bem! Voc� chegou ao 5� andar!");
	
	do{
	System.out.println("Para descer mais um andar voc� precisa decidir qual sentido pegar. Essa sala s� possui uma sa�da, ent�o � inevit�vel \n"
			+ "voc� passar pelo corredor. Por�m, se voc� sair da sala e ir para a direita voc� ter� a op��o da escada, e do elevador. E se voc� ir para a esquerda voc� \n"
			+ "ter� acesso a outras duas salas. A sala A te d� acesso ao duto de ar condicionado, que voc� n�o sabe com qual sala faz liga��o. E a sala B � integrada com o \n"
			+ "andar de baixo na sala de descanso dos seguran�as. S� um te permitir� avan�ar.. E ai, qual dessas op��es voc� escolhe? \n"
			+ "1 - Lado direito, escada;\n"
			+ "2 - Lado direito, elevador;\n"
			+ "3 - Lado esquerdo, Sala A;\n"
			+ "4 - Lado esquerdo, Sala B;");	   
	quinto = entrada.nextInt();
	
		if(quinto == 1 ||quinto == 3 ||quinto == 4) {
			System.out.println("Esse n�o � o melhor caminho, tente outra vez!\n");
		}
	}while(quinto != 2);
		
	System.out.println("Ok, agora que voc� sabe que s� conseguir� ter acesso ao pr�ximo andar pelo elevador, pode tentar acessar ao mesmo.Corre!!!\n");
	//incluir desenhos de caminhada
	System.out.println("Ok, voc� chegou ao elevador! Para abrir a porta, voc� precisa responder a quest�o abaixo:\n");
	
	if(caract == 1) {
		//desafio 1
		System.out.println("Observe o enunciado abaixo e escolha o c�digo que foi utilizado corretamente: \n"
				+ "Quest�o: Desenvolva um algoritmo em Java que leia um n�mero inteiro. Caso o n� seja par imprima o seu antecessor, \n" + 
				"e se ele for �mpar, imprima seu sucessor. \n");
		System.out.println(" Op��o 1: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 != 0){ \n "
				+ "int ant = n - 1;"
				+ "Seu antecessor �: + ant \n"
				+ "} else { \n"
				+ "int suc = n +1;"
				+ "Seu sucessor �: + suc }\n");
		System.out.println(" Op��o 2: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "int ant = n - 1;"
				+ "Seu antecessor �: + ant \n"
				+ "} else { \n"
				+ "int suc = n +1;"
				+ "Seu sucessor �: + suc }\n");
		System.out.println(" Op��o 3: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = input.next(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "int ant = n - 1;"
				+ "Seu sucessor �: + ant \n"
				+ "} else { \n"
				+ "int suc = n +1;"
				+ "Seu antecessor �: + suc}");
		System.out.println("Qual a op��o correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 2) {
			System.out.println("Muito bem! Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else if (caract == 2) {
		//desafio 2
		System.out.println("Observe o enunciado abaixo e escolha o c�digo que foi utilizado corretamente: \n"
				+ "Quest�o: Desenvolva um algoritmo em Java que leia um n�mero inteiro. Caso o n� seja par apresenta a mensagem PAR, \n" + 
				"e se ele for �mpar, apresente a mensagem IMPAR. \n");
		System.out.println(" Op��o 1: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 != 0){ \n "
				+ "PAR! \n"
				+ "} else { \n"
				+ "IMPAR! }\n");
		System.out.println(" Op��o 2: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "PAR! \n"
				+ "} else { \n"
				+ "IMPAR!} \n");
		System.out.println(" Op��o 3: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = input.next(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "IMPAR! \n"
				+ "} else { \n"
				+ "PAR!}");
		System.out.println("Qual a op��o correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 2) {
			System.out.println("Muito bem! Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else {
		//desafio 3
		System.out.println("Observe o enunciado abaixo e escolha o c�digo que foi utilizado corretamente: \n"
				+ "Quest�o: Desenvolva um algoritmo em Java que leia um n�mero inteiro. Caso o n� seja par imprima PAR, \n" + 
				"se ele for �mpar, imprima IMPAR, e se ele for 0, imprima ZERO!. \n");
		System.out.println(" Op��o 1: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 != 0){ \n "
				+ "PAR! \n"
				+ "} else if ( n % 3 != 0){ \n"
				+ "IMPAR!\n"
				+ "} else { "
				+ "ZERO!\n");
		System.out.println(" Op��o 2: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "PAR! \n"
				+ "} else if (n % 3 == 0){ \n"
				+ "IMPAR! \n"
				+ "} else{ "
				+ "ZERO!\n");
		System.out.println(" Op��o 3: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um n�mero: ); \n"
				+ "n = input.next(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "IMPAR! \n"
				+ "} else if ( n % 2 == 0) { \n"
				+ "PAR! \n"
				+ "} else {"
				+ "ZERO!\n");
		System.out.println("Qual a op��o correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 2) {
			System.out.println("Muito bem! Voc� abriu a porta do elevador, entre que voc� ir� para o 4� andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}
	
}
}