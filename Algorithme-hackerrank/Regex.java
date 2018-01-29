import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner clv = new Scanner(System.in);
		int a = clv.nextInt();
		String regex = ".+@gmail\\.com$";
		Pattern pattern = Pattern.compile(regex);
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<a; i++){
			String name = clv.next();
			String email = clv.next();
			Matcher match = pattern.matcher(email);
			if(match.find()){
				list.add(name);
			}
		}
		Collections.sort(list);
		list.forEach(System.out::println);
    }
}