package algoritm;

public class goodstring {
    public static void main(String[] args) {
        String prueba="leEeetcode";
        String prueba2=makegood(prueba);
        System.out.println(prueba2);


    }
    static String makegood(String s){
        boolean ch=true;   
        while(ch){
           ch=false;
           String t=s;
           for (int i = 0; i < s.length()-1; i++) {
               char a=Character.toUpperCase(s.charAt(i));
               char b=Character.toUpperCase(s.charAt(i+1));
               if(a==s.charAt(i+1)||b==s.charAt(i)){
                 t=s.substring(0, i)+s.substring(i+2);
                 ch=true;
                 break;
               }
           } 
           s=t;
        }
        return s;


    }




}