package link;

public class LinkList {
	
	Node head;
	
	int size;
	
	public LinkList() {
		head = null;
		size = 0;
	}
	
	public Object obtain(int index) {
		int contador = 0;
		Node temporal = head;
		while(contador < index) {
			temporal = temporal.getNext();
			contador++;
		}
		return temporal.getValue();
	}
	
	
	public void deletefirst() {
		head = head.next;
		size--;
	}
	
	public void deleteIndex(int index) {
		
		if(index==0) {
			head =head.next;
		}else {
			int cont=0;
			Node temp = head;
			while(cont<index-1) {
				temp=temp.getNext();
				cont++;
			}
			temp.linkNext(temp.getNext().getNext());
		}
		size--;
	}
	
	public void cut(int index) {
		int cont=0;
		Node temp = head;
		while(cont<index-1) {
			temp=temp.getNext();
			cont++;
		}
		
		temp.linkNext(null);
		size = index;
	}
	
	
	public void addhead(Object obj) {
		if(head == null) {
			head = new Node(obj);
		}else {
			Node tmp = head;
			Node nuevo = new Node(obj);
			nuevo.linkNext(tmp);
			head = nuevo;
		}
	
		size++;
	}
	
	public int size() {
		return size;
	}
	
	
	public boolean isNull() {
		return (head == null)?true:false;
	}

}
