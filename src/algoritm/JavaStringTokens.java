package algoritm;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaStringTokens {

    public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            String patter = in.nextLine();
            try {
                Pattern pat=Pattern.compile(patter);
                System.out.println("Valid");
            } catch (Exception e) {
                System.out.println("Invalid");
            }
              testCases--;
		}
	}






   /* public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        scan.close();
        
        if(s.length() == 0){
            System.out.println(0);
        }
        else{
            // Strip out non-word characters and replace with whitespace, trim leading/trailing whitespace
            s = s.replaceAll("[^\\p{Alpha}]+", " ").trim();
            
            if(s.isEmpty()) {
                // String contains no valid tokens
                System.out.println(0);
            }
            else {
                // Split the string into valid tokens
                String[] strings = s.split("\\p{Space}+");
                
                // Print number of tokens
                System.out.println(strings.length);
                
                // Print each token
                for(String str : strings){
                    System.out.println(str);
                }
            }
        }
    } */












/*    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        String a="";
        s = s.replaceAll("\\s", ",");
        s = s.replaceAll("[!?._'@]", ",");
        String S[] = s.split("[!?,._'@]");
        for (int i = 0; i < S.length; i++) {
            if (S[i].equalsIgnoreCase("")==false) {
                 a= a + S[i] + " ";
            }
        }
        String A[]=a.split(" ");
        System.out.println(A.length);
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }
        scan.close();
    } */
}