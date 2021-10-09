package nedelja1.nedelja;

import java.util.Scanner;

   //   Jednakostranicni trougao


public class Zadatak6 {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter number of stars:");
	int number = sc.nextInt();

	String stars = "";

	for(int j = 0; j < number;j++) {

		for(int i = 0; i < number - j -1;i++) {
			stars += " ";
		}

		for(int k = 0; k < j + 1;k++) {
			stars += "* ";
		}

		System.out.println(stars);

		stars ="";

	}
	sc.close();
	
}

}