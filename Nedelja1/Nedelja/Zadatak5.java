package nedelja1.nedelja;

import java.util.Scanner;


      //  Skriveni broj


public class Zadatak5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter integer positive number:");
		int number = sc.nextInt();
		
		int temp = number;
		
		int counter = 0;
		while(number != 0) {
			
			number /= 10;
			counter++;
		}
		
		int sum = 0;
		for(int i = 0; i < counter;i++) {
			int digit = temp % 10;
			temp /= 10;
			sum += digit;
		}
		
		int temp2 = sum;
		
		int counter2 = 0;
		while(sum != 0) {
			sum /= 10;
			counter2++;
		}
		
		int sumOfDigits = 0;
		for(int j = 0;j < counter2;j++) {
			int digit2 = temp2 % 10;
			temp2 /= 10;
			sumOfDigits += digit2;
		}
		

		System.out.println(sumOfDigits);
		
	}

}
