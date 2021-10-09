package nedelja2.nedelja;


import java.util.Arrays;
import java.util.Scanner;

   //     4. Parovi
   //     Korisnik unosi niz pozitivnih celih brojeva cija je duzina paran broj. Napraviti funkciju koja
   //     vraca novi niz ciji su elementi zbir parova uzastopnih elemenata starog niza.
   //     Dakle, 0. element novog niza je jednak zbiru 0. i 1. elmenta starog niza, 1. element novog niza
   //     je jednak zbiru 2. i 3. elementa novog niza, itd.

public class Zadatak4 {
	
	public static int[] calculateNewArray(int[] x) {
		
		int[] b = new int[x.length/2];
		
		for(int i = 0; i < b.length;i = i+1) {
			
			b[i] = x[i * 2] + x[i * 2 + 1];
				
			
		}
		
		return b;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    
		int number;
		do {
		System.out.println("Enter number of array elements(must be an even number):");
		
		 number = sc.nextInt();
		}while(number % 2 != 0);
		
		int[] a = new int[number];
		
		for(int i = 0;i < number;i++) {
			
			System.out.println("Enter a[" + i + "]:");
			a[i] = sc.nextInt();
		}
		
		System.out.println("Novi niz: " + Arrays.toString(calculateNewArray(a)));
		
		 sc.close();
	}
	
}

