package myshapes;

import java.util.Vector;

/** class Shape
* Parent Class for all shapes
*
*/
abstract public class Shape implements MyShapes {
	
	// enumerations for size comparison
	final static int SMALLER 	= -1;
	final static int SAME	  	=  0;
	final static int LARGER  	=  1;
	
	/** shape type
	*
	*	{@link #CIRCLE}
	*	{@link #RECTANGLE}
	*	{@link #TRIANGLE}
	*  
	*/
	public enum shapeType { 
							/**
							 * 
							 */
								CIRCLE,
							/**
							 * 
							 */
								RECTANGLE,
							/**
							 * 
							 */
								TRIANGLE }
	
	private String 		name;
	
	protected shapeType type;
	protected int 		nverts;
	protected int 		nsides;
	protected Vertex	origin;		// origin and/or anchor
	protected double	radius;		// for Circle				 
	protected Vertex[] 	verts;		// TODO re-implement both these as Vectors
	protected Line[] 	lines;
	
	/** name() - overloaded getter/setter
	 * 
	 * @return name - String
	 */
	final public String name() {
		return name;
	}
	
	/** name() - overloaded getter/setter
	 * 
	 * @param name  - String. if present sets name attribute
	 * @return name - String
	 */
	final public String name(String name) {
		this.name = name;
		return this.name;
	}
	
	/** area()
	* Returns the area of the shape.
	*
	* @return double
	*/
	@Override
	abstract public double area();

	
	/** perimeter()
	* Returns the length of perimeter of the shape.
	*
	* @return double
	*/
	@Override
	abstract public double perimeter();
	
	/** print()
	* Prints details about the shape.
	*
	* 
	*/
	public void print() {
		System.out.printf("Shape: %s Area: %f \n", this.name(), this.area());
		for( Point p: verts) {
			p.print();
		}
	}//print
	
	
	/** compareTo()
	* Compares area of this with Shape to.
	*
	* @param to - Shape
	* @return int - -1 if this is smaller, +1 if larger and 0 is same size
	* 
	*/
	public int compare(Shape to) {
		
		if(this.area() > to.area()) return  1;
		if(this.area() < to.area()) return -1;
		
		// they are the same size
		return 0;
	}
	
	/** printShapes()
	* 	Calls the print() method for every shape on the vector
	*
	* @param shapes - Vector of Shape
	*/
	public static void printShapes(Vector<Shape> shapes) {
		for(Shape s: shapes) {
			s.print();
		}
	}
	
	/**
	 * 
	 * isValid tests that a valid enclosed shape made from contained vertices
	 * overloaded by Circle subclass which is a special case.
	 * @return boolean
	 * 
	 */
	public boolean isValid() {
		// test here is that all points must be unique
		for(int n = 0; n < nverts; n++) {
			for(int i = n+1; i < nverts; i++) {
				if (verts[n].same(verts[i])) return false;
			}
			
		}
		return true;
	}
	
	
}// class
