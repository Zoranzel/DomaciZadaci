package nedelja3.sreda;


import java.util.Scanner;

//3.  Napisati funkciju koja za prosledjeni password proverava da li je validan, tj.:
  
//     Da li postoji barem jedno veliko slovo. (Hint: Hmm, sta je bese ono Strahinja pominjao da pogledamo osim, String i Integer klasa ?")
//     Je duzi od 8 karaktera.

public class Zadatak3 {

public static boolean isValid(String x) {
	
	
	boolean val1 = false;
	for(int i = 0; i < x.length();i++) {
		
		if(Character.isUpperCase(x.charAt(i))) {
			
			val1 = true;
		}
	}
	
	boolean val2 = false;
	if(x.length() > 8) {
		
		val2 = true;
	}
	
	return (val1 && val2);
}

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter password:");
	
	String password = sc.nextLine();

	boolean rez = isValid(password);
	
	System.out.println(rez ? "Password is valid." : "Password is not valid.");
}

}

