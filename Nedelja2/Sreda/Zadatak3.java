package nedelja2.sreda;


import java.util.Scanner; 

public class Zadatak3 {

	public static void bid(boolean b, int i, double d) {

		if( b == false) {
			System.out.println("Boolean");
		}

		if(i > 49) {
			System.out.println("Integer");
		}

		if(Math.floor(d) > (i * 2)) {
			System.out.println("Double");
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter values for b, i and d:");
		boolean b = sc.nextBoolean();
		int i = sc.nextInt();
		double d = sc.nextDouble();

		bid(b, i, d);

		sc.close();

	}

}
