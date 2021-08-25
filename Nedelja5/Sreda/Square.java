package nedelja5.sreda;

public class Square extends Rectangle {
	
	

	 /*Constructor*/
	
	public Square(String name, double a, double b) {
		super(name, a, b);
		
	}
	
	

    /*Methods*/
    //TODO
	
	
	@Override
	public double circumference() {
		
		return 2 * (getA() + getB());
	}
	

	@Override
    public double area() {
    	
    	return getA() * getB();
    }

	
    @Override
    public String toString() {
        return super.toString();
    }

	
}
