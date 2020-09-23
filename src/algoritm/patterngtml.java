import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class patterngtml {
	public static void main(String[] args){
		
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
            boolean empa=false;
			String line = in.nextLine();
            String re="<(.+)>([^<]+)<\\/\\1>";
            Pattern regex=Pattern.compile(re);
            Matcher m = regex.matcher(line);
			while(m.find()){
                System.out.println(m.group(2));
                empa=true;
                
            }
            if(!empa){
                System.out.println("None");
            }
			testCases--;
		}
	}
}

