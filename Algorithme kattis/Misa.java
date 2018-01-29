import java.util.*;
public class Misa{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		//scanner.next();
		String s = "";
		for(int i = 0; i<a; i++){
			String line = scanner.next();
			s += line;
		}
		System.out.println(s);
		int sum = 0;
		for(int j=0;j<s.length() ; j++){
			if(s.charAt(j)=='o'){
				sum += 1;
			}
		}
		System.out.print(sum);
	}
}