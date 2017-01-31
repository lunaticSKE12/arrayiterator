package ku.util;

/**
 * Main is class for test ArrayIterator
 * @author Napong Dungduangsasitorn
 *
 */

public class Main {
	public static void main(String[] arg){
		String [] array = { "apple", "banana", null, "carrot" }; 
		
		ArrayIterator<String> iter = new ArrayIterator( array ); 
	

		System.out.println(iter.next( ));
		System.out.println(iter.hasNext( ));
		System.out.println(iter.hasNext( ));	
		System.out.println(iter.hasNext( ));	
		System.out.println(iter.next( ));
		System.out.println(iter.next( ));
		System.out.println(iter.hasNext( ));
		System.out.println(iter.next( ));
		
		/*String [] fruit = { "apple", null, null, "banana"}; 
		ArrayIterator<String> it = new ArrayIterator<String>(fruit);
		
		System.out.println(it.hasNext( ));
		System.out.println(it.next( ));
		System.out.println(it.next( ));
		System.out.println(it.hasNext( ));
		System.out.println(it.next( ));*/
		
		/*Object [ ] array = new Object[1];  // array containing null 
		ArrayIterator it = new ArrayIterator( array ); 
		
		System.out.println(it0.hasNext( ));
		System.out.println(it0.next( ));*/
		
	}

}
