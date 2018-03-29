
public class Node<T> {
	private T info;
	private Node<T> next;
	
	public Node(T _info, Node<T> _next) {
		this.info = _info;
		this.next = _next;
	}
	
	public T getInfo() {
		return info;
	}
	
	public Node<T> getNode() {
		return next;
	}
	public void setNode(Node<T> node) {
		next = node;
	}
}
