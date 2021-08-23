package nedelja4.sreda;

import java.util.Arrays;

public class Karatista {

	private String ime;
	private int godine;
	private String rang;
	private String[] kata;


	public Karatista(String ime, int godine, String rang, String[] kata) {

		if(rang.equals("")) {
			System.out.println("Ne mozete inicijalizovati vrednost polja rang praznim stringom.");
		}else {
			this.rang = rang;
		}

		if(ime.equals("")) {
			System.out.println("Ne mozete inicijalizovati polje ime praznim stringom.");
		}else {
			this.ime = ime;
		}

		if(godine < 0) {
			System.out.println("Godine ne mogu biti negativan broj.");
		}else {
			this.godine = godine;
		}

		if(kata.length == 0) {
			System.out.println("Uneli ste prazan niz kata."); 	
		}else {
			this.kata = kata;
		}
	}


	public String getIme() {
		return ime;
	}


	public void setIme(String ime) {

		if(ime.equals("")) {
			System.out.println("Ne mozete menjati vrednost polja ime praznim stringom.");
			return;
		}
		this.ime = ime;
	}


	public int getGodine() {
		return godine;
	}


	public void setGodine(int godine) {
		if(godine < 0) {
			System.out.println("Niste uspeli da promenite vrednost atributa godine.");
			return;
		}
		this.godine = godine;
	}


	public String getRang() {
		return rang;
	}


	public void setRang(String rang) {
		if(rang.equals("")) {
			System.out.println("Ne mozete menjati vrednost polja rang praznim stringom.");
			return;
		}
		this.rang = rang;
	}


	public String[] getKata() {
		return kata;
	}


	public void setKata(String[] kata) {
		if(kata.length == 0) {
			System.out.println("Ne mozete promeniti vrednost niza kata, jer je vas niz prazan!"); 	
			return;
		}else {
			this.kata = kata;
		}
	}


	public void napadni(int index) {
		System.out.println("Karatista " + ime + " napada sa " + kata[index] + " katom.");
	}

	public void vatreniNapad() {
		int max = kata.length - 1;
		int min = 0;
		System.out.println("Karatista " + ime + " napada sa " + kata[(int)Math.floor(Math.random()*(max-min+1)+min)] + " katom.");
	}

	public void log() {
		System.out.print("Karatistia: " + ime + ", " + godine + ", " + rang + " - zna naredne kate ");
		for(int i = 0; i< kata.length;i++) {
			System.out.print(kata[i] + " "); 
		}
		System.out.println();
	}


	@Override
	public String toString() {
		return "Karatista [ime=" + ime + ", godine=" + godine + ", rang=" + rang + ", kata=" + Arrays.toString(kata)
		+ "]";
	}

}
