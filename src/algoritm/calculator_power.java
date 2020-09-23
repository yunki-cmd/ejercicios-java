package algoritm;

import java.util.Scanner;

public class calculator_power {




	public static final Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (in.hasNextInt()) {
			int n = in.nextInt();
			int p = in.nextInt();

			try {
				System.out.println(power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	static public int power(int n, int p) throws Exception {
		if ((n >= 0 && p > 0) || (n > 0 && p == 0)) {
			int result;
			result = (int) Math.pow(n, p);
			return result;
		} else if (n < 0 || p < 0) {
			throw new Exception("n or p should not be negative.");
		} else if (n == 0 && p == 0) {
			throw new Exception("n and p should not be zero.");
		}
		return (Integer) null;
	}

}
