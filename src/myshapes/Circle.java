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
	* @param origin - Vertex - centre of circle
	* @param radius - double
	* @throws InvalidShapeException - if radius is less than or equal to zero
	*/
	public Circle(Vertex origin, double radius) throws InvalidShapeException{
		if(! isValid() ) throw new InvalidShapeException();
		this.origin = origin;
		this.radius = radius;
		verts =  new Vertex[]{origin}; 	// one vertex at center
		lines = null;					// lines array is null for circle
	}//Circle()
	
	/**
	* Constructor
	*
	* @param x - double - x co-ordinate of centre
	* @param y - double - y co-ordinate of centre
	* @param radius - double
	* @throws InvalidShapeException - if radius is less than or equal to zero
	*/
	public Circle(double x, double y, double radius) throws InvalidShapeException{
		Vertex vertex = new Vertex(x,y);
		this.origin = vertex;
		this.radius = radius;
		verts =  new Vertex[]{origin}; 	// one vertex at center
		lines = null;					// lines array is null for circle
		if(! isValid() ) throw new InvalidShapeException();
			
	}//Circle()
	
	/** area()
	* Returns the area of the shape.
	*
	* @return double
	*/
	final public double area() {
		return ( Math.pow(radius, 2) * pi);
	}//area()
	
	/** perimeter()
	* Returns the circumference.
	*
	* @return double
	*/
	final public double perimeter() {
		return (2 * radius * pi);
	}// perimeter()
	
	
	/**
	 * isValid tests that a valid enclosed shape made from contained vertices
	 * overloaded here in Circle as it is a special case.
	 * 
	 * This overload just tests that the radius is not negative.
	 * 
	 * @return boolean
	 */
	final public boolean isValid() {
		// test here is that all points must be unique
		if (radius <= 0) {
			return false;
		}
		return true;
	}
	
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
