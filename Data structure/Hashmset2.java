import java.util.*;
public class Hashmset2{
	/*static int function(int a, int b){
		int somme;
		somme = a + b;
		return somme;
	}*/
	public static void main(String[] args){
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("code", "java");
		hm.put("plateforme", "Geecksforgeecks");
		hm.put("kind", "jstandar");
		
		System.out.print("elements of hmh ="+hm);
		System.out.println();
		Set<Map.Entry<String, String>> mappingmap = hm.entrySet();
		
		System.out.print("Set of keys and values using entrySet() ="+mappingmap);
		System.out.println();
		
		if(hm.containsKey("code")){
			System.out.println("testing existence of value of the code key ="+hm.get("code"));
		}
		Set<String> keys = hm.keySet();
		System.out.println("Initial keys : "+ keys);
		Collection<String> value = hm.values();
		System.out.println("initial values :"+ value);
		System.out.println("Using getOrDefault :"+hm.getOrDefault("code", "javaArticle"));
		System.out.println("Using getOrDefault :"+hm.getOrDefault("search", "javaArticle"));
		hm.putIfAbsent("code", "mama i like you");
		System.out.println("how work putIfAbsent :"+hm);
		hm.putIfAbsent("search", "mama i like you");
		System.out.println("how work putIfAbsent :"+hm);
		// using of iterator() to get all elets.
		Iterator<Map.Entry<String, String>> hm_iterator = hm.entrySet().iterator();
		
		while(hm_iterator.hasNext()){
			Map.Entry<String, String> entry = hm_iterator.next();
			System.out.println(entry);
			hm_iterator.remove();
			System.out.println("Set of keys and values :"+mappingmap);
		}
		//System.out.println(function(2, 8));
	}
}