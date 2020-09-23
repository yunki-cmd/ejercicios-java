package algoritm;

import java.io.*;
import java.util.*;

public class java_subarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int des = input.nextInt();
        int array[] = new int[des];
        for (int i = 0; i < des; i++) {
            array[i] = input.nextInt();
        }
        int result = 0;
        for (int i = 0; i < des; i++) {
            for (int j = i; j < des; j++) {
                int aux = 0;
                for (int k = i; k <= j; k++) {
                    aux = aux + array[k];
                }
                if(aux<0) result++;
            }
        }

        System.out.println(result);
        input.close();
    }

}
