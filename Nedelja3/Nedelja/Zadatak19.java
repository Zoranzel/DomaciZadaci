package nedelja3.nedelja;


import java.util.ArrayList;
import java.util.List;

public class Zadatak19 {
	
	public static void removeAll(List<Integer> list, Integer element) {
	    while (list.contains(element)) {
	        list.remove(element);
	    }
	}
	
	public static int secondSmallest(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> list3) {


		list1.addAll(list2);

		list1.addAll(list3);

		int min = list1.get(0);
		for(int i = 1; i < list1.size();i++) {

			if(list1.get(i) < min) {
				min = list1.get(i);
			}
		}
		
		// brisanje najveceg
		
		removeAll(list1, min);
			
		// ponovo trazim najmanji
		
		int minSecond = list1.get(0);
		for(int i = 1; i < list1.size();i++) {

			if(list1.get(i) < minSecond) {
				minSecond = list1.get(i);
			}
		}
		
		return minSecond;
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();

		list1.add(-10);
		list1.add(2);
		list1.add(3);
		list1.add(10);
		list1.add(2);
		list1.add(-3);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(10);
		list2.add(20);
		list2.add(4);
		list2.add(-3);
		list2.add(-10);
		list2.add(17);	

		ArrayList<Integer> list3 = new ArrayList<>();
		list3.add(11);
		list3.add(12);
		list3.add(-3);
		list3.add(14);
		list3.add(-3);	
		
		int rez = secondSmallest(list1, list2, list3);
		System.out.println("Second smallest is: " + rez);
		
	}

}