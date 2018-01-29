//created by zelmad mohamed.
//import util library.

import java.util.*;

public class TreeMapImpl{
	//frequency fonction.
	
	static void printFrequency(int[] arr)
	{
		TreeMap<Integer, Integer> tmap = new TreeMap<Integer, Integer>();
		for(int i =0 ; i<arr.length; i++){
			
			Integer c = tmap.get(arr[i]);
			
			if(c == null){
				tmap.put(arr[i], 1);
			}
			else{
				tmap.put(arr[i], ++c);
			}
		}
		for(Map.Entry g : tmap.entrySet()){
			System.out.println("Frequency of "+ g.getKey()+ " is "+ g.getValue()+".");
		}
	}
	//this is the principale method.
	
	public static void main(String[] args){
		int[] arr={10, 30, 35, 10, 5, 10, 5};
		printFrequency(arr);
	}
}