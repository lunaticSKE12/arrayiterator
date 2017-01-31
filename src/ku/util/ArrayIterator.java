package ku.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * 
 * @author Napong Dungduangsasitorn
 *
 * @param <T>
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
