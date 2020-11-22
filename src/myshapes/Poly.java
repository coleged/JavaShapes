package myshapes;

/** class Poly
* Parent Class for all multi sided shapes
* 
* Abstract for now, but might find it is necessary to create objects of this Class
*
*/
abstract public class Poly extends Shape{

	/**
	* Constructor
	*
	*/
	public Poly() {
		// TODO Auto-generated constructor stub
	}
	
	/** perimeter()
	* Returns the length of perimeter of the shape.
	*
	* @return double
	*/
	@Override
	public double perimeter() {
		double per = 0;
		
		for(Line l : lines) {
			per += l.length();
		}	
		return per;
	}// perimeter()
	

	abstract public double area();

}
