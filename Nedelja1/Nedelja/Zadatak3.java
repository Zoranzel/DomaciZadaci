package nedelja1.nedelja;


import java.util.Scanner;


   //   Prosecna vrednost


public class Zadatak3 {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter price:");
	double price = sc.nextDouble();

	if(price == 0) {
		System.out.println(0);
	} else {

		int counter = 1;
		double sum = price;

		while(price != 0) {

			System.out.println("Enter price:");
			price = sc.nextDouble();

			if(price > 0) {
				sum += price;
				counter++;
			}	
		}

		double average = sum/counter;
		System.out.println(average);

	}
	sc.close();
}
}
