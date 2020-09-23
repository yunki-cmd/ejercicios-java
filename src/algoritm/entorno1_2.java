package algoritm;

import java.util.Scanner;

public class entorno1_2 {
    

    public static void menoresNoDivisores(int num){
        for (int i = 1; i < num; i++) {
            if(num%i!=0){
                System.out.print(i+" ");
            }
        }
        
    }


    public static void main(String[] args) {
        int numero=0;
        Scanner input=new Scanner(System.in);
        numero=input.nextInt();
        menoresNoDivisores(numero);
        input.close();
        
            
        }
    


}