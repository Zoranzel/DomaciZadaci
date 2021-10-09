package nedelja1.nedelja;

import java.util.Scanner;


     //    Olimpijske medalje

public class Zadatak1 {

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter countries and medals:");
	String fCountry = sc.nextLine();
	String sCountry = sc.nextLine();

	int gold = sc.nextInt();
	int silver = sc.nextInt();
	int bronze = sc.nextInt();

	int gold2 = sc.nextInt();
	int silver2 = sc.nextInt();
	int bronze2 = sc.nextInt();


	int firstMedals = gold + silver + bronze;

	int secondMedals = gold2 + silver2 + bronze2;

	if(firstMedals > secondMedals) {
		System.out.println(fCountry);
	} else if(firstMedals < secondMedals) {
		System.out.println(sCountry);
	} else {

		if(gold > gold2) {
			System.out.println(fCountry);
		} else if(gold < gold2) {
			System.out.println(sCountry);
		} else {

			if(silver > silver2) {
				System.out.println(fCountry);
			} else if(silver < silver2) {
				System.out.println(sCountry);
			} else {

				if(bronze > bronze2) {
					System.out.println(fCountry);
				} else if(bronze < bronze2) {
					System.out.println(sCountry);
				} else {

					System.out.println("Nereseno");	
				}

			}

		}	

	}
	sc.close();
}

}

