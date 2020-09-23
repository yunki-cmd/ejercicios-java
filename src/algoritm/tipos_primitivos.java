package algoritm;

import java.util.Scanner;
public class tipos_primitivos {

    public static void main(String []argh)
    {

        // el ejercicios consisten en sacar los tipòs de primitivos que se puede guardar con los datos introducidos

        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
            long x=sc.nextLong();
            System.out.println(x+" can be fitted in:");
            if(x>=-128 && x<=127)System.out.println("* byte");
            if(x>=-32768 && x<=32767) System.out.println("* short");
            if(x>=Math.pow(-2,31) && x<=Math.pow(2,31)-1) System.out.println("* int");
            if(x>=Math.pow(-2,63) && x<=Math.pow(2,63)-1) System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
        sc.close();
    }


}

/**
 *  datos ejemplo de entrada 
22
0
1
-1
18446744073709551616
-18446744073709551616
18446744073709551615
-18446744073709551616
32768
-32768
32767
-32767
2147483648
2147483647
-2147483648
-2147483647
128
127
-128
-127{-truncated-}
 * 
 * 
 * datos de salida
 * 0 can be fitted in:
* byte
* short
* int
* long
1 can be fitted in:
* byte
* short
* int
* long
-1 can be fitted in:
* byte
* short
* int
* long
18446744073709551616 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
18446744073709551615 can't be fitted anywhere.
-18446744073709551616 can't be fitted anywhere.
32768 can be fitted in:
* int
* long
-32768 can be fitted in:
* short
* int
* long
32767 can be fitted in:
* short
* int
* long
-32767 can be fitted in:
* short
* int
* long
2147483648 can be fitted in:
* long
2147483647 can be fitted in:
* int
* long
-2147483648 can be fitted in:
* int
* long
-2147483647 can be fitted in:
* int
* long
128 can be fitted in:
* short
* int
* long
127 can be fitted in:
* byte
* short
* int
* long
-128 can be fitted in:
* byte
* short
* int
* long
-127{-truncated-}
 * 
 * 
 * 
 */