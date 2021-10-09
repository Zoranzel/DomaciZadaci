package nedelja2.nedelja;


import java.util.Scanner;

//Suma cifara broja, ponovo
//Korisnik unosi broj kao String. Na standardni izlaz ispisati zbir njegovih cifara. Za racunanje
//zbira cifara napraviti zasebnu funkciju koja vraca int.
//Raditi pomocu String metode toCharArray()!


public class Zadatak2 {


  //   validacija unesenog broja(koji je u obliku Stringa)
	

public static boolean isValid(String x) {

	try {
		Integer.parseInt(x);
	}catch(Exception e){
		return false;
	}

	return true;
}


public static int calculateSum(String x) {


	char[] b = new char[x.length()];
	b = x.toCharArray();


	int sum = 0;
	for(int i = 0; i < b.length;i++) {
		sum += Character.getNumericValue(b[i]);
	}

	return sum;
}

public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	String number;
	do {
		System.out.println("Enter number:");

		number = sc.nextLine();

	}while(!isValid(number));

	System.out.println("Zbir cifara broja " + number + " je: " + calculateSum(number));

	sc.close();
}

}
