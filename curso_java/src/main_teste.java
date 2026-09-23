import java.util.Scanner;

public class main_teste {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fat = 1;

		for (int i = 1; i <= n; i++) {

			fat = fat * i;
		}

		System.out.println(fat);

		sc.close();
	/*	
		int entrada = sc.nextInt();
		int in = 0;
		int out = 0;

		
		for (int i=0; i<entrada; i++) {		
			
			int x = sc.nextInt();			
			out += (x >= 10 && x <= 20) ? 1 : 0;
			in += (x >= 10 && x <= 20) ? 0 : 1;			
		}
		System.out.println("in: " + in);
		System.out.println("out: " + out);
		sc.close();
		*/
	} 
	
}
	