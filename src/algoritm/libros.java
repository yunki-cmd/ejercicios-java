package algoritm;

import java.util.Scanner;

public class libros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println(eje2(a,b));
        sc.close();
        
    }
    public static int eje2(int n, int p){
      int inicio=0;
      int fin=0;
        for (int i = p; i>1; i-=2) {
            if(i>1){
              inicio++;      
            }
        }
        for (int i = p; i<=n; i+=2) {
            if(i<=n){
                fin++;
            }
        }
        if(inicio<fin){
            return inicio;
        }else if(fin<=inicio){
            return fin;
        }
        else return fin;

    }
    public static int eje(int n,int p){
        int pagefin;
        int pagein;
        pagefin=(n-1)-(p);
        pagefin/=2;
        pagein=p-1;
        pagein/=2;
        if(pagefin>=pagein){
        
            return pagefin;
        }else{
            return pagefin;
        }
    }
}