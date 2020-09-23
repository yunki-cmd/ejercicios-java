package algoritm;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class nubesdeenma {
 


    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
        int saltos = 0;
        int limite = c.length-1;
        for (int i = limite; i >= 1;) {
            if (i >= 2) {
                if (c[i - 1] == 0) {
                    if (c[i - 2] == 1) {
                        i = i - 1;
                        saltos++;
                    } else {
                        i = i - 2;
                        saltos++;
                    }
                } else {
                    i = i - 2;
                    saltos++;
                }
            } else {
                if (c[i - 1] == 1) {
                    i = 1 - 2;
                    saltos++;
                } else {
                    i = i - 1;
                    saltos++;
                }
            }
        }

        return saltos;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        int[] c = new int[n];

        for (int i = 0; i < n; i++) {
            c[i] = scanner.nextInt();
        }

        int result = jumpingOnClouds(c);
        System.out.println(result);


        scanner.close();
    }
}

