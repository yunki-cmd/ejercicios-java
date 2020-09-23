package algoritm;

import java.util.Scanner;
public class iniciar {

	 static int B;
     static int H;
     static boolean flag=false;
     static Scanner input=new Scanner(System.in);
     static {
          B=input.nextInt();
          H=input.nextInt();
          if((B>=1) && (H>=1)){
              if((B<=100) && (H<=100)){
                  flag=true;
              }
          }
          else {
              System.out.println("java.lang.Exception: Breadth and height must be positive");
          }
    
     }


	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			
		}//end of main


	
	

}
