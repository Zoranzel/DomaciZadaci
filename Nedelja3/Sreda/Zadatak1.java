package nedelja3.sreda;


public class Zadatak1 {

	public static void function(String a) throws Exception{
		
		if(a == null) {
			throw new Exception("Prosledjeni String je tipa null.");	
		}

		String b = a.replace("$","");
		String c = b.replace("#", "");
		String d = c.replace("@", "");

		System.out.println(d);
	}

	public static void main(String[] args) {

		String a = "Vo$z$ite $#@pazlj@i######vo!#";
		
		String b = "@P##@o#$zd#r@a@v $$s$@@vi$m ##na@š$$i@m v#o@z##ac$i##m@@a!";
		
		String d = null;
		
		String v = "@B##rz#$i@n@a @#j$$e og@r$$an#ice$na n#a #1@@2$0 $$k$i$$l@om#et$ar@a!";

		try {
		function(b);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
