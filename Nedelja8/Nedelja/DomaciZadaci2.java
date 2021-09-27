package mape.zadaci;

import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class DomaciZadaci2 {

	/*
	 * 3. Molekularna formula
	 *
	 * Hemijske formule molekula nam daju odlican opis toga koliko kojih atoma ima u molekulu,
	 * kao i na koji nacin su oni povezani, dok nam molekularna formula daje samo opis broja atoma koji
	 * ucestvuju u gradjenju datog molekula. Vas zadatak je da datu hemijsku formulu pretvorite u njenu molekularnu.
	 * (Gde su elementi poredjanji po leksikografskom poretku)
	 *
	 *
	 * NPR:
	 * H2S04 -> H2O4S1
	 * Al2(S04)3 -> O12S3Al2
	 * */


	public static String molekul(String hemija) {

		TreeMap<String, Integer> mapa = new TreeMap<>();

		char[] chars = hemija.toCharArray();

		Stack<String> stack = new Stack<>();



		for(int i = 0;i < chars.length;i++) {

			char current = chars[i];

			if(Character.isAlphabetic(current)) {

				// Slovo
				if(!stack.isEmpty()) {

					stack.push(current + "");
				}

				if((i + 1) < chars.length) {

					// Gledaj desno
					if(Character.isDigit(chars[i+1])) {

						//  Uvecaj za broj
						if(mapa.containsKey(current + "")) {

							mapa.put(current + "", mapa.get(current + "") + Character.getNumericValue(chars[i+1]));
						}else {
							mapa.put(current+"", Character.getNumericValue(chars[i+1]));
						}
					}else {

						// Uvecaj za 1
						if(mapa.containsKey(current + "")) {

							mapa.put(current + "", mapa.get(current + "") + 1);
						}else {
							mapa.put(current + "", 1);
						}

					}
				}

				else {

					// Desno nema nista, uvecaj za 1
					if(mapa.containsKey(current + "")) {

						mapa.put(current + "", mapa.get(current + "") + 1);
					}else {

						mapa.put(current + "", 1);
					}
				}


			}
			else if(current == '(') {

				stack.push("(");
			}else if(Character.isDigit(current)) {

			}

			//  poslednji else
			else {

				int x = 1;
				if((i+1) < chars.length && Character.isDigit(chars[i+1])) {

					x = Character.getNumericValue(chars[i+1]);
				}

				while(!stack.isEmpty()) {

					String top = stack.pop();

					if(top.equals("(")) {

						break;
					}else if(Character.isDigit(top.charAt(0))) {

					}else {
						// Hemijski element
						if(mapa.containsKey(top)) {

							mapa.put(top, mapa.get(top) * x);
						}else {

							mapa.put(top, x);
						}
					}

				}
			}

		}

		String rez = "";


		for(Map.Entry<String, Integer> e : mapa.entrySet()) {

			rez += e.getKey();
			rez += String.valueOf(e.getValue());
		}



		return rez;

	}
	
	
	/*
	 * 7. Fibonacijev niz
	 * Fibonacijev niz je onaj niz koji pocinje sa 0, 1, a svaki sledeci broj je dobijen kao zbir prethodna dva.
	 * Formalnije, Fibonacijev niz je zadat rekurentno kao:
	 * | fib(0) = 0
	 * | fib(1) = 1
	 * | fib(n) = fib(n-1) + fib(n-2), za n >= 2;
	 * Za proslednjen broj n, naci n-ti Fibonacijev broj.
	 * */

	public static int fib(int n){

		if(n == 1) {
			return 0;
		}

		if(n == 2) {
			return 1;
		}

		int rez = 0;

		int x = 0;
		int y = 1;

		for(int i = 2; i < n;i++) {

			rez = x + y;
			x = y;
			y = rez;

		}


		return rez;
	}




	public static void main(String[] args) {

//		System.out.println(molekul("COOH"));
		
//		System.out.println(fib(11));


	}

}
