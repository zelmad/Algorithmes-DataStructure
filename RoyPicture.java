
import java.util.Scanner;

public class RoyPicture {
	
	public static void main(String[] args){
		
        Scanner scanner = new Scanner(System.in);
		
		int minDimens = scanner.nextInt();
		int numbPhoto = scanner.nextInt();
		
		for(int i=0; i<numbPhoto; i++){
			
			int width = scanner.nextInt();
			int height = scanner.nextInt();
			
			if( width < minDimens || height < minDimens ){
				
				System.out.println("UPLOAD ANOTHER");
			}
			if(width >= minDimens && height >= minDimens){
				if(width == height){
					System.out.println("ACCEPTED");
				}
				else{
					System.out.println("CROP IT");
				}
		}
	}
}
