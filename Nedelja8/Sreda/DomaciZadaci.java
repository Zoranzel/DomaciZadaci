package stek.zadaci;

import java.util.ArrayList;
import java.util.TreeSet;

public class DomaciZadaci {
	
	/*
	    * 2. Svi elementi
	    * Za dva zadata niza brojeva vratiti niz svih brojeva iz oba niza bez ponavljanja.
	    * */

	    public static ArrayList<Integer> union(ArrayList<Integer> a, ArrayList<Integer> b){
	    	
	    	if(a == null && b == null) {
	    		return null;
	    	}
	    	
	    	if(a == null && b != null) {
	    		return b;
	    	}
	    	
	    	if(b == null && a != null) {
	    		return a;
	    	}
	        
	    	TreeSet<Integer> set = new TreeSet<>(a);
	    	
	    	for(int i = 0; i< b.size();i++) {
	    		
	    		set.add(b.get(i));
	    	}
	    	
	    	
	        return new ArrayList<>(set);
	    }
	    
	    
	    /*
	     * 7. Anagram
	     * Funkcija prima 2 String i daje odgovor da/ne u odnosu na to da li je
	     * jedan String anagram drugog.
	     *
	     * NPR:
	     * "panta redovno zakasni"
	     * "neopravdan izostanak"
	     * Da
	     * */

	     public static boolean anagram(String s1, String s2){
	     	
	     	if(s1 == null && s2 == null) {
	     		return false;
	     	}
	     	
	     	if(s1 == null || s2 == null) {
	     		return false;
	     	}
	     	
	     	if(s1.length() == 0 && s2.length() == 0) {
	     		return false;
	     	}
	     	
	     	s1 = s1.replaceAll(" ", "");
	     	s2 = s2.replaceAll(" ", "");
	     	
	     	System.out.println(s1);
	     	System.out.println(s2);
	     	
	     	char[] a = s1.toCharArray();
	     	char[] b = s2.toCharArray();
	     	
	     	if(a.length != b.length) {
	             return false;
	         	}
	     	
	     	TreeSet<Character> set = new TreeSet<>();
	     	
	     	for(int i = 0; i < a.length;i++) {
	     		
	     		set.add(a[i]);
	     	}
	     	
	     	
	     	 System.out.println();
	      	System.out.println(set);
	     	
	     	
	         for(int i = 0; i < b.length;i++) {
	     		
	     		if( !set.contains(b[i])) {
	     			
	     			return false;
	     		}
	     	}
	     	
	     	return true;
	     }

	

	public static void main(String[] args) {

		
    	// 2. zadatak - unija
    	
//    	ArrayList<Integer> a = new ArrayList<>();
//    	a.add(1);
//    	a.add(2);
//    	a.add(3);
//    	a.add(4);
//    	a.add(5);
//    	
//    	ArrayList<Integer> b = new ArrayList<>();
//    	b.add(2);
//    	b.add(4);
//    	b.add(6);
//    	b.add(8);
//    	b.add(10);
//    	
//    	ArrayList<Integer> d = new ArrayList<>();
//    	ArrayList<Integer> f = null;
//    	
//    	ArrayList<Integer> rez = union(a, f);
//    	System.out.println(rez.toString());
//		
		
//  7. zadatak  - anagram
    	
//    	String a = "panta redovno zakasni";
//    	String b = "neopravdan izostanak";
//    	
//    	String a1 = "setih se osnov vere krasi isusov krst";
//    	String a2 = "hristos vaskrese";
//    	
//    	
//    	String b1 = "aka vrat";
//    	String b2 = "kravata";
//    	
//    	String b3 = "koza";
//    	String b4 = "kazao";
//    	
//    	String b5 = "viviandarkbloom";
//    	String b6 = "vladimirnabokov";
//    	
//    	String b7 = "zamalo";
//    	String b8 = "mazalO";
//    	
//    	String b9 = "";
//    	String b10 = "";
//    	
//    	System.out.println("a i b su anagrami: " + anagram(b1, b2));
//    	
		
	}

}
