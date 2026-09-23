import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		/*
		 * String texto; int num_inteiro; double num_decimal; char digito;
		 */

		/*
		 * strings texto = sc.next(); System.out.println("Voce digitou: "+ texto);
		 */

		/*
		 * numeros inteiros 
		 * num_inteiro =sc.nextInt();
		 * System.out.println("Voce digitou: "+ num_inteiro);
		 */

		/*
		 * numeros decimais 
		 * num_decimal = sc.nextDouble();
		 * System.out.println("Voce digitou: "+ num_decimal);
		 * System.out.printf("Voce digitou tambem: %.2f%n", num_decimal);
		 */

		/*
		 * para uso do char 
		 * digito =sc.next().charAt(0);
		 * System.out.println("Voce digitou: "+ digito);
		 */

		/*
		 * usando todos 
		 * texto = sc.next(); num_inteiro = sc.nextInt(); num_decimal =
		 * sc.nextDouble(); digito =sc.next().charAt(0);
		 * 
		 * System.out.println("Dados digitados: "); System.out.println(texto);
		 * System.out.println(num_inteiro); System.out.println(num_decimal);
		 * System.out.println(digito);
		 */

		String s1, s2, s3;
		int x;

		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
