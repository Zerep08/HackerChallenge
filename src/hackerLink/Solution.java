package hackerLink;

public class Solution {

	public static  Node insert(Node head,int data) {
		//Complete this method
		Node nuevo = new Node(data);
		
		if(head==null) {
			head = new Node(data);
			return head;
		}
		
		Node last = head;
		
		while(last.next!=null) {
			last = last.next;
		}
		
		last.next = nuevo;
		
		return head;
	}





	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		// Scanner sc = new Scanner(System.in);
		Node head = null;
		// int N = sc.nextInt();
		int []arr = {1,2,3,4,5};
		int N=0;
		while(N<arr.length) {
			//int ele = sc.nextInt();
			// head = insert(head,ele);
			//System.out.print(arr[N]);
			head = insert(head,arr[N]);
			N++;
		}
		display(head);
		//sc.close();
	}
}
