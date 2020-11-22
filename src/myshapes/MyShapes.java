/**
 * 
 * First Java program.		November 2020
 * 
 * Just playing about with structure and ideas - a bit of a learning playpen
 * 
 * Developed with Eclipse and exported for launching with Apache Ant
 * 
 * 												colege@gmail.com
 * 
 */
package myshapes;

/**
 * @author ecole
 *
 */
public interface MyShapes {
	
	/** area()
	* returns the area of a shape
	* 
	* @return double
	*
	*/
	double area();			// Returns area of shape
	
	/** perimeter()
	* returns the length of perimeter of a shape
	* 
	* @return double
	*
	*/
	double perimeter();		// Returns length of perimeter
	
	/** print()
	* prints information about a  of a shape
	* 
	*
	*/
	void   print();			// Prints out shape information
	
	/** compare()
	* Compares this shape with to wrt area
	* 
	* returns -1 if this is smaller, 0 is the same and +1 if larger
	* @param to - the shape to compare with
	* @return int
	*/
	int compare(Shape to);

}// interface myShapes
