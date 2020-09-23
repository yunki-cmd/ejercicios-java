package algoritm;


import java.util.Scanner;

public class Java_Anagrams {
    static boolean isAnagram(String a, String b) {
        a=a.substring(0, 1).toLowerCase()+a.substring(1).toLowerCase();
        b=b.substring(0, 1).toLowerCase()+b.substring(1).toLowerCase();
        char A[]=a.toCharArray();
        char B[]=b.toCharArray();
        int aux=0;
        if(a.length()!=b.length()|| a.length()<=0 || b.length()<=0){
            return false;
        }else{
          for (int i = 0; i < A.length; i++) {
              for (int j = 0; j < B.length; j++) {
                  if(A[i]==B[j]){
                      A[i]=' ';
                      B[j]=' ';
                      j=B.length;
                  }
              }

              }
              for (int i = 0; i < B.length; i++) {
                  if(A[i]==B[i]){
                    aux++;
                  }
              }
              if(aux==A.length)return true;
          }

        return false;
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}