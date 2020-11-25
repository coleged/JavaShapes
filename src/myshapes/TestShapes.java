package myshapes;
/**
 * 
 * TestShapes.java	- quick test program for the myshapes package
 * 
 * TODO:
 * 
 * 	Manually check the maths, esp. the area calculation for triangle
 * 
 * @author colege@gmail.com
 * 
 */

import java.util.*;  

/** TestShapes - includes main()
* Simple test program for myShapes project
*
*/
public class TestShapes {
	
	/***************************************************
	* 
	*					main()
	*
	*@param args (String[]) - none implemented
	*
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Shapes Test.");
		
		// Container of shapes
		Vector<Shape> myShapes = new Vector<Shape>();  
		
		Line firstLine = new Line(0,0,7,7);
		firstLine.print();
		
		// Triangle 1
			Vertex v1 = new Vertex(1,-605);
			Vertex v2 = new Vertex(4,80);
			Vertex v3 = new Vertex(4,-47);
			
			try {
				Triangle t1 = new Triangle(v1,v2,v3);
				t1.name("Triangle 1");
				myShapes.add(t1);
			}
			catch(InvalidShapeException exc) {
				System.out.println("Triangle - oops: " + exc.toString());
				
			}
			
	
		// Triangle 2
			v1 = new Vertex(0,0);
			v2 = new Vertex(0,10);
			v3 = new Vertex(10,0);
			try {
				Triangle t2 = new Triangle(v1,v2,v3);
				t2.name("Triangle 2");
				myShapes.add(t2);
			}
			catch(InvalidShapeException exc) {
				System.out.println("Triangle - oops: " + exc.toString());
			}
			
		// Circle 1
			try {
				Circle c1 = new Circle(0,0,34);
				c1.name("Circle 1");
				myShapes.add(c1);
			}
			catch(InvalidShapeException exc) {
				System.out.println("Circle - oops: " + exc.toString());
			}
			
			Shape.printShapes(myShapes);
			
			// TODO: pull these compares off the vector
			/*
			// Compare  t1 for t2
			if (t1.compare(t2) == Shape.LARGER) {
				System.out.println( t1.name() + " is bigger than " + t2.name() );
			}else {
				if ( t1.compare(t2) != Shape.SAME) {
					System.out.println( t1.name() + " is smaller than " + t2.name() );
				}else {
					// Shape.SMALLER
					System.out.println( t1.name() + " is the same size as " + t2.name() );
				}
			}
			
			// Compare  c1 for t2
			if (c1.compare(t2) == Shape.LARGER) {
				System.out.println( c1.name() + " is bigger than " + t2.name() );
			}else {
				if ( c1.compare(t2) != Shape.SAME) {
					System.out.println( c1.name() + " is smaller than " + t2.name() );
				}else {
					// Shape.SMALLER
					System.out.println( c1.name() + " is the same size as " + t2.name() );
				}
			}
			*/
		
	}

}
