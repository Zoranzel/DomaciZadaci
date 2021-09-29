package nedelja9.sreda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//   Za prosledjenu Listu brojeva preko tokova izdvojiti:

//   Sve brojeve deljive sa 3 uvecati za 2
//   Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja
//   Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate


public class Domaci {

	public static int transform(int n) {     

		if(n % 3 == 0) {

			return n + 2;
		}

		return n;
	}




	//  1.  Sve brojeve deljive sa 3 uvecati za 2

	public static List<Integer> increaseByTwoAllDivisibleByThree(List<Integer> list) {

		return  list.stream().
				map(Domaci::transform).collect(Collectors.toList());


	}


	//  2.  Izbaciti sve brojeve koji su deljivi sa 3 prilikom njihovog dupliranja

	public static List<Integer> removeAllDivisibleByThreeWhenWeDoubleIt(List<Integer> list) {


		return list.stream().filter(x -> !((x * 2) % 3 == 0)).collect(Collectors.toList());

	}



	//  3.  Pomnoziti svaki neparan broj sa 2 i izbaciti duplikate

	public static List<Integer> multiplyEveryOddWithTwoAndRemoveDuplicates(List<Integer> list) {

		return list.stream().map(x ->{ if(x % 2 != 0) {
			return x * 2;
		}
		return x;}).distinct().collect(Collectors.toList());

	}





	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		//		list.add(1);
		//		list.add(2);
		//		list.add(3);
		//		list.add(4);
		//		list.add(5);
		//		list.add(6);
		//		list.add(7);
		//		list.add(8);
		//		list.add(9);
		//		list.add(10);

		//		list.add(11);
		//		list.add(12);
		//		list.add(13);
		//		list.add(14);
		//		list.add(15);
		//		list.add(16);
		//		list.add(17);

		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);


//				List<Integer> rez1 = increaseByTwoAllDivisibleByThree(list);
//				
//				for(Integer p : rez1) {
//					
//					System.out.println(p);
//				}


//				List<Integer> rez = removeAllDivisibleByThreeWhenWeDoubleIt(list);
//				
//				for(Integer p : rez) {
//					
//					System.out.print(p + " ");
//				}

		List<Integer> rez3 = multiplyEveryOddWithTwoAndRemoveDuplicates(list);

		for(Integer p : rez3) {

			System.out.print(p + " ");
		}



	}

}
