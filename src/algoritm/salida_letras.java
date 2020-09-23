package algoritm;
import java.util.Scanner;
public class salida_letras {

		public static void main(String[] args) {
	            Scanner sc=new Scanner(System.in);
	            System.out.println("================================");
	            for(int i=0;i<3;i++)
	            {
	                String s1=sc.next();
	                int x=sc.nextInt();
	                int espacio=15-s1.length();
	                if(s1.length()<=10 && x<1000) {
	                        for (int j = 0; j<espacio; j++) {
	                            if(j<15) {
	                                s1=s1.concat(" ");
	                            }
	                            
	                        }
	                        if(x<10) {
	                            System.out.println(s1+"00"+x);
	                        }
	                        if(x<100) {
	                            if(x>=10) {
	                                System.out.println(s1+"0"+x);
	                                }
	                        }
	                        if(x>=100){
	                            System.out.println(s1+x);
	                        }
	                    }
	                
	            }
	            System.out.println("================================");

	    sc.close();
	}
}
