import java.util.Scanner;

public class Recursion {
	
	
	static int factorial(int n) {
        
		//Recursion case
		if(n>1) {
        	return n * factorial(n-1);
        }
		//Base case
		else {
        	return n;
        }
    }

	public static void main(String[] args) {
		   
		    Scanner in = new Scanner(System.in);
		    int n = in.nextInt();
		    int result = factorial(n);
		    System.out.println(result);
		    in.close();
	}

}
