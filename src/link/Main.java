package link;

public class Main {

	public static void main(String[] args) {
		/*Node first = new Node("Soy primero");
		Node second = new Node("Soy segundo");
		Node third = new Node("Soy tercero");
		
		first.linkNext(second);
		first.getNext().linkNext(third);
		System.out.println(first.getNext().getNext().getValue());*/
		
		
		LinkList list = new LinkList();
		
		
		
		list.addhead(1);
		list.addhead(2);
		list.addhead(3);
		list.addhead(4);
		list.addhead(5);
		list.addhead(6);
		
		list.cut(3);
		
		System.out.println("Primer: "+list.obtain(0));
		System.out.println("Ultimo: "+list.obtain(list.size()-1));
		System.out.println("Tamano: "+list.size());
		
		

	}

}
