import java.util.*;
import java.util.function.Predicate;

class Training{
	public static void main(String[] args){
		List<String> names = Arrays.asList("Geeck", "for", "Geecks","Graound");
		Predicate<String> p = (s) -> s.startsWith("f");
		for(String st:names){
			if(p.test(st)){
				System.out.println(st);
			}
		}
	}
}