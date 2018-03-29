
public class LinkedSequence<T> extends java.lang.Object implements java.lang.Cloneable{
	
	//Initialize Current Element 
	private Node<T> head;
	private Node<T> current;
	
	public LinkedSequence() {
		//Constructor
		head = null;
		current = null;
	}
	
	public void addAfter(T element) {
		if (head == null) {
			head = new Node<T>(element, null);
			current = head;
		}else {
			Node<T> tmp = current;
			if(tmp.getNode() == null) {
				current = new Node<T>(element, null);
				tmp.setNode(current);
				
			}else {
				current = new Node<T>(element, tmp.getNode());
				tmp.setNode(current);
			}
		}
	}
	
	public void addAll(LinkedSequence<T> seq) throws java.lang.NullPointerException{
		if(seq.getHead() != null) {
			Node<T> tmp = head;
			while(tmp != null) {
				if(tmp.getNode() == null) {
					tmp.setNode(seq.getHead());
					return;
				}
				tmp = tmp.getNode();
			}
		}else {
			throw new java.lang.NullPointerException("The sequence attempting to connect is empty");
		}
	}
	
	public void addBefore(T element) {
		if (head == null) {
			head = new Node<T>(element,null);
			current = head;
		}else {

			
			if(head == current) {
				current = new Node<T>(element,head);
				head = current;
			}
			else {
				Node<T> tmp = head;
				while(tmp != null) {
					if(tmp.getNode() == current) {
						Node<T> foo = tmp;
						tmp = new Node<T>(element,current);
						foo.setNode(tmp);
						break;
					}
					tmp = tmp.getNode();
				}
			}
			
		}
	}
	
	public void advance() throws java.lang.IllegalStateException{
		if (isCurrent()) {
			if(current.getNode() == null) {
				current = null;
			}else {
				current = current.getNode();
			}
		}else {
			throw new java.lang.IllegalStateException("No current node available");
		}
	}
	
	@SuppressWarnings("unchecked")
	public LinkedSequence<T> clone() throws CloneNotSupportedException {
		return (LinkedSequence<T>)super.clone();
	}
	
	
	public static <T> LinkedSequence<T> concatenaton(LinkedSequence<T> s1, LinkedSequence<T> s2) throws java.lang.NullPointerException{
		if(s1.getHead() != null && s2.getHead()!= null) {
			
			Node<T> tmp = s1.getHead();
			while(tmp != null) {
				if(tmp.getNode() == null) {
					tmp.setNode(s2.getHead());
					break;
				}
				tmp = tmp.getNode();
			}
			return s1;
		}else {
			throw new java.lang.NullPointerException("One of the sequence is empty");
		}
		
	}
	
	public T getCurrent() throws java.lang.IllegalStateException{
		if(isCurrent()) {
			return current.getInfo();
		}else {
			throw new java.lang.IllegalStateException("No current node available");
		}
	}
	public boolean isCurrent() {
		return current != null;
	}
	public void removeCurrent() throws java.lang.IllegalStateException{
		if(isCurrent()) {
			if(current.getNode() != null) {
				if (head == current) {
					Node<T> tmp = head;
					head = head.getNode();
					current = current.getNode();
					//Deallocate object
					tmp.setNode(null);
					tmp = null;
				}else {
					Node<T> tmp = head;
					while(tmp != null) {
						if(tmp.getNode() == current) {
							//Set the previous node to point at the next node of the current
							tmp.setNode(current.getNode());
							//Let current point to another node
							current = current.getNode();
							break;
						}
						tmp = tmp.getNode();
					}
				}
			}else {
				Node<T> tmp = head;
				while(tmp != null) {
					if(tmp.getNode() == current) {
						//Unlink to remove
						tmp.setNode(null);
						//Deallocate current pointer
						current = null;
						break;
					}
					tmp = tmp.getNode();
				}
			}
		}else {
			throw new java.lang.IllegalStateException("No current node available");
		}
	}
	public int size() {
		int count = 0;
		Node<T> tmp = head;
		while(tmp != null) {
			count++;
			tmp = tmp.getNode();
		}
		return count;
	}
	public void start() {
		current = head;
	}
	
	public Node<T> getHead(){
		if(head != null) {
			return head;
		}
		else {
			return null;
		}
	}
	
	public String toString() {
		Node<T> tmp = head;
		String res = ""; 
		while(tmp != null) {
			res += " " + tmp.getInfo(); 
			tmp = tmp.getNode();
		}
		return res;
	}
}

