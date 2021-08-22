package Nedelja4;

public class Poruka {

	private String poruka;
	private String posiljalac;
	private String primalac;
	int sum;
	int id;


	public Poruka(String poruka, String posiljalac, String primalac, int sum, int id) {
		this.poruka = poruka;
		this.posiljalac = posiljalac;
		this.primalac = primalac;
		this.sum = sum;
		this.id = id;
	}


	public String getPoruka() {
		return poruka;
	}


	public void setPoruka(String poruka) {
		this.poruka = poruka;
	}


	public String getPosiljalac() {
		return posiljalac;
	}


	public void setPosiljalac(String posiljalac) {
		this.posiljalac = posiljalac;
	}


	public String getPrimalac() {
		return primalac;
	}


	public void setPrimalac(String primalac) {
		this.primalac = primalac;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}



	/*Konstruktori*/

	/*Metode*/
	// TODO: setter i getter

	// U konzoli ispisuje, ako je suma nenegativna:
	// {posiljalac} salje {suma} para {primalac}-u, uz poruku:
	// {poruka}
	// a ako je suma negativna:
	// {posiljalac} primac {suma} para od {primalac}-a, uz poruku:
	// {poruka}

	public void posalji() {

		if(sum >= 0) {
			System.out.println("" + posiljalac + " salje " + sum + " para " + primalac + "-u, uz poruku: " + poruka);
		}else {
			System.out.println("" + posiljalac + " primac " + sum + " para od " + primalac + "-a, uz poruku: " + poruka);
		}
	}



	// Ispisuje:
	// {posiljalac} i {prilamalac} vrse tranzakciju od {suma}, uz poruku: {poruka} ({id})

	@Override
	public String toString() {
		return "" + posiljalac + " i " + primalac + " vrse transakciju od " + sum + ", uz poruku: " + poruka + " (" + id + ")";
	}


}
