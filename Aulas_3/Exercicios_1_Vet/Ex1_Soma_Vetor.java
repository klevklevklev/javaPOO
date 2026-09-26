import java.util.Locale;
import java.util.Scanner;

public class Ex1_Soma_Vetor {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos numeros voce vai digitar?");
		int numeros = sc.nextInt();
		double[] vect = new double[numeros];
		
		int i = 0;
		for (i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}		
	
		double soma = 0.0;
		double media = 0.0;
		
		for (int x = 0; x < vect.length; x++) {
			soma += vect[x];
			media = soma / numeros;
		}
		
		System.out.println("Soma: " + soma);
		System.out.println("Media: " + media);

		sc.close();
	}
}
