package cse360assign2;

/**
 * @author Jacqueline Burton
 * Class id: CSE360 - Monday
 * Assignment: 2
 * Version: 2.0
 * 
 * Allows the user to add and subtract values from a total 
 * that is initially set to 0. It also records the history 
 * of operations preformed since the last clear function call representing all
 * operations done in a string format stored in the history variable that is
 * initially set to "0" during construction.
 */

public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Constructs the AddingMachine object setting total to 0 and history to "0"
	 */
	
	public AddingMachine() {
		total = 0;  
		history = "0";
	}
	
	/**
	 * Accesses total variable, returning the current sum 	 
	 * @return total	the current sum of the object
	 */
	
	public int getTotal() {
		return total;
	}
	
	/**
	 * Adds a value to total
	 * @param value 	the amount added to total
	 */
	public void add(int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts a value from total
	 * @param value 	the amount subtracted from total
	 */
	public void subtract(int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * Returns a string that records the history of all operations since the
	 * last clear was performed
	 * @return history	the strings which holds the operations 
	 */
	public String toString() {
		return history;
	}
	
	/**
	 * Resets the total and history to their initial values
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
