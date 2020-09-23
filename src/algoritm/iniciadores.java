package algoritm;

import java.util.Scanner;
public class iniciadores {
        static int B,H;
        static boolean flag;
        static Scanner input=new Scanner(System.in);
        static{
        B=input.nextInt();
        H=input.nextInt();
        if((B>=1) && (H>=1))
            if(B<=100 && H<=100){
                flag=true;
            }else{
                System.out.println("introduzca numeros mayores de 0");
            }
        
        }

public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main


}