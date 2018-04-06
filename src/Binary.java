import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String binary;
		char [] c;
		int n;
		int cont=0;
		int max =0;
		n = in.nextInt();		
		binary = Integer.toBinaryString(n);
		System.out.println(binary);
		c = binary.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			if(c[i]=='1') {
				cont++;
			}else {
				if(cont > max) {
				max=cont;
				
			}									
				cont = 0;
			}
			
			
		}

		System.out.println(max);
		
		in.close();
		
		
		
		

	}

}
