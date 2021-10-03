package nedelja9.nedelja;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


//  Random test primer
//  Za 6. zadatak sa prethodnog testa: "Za zadati niz brojeva vratiti NIZ brojeva
//  tako da svi brojevi koji nisu nula idu na pocetak,
//  prateci svoj originalni raspored, a zatim ga popuniti sa ostalim nulama",
//  napisati program koji generise 1000 test primera i pise ih u fajl u obliku:
//  assertEquals(new int[]{---}, imeFunkcije(new int[]{...});
//  assertEquals(new int[]{---}, imeFunkcije(new int[]{...});
//  itd;
//  gde je --- reseni niz, a ... pocetni niz (dakle ovaj fajl ce imati 1000 redova)
//  (inicijalne brojeve nasumicno generisati i duzinu niza takodje nasumicno
//   generisati)



public class Zadatak1 {

	public static Integer[] rearrangeArray(int[] arr) {

		List<Integer> list = new ArrayList<>();

		int[] rez = new int[arr.length];

		int br = 0;
		for(int i = 0; i < arr.length;i++) {

			if(arr[i] != 0) {

				list.add( br, arr[i]);

				br++;
			}
		}

		for(int i = 0;i < arr.length;i++) {

			if(arr[i] == 0) {

				list.add(arr[i]);
			}
		}

		return list.toArray(new Integer[0]);	
	}


	public static void main(String[] args) throws IOException {

		Random rand = new Random();

		File f = new File("MyFile.txt");

		boolean re = f.createNewFile();

		//		System.out.println(re);

		BufferedWriter writer = new BufferedWriter(new FileWriter("MyFile.txt"));


		int[] a = null;


		for(int i = 0; i < 1000;i++) {

			a = new int[3 + rand.nextInt(12)];

			for(int j = 0; j < a.length;j++) {

				if(j % 2 == 0) {

					a[j] = rand.nextInt(10);
				}else {

					a[j] = rand.nextInt(1);
				}

			}

			Integer[] rez = rearrangeArray(a);

			// sada treba da ih postavim u odgovarajuci format za ispis

			String s1 = "";
			for(int j = 0; j < a.length;j++) {

				if(j == a.length - 1) {

					s1 += a[j];
					break;
				}

				s1 += a[j] + ", ";
			}

			String s2 = "";
			for(int j = 0; j < rez.length;j++) {

				if(j == rez.length - 1) {

					s2 += rez[j];
					break;
				}

				s2 += rez[j] + ", ";
			}


			try {

				writer.write("assertEquals(new int[]{" + s2 + "}, rearrangeArray(new int[]{" + s1 + "});" );
				writer.newLine();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		writer.close();

	}

}
