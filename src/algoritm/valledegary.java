package algoritm;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class valledegary {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
       int bajada=0;
       int camino=s.length();
        int valle=0;
        for (int i = camino, j=0; i >= 0; i--,j++) {
            if(s.charAt(j) == ('U')) {
                bajada++;
            }
            if(s.charAt(j) == ('D')) {
                bajada--;
            }
            if(bajada==0 && s.charAt(j)=='U'){
                valle++;
            }
        }
        return valle;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
