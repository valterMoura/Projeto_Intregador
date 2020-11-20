package Projeto_Intregador;

import java.util.Scanner;

public class QuintoAndar {
	
	static public void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int quinto;
		int caract = 3;
	System.out.println("Muito bem! Você chegou ao 5º andar!");
	
	do{
	System.out.println("Para descer mais um andar você precisa decidir qual sentido pegar. Essa sala só possui uma saída, então é inevitável \n"
			+ "você passar pelo corredor. Porém, se você sair da sala e ir para a direita você terá a opção da escada, e do elevador. E se você ir para a esquerda você \n"
			+ "terá acesso a outras duas salas. A sala A te dá acesso ao duto de ar condicionado, que você não sabe com qual sala faz ligação. E a sala B é integrada com o \n"
			+ "andar de baixo na sala de descanso dos seguranças. Só um te permitirá avançar.. E ai, qual dessas opções você escolhe? \n"
			+ "1 - Lado direito, escada;\n"
			+ "2 - Lado direito, elevador;\n"
			+ "3 - Lado esquerdo, Sala A;\n"
			+ "4 - Lado esquerdo, Sala B;");	   
	quinto = entrada.nextInt();
	
		if(quinto == 1 ||quinto == 3 ||quinto == 4) {
			System.out.println("Esse não é o melhor caminho, tente outra vez!\n");
		}
	}while(quinto != 2);
		
	System.out.println("Ok, agora que você sabe que só conseguirá ter acesso ao próximo andar pelo elevador, pode tentar acessar ao mesmo.Corre!!!\n");
	//incluir desenhos de caminhada
	System.out.println("Ok, você chegou ao elevador! Para abrir a porta, você precisa responder a questão abaixo:\n");
	
	if(caract == 1) {
		//desafio 1
		System.out.println("Observe o enunciado abaixo e escolha o código que foi utilizado corretamente: \n"
				+ "Questão: Desenvolva um algoritmo em Java que leia um número inteiro. Caso o nº seja par imprima o seu antecessor, \n" + 
				"e se ele for ímpar, imprima seu sucessor. \n");
		System.out.println(" Opção 1: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 != 0){ \n "
				+ "int ant = n - 1;"
				+ "Seu antecessor é: + ant \n"
				+ "} else { \n"
				+ "int suc = n +1;"
				+ "Seu sucessor é: + suc }\n");
		System.out.println(" Opção 2: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "int ant = n - 1;"
				+ "Seu antecessor é: + ant \n"
				+ "} else { \n"
				+ "int suc = n +1;"
				+ "Seu sucessor é: + suc }\n");
		System.out.println(" Opção 3: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = input.next(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "int ant = n - 1;"
				+ "Seu sucessor é: + ant \n"
				+ "} else { \n"
				+ "int suc = n +1;"
				+ "Seu antecessor é: + suc}");
		System.out.println("Qual a opção correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 2) {
			System.out.println("Muito bem! Você abriu a porta do elevador, entre que você irá para o 4º andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else if (caract == 2) {
		//desafio 2
		System.out.println("Observe o enunciado abaixo e escolha o código que foi utilizado corretamente: \n"
				+ "Questão: Desenvolva um algoritmo em Java que leia um número inteiro. Caso o nº seja par apresenta a mensagem PAR, \n" + 
				"e se ele for ímpar, apresente a mensagem IMPAR. \n");
		System.out.println(" Opção 1: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 != 0){ \n "
				+ "PAR! \n"
				+ "} else { \n"
				+ "IMPAR! }\n");
		System.out.println(" Opção 2: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "PAR! \n"
				+ "} else { \n"
				+ "IMPAR!} \n");
		System.out.println(" Opção 3: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = input.next(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "IMPAR! \n"
				+ "} else { \n"
				+ "PAR!}");
		System.out.println("Qual a opção correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 2) {
			System.out.println("Muito bem! Você abriu a porta do elevador, entre que você irá para o 4º andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}else {
		//desafio 3
		System.out.println("Observe o enunciado abaixo e escolha o código que foi utilizado corretamente: \n"
				+ "Questão: Desenvolva um algoritmo em Java que leia um número inteiro. Caso o nº seja par imprima PAR, \n" + 
				"se ele for ímpar, imprima IMPAR, e se ele for 0, imprima ZERO!. \n");
		System.out.println(" Opção 1: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 != 0){ \n "
				+ "PAR! \n"
				+ "} else if ( n % 3 != 0){ \n"
				+ "IMPAR!\n"
				+ "} else { "
				+ "ZERO!\n");
		System.out.println(" Opção 2: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = entrada.nextInt(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "PAR! \n"
				+ "} else if (n % 3 == 0){ \n"
				+ "IMPAR! \n"
				+ "} else{ "
				+ "ZERO!\n");
		System.out.println(" Opção 3: \n"
				+ "Scanner entrada = new Scanner(System.in); \n" + 
				"int n; \n"
				+ "System.out.println(Digite um número: ); \n"
				+ "n = input.next(); \n"
				+ "if(n % 2 == 0){ \n "
				+ "IMPAR! \n"
				+ "} else if ( n % 2 == 0) { \n"
				+ "PAR! \n"
				+ "} else {"
				+ "ZERO!\n");
		System.out.println("Qual a opção correta? ");
		int resposta = entrada.nextInt();
		if(resposta == 2) {
			System.out.println("Muito bem! Você abriu a porta do elevador, entre que você irá para o 4º andar!!");
		} else {
			System.out.println("Resposta errada! GAME OVER!");
		}
	}
	
}
}