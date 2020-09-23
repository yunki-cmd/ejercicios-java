package algoritm;

public class fibonassi_recursive {
    public static void main(String[] args) {
        int f;
        f = 5;
        f=fibo(f);
        System.out.println(f);
    }

    static int fibo(int a) {
       if(a==1)return a;
       if(a==2)return a;
       if(a>1){
        int f1=fibo(a-1);
        int f2=fibo(a-2);
        return f1+f2;
        };
        return 1;

       }

}