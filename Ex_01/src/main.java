import java.util.Locale;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
/*
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma mensagem explicativa, conforme exemplos.
	
	int valor_1, valor_2, resultado;
	
	System.out.println("Numeros para ser somado: ");
	valor_1 = sc.nextInt();
	valor_2 = sc.nextInt();
	resultado = valor_1 + valor_2;
	
	System.out.println("Soma: "+ resultado);
	sc.close();
*/
	
/*
 * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro casas decimais conforme exemplos.	

		double area, pi = 3.14159, raio;
		
		System.out.println("Informe o valor do raio: ");
		raio = sc.nextDouble();
		
		area = pi * Math.pow(raio, 2);
		System.out.printf("Valor da area: %.4f%n", area);
		sc.close();
*/

/*
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)

		int A, B, C, D, diferenca;
		System.out.println("Digite os numeros: ");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		diferenca = A * B - C * D;
		
		System.out.printf("Todos os dados: %d, %d, %d, %d%n", A, B, C, D);
		System.out.println("Diferença: "+ diferenca);
		sc.close();
*/
		
/*
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
	decimais.

		
		int numero, horas_trabalhadas;
		float valor_hora, salario;
		
		System.out.println("Digite em sequencia seu numero de funcionario, numero de horas trabalhadas e o valor por hora trabalhada");
		numero = sc.nextInt();
		horas_trabalhadas = sc.nextInt();
		valor_hora = sc.nextFloat();
		
		salario = valor_hora * horas_trabalhadas;
		
		System.out.printf("NUMBER: %d%nSALARY: %.2f%n",numero, salario);
		sc.close();
*/
		
/*
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
 
		
	int cod_peca1, cod_peca2, num_peca1, num_peca2;
	double preco_peca1, preco_peca2, total;
	
	cod_peca1 = sc.nextInt();
	num_peca1 = sc.nextInt();
	preco_peca1 = sc.nextFloat();

	cod_peca2 = sc.nextInt();
	num_peca2 = sc.nextInt();
	preco_peca2 = sc.nextFloat();
	
	total = num_peca1 * preco_peca1 + num_peca2 * preco_peca2;
	
    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
	
	sc.close();
*/		
		
	}
}
