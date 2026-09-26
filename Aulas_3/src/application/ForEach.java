package application;

public class ForEach {

	public static void main(String[] args) {

		String[] vect = new String[] { "Maria", "Bob", "Alex" };
		int[] vectDouble = new int[] { 1, 15, 5 };

		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}

		System.out.println("----------------------------------");

		for (String obj : vect) {
			System.out.println(obj);
		}

		System.out.println("----------------------------------");

		for (int numeros : vectDouble) {
			System.out.println(numeros);

		}

	}
}
