package nedelja5.sreda;

public class Circle extends Shape{
	
	 private double r;

	    /*Constructor*/
	 
	 public Circle(String name, double r) {
			super(name);
			this.r = r;
		}
	
	   

	    /*Methods*/
	    //Todo:
	 
	 @Override
	 public double circumference() {
		 
		 return 2*r*Math.PI;
	 }
	 
	 @Override
	 public double area() {
		 
		 return r*r*Math.PI;
	 }

	    @Override
	    public String toString() {
	        return super.toString();
	    }
	

}
