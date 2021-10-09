package nedelja3.sreda;


public class Zadatak2 {

	public static String function(String a,String[] x, String[] y) {


		for(int i = 0; i < x.length;i++) {

			a = a.replace(x[i], y[i]);

		}

		return a;
	}

	public static void main(String[] args) {

		String poruka = "Jedi #$%^ !@#$!!!@# mali!";

		String[] kljuc = {"#$%^", "!@#$!!!@#"};

		String[] decode = {"pite", "moroncinu"};


		String rez = function(poruka, kljuc, decode);

		System.out.println(rez);
	}

}
