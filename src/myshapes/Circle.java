package myshapes;

/** class Circle
*
* Class for a Circle
*
*/
public class Circle extends Shape {
	
	
	static double pi = Math.PI;
	
	
	/**
	* Constructor
	*
	* @param origin - Vertex - center of circle
	* @param radius - double
	*/
	public Circle(Vertex origin, double radius) {
		this.origin = origin;
		this.radius = radius;
		verts =  new Vertex[]{origin}; 	// one vertex at center
		lines = null;					// lines array is null for circle
	}
	
	/**
	* Constructor
	*
	* @param x - double - x co-ordinate of center of circle
	* @param y - double - y co-ordinate of center of circle
	* @param radius - double
	*/
	public Circle(double x, double y, double radius) {
		this( new Vertex(x,y), radius);	// call constructor with (Vertex,double) params
	}
	
	public double area() {
		
		return ( Math.pow(radius, 2) * pi);
	}//area()

	
	/** perimeter()
	* Returns the circumference.
	*
	* @return double
	*/
	@Override
	public double perimeter() {
		
		return (2 * radius * pi);
	}// perimeter()
	
	/** print()
	* Prints details about the shape.
	*
	*/
	public void print() {
		System.out.printf("Shape: %s Area: %f \n", this.name(), this.area());
		for( Point p: verts) {
			p.print();
		}
	}//print

}
