import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	static private int[] testScores;

    Student(String firstName, String lastName, int id, int[] testScores){
        super(firstName, lastName, id);
		
        this.testScores = testScores;
    }

    static char calculate(){
        int sum = 0;
        for(int testScore : testScores) sum+=testScore; 
		
        int moy = sum / testScores.length;
		
        if(moy >=90 && moy <= 100) return 'O';
        if( moy >=80 && moy < 90) return 'E';
        if( moy >=70 && moy < 80)return 'A';
        if( moy >=55 && moy < 70) return 'P';
        if( moy >=40 && moy < 55)return 'D';
        return 'T';
    } 
}
public class Inheratenace {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}