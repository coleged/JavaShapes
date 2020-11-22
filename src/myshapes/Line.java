package myshapes;

/** class Line
* Simple Lines
*
*/
public class Line extends Shape{
	
	static long count = 0; 	// static count of line objects instantiated
	
	Point 	A;				// start of line	
	Point 	B;				// end of line
	long   	ref;		   	// line reference number
	
	/**
	* Constructor
	*
	* @param double X1, Y1, X2, Y2 - coordinates of the two end points
	*/
	Line(double x1, double y1, double x2, double y2){
		nverts = 2;
		nsides = 1;
		A = new Point(x1,y1);
		B = new Point(x2,y2);
		ref = ++count;
	}//Line()
	
	/** Line(Vertex,Vertex)
	* Constructor
	*
	* @param A, B - the two end points expressed as Vertex objects
	*/
	Line(Vertex v1, Vertex v2){
		nverts = 2;
		nsides = 1;
		A = v1;
		B = v2;
	}//Line()
	
	/** length()
	* Get Length of line.
	*
	* @return len
	*/
	public double length(){
		double adj = A.X() - B.X();
		double opp = A.Y() - B.Y();
		double len = Math.sqrt(adj*adj + opp*opp);
		
		return len;
	}//length()
	
	/** product(Line)
	* Get product of this and other line l2.  
	*
	* @param  l2 Line other_line
	* @return ret (double) - length of line
	*/
	public double product(Line l2){
		// vector product
		double ret =  (this.A.X() - this.B.X())*(l2.A.X() - l2.B.X()) +
				      (this.A.Y() - this.B.Y())*(l2.A.Y() - l2.B.Y())     ;
		
		return ret;
	}//product()
	
	/** cosAngle(Line)
	* Get (cosine of) angle between this and other line l2.
	* 
	* @param  l2 Line other_line
	* @return double
	*/
	public double cosAngle(Line l2) {
		// vector math shows that the cosine of angle between two vectors
		// is equal to the product of the two vectors divided by the product of
		// there determinants (lengths)
		
		double cosA = this.product(l2) / (this.length() * l2.length());
		
		
		return cosA;
	}//cosAngle()
	
	/** print()
	* Prints details about the Line. Overrides parent
	*
	* 
	*/
	public void print() {
		System.out.printf("Line: %d %d:(%f,%f)-%d:(%f,%f) l=%f \n", ref,
																A.ref,
																A.X(),
																A.Y(),
																B.ref,
																B.X(),
																B.Y(),
																length());
	}//print()
	
}// class
