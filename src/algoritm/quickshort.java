package algoritm;

public class quickshort {

    public static void main(String[] args) {
        
        int a[]={5,6,98,41,52,41,5,4,7};
        a=quickshor(a,0,8);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

        static int[] quickshor(int a[],int izquierda, int derecha){
           //por cada recursion se comprueba que ambas lados no haya coincidido
            if(izquierda>=derecha){
                return a;}
             int i=izquierda,j=derecha; // variable que sirve de puntero
            if(izquierda!=derecha){
            // declaracion de los variables necesarios
            int pivote=izquierda; // el pivote donde se incia desde la izquierda 
            //del array es decir el lado 0
            int aux; // variable auxilar para intercambiar
            //bucle while que lo que busca es las variable menor y mayor que el pivote
            while(izquierda!=derecha){
                //se ejecuta el bucle siempre que ambos lados no coincida
                //bucle que comienza en el lado derecho y busca el numero mayor
                //el pivote
                System.out.print("pivote "+a[pivote]+" ");
                imprimir(a);
                while (a[derecha] >= a[pivote] && izquierda<derecha) {
                    derecha--;
                }
                //bucle que empieza por el lado izq y busca el numero menor que el pivote
                while (a[izquierda] < a[pivote] && izquierda<derecha) {
                    izquierda++;
                }
                // si se da el hecho lo intermcambia
                if (derecha != izquierda) {
                    aux = a[derecha];
                    a[derecha] = a[izquierda];
                    a[izquierda] = aux;
                }
            }
            // intercambio de pivote
            
            if(izquierda==derecha){
                quickshor(a, i, izquierda-1);//izquierda que se queda en el bucle
                quickshor(a, izquierda+1, j);// variable que se queda en el bucle
                //asi se parte el array en partes mas pequeñas
            }
            }else{
                return a;
            }
            return a;
        }
        static void imprimir(int a[]){
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[j]+" ");
                if(j==a.length-1){
                    System.out.println(" ");
                }
            }
        }
}