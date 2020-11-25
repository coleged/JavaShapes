package myshapes;

/** class Triangle
* 3 sided shape
*
*/
public class Triangle  extends Poly {

	/**
	* Constructor
	*
	* @param v1 - three vertices of the triangle
	* @param v2 - three vertices of the triangle
	* @param v3 - three vertices of the triangle
	* @throws InvalidShapeException - if any two vertices are coincident
	*  
	*/
	public Triangle(Vertex v1, Vertex v2, Vertex v3 ) throws InvalidShapeException {
		nverts = 3;
		nsides = 3;
		type = shapeType.TRIANGLE;
		verts =  new Vertex[]{v1, v2, v3};
		lines =  new Line[3];
		lines[0] = new Line(v1,v2);
		lines[1] = new Line(v2,v3);
		lines[2] = new Line(v3,v1);
		if(! isValid() ) throw new InvalidShapeException();
	}
	
	final public double area() {	
		// Using Herons rule for area of triangle
		// area = sqrt( (per/2-l1)(per/2-l2)(per/2-l3) )
		double area = 1;	// set to 1 because we are using iterative product in for loop
		double per = this.perimeter()/2;
		for(Line l: lines) {
			area *= (per-l.length());
		}
		area = Math.sqrt(per*area);
		
		return area;
	};

}
