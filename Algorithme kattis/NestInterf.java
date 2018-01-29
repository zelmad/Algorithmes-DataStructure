import java.util.*;
import java.io.*;

interface Test{
	protected interface Yes{
		void show();
	}
}

class Inter  implements Test.Yes{

	public void show(){
		System.out.println("i'm the public function");
	}
}
public class NestInterf{

	
	public static void main(String[] args){

		Test.Yes obj;
		Inter cla = new Inter();
		obj = cla;
		obj.show();
	} 
}