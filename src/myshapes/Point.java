package myshapes;

/** class Point
* Simple point in 2D space
*
*/
public class Point {
	
	private double X;
	private double Y;
	static long count = 0;
	long ref;
	String label;
	
	/**
	* Constructor
	*
	* @param double x,y - coordinates of the point
	*/
	Point(double x, double y){
		X = x;
		Y = y;
		ref = ++count;
	}
	
	/** X() - getter
	* Get X coordinate.
	*
	* @return double
	*/
	public double X() {
		return X;
	}
	
	/** Y() - getter
	* Get Y coordinate.
	*
	* @return double
	*/
	public double Y() {
		return Y;
	}
	
	/** print() 
	* Get X coordinate.
	*
	* prints information about the Point object
	*/
	public void print() {
		System.out.printf("P: %d (%f,%f) \n", ref, X,Y);
	}

}
