package nedelja2.sreda;


import java.util.Scanner;

   //   Napisati program koji uporedjuje 3 realna broja i ispisuje najmanji od njih u konzoli.


public class Zadatak1 {


public static double findSmallest(double a, double b, double c) {
	
	return (Math.min(Math.min(a, b), c));
}

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter 3 real numbers:");
	
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double c = sc.nextDouble();
	
	 double rezultat = findSmallest(a, b, c);
	 System.out.println(rezultat);
	
	sc.close();
	
}

}
