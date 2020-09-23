import java.io.*;
import java.util.*;

public class String_prueba {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String subString="";
        char a[]=new char[A.length()];
        for (int i = 0, j=A.length()-1; j >=0;i++,j--) {
            a[i]=A.charAt(j);
        }
        for (int i = 0; i < a.length; i++) {
            subString=subString+a[i];
        }
        if(subString.compareToIgnoreCase(A)==0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }




   /* 
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String substring=s.substring(0, k);
        smallest=substring;
        largest=substring;
        for (int i = 1; i <=s.length()-k ; i++) {
            substring=s.substring(i, i+k);
            if(substring.compareTo(smallest)<0){
                smallest=substring;
            }
            if(substring.compareTo(largest)>0){
                largest=substring;
            }
        }
        return smallest + "\n" + largest;
    }





       
        public static String getSmallestAndLargest(String s, int k) {
            String smallest = "";
            String largest = "";
            String sub[]=new String[s.length()];
            int ocupados=0;
            // separar el string en sus compoenente por substring
            int aux=k;
            for (int i = 0; i < s.length();i++) {
                sub[i]=s.substring(i, aux);
                ocupados=i;
                if((aux-i==k)&& aux<s.length()){
                    aux++;
                }else if(aux==s.length()){
                    i=s.length();
                }
                
            }
            //order alfabeticamente
           
                for(int j=0;j<ocupados;j++) {
                    for(int i=0;i<ocupados;i++) {
                        if (sub[i].compareTo(sub[i])>0) {
                            String aux1;
                            aux1=sub[i];
                            sub[i]=sub[i+1];
                            sub[i+1]=aux1;
                        }
                    }
                }
            smallest=sub[ocupados];
            largest=sub[0];
            
            return smallest + "\n" + largest;
        }
    
    
        public static void main(String[] args) {
           
          
            System.out.println(getSmallestAndLargest("welcomeToJava", 3));
        
        
        
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start, end));
        */


        /*
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if((A.compareTo(B)<0)||(A.compareTo(B)==0)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        A=A.substring(0,1).toUpperCase()+A.substring(1);
        B=B.substring(0, 1).toUpperCase()+B.substring(1);
        System.out.println(A+" "+B);
        sc.close();
        */
    
}
