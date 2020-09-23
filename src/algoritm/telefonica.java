package algoritm;

import java.util.Scanner;

public class telefonica {

    public static int sinuno(String a) throws Exception {
        int num = 0;
        if (a.contains("1")) {
            throw new Exception("Error uno incluido");
        } else {
            num = Integer.parseInt(a.substring(0, 1));
            return num;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        String prueba;
        prueba = input.nextLine();
        int num=0;
        try {
            num = sinuno(prueba);
        } catch (Exception e) {
           System.out.println("error uno");
        }
        System.out.println(num);
        input.close();

/*
    boolean ciclo1=false;
    int nume=0;
    System.out.println("numero");
    nume=input.nextInt();
    char abe[][]={{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j','k','l'},{'m','n','o'},
    {'p','q','r'},{'s','t','u'},{'v','w','y'}};  // j=3   i=8
        
       while(ciclo1=false){
           
        boolean ciclo2=false;
            while(ciclo2=false){
                
            }


       }
        */

    }
}