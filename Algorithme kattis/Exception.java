import java.io.*;

public class Exception{
	public static void main(String[] args) throws IOException{

		FileReader file = new FileReader("\\Desktop\\file.txt");
		BufferedReader fileinput = new BufferedReader(file);
		for(int count = 0 ; count < 3; count++){
			System.out.println(fileinput.readLine());
		}
		fileinput.close();
	}
}