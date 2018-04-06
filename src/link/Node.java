package link;

public class Node {
	Object value;
	Node next;
	public Node(Object value) {
		
		this.value = value;
		this.next = null;
	}
	
	public void linkNext(Node n) {
		next = n;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Object getValue() {
		return value;
	}
	
	

}
