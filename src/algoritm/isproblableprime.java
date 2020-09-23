package algoritm;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class isproblableprime {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		String n = scanner.nextLine();

		BigInteger pr = new BigInteger(n);

		// el parametro a introducir en el metodo isprobableprime es la certeza de que sea realmente primo
		if (pr.isProbablePrime(100) == true) {
			System.out.println("prime");
		}else {
			System.out.println("not prime");
		}

		scanner.close();
	}

}
