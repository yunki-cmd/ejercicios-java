package algoritm;

import java.util.Scanner;

public class entorno2_2 {
    static Scanner input=new Scanner(System.in);
    public static void meterdatos(int a[]){
        int limite=a.length;
        for (int i = 0; i < limite; i++) {
            a[i]=input.nextInt();
        }
        // ordenar los datos de menor a mayor
        int aux;
        for (int i = 0; i < limite; i++) {
            for (int j =0 ; j <limite; j++) {
                if(a[i]<a[j]){
                    aux=a[j];
                    a[j]=a[i];
                    a[i]=aux;
                }
            }
        }


    }
    public static void losdivisores(int a[]){
        int limite=a.length-1;
        for (int i = limite; i >=0; i--) {
            for (int j = i-1; j >=0; j--) {
                if(a[i]%a[j]==0){
                    System.out.println(a[j]+" es divisor de "+a[i]);
                }
            }
        }
    }



    public static void main(String[] args) {
        int array[]=new int [4];
        meterdatos(array);
        losdivisores(array);
        

    }



}