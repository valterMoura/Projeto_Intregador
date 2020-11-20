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
		
	System.out.println("Muito bem! Agora você ja está no TERREO!\n"
			+ "Mas o jogo ainda não acabou! Esse é o andar mais protegido pelos seguranças, e sair daqui não será tão fácil!!\n"
			+ "Em todas as saídas há dois seguranças que não deixam ninguém sair até você ser capturado, e todas as pessoas estão sendo vistoriadas.\n"
			+ "Para conseguir sair do prédio, você precisará despistar os seguranças e abrir as portas que estão travadas! E aí? Já sabe como fazer isso?\n");
	System.out.println("Primeiro passo será destravar as portas, para depois pensar em despistar os seguranças. Mas para isso você precisará hackear o sistema de iluminação \n"
			+ "É nessa hora que você testará suas habilidades com a lógica. E a partir desse momentos suas forças e características, escolhidas no início do jogo, não terão \n"
			+ "mais validade. Você está sozinho(a) nessa " + nome + "!! Vamos ao desafio? 1 - SIM; ");
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
	
	System.out.println("O sistema de iluminação é protegido por um código, e para ter acesso ao código você precisará decifrar a questão abaixo: ");
	System.out.println("Considerando a lógica de programação e seus operadores lógicos utilizados nas linguagens de programação, atente-se para a expressão abaixo.\n" + 
			"C * (B - A) <= D - B / C \n" + 
			"Qual seria o resultado da execução dessa expressão, caso o valor das variáveis fossem: A=3; B=6; C=2 e D=9 ?");
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
				System.out.println("Resposta inválida!");
	}
	
	}while(!acertou);
	
	int[] vetor = new int[5];
	int[] vetorCorreto = {2, 6, 11, 16, 18};
	
	System.out.println("Muito bem, o sistema de iluminação foi desativado e as portas estão destravadas! Agora só falta despistar os seguranças..\n"
			+ "Para isso você precisará ativar o alarme de incêndio. Dessa maneira haverá tumulto, e será sua oportunidade de escapar sem sem visto!\n"
			+ "O sistema de incêndio será ativado assim que você completar o código abaixo conforme as instruções. \n\n");
	System.out.println("Considere os seguintes valores para as variáveis. A = 10; B = 12; C = -2; D = 6; Agora responda as questões a seguir. Todas as \n"
			+ "respostas corretas formarão um vetor que ativará o sistema de incêndio. Mas preste muita atenção, se errar uma questão o sistema de incêncio \n"
			+ "não ativa e os seguranças receberão uma mensagem alertando da tentativa. É a questão que te libertará ou prenderá. Depende apenas de você! \n"
			+ "Questão 1: \n"
			+ "Considerando os valores já informados, qual seria o retorno da operação a seguir: A * C - B / D \n"
			+ "1 - 10 positivo; \n"
			+ "2 - 22 negativo; \n" // RESPOSTA CORRETA
			+ "3 - 22 positivo; \n"
			+ "4 - 18 positivo; \n");
        vetor[0]= entrada.nextInt();
        System.out.println("Questão 2: \n"
    			+ "Usando o laço WHILE, qual opção abaixo corresponde ao enunciado: Faça um programa que mostre todos os números inteiros de 1 a 50.\n"
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
    			+ "Qual a opção correta? \n");
            vetor[1]= entrada.nextInt();
            System.out.println("Questão 3: \n"
        			+ "Considerando os valores já informados, qual seria o retorno da operação a seguir: A + C - B / D \n"
        			+ "9 - 6 negativo; \n"
        			+ "10 - 0 zero; \n"
        			+ "11 - 6 positivo; \n" // RESPOSTA CORRETA
        			+ "12 - 1 positivo; \n");
                vetor[2]= entrada.nextInt();
                System.out.println("Questão 4: \n"
            			+ "Qual dos programas abaixo gera a seguinte série: 10, 20, 30, 40, ..., até 1000 utilizando o laço FOR."
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
                    System.out.println("Questão 5: \n"
                			+ "desenvolver questão"
                			+ "17 - int i = 7;\n" + 
                			"        while(i<200){\n" + 
                			"            System.out.println(i + \" é múltiplo de 7\");\n" + 
                			"            i = i * 7;\n" + 
                			"        }; \n\n"
                			+ "18 - int i = 7;\n" + //RESPOSTA CORRETA
                			"        while(i<200){\n" + 
                			"            System.out.println(i + \" é múltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n"
                			+ "19 - int i = 0;\n" + 
                			"        while(i<=200){\n" + 
                			"            System.out.println(i + \" é múltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n"
                			+ "20 - int i = 7;\n" + 
                			"        while(i<=200){\n" + 
                			"            System.out.println(i + \" é múltiplo de 7\");\n" + 
                			"            i = i + 7;\n" + 
                			"        }; \n\n");
                        vetor[4]= entrada.nextInt();
        
                        System.out.println("Suas respostas criaram o vetor: vetor[" + vetor[0] + ", " + vetor[1] + ", " + vetor[2] + ", " + vetor[3] + ", " + vetor[4] + "]." );
                        
                        if(Arrays.equals(vetor, vetorCorreto)) {
                        	System.out.println("Sistema de incêndio ativado. Seguranças foram distraídos e você escapou!!!\n"
                        			+ "Parabéns! Você conseguiu provar suas habilidades!!! Agora é só comemorar!! \n\n"
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
                        	System.out.println("SENHA ERRADA! Seguranças foram alarmados e você está preso(a)!!!\n\n"
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
