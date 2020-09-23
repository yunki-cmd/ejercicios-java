package algoritm;

class recursividad{
    public static void main(final String[] args) {
        
        // n=n*(n-1)!
        int n=5;
        int r=0;
        r=numero(n);
        System.out.println(r);
    }   

    static int numero(int n){
        int r;
        if (n==1){
            return n;
        }else{
                r=n*numero(n-1);
            }
        return r;
    }
}