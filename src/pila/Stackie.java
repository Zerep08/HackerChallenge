package pila;

public class Stackie {
	
	String arr[];
	int max;
	int top;
	public Stackie(int n) {
		max = n;
		arr= new String[max];
		top=0;
	}
	
	public boolean empty() {
		if(top==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void push(String str) {		
		if(top<max) {
		arr[top] = str;
		top++;
		}
	}
	
	public String  peek() {
	if(top>0) {
		return arr[top-1];
	}else {
		return null;
	}
	
	
	}
	
	public String pop() {
		String temp = null;
		if(top>0) {
			temp = arr[top-1];
			arr[top-1] = null;
			top--;
		}
		return temp;
	}

}
