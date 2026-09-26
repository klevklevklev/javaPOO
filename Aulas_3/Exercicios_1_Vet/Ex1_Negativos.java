
import java.util.Locale;
import java.util.Scanner;

public class Ex1_Negativos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce vai digitar?");
		int numeros = sc.nextInt();
		double [] vect = new double [numeros];
		
		
		for(int i= 0; i<vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.print("Numeros negativos: ");
		
		for(int i= 0; i<vect.length; i++) {
			if (vect[i]<0) {
				System.out.println(vect[i]);
			}
		}							
		sc.close();
		
	}

}
