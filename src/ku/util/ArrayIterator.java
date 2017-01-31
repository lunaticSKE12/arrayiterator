package ku.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * iterator allows to modify values and keys while iterating over Arrays and Objects.
 * Many collections and data structures provide an Iterator so 
 * we can iterate over all the elements in the collection 
 * without knowing the structure of the collection.
 * @author Napong Dungduangsasitorn
 *
 * @param <T> the type without knowing.
 */

public class ArrayIterator<T> implements Iterator<T> {
	
	/** attribute for the array we want to iterate over */   
	
	private T[ ] array; 
	
	/* cursor for remember the position in collection */
	
	private int cursor;

	 /**     
	  * Initialize a new array iterator with the array to process.     
	  * @param array is the array to iterate over     
	  */   
	
	public ArrayIterator(T[] array) {         
		this.array = array; 
		this.cursor = 0; // cursor points to the first element. 
		
	}
	
	/**
	 * check that has next element in array.
	 * @return true if cursor is not exceed array size,
	 * return false if cursor is exceed array size.
	 */
	
	@Override
	public boolean hasNext() {
		
		return this.cursor < array.length - 1;
	}

	/**     
	 * Return the next non-null element from array, if any.    
	 * @return the next non-null element in the array.     
	 * @throws NoSuchElementException if there are no more elements to return.     
	 */ 
	
	@Override
	public T next() {
		if(hasNext()){
			for(int i = this.cursor ; i < array.length ; i++){
				this.cursor++;
				if(this.array[i] != null){
					return this.array[i];
				}
			}
		}

		throw new NoSuchElementException();
	}

}
