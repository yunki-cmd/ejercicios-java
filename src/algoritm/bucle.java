package algoritm;

import java.util.Scanner;

public class bucle {
	   public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	            int resul = 0;
	            for (int j = 0; j <n; j++) {
	            	if(j==0) {
	            		resul=(int)(a+Math.pow(2, j)*b);
	            		System.out.print(resul+" ");
	            	}
	            	if(j>0) {
					resul=(int) (resul+(Math.pow(2, j)*b));
					System.out.print(resul+" ");
	            	}
	            	if(j==n-1) {
	            		System.out.println("");
	            	}
				}
	            
	        }
	        in.close();
	    }
}
