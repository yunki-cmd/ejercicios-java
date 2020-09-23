package algoritm;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class spliter {
    public static void main(String[] args) {
        String cadena = "000.12.12.034";
        Pattern pat = Pattern.compile(
                "^([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])[.]([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])[.]([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])[.]([01]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])$");
        Matcher mat = pat.matcher(cadena);
        if (mat.matches()) {
            System.out.println("es una ip");
        } else {
            System.out.println("no es una ip");
        }
    }

}