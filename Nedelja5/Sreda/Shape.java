package nedelja5.sreda;

public abstract class Shape {
	
	 private String name;

	    /*Constructor*/
	    // TODO: Implement me
	 
	    public Shape(String name) {
			this.name = name;
		}
	 
	 

	    /*Methods*/
	    public abstract double circumference();

	   

		public abstract double area();

	    //Shape: {name}
	    //Circumference: {circumference()}
	    //Area: {area()}
	    //-----------------
	    @Override
	    public String toString() {
	    	String spacer ="-----------------";
	        return "Shape: " + name + "\n" + "Circumference: " + circumference() + "\n" + "Area: " + area() + "\n" + spacer; // TODO: Implement me
	    }
	

}
