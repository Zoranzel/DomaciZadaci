package nedelja1.nedelja;


import java.util.Scanner;


     //    FizzBuzz

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number:");
		int number = sc.nextInt();

		for(int i = 1; i <= number;i++) {

			System.out.println("" + i + ":" + (((i % 3 == 0) &&( i % 5 == 0)) ? "FizzBuzz" : ((i % 5 == 0) ? "Buzz" : ((i % 3 == 0) ? "Fizz" : ""))));
		}
		sc.close();
	}

}
