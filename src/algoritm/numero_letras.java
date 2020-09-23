package algoritm;

import java.util.Scanner;

public class numero_letras {

    public static int posi(int a, int b) {

        if (a == 2 && b==-1) {
            b = 2;
        }
        if (a < 0) {
            b--;
        }
        return b;
    }

    public static int comprobar(int a) {
        if (a == -1) {
            a = 2;
        }
        return a;
    }

    public static void main(String[] args) {
        // pedimos los numeros
        Scanner input = new Scanner(System.in);
        // son 7 numeros:
        int num[] = new int[4];

        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
            if (num[i] == 1) {
                System.out.println("uno no es valido vuelva a introducir otro numero valido");
                i--;
            }
        }
        char abe[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' }, { 'j', 'k', 'l' }, { 'm', 'n', 'o' },
                { 'p', 'q', 'r' }, { 's', 't', 'u' }, { 'v', 'w', 'y' } }; // j=3 i=8
        int ultiposi = 2;
        int posi2 = 2, posi1 = 2, posi3 = 2;
        boolean repe = true;
        while (repe == true) {

            System.out.println(abe[num[0] - 2][posi1] + "" + abe[num[1] - 2][posi2] + abe[num[2] - 2][posi3] + ""
                    + abe[num[3] - 2][ultiposi] + "");
            ultiposi--;
            posi3 = posi(ultiposi, posi3);
            posi2 = posi(posi3, posi2);
            posi1 = posi(posi2, posi1);
            posi3=comprobar(posi3);
            posi2=comprobar(posi2);
            if (ultiposi < 0) {
                ultiposi = 2;
            }

        }
        input.close();

    }

}