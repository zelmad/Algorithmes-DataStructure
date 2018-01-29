import java.util.*;
import java.io.*;

interface Age{

	int x = 10;
	void getAge();
}
public class AnonymClass{
	public static void main(String[] args){
		Age obj = new Age(){
			@Override
			public void getAge(){
				System.out.println("the age is = "+x);
			}
		};
		obj.getAge();
	}
}
