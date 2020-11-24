package myshapes;

/**
 * 
 * Invalid shape exception. Thrown when attempt to make a shape with bad points. e.g. two or more points coincident
 * @author ecole
 *
 */

public class InvalidShapeException extends Exception{

	/**
	 * Looks like Exception is a serialisable class, as Eclipse complained
	 * until I added this ID
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// default super constructor
	
	/**
	 * 
	 * @return string descriptor for the exception
	 * 
	 */
	public String toString() {
		
		return("Invalid shape");
	}

}
