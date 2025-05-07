package Rectangle;

public class Rectangle {
	
	    int length;
	    int breadth;

	    public Rectangle() {
	        this.length = 1;
	        this.breadth = 1;
	    }

	   
	    public Rectangle(int length, int breadth) {
	        this.length = length;
	        this.breadth = breadth;
	    }

	  
	    public int getArea() {
	        return length * breadth;
	    }

	    public static void main(String[] args) {
	        Rectangle rect1 = new Rectangle();       
	        Rectangle rect2 = new Rectangle(5, 10);   

	        System.out.println("Area (default): " + rect1.getArea());
	        System.out.println("Area (5,10): " + rect2.getArea());
	    }
	}
