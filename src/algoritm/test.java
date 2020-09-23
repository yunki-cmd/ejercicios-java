package algoritm;

public class test {
    static String catAndMouse(int x, int y, int z) {
        for (int i = 0; i < z;) {
            if (x > z) {
                x--;
            } else {
                x++;
            }
            if (y > z) {
                y--;
            } else {
                y++;
            }
            if (x == z || y == z) {
                break;
            }
        }
        if (x == z && y == z) {
            return "Mouse C";
        }
        if (x == z) {
            return "Cat A";
        } else {
            return "Cat B";
        }
    }
    public static int pickingNumbers(int a[] ) {
        int limite = a.length;
        int aux = 0;
        int aux1 = 0;
        int aux2 = 0;
        int longitud = 0;
        int longitud_max = 0;
        for (int i = 0; i < limite; i++) {
            aux = a[i];
            aux1 = aux - 1;
            aux2 = aux + 1;
            for (int j = 0; j < limite; j++) {
                if(a[j]==aux || a[j]==aux1){
                    longitud++;
                }
            }
            if (longitud_max <= longitud) {
                longitud_max = longitud;
            }
            longitud = 0;
            for (int j = 0; j < limite; j++) {
                if(a[j]==aux || a[j]==aux2){
                    longitud++;
                }
            }
            if (longitud_max <= longitud) {
                longitud_max = longitud;
            }
            longitud = 0;
        }
        return longitud_max;
    }
   
    static int pageCount(int a, int b) {
        int dela = 0;
        int detras = 0;
        for (int i = 1; i < b; i += 2) {
            dela++;
        }
        if (a % 2 == 0) {
            for (int i = a; i > b; i -= 2) {
                detras++;
            }
        } else {
            for (int i = a; i > b + 1; i -= 2) {
                detras++;
            }
        }
        if (detras > dela) {
            return dela;
        } else {
            return detras;
        }
    }


    public static void main(String[] args) {
      /*  int x,y,z;
        x=21;
        y=80;
        z=4;
        System.out.println(catAndMouse(x, y, z));
        */
        int test[]={4,2, 3, 4, 4, 9, 98, 98, 3, 3, 3, 4,
             2, 98, 1, 98, 98, 1, 1, 4, 98, 2, 98, 3, 9, 9, 3, 1, 4, 1, 98,
              9, 9, 2, 9, 4, 2, 2, 9, 98, 4, 98, 1, 3, 4, 9, 1, 98, 98, 4, 2,
              3, 98, 98, 1, 99, 9, 98, 98, 3, 98, 98, 4, 98, 2, 98, 4, 2, 1, 1, 9, 2, 4};
            System.out.println(pickingNumbers(test));
        //System.out.println(pageCount(5, 1));
    }
}