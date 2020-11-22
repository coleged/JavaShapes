package myshapes;

/** class Quad
* Abstract Class for 4 sided polygons
*
*/
abstract public class Quad extends Poly {

	/**
	* Constructor
	*
	*/
	public Quad() {
		nverts = 4;
		nsides = 4;
	}
	
	abstract public double area();

}
