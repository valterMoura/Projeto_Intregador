package Projeto_Intregador;

public class teste4andar {
	public static void main(String[] args) {

	for(int quarto = 0; quarto <=6; quarto++) {
		System.out.println(" Com a op��o: " + quarto);
	do {
		System.out.println(
				"Agora, para você chegar ao 3º andar precisará descobrir em qual das salas está a passagem dos dutos de ar. Existe em somente uma das 4 salas do andar. \n"
						+ "Após escolher a sala correta, você precisará completar o algoritmo escrito na entrada. Somente a resposta correta te permitirá acesso a passagem!! \n"
						+ "E ai, qual das salas você escolhe? \n" + "1 - SALA A;\n" + "2 - SALA B;\n"
						+ "3 - SALA C;\n" + "4 - SALA D;");
		

		if (quarto == 1 || quarto == 2 || quarto == 4) {
			System.out.println(
					"Sala errada, tente outra.. Lembre que você está perdendo tempo. A qualquer momento um segurança pode te encontrar!\n");
			break;
		}else if (quarto == 3) {
			System.out.println("Muito bom!\n");
			break;
		}else {
			System.out.println("Op��o inv�lida!!\n");
			break;
		}
	} while (quarto != 3);
	
}
}}