package myshapes;

/** class Triangle
* 3 sided shape
*
*/
public class Triangle extends Poly {

	/**
	* Constructor
	*
	* @param v1 - three vertices of the triangle
	* @param v2 - three vertices of the triangle
	* @param v3 - three vertices of the triangle
	*/
	public Triangle(Vertex v1, Vertex v2, Vertex v3 ) {
		nverts = 3;
		nsides = 3;
		type = shapeType.TRIANGLE;
		verts =  new Vertex[]{v1, v2, v3};
		lines =  new Line[3];
		lines[0] = new Line(v1,v2);
		lines[1] = new Line(v2,v3);
		lines[2] = new Line(v3,v1);
	}
	
	public double area() {	
		// Using Herons rule for area of triangle
		double area = 1;
		double s = this.perimeter()/2;
		for(Line l: lines) {
			area *= (s-l.length());
		}
		area = Math.sqrt(s*area);
		
		return area;
	};

}
