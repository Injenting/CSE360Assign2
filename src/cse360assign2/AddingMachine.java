/**
 * @author Nic Pauwels
 * @classID CSE360-85141
 * @assignment Assignment2
 * 
 * This file contains the class AddingMachine.
 */
package cse360assign2;

public class AddingMachine {

	private int total;
        private String history;
	
        /**
        * Class constructor
        */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
                history = "0";
	}
	
        
         /**
         * Returns the current value of total
         *
         * @return  the value of total
         */
	public int getTotal () {
		return total;
	}
	
        
        /**
         * Adds a given value to total
         *
         * @param  value   an int to be added to total
         */        
	public void add (int value) {
            total += value;
            history += " + " + value;
	}

        
        /**
         * Subtracts a given value from total
         *
         * @param  value   an int that is to be subtracted from total
         */
	public void subtract (int value) {
            total -= value;
            history += " - " + value;
	}

        
        /**
         * Returns a String that represents all of the additions and subtractions
         * that have been called on the instance of this class.
         *
         * @return      the history of transactions on total
         */
	public String toString () {
		return history;
	}
        
        
        /**
         * Clears something 
         *
         */
	public void clear() {
	
	}
}
