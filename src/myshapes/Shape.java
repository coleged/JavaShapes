package myshapes;

import java.util.Vector;

/** class Shape
* Parent Class for all shapes
*
*/
abstract public class Shape implements MyShapes {
	
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
	
	shapeType 	type;
	int 		nverts;
	int 		nsides;
	Vertex		origin;		// origin and/or anchor
	double		radius;		// for Circle				 
	Vertex[] 	verts;		// TODO re-implement both these as Vectors
	Line[] 		lines;
	
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
	public String name(String name) {
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
	public double perimeter() {
		return 0;
	}// perimeter()
	
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
	
	
}// class
