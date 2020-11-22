package myshapes;

/** class Quad
* A Class for 4 sided polygons
*
*/
abstract public class Quad extends Poly {

	/**
	* Constructor
	*
	*/
	public Quad() {
		nverts = 3;
		nsides = 3;
	}
	
	abstract public double area();

}
