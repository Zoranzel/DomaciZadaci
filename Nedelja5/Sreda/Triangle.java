package nedelja5.sreda;

public class Triangle extends Shape{
	
	  private double a, b, c;

	    /*Constructor*/
	  
	  
	  public Triangle(String name, double a, double b, double c) {
			super(name);
			this.a = a;
			this.b = b;
			this.c = c;
		}
	  
	  

	    /*Methods*/
	    //Todo:
	  
	  @Override
	  public double circumference() {
		  
		  return a + b + c;
	  }
	  
	  @Override
	  public double area() {
		  
		  double s = (a + b + c)/2;
		  
		  double p = Math.sqrt(s * (s-a) * (s-b) * (s-c));	  
		  
		  return p;
	  }

	    @Override
	    public String toString() {
	        return super.toString();
	    }


}
