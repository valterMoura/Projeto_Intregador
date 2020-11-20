package Projeto_Intregador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class terreo {
static public void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int terreo;
		String nome = "Joao";
		
	System.out.println("Muito bem! Agora voc� ja est� no TERREO!\n"
			+ "Mas o jogo ainda n�o acabou! Esse � o andar mais protegido pelos seguran�as, e sair daqui n�o ser� t�o f�cil!!\n"
			+ "Em todas as sa�das h� dois seguran�as que n�o deixam ningu�m sair at� voc� ser capturado, e todas as pessoas est�o sendo vistoriadas.\n"
			+ "Para conseguir sair do pr�dio, voc� precisar� despistar os seguran�as e abrir as portas que est�o travadas! E a�? J� sabe como fazer isso?\n");
	System.out.println("Primeiro passo ser� destravar as portas, para depois pensar em despistar os seguran�as. Mas para isso voc� precisar� hackear o sistema de ilumina��o \n"
			+ "� nessa hora que voc� testar� suas habilidades com a l�gica. E a partir desse momentos suas for�as e caracter�sticas, escolhidas no in�cio do jogo, n�o ter�o \n"
			+ "mais validade. Voc� est� sozinho(a) nessa " + nome + "!! Vamos ao desafio? 1 - SIM; ");
	terreo = entrada.nextInt();
	
	if(terreo == 1) {
		System.out.println("Muito bem, deixa eu te explicar! ");
	}
	
	ArrayList<String> alternativas = new ArrayList<String>();
	alternativas.add("Verdadeiro (true);"); // alternativa correta
	alternativas.add("Falso (false);");
	alternativas.add("6;");
	alternativas.add("9;");
	
	boolean acertou = false;
	
	do {
		
		Collections.shuffle(alternativas);
	
	System.out.println("O sistema de ilumina��o � protegido por um c�digo, e para ter acesso ao c�digo voc� precisar� decifrar a quest�o abaixo: ");
	System.out.println("Considerando a l�gica de programa��o e seus operadores l�gicos utilizados nas linguagens de programa��o, atente-se para a express�o abaixo.\n" + 
			"C * (B - A) <= D - B / C \n" + 
			"Qual seria o resultado da execu��o dessa express�o, caso o valor das vari�veis fossem: A=3; B=6; C=2 e D=9 ?");
	System.out.println("a) " + alternativas.get(0));
	System.out.println("b) " + alternativas.get(1));
	System.out.println("c) " + alternativas.get(2));
	System.out.println("d) " + alternativas.get(3));
	System.out.println("Escolha uma alternativa: ");
	String resposta = entrada.next();
	
	switch(resposta) {
	case "a":
	case "A":
		if (alternativas.get(0).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
	case "b":
	case "B":
		if (alternativas.get(1).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
	case "c":
	case "C":
		if (alternativas.get(2).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
	case "d":
	case "D":
		if (alternativas.get(3).equals("Verdadeiro (true);")) {
			System.out.println("Resposta correta!");
			acertou = true;
			} else {
			System.out.println("Resposta incorreta!");
			}
			break;
			default:
				System.out.println("Resposta inv�lida!");
	}
	
	}while(!acertou);
	
	int[] vetor = new int[5];
	int[] vetorCorreto = {2, 6, 11, 16, 18};
	
	System.out.println("Muito bem, o sistema de ilumina��o foi desativado e as portas est�o destravadas! Agora s� falta despistar os seguran�as..\n"
			+ "Para isso voc� precisar� ativar o alarme de inc�ndio. Dessa maneira haver� tumulto, e ser� sua oportunidade de escapar sem sem visto!\n"
			+ "O sistema de inc�ndio ser� ativado assim que voc� completar o c�digo abaixo conforme as instru��es. \n\n");
	System.out.println("Considere os seguintes valores para as vari�veis. A = 10; B = 12; C = -2; D = 6; Agora responda as quest�es a seguir. Todas as \n"
			+ "respostas corretas formar�o um vetor que ativar� o sistema de inc�ndio. Mas preste muita aten��o, se errar uma quest�o o sistema de inc�ncio \n"
			+ "n�o ativa e os seguran�as receber�o uma mensagem alertando da tentativa. � a quest�o que te libertar� ou prender�. Depende apenas de voc�! \n"
			+ "Quest�o 1: \n"
			+ "Considerando os valores j� informados, qual seria o retorno da opera��o a seguir: A * C - B / D \n"
			+ "1 - 10 positivo; \n"
			+ "2 - 22 negativo; \n" // RESPOSTA CORRETA
			+ "3 - 22 positivo; \n"
			+ "4 - 18 positivo; \n");
        vetor[0]= entrada.nextInt();
        System.out.println("Quest�o 2: \n"
    			+ "Usando o la�o WHILE, qual op��o abaixo corresponde ao enunciado: Fa�a um programa que mostre todos os n�meros inteiros de 1 a 50.\n"
    			+ "5 - int i = 1;\n" + 
    			"    	while( i = 50) {\n" + 
    			"    	System.out.println(\"Inteiro \" + i );\n" + 
    			"    	i = i + 1;\n" + 
    			"    	}; \n\n"
    			+ "6 - int i = 1;\n" + //RESPOSTA CORRETA
    			"		while( i <= 50) {\n" + 
    			"		System.out.println(\"Inteiro \" + i );\n" + 
    			"		i = i + 1;\n" + 
    			"	    }; \n\n"
    			+ "7 - int i = 1;\n" + 
    			"    	while( i >= 50) {\n" + 
    			"    	System.out.println(\"Inteiro \" + i );\n" + 
    			"    	i = i + 1;\n" + 
    			"    	}; \n\n"
    			+ "8 - int i = 1;\n" + 
    			"    	while( i <= 50) {\n" + 
    			"    	System.out.println(\"Inteiro \" + i );\n" + 
    			"    	i = i - 1;\n" + 
    			"    	}; \n\n"
    			+ "Qual a op��o correta? \n");
            vetor[1]= entrada.nextInt();
            System.out.println("Quest�o 3: \n"
        			+ "Considerando os valores j� informados, qual seria o retorno da opera��o a seguir: A + C - B / D \n"
        			+ "9 - 6 negativo; \n"
        			+ "10 - 0 zero; \n"
        			+ "11 - 6 positivo; \n" // RESPOSTA CORRETA
        			+ "12 - 1 positivo; \n");
                vetor[2]= entrada.nextInt();
                System.out.println("Quest�o 4: \n"
            			+ "Qual dos programas abaixo gera a seguinte s�rie: 10, 20, 30, 40, ..., at� 1000 utilizando o la�o FOR."
            			+ "13 - int i;\n" + 
            			"        for(i = 10; i = 1000; i = i + 10){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n"
            			+ "14 - int i;\n" + 
            			"        for(i = 10; i >= 1000; i = i++){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n"
            			+ "15 - int i;\n" + 
            			"        for(i = 10; i <= 1000; i = i++){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n"
            			+ "16 - int i;\n" + // RESPOSTA CORRETA
            			"        for(i = 10; i <= 1000; i = i + 10){\n" + 
            			"            System.out.println(\"Sequencia\" + i);\n" + 
            			"            }; \n\n");
                    vetor[3]= entrada.nextInt();
                    System.out.println("Quest�o 5: \n"
                			+ "desenvolver quest�o"
                			+ "17 - int i = 7;\n" + 
                			"        while(i<200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i * 7;\n" + 
                			"        }; \n\n"
                			+ "18 - int i = 7;\n" + //RESPOSTA CORRETA
                			"        while(i<200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n"
                			+ "19 - int i = 0;\n" + 
                			"        while(i<=200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n"
                			+ "20 - int i = 7;\n" + 
                			"        while(i<=200){\n" + 
                			"            System.out.println(i + \" � m�ltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n");
                        vetor[4]= entrada.nextInt();
        
                        System.out.println("Suas respostas criaram o vetor: vetor[" + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4] + "]." );
                        
                        if(Arrays.equals(vetor, vetorCorreto)) {
                        	System.out.println("Sistema de inc�ndio ativado. Seguran�as foram distra�dos e voc� escapou!!!\n"
                        			+ "Parab�ns! Voc� conseguiu provar suas habilidades!!! Agora � s� comemorar!! \n\n"
                        			+ "   .* *.               `o`o`\r\n" + 
                        			"         *. .*              o`o`o`o      ^,^,^\r\n" + 
                        			"           * \\               `o`o`     ^,^,^,^,^\r\n" + 
                        			"              \\     ***        |       ^,^,^,^,^\r\n" + 
                        			"               \\   *****       |        /^,^,^\r\n" + 
                        			"                \\   ***        |       /\r\n" + 
                        			"    ~@~*~@~      \\   \\         |      /\r\n" + 
                        			"  ~*~@~*~@~*~     \\   \\        |     /\r\n" + 
                        			"  ~*~@smd@~*~      \\   \\       |    /     #$#$#        .`'.;.\r\n" + 
                        			"  ~*~@~*~@~*~       \\   \\      |   /     #$#$#$#   00  .`,.',\r\n" + 
                        			"    ~@~*~@~ \\        \\   \\     |  /      /#$#$#   /|||  `.,'\r\n" + 
                        			"_____________\\________\\___\\____|_/______/_________|\\/\\___||______");
                        	
                        }else {
                        	System.out.println("SENHA ERRADA! Seguran�as foram alarmados e voc� est� preso(a)!!!\n\n"
                        			+ "MM'\"\"\"\"\"`MM                              \r\n" + 
                        			"M' .mmm. `M                              \r\n" + 
                        			"M  MMMMMMMM .d8888b. 88d8b.d8b. .d8888b. \r\n" + 
                        			"M  MMM   `M 88'  `88 88'`88'`88 88ooood8 \r\n" + 
                        			"M. `MMM' .M 88.  .88 88  88  88 88.  ... \r\n" + 
                        			"MM.     .MM `88888P8 dP  dP  dP `88888P' \r\n" + 
                        			"MMMMMMMMMMM                              \r\n" + 
                        			"                                         \r\n" + 
                        			"MMP\"\"\"\"\"YMM                            dP \r\n" + 
                        			"M' .mmm. `M                            88 \r\n" + 
                        			"M  MMMMM  M dP   .dP .d8888b. 88d888b. 88 \r\n" + 
                        			"M  MMMMM  M 88   d8' 88ooood8 88'  `88 dP \r\n" + 
                        			"M. `MMM' .M 88 .88'  88.  ... 88          \r\n" + 
                        			"MMb     dMM 8888P'   `88888P' dP       oo \r\n" + 
                        			"MMMMMMMMMMM                               \r\n" + 
                        			"                                          ");
                        	
                        }
}


}
