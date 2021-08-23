package Nedelja4;

import java.util.ArrayList;

public class Posta {

	private ArrayList<Poruka> poruke;


	/*Konstruktori*/

	public Posta(ArrayList<Poruka> poruke) {
		this.poruke = poruke;
	}

	public Posta() {
		poruke = new ArrayList<Poruka>();
	}



	/*Metode*/

	public ArrayList<Poruka> getPoruke() {
		return poruke;
	}

	public void setPoruke(ArrayList<Poruka> poruke) {
		this.poruke = poruke;
	}

	//Dodaje poruku p u poruke ako ona vec ne postoji (gledano u odnosu na id)
	public void add(Poruka p){

		for(int i = 0; i < poruke.size();i++) {

			if(poruke.get(i).getId() == p.getId()) {
				return;
			}
		}

		poruke.add(p);
	}

	//Brise poruku p iz poruka ako ona postoji (gledano u odnosu na id)
	public void remove(Poruka p){

		for(int i = 0; i < poruke.size();i++) {

			if(poruke.get(i).getId() == p.getId()) {
				poruke.remove(i);
			}
		}

	}

	//Ispisuje poruku p i ibrese je iz poruka, ako ona postoji (gledano u odnosu na id)
	public void send(Poruka p){

		for(int i = 0; i < poruke.size();i++) {

			if(poruke.get(i).getId() == p.getId()) {

				System.out.println(p);
				poruke.remove(i);
			}
		}
	}

	//Menja tekst poruke
	public void change(Poruka p, String msg){

		for(Poruka el : poruke) {

			if(el.getId() == p.getId()) {

				el.setPoruka(msg);
			}
		}

	}

	// Vraca sumu poruke p ako ta poruka postoji u listi
	public int isplata(Poruka p){

		for(Poruka el : poruke) {

			if(el.getId() == p.getId()) {

				return el.getSum();
			}
		}

		return -1;             
	}


	// U konzoli ispisuje, ako je suma nenegativna:
	// {posiljalac} salje {suma} para {primalac}-u, uz poruku:
	// {poruka}
	// a ako je suma negativna:
	// {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
	// {poruka}
	// za svaki element iz liste!
	@Override
	public String toString() {

		String rez = "";

		for(Poruka el : poruke) {

			if(el.getSum() >= 0) {
				rez += el.getPosiljalac() + " salje " + el.getSum() + " para " + el.getPrimalac() + "-a, uz poruku: " + el.getPoruka() + "\n";
			}else {

				rez += el.getPosiljalac() + " primac " + el.getSum() + " para od " + el.getPrimalac() + "-a, uz poruku: " + el.getPoruka() + "\n";
			}
		}


		return rez;
	}


}
