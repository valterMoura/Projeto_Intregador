package code;
import java.util.Scanner;
public class Teste_Renato {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		testeNormal();
		testeGameOverAndar2();
		testeGameOverAndar7();
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Todos os testes foram concluídos sem erros.");
	}
	
	static void testeNormal() {
		int escolhas2[] = {2,1,1,1};
		int escolhas7[] = {3,3,2};
		
		System.out.println("Início do teste da função andar2");
		System.out.println("============================================");
		andar2(escolhas2);
		System.out.println("============================================");
		System.out.println("Término do teste da função andar2. Sem erros");
		
		System.out.print("\n\n");
		
		System.out.println("Início do teste da função andar7");
		System.out.println("============================================");
		andar7(escolhas7);
		System.out.println("============================================");
		System.out.println("Término do teste da função andar7. Sem erros");
		System.out.println("--------------------------------------------");
		System.out.println("Testes com respostar certas foram concluídos sem erros.");
	}
	
	static void testeGameOverAndar2() {
		
		int escolhas2[] = {2,2,1,1};
		
		System.out.println("Início do teste da função andar2");
		System.out.println("============================================");
		andar2(escolhas2);
		System.out.println("============================================");
		System.out.println("Término do teste da função andar2 com Game Over. Sem erros");
		
	}
	
	static void testeGameOverAndar7() {
		
		int escolhas2[] = {3,3,1};
		
		System.out.println("Início do teste da função andar7");
		System.out.println("============================================");
		andar7(escolhas2);
		System.out.println("============================================");
		System.out.println("Término do teste da função andar7 com Game Over. Sem erros");
		
	}
	
	static void andar2(int[] escolhas) {
		// gabarito: 2, 1, 1 e Todas
		//int escolhas[] = {2,1,1,1};
		
		// Possibilidade de Game Over no desafio 2
		int tentativas = 5;

		// Chegada
		System.out.println("Muito bem! Você chegou ao 2º andar!");
		System.out.println("Você chega no refeitório do segundo andar. Ao passar pela porta de saída, você observa um ");
		System.out.println("amplo salão de cubículos. Você está em um dos extremos, e no outro você o acesso: ao elevador, ");
		System.out.println("às escadas normais, e às escadas de incêndio. Porém, para chegar a qualquer uma dessas opções, ");
		System.out.println("você deve passar pelos cubículos.");
		System.out.println("Em um dos corredores laterais, do lado no qual você está, há uma mesa do setor de segurança, ");
		System.out.println("onde há um guarda de costas para você. Um dos cubículos à sua frente está desocupado, e você ");
		System.out.println("entra nele para acessar o computador, e tentar obter o diagrama de rede do salão.");
		
		// Desafio 1 (correta: 1)
		do {
			System.out.println("Ao tirar o computador de modo de espera, você vê na tela uma pergunta para liberar o acesso ao ");
			System.out.println("computador:");
			System.out.println("'Em uma linguagem estruturada, quais as três principais estruturas de instruções?'");
			
			System.out.println("1) Objetos, métodos e atributos");
			System.out.println("2) Sequencial, decisão e repetição");
			System.out.println("3) listas, pilhas e árvores  ");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[0] = entrada.nextInt();

			if (escolhas[0] == 1) {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println("cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}
			if (escolhas[0] == 2) {
				System.out.println("Esta é a resposta certa, e você consegue acesso ao computador.");
			}
			if (escolhas[0] == 3) {
				System.out.println(
						"A resposta é uma errada, e o computador produz um alerta na caixa de som que alerta o ocupante do ");
				System.out.println("cubículo em frente. Achando que é um colega, ele levanta para falar com você e percebe que ");
				System.out.println("se trata de um estranho, e alerta o guarda!");
			}

			if (escolhas[0] != 2)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 2);
		
		
		System.out.println("No computador você tenta acessar o servidor ou roteador que interliga esses computadores. ");
		
		System.out.println("Você abre o navegador e digita '192.168.0.1' e para a sua surpresa, uma página de administração ");
		System.out.println("se abre. Pelo jeito, nada de servidor, nem administrador profissional: sem senha.");
		System.out.println("Você abre uma aba chamada chamada 'Clientes', e vê uma lista de clientes atualmente conectados. ");
		System.out.println("A página exibe 26 clientes, 13 ativos. Após uma olhada, você observa que há 5 filas de 5 cubículos. ");
		System.out.println("O computador no qual você está é o ... .0.6. Com essas informações você monta duas matrizes.");
		System.out.println("Em uma, o computador  ... .0.2 está para a sua direita, e na outra, ele está para sua frente.");
		System.out.println("Na fila à sua frente, o caminho estaria livre. Na fila à sua direita não, além da mesa do segurança.");
		System.out.println("Ao olhar de novo, você que na mesa do segurança não é um segurança sentado, mas alguem mexendo no ");
		System.out.println("computador. Essa pessoa junta suas coisas, sai da mesa em diração à saída. Passa pelo seu cubículo ");
		System.out.println("sem lhe notar e entra no elevador.");
		
		
		
		// Desafio 2 (correta: 1)
		do {
			System.out.println("Imediatamente você se senta à mesa e tenta acessar o diagrama dos cubículos. Porém, percebe que o ");
			System.out.println("código do diagrama está incompleto! Falta terminar o laço que preenche a matriz com cubículos ");
			System.out.println("cheios ou vazios.");
			System.out.println("Que opção de estrutura de código concluiria esse serviço de modo simples?.");

			System.out.println("1) Dois laços for com if's para verificar a ocupação.");
			System.out.println("2) Dois do-while com a condição de número de cubículos.");
			System.out.println("3) Um grande switch verificando ocupações.");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[1] = entrada.nextInt();

			if (escolhas[1] == 1) {
				System.out.println(
						"O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a seguir ");
				System.out.println("é o entre os cubículos. Você segue por esse caminho.");
			}
			if (escolhas[1] == 2) {
				System.out.println("O computador roda o código e o diagrama é desenhado na tela e você vê que o caminho a frente ");
				System.out.println("do seu cubículo está livre. Ao segui por esse caminho, você é surpreendido por haver alguém ");
				System.out.println("em um dos cubículos! Seu código produziu um resultado errado. A pessoa grita, o segurança ");
				System.out.println("vê e detém você.");
				System.out.println("Resposta errada.");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"O computador roda o código, mas mensagens de erro são exibidas. Você tenta corrir o código, mas nada ");
				System.out.println("funciona. Após algumas tentativas, você perde noção do tempo e o segurança aparece atrás de");
				System.out.println("você e detém você!");
				System.out.println("Resposta errada.");
			}

			if (escolhas[1] != 1) {
				tentativas--;
			}
			if (tentativas == 1) {
				System.out.println("GAME OVER\n");
				//menu();
				return;
			}
				
		} while (escolhas[1] != 1);
		
		
		System.out.println("Você segue entre os cubículos, mas alguém faz barulho como se fosse se levantar, e você entra em ");
		System.out.println("um dos cubículos. Enquanto isso, o técnico de TI volta e vê que alguém completou o código. ");
		System.out.println("Imediatamente, ele comunica o fato ao segurança, que pergunta quanto tempo faz que a alteração foi ");
		System.out.println("feita. O técnico procura a informação.");
		System.out.println("Nisso, a pessoa que saiu do cubículo passa pelo segurança, e quando perguntada, essa pessoa diz que ");
		System.out.println("não tinha visto ninguém estranho por alí.");
		System.out.println("Abaixado, você se desloca até a saída da área de cubículos. Porém, você é surpreendido, pois não há ");
		System.out.println("passagem entre os dois cubículos por onde você passaria; há pilhas de caixas que não era visível ");
		System.out.println("antes. E passar por cima seria algo notado.");
		System.out.println("Os dois cubículos perto de você estão vagos. Você em um de decide usar suas habilidades para derubar ");
		System.out.println("a rede e tentar fazer algumas pessoas fazerem uma pausa e iram ao refeitório para um café.");
		System.out.println("No computador você acessa o roteador novamente. Bloqueia todos e coloca uma senha.");
		System.out.println("Logo algumas pessoas reclamam com o técnico que estava alí, sem que ele conseguisse resolver, pois o ");
		System.out.println("roteador na verdade é um software no servido de segurança que fica em outro local, e mexer nele seria ");
		System.out.println("complicado.");
		System.out.println("Várias pessoas se frustram com a situação e seguem para o refeitório, resmungando impropérios ");
		System.out.println("relacionados ao técnico.");
		System.out.println("Com isso, há menos gente nos cubículos, mas não há como saber quais estão vazios.");
		
		
		// Desafio 3 (correta: 1)
		do {
			System.out.println("Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
			System.out.println("estão presas por uma trava eletrônica.");
			System.out.println("Um post-it no monitor faz referência a essa senha, seguido de: ");
			System.out.println("'Incremente antes de retornar o valor'");
			System.out.println("e 'três erros emite alarme sonoro'");
			
			System.out.println("Você pensa e considera três opções: ");
			System.out.println("1) ++i");
			System.out.println("2) i++");
			System.out.println("3) i+=1");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[2] = entrada.nextInt();

			if (escolhas[2] == 1) {
				System.out.println(
						"Senha correta! A trava libera as pilhas e você move lentamente uma delas até ter um espaço para passar. ");
			}
			if (escolhas[2] == 2) {
				System.out.println("Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
				
			}
			if (escolhas[2] == 3) {
				System.out.println("Você digita uma senha errada, e a trava parece se comportar estranhamente e emite o alarme ");
				System.out.println("alertando o segurança que vem até as caixas e encontra você.");
			}

			if (escolhas[2] != 1)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[2] != 1);
		
		
		System.out.println("Andando abaixado você chega até as saídas. À sua frente está o elevador, à sua esquerda o acesso às ");
		System.out.println("escadas normais, e à direita tem a janela que dá para a escada de incêndio.");
	
		// Saída (todas)
		
			System.out.println("Você observa que seria possível mover uma das pilhas de modo a permitir passagem, mas as caixas ");
				
			System.out.println("Qual dos três caminhos você escolhe: ");
			System.out.println("1) Escadas normais");
			System.out.println("2) Elevador");
			System.out.println("3) Escada de incêndio");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[3] = entrada.nextInt();

			if (escolhas[3] == 1) {
				System.out.println("Ao se aproximar das escadas, você ouve passos. Você se encosta na parede entre a porta e o ");
				System.out.println("elevador. Um funcionário da limpeza sai das escadas sem ver você. Rapidamente, você ");
				System.out.println("entra nas escadas e desce para o 1o andar.");
			}
			if (escolhas[3] == 2) {
				System.out.println("Ao se aproximas do elevador, você vê que ele já estava descendo, e pode ter pessoas dentro. ");
				System.out.println("Você fica entre o elevador e a janela, como se estivesse eperando e olhando o lado de fora. ");
				System.out.println("Duas pessoas saem do elevador conversando e não percebem você. Você entra no elevador vazio e ");
				System.out.println("desce para o 1o andar.");
				
			}
			if (escolhas[3] == 3) {
				System.out.println("Você olha para ver se tem alguém vendo. O guarda e o técnico estão distantes discutindo sobre ");
				System.out.println("os problemas no servidor. Você aproveita, abre a janela e desce pela escada até o 1o andar.");
			}

		
		
	}
	
	static void andar7(int[] escolhas) {
		//gabarito: 3, 3, e 2
		//int escolhas[] = {3,3,2};
		
		// Possibilidade de Game Over no desafio 3
		int tentativas = 5;
		
		// Chegada
		System.out.println("Muito bem! Você chegou ao 7º andar!");

		// Desafio 1 (correta: 3)
		do {
			System.out.println("Ao sair das escadas, você se depara com um corredor de portas, ");
			System.out.println("um bilhete no chão e uma câmera acima do acesso 'as escadas, que varre de lado a lado.");
			System.out.println("No bilhete lê-se:");
			System.out.println("'A porta que leva 'a saída é aquela em que o número da porta está ");
			System.out.println("associado ao resultado da seguinte pergunta:");
			System.out.println("Qual laço de repetição pode ser usado para situações nas quais se tem que ");
			System.out.println("verificar a condição após a execução do bloco de código?");
			System.out.println("1) Porta1 : while");
			System.out.println("2) Porta2 : for");
			System.out.println("3) Porta3 : do-while'");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[0] = entrada.nextInt();

			if (escolhas[0] != 3)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[0] != 3);

		// Desafio 2
		do {
			System.out.println("A porta que você escolheu dá na cozinha. Na pia você vê a cafeteira com café pronto.");
			System.out.println("Você coloca um pouco em uma caneca, mas ouve alguém se aproximando da cozinha.");
			System.out.println("Rapidamente, você procura para onde tentar ir. Você vê: ");
			System.out.println("1) compartimento abaixo da pia, com porta para fechar");
			System.out.println("2) Um armário ao lado da pia");
			System.out.println("3) Em baixo de uma mesa com quatro cadeiras próxima a um canto da cozinha");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[1] = entrada.nextInt();

			if (escolhas[1] == 1) {
				System.out.println(
						"Ao tentar entrar de baixo da pia você percebe que não cabe, e o guarda que entra na cozinha o vê!");
			}
			if (escolhas[1] == 2) {
				System.out.println("Você consegue entrar no armário, mas os produtos de limpeza lá dentro fazem que você espirre, ");
				System.out.println("e o guarda que entrou na cozinha é alertado da sua presença!");
			}
			if (escolhas[1] == 3) {
				System.out.println(
						"Apesar de a mesa não ser um local muito protegido, o guarda que entrou na cozinha, passa por ela ");
				System.out.println("sem perceber a sua presença.");
			}

			if (escolhas[1] != 3)
				System.out.println("Resposta errada, tente mais uma vez.");

		} while (escolhas[1] != 3);

		// Desafio 3 (correta : 3)
		do {
			System.out.println("Ao sair da cozinha, você vê um salão com vários cubículos. Em alguns arece haver gente trabalhando, ");
			System.out.println(" e bastante ocupados. Você deve manter-se depercebido.");
			System.out.println("Duas das laterais desse salão são janelas. Algumas, próximas a uma parede, há um acesso à ");
			System.out.println(" escada de emergência. Porém, para acessá-la, você teria que ser visto por alguns ocupantes ");
			System.out.println(" dos cubículos. Você procura opções para evitar isso. Uma mesa fora dos cubículos, parece ser ");
			System.out.println("do setor de segurança e está desocupada. Provavelmente é o posto do guarda que passou pela cozinha. ");
			System.out.println(" Ao se aproximar da mesa, no monitor você observa que aparece uma mensagem"); 
			System.out.println("'Para acessar o diagrama de utilização dos cubículos responda: ");
			System.out.println("Em uma estrutura switch, qual declaração, que quando presente, é executada quando "
					+ "nenhum dos casos ocorre?");
			System.out.println("1) Break");
			System.out.println("2) default");
			System.out.println("3) goto");
			System.out.println("Qual a sua escolha?(1, 2 ou 3): ");
			//escolhas[2] = entrada.nextInt();

			if (escolhas[2] == 1) {
				System.out.println(
						"Esta resposta é uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende você.");
			}
			if (escolhas[2] == 2) {
				System.out.println(
						"Resposta certa. O diagrama aparece e você vê que os dois cubículos voltados para a parede ");
				System.out.println("no caminho da janela estão desocupados, permitindo acesso. Você abre a janela e desce para ");
				System.out.println("o 6o andar.");
			}
			if (escolhas[2] == 3) {
				System.out.println(
						"Esta resposta é uma das erradas, e ao reiniciar a pergunta o guarda volta e surpreende você.");
			}
			if (escolhas[1] != 1) {
				tentativas--;
			}
			if (tentativas == 1) {
				System.out.println("GAME OVER\n");
				//menu();
				return;
			}

		} while (escolhas[2] != 2);

	}
	
}
