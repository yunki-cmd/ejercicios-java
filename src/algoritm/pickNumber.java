package algoritm;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
public class pickNumber {


    static class Result {

        /*
         * Complete the 'pickingNumbers' function below.
         *
         * The function is expected to return an INTEGER. The function accepts
         * INTEGER_ARRAY a as parameter.
         */

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

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.pickingNumbers(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

