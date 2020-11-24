package myshapes;

/** class Point
* Simple point in 2D space
*
*/
public class Point {
	
	private double X;
	private double Y;
	private static long count = 0;
	private long ref;
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
	
	/** setX() - setter
	* set X coordinate.
	*
	*/
	final void setX(double x) {
		X = x;
	}//setX()
	
	/** setY() - setter
	* set Y coordinate.
	*
	*/
	final void setY(double y) {
		Y = y;
	}//setY()
	
	/** X() - getter
	* Get X coordinate.
	*
	* @return double
	*/
	final public double X() {
		return X;
	}
	
	/** same() - getter
	* Returns true if this point is the same as other
	*
	* @return boolean
	*/
	final public boolean same(Point other) {
		if((this.X == other.X()) && (this.Y == other.Y())) return true;
		return false;
	}
	
	/** Y() - getter
	* Get Y coordinate.
	*
	* @return double
	*/
	final public double Y() {
		return Y;
	}
	
	/** ref() - getter
	* Get reference number for point.
	*
	* @return long
	*/
	final public long ref() {
		return ref;
	}
	
	/** print() 
	*
	* prints information about the Point object
	*/
	public void print() {
		System.out.printf("P: %d (%f,%f) \n", ref, X,Y);
	}

}
