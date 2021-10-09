package nedelja1.nedelja;


import java.util.Scanner;


    //    Prestupne godine


public class Zadatak4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter years: ");
		int firstYear = sc.nextInt();
		int secondYear = sc.nextInt();
		
		
		int counter = 0;
		for(int i = firstYear; i <= secondYear;i++) {
			if(i % 4 == 0 &&((i % 100 != 0) || (i % 400 == 0))) {
			
				counter++;
			}
		}
		
		
		System.out.println(counter);
		
		sc.close();
	}

}
