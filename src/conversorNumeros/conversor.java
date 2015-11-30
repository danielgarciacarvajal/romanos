package conversorNumeros;

import java.util.*;

public class conversor {
	private static Scanner in;

	public static void main(String[] args) {

		int x, i;

		int Vn[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String Vc[] = { "m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i" };
		 
		Scanner in = new Scanner(System.in);
		 
		while (true) {
			System.out.println("ingrese un numero decimal cualquiera ó 0 (cero) para terminar");
			x = in.nextInt();
			
			if (x == 0){
				System.out.println("Hasta pronto");
				break;}
			System.out.printf("%-4d", x);

			i = 0;
			while (x > 0) {
				if (x >= Vn[i]) {
					System.out.print(Vc[i]);
					x = x - Vn[i];
				} else
					i++;
			}
			System.out.println();
		}
	}
}
