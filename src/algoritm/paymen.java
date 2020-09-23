package algoritm;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class paymen {
	    
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        double payment = scanner.nextDouble();
	        scanner.close();
	        Locale ind=new Locale("en", "IN");
	        NumberFormat formato=NumberFormat.getCurrencyInstance(Locale.US);
	        String us,india,china,france;
	        us=formato.format(payment);
	        System.out.println("US: " + us);
	        
	       formato=NumberFormat.getCurrencyInstance(ind);
	        india=formato.format(payment);
	        System.out.println("India: " + india);
	        Locale.setDefault(Locale.CHINA);
	       formato= NumberFormat.getCurrencyInstance(Locale.CHINA);
	        china=formato.format(payment);
	        System.out.println("China: " + china);
	        formato=NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        france=formato.format(payment);
	        System.out.println("France: " + france);
	    }
	}