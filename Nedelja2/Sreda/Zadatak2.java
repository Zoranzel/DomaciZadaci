package nedelja2.sreda;


import java.util.Scanner;



public class Zadatak2 {

	//		public static int factoriel(int x) {
	//	
	//	        int sum = 1;
	//	        while(x != 0) {
	//	        	sum *= x;
	//	        	x = x -1;
	//	        }
	//	        return sum;
	//		}

	
	// drugi nacin

	public static int factoriel2(int x) {
		int sum = 1;
		for(int i = 1; i <= x;i++) {
			sum *= i;
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter positive integer number(bigger then 0):");
		int number = sc.nextInt();

		int rez = factoriel2(number);
		System.out.println(rez);

		sc.close();

	}

}
