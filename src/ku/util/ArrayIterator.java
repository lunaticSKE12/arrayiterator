package ku.util;

import java.util.Iterator;

public class ArrayIterator<T> implements Iterator<T> {
	
	/** attribute for the array we want to iterate over */   
	private T[ ] array; 
	
	private int cursor;

	 /**     
	  * Initialize a new array iterator with the array to process.     
	  * @param array is the array to iterate over     
	  */   
	public ArrayIterator(T[] array) {         
		this.array = array;        
		this.cursor = 0;
		
	}
	
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	/**     
	 * Return the next non-null element from array, if any.    
	 * @return the next non-null element in the array.     
	 * @throws NoSuchElementException if there are no more elements to return.     
	 */ 
	
	@Override
	public T next() {
		// TODO Auto-generated method stub
		return null;
	}

}
