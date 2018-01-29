import java.io.*;
import java.util.*;

public class Binarystring {

    Binarystring(Integer integ, Integer integer){
        //String binaryInteger = Integer.toBinaryString(integer);
		for(int i=0; i<integ ; i++){
			int tmp = i & integer;
			System.out.println( Integer.toBinaryString(i) + " AND " + Integer.toBinaryString(integer) 
                + " = " + Integer.toBinaryString(tmp) + " = " + tmp );
		}
            // Perform a bitwise operation using byte and integer operands, save result as tmp:
             
            
    }
    
    public static void main(String[] args) {
        new Binarystring(5, 2);
    }
}