import java.util.Scanner;

public class Array2D {
	


	    public static void main(String[] args) {
	       // Scanner in = new Scanner(System.in);
	        int arr[][] = {{0, 6, -7, 1, 6, 3},
	        		{-8, 2, 8, 3, -2, 7},
	        		{-3, 3, -6, -3, 0, -6},
	        		{5, 0, 5, -1, -5, 2},
	        		{6, 2, 8, 1, 3, 0},
	        		{8, 5, 0, 4, -7, 4}};
	        int temp;
	        int max = 0;
	       
	        
	        /*
	        for(int i=0; i < 6; i++){
	            for(int j=0; j < 6; j++){
	                arr[i][j] = in.nextInt();
	            }
	        }
	        */
	        for(int i=0; i<4; i++){
	            for(int j=0; j<4; j++){
	             temp = arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
	                
	                if(temp>max)max=temp;
	            }
	        }
	        
	        System.out.println(max);
	        
	        
	    }
	


}
