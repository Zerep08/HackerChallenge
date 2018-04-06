package pila;

import java.util.Stack;

public class PilaExample {

	public static void main(String[] args) {
	// push = put elements in the stack
	// pop =  retrieve the last element added in the stack
	// peek = Allow to see the first element added
    // empty =  is used to see if the stack is empty
	Stack <String>stack = new Stack<String>();
	
	stack.push("Mundo");
	stack.push("Hola");
	
	
	
	Stackie stackie = new Stackie(3);
	
	stackie.push("Hola soy stackie");
	
	
	System.out.println(stackie.peek());
	System.out.println(stackie.empty());
	System.out.println(stackie.pop());
	System.out.println(stackie.empty());
	
	
	

	}

}
