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

public class fecha_hackrank {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int month = input.nextInt();

        int day = input.nextInt();

        int year = input.nextInt();

        String res = findDay(month, day, year);
        System.out.println(res);
        input.close();
        
    }

    public static String findDay(int month, int day, int year) {
        Calendar cale=Calendar.getInstance();
        cale.set(year, month-1, day);
        Date da=cale.getTime();
        int dias=da.getDay();
        String dia=null;
        if(dias==0)dia="Sunday";
        if(dias==1)dia="Monday";
        if(dias==2)dia="Tuesday";
        if(dias==3)dia="Wednesday";
        if(dias==4)dia="Thursday";
        if(dias==5)dia="Friday";
        if(dias==6)dia="Saturday";
        return dia;
 }
}
