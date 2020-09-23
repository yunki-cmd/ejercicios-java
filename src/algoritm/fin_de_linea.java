package algoritm;

import java.util.Scanner;
public class fin_de_linea {




    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int aux=1;
        do
        {
            String lineas=entrada.nextLine();
            System.out.println(aux + " " + lineas);
            aux++;
        } while (entrada.hasNext()==true);
        entrada.close();
    }
    

}