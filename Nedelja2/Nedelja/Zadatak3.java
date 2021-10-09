package nedelja2.nedelja;

import java.util.Arrays;
import java.util.Scanner;


//   3. Levo Desno
//   Korisnik unosi broj n koji oznacava koliko double brojeva kod treba da ocekuje. Zatim, unosi n double
//   brojeva, pozitivnih, negativnih ili 0.0. Smestiti sve te brojeve u niz, tako da idu prvo svi negativni,
//   pa onda sve 0.0, pa tek onda svi pozitivni brojevi (brojevi nemoraju da budu sortirani). Napraviti
//   zasebnu funkciju koja smesta brojeve na njihove odgovarajuce lokacije u nizu i zasebnu funkciju
//   koja ispisuje ceo niz.



public class Zadatak3 {

	public static void printArray(double[] y) {

		//		for(Double p : y) {
		//			System.out.print(p + " "); 
		//		}

		System.out.println(Arrays.toString(y));
	}

	public static double[] order(double[] x) {

		double[] b = new double[x.length];

		int counter = 0;

		for(int i = 0; i < x.length;i++) {
			if(x[i] < 0) {
				counter++;
				b[counter - 1] = x[i];
			}
		}

		for(int j = 0; j < x.length;j++) {
			if(x[j] == 0) {
				counter++;
				b[counter - 1] = x[j];
			}
		}

		for(int k = 0; k < x.length;k++) {
			if(x[k] > 0) {
				counter++;
				b[counter - 1] = x[k];
			}
		}

		return b;

	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");

		int n = sc.nextInt();

		double[] a = new double[n];

		for(int i = 0; i < n;i++) {
			System.out.println("Enter a[" + i +"]:");
			a[i] = sc.nextDouble();
		}

		System.out.println(Arrays.toString(a));

		System.out.println();

		double[] rez = order(a);

		printArray(rez);

		sc.close();
	}

}
