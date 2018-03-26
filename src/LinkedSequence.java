
public class LinkedSequence<T> extends java.lang.Object implements java.lang.Cloneable{
	
	//Initialize Current Element 
	private T currElement;
	private LinkedSequence<T> seq;
	
	
	
	public LinkedSequence() {
		//Constructor
		seq = null;
		currElement = null;
	}
	
	public void addAfter(T element) {
		if (isCurrent()) {
			
		}
	}
	
	public void addAll(LinkedSequence<T> seq) throws java.lang.NullPointerException{
		
	}
	
	public void addBefore(T element) {
		
	}
	
	public void advance() throws java.lang.IllegalStateException{
		
	}
	
	public T clone() {
		
		return null;
	}
	
	
	public static <T> LinkedSequence<T> concatenaton(LinkedSequence<T> s1, LinkedSequence<T> s2){
		return null;
		
	}
	
	public T getCurrent() {
		return null;
	}
	public boolean isCurrent() {
		
		return currElement != null;
	}
	public void removeCurrent() throws java.lang.IllegalStateException{
		
	}
	public int size() {
		return 0;
	}
	public void start() {
		
	}
}

