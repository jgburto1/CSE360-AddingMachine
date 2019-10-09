package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * @author Jacqueline Burton
 *	Class id: CSE360 - Monday
 *	Assignment: 2
 *
 *	Test class that tests the AddingMachine class for
 *	correct functionality.
 */

class AddingMachineTest {
	
	AddingMachine adder = new AddingMachine();
	
	/**
	 * Ensures history is the correct initial value
	 */
	@Test
	void checkInitialHistory() {
		assertEquals("0", adder.toString());
	}
	
	/**
	 * Ensures total is the correct initial value
	 */
	@Test
	void checkInitialTotal() {
		assertEquals(0, adder.getTotal());
	}
	
	/**
	 * Checks that the add function is adding the right amount and that
	 * the history is updated in the right format
	 */
	@Test
	void checkAdd() {
		adder.add(3);
		assertEquals(3,adder.getTotal());
		assertEquals("0 + 3", adder.toString());
	}
	
	/**
	 * Checks that the add function is subtracting the right amount and that
	 * the history is updated in the right format
	 */
	@Test
	void checkSubtract() {
		adder.subtract(1);
		assertEquals(-1,adder.getTotal());
		assertEquals("0 - 1", adder.toString());
	}
	
	/**
	 * Ensures sequential operations are updating adder's total and history
	 */
	@Test
	void addSubtractAdd() {
		adder.add(5);
		assertEquals(5, adder.getTotal());
		assertEquals("0 + 5", adder.toString());
		
		adder.subtract(2);
		assertEquals(3, adder.getTotal());
		assertEquals("0 + 5 - 2", adder.toString());
		
		adder.add(10);
		assertEquals(13, adder.getTotal());
		assertEquals("0 + 5 - 2 + 10", adder.toString());
	}
	
	/**
	 * Makes sure that clearing before any other operations results in initial values
	 */
	@Test
	void clearInitial() {
		adder.clear();
		assertEquals(0,adder.getTotal());
		assertEquals("0", adder.toString());
	}
	
	/**
	 * Ensures clearing resets adder's total and history 
	 * to their initial values after adding
	 */
	@Test
	void clearAfterAdd() {
		adder.add(25);
		assertEquals(25, adder.getTotal());
		assertEquals("0 + 25", adder.toString());
		
		adder.clear();
		assertEquals(0, adder.getTotal());
		assertEquals("0", adder.toString());
	}
	
	/**
	 * Ensures clearing resets adder's total and history 
	 * to their initial values after subtracting
	 */
	@Test
	void clearAfterSubtract() {
		adder.subtract(8);
		assertEquals(-8, adder.getTotal());
		assertEquals("0 - 8", adder.toString());
		
		adder.clear();
		assertEquals(0, adder.getTotal());
		assertEquals("0", adder.toString());
	}
	
	/**
	 * Ensures clearing resets adder's total and history 
	 * to their initial values after several operations
	 */
	@Test
	void clearAfterSubtractAddSubtract() {
		adder.subtract(10);
		adder.add(2);
		adder.subtract(1);
		
		assertEquals(-9, adder.getTotal());
		assertEquals("0 - 10 + 2 - 1", adder.toString());
		
		adder.clear();
		assertEquals(0, adder.getTotal());
		assertEquals("0", adder.toString());
	}
	
	/**
	 * Ensures clearing resets adder's total and history 
	 * to their initial values after many calls in a row
	 */
	@Test
	void clearTwice() {
		adder.clear();
		adder.clear();
		assertEquals(0, adder.getTotal());
		assertEquals("0", adder.toString());
	}
	
	/**
	 * Ensures clearing resets adder's total and history 
	 * to their initial values and that the values can be further updated
	 */
	@Test 
	void subtractClearAdd() {
		adder.subtract(5);
		assertEquals(-5, adder.getTotal());
		assertEquals("0 - 5", adder.toString());
		
		adder.clear();
		assertEquals(0, adder.getTotal());
		assertEquals("0", adder.toString());
		
		adder.add(45);
		assertEquals(45, adder.getTotal());
		assertEquals("0 + 45", adder.toString());
	}
	
	/**
	 * Makes sure that negative numbers are subtracted correctly 
	 * and that the format is held for the history
	 */
	@Test
	void subtractNegative() {
		adder.subtract(-5);
		assertEquals(5, adder.getTotal());
		assertEquals("0 - -5", adder.toString());
	}
	
	/**
	 * Makes sure that negative numbers are added correctly 
	 * and that the format is held for the history
	 */
	@Test
	void AddNegative() {
		adder.add(-5);
		assertEquals(-5, adder.getTotal());
		assertEquals("0 + -5", adder.toString());
	}

}
