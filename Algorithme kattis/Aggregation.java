import java.util.*;
import java.io.*;


class Students{

	String name;
	int id;
	String dept;

	Students(String name, int id, String dept){
		this.name = name;
		this.id = id;
		this.dept = dept;
	}
}

class Departement{

	String nameOfDeprt;
	private List<Students> listOfStudent;

	Departement(String nameOfDeprt, List<Students> listOfStudent){
		this.nameOfDeprt = nameOfDeprt;
		this.listOfStudent = listOfStudent;
	}

	public List<Students> getStudent(){
		return listOfStudent;
	}
}

class Institut{

	String name;
	List<Departement> departements;

	Institut(String name, List<Departement> departements){

		this.name = name;
		this.departements = departements;
	}

	public int totalstudent(){

		int nbrOfStudent = 0;
		List<Students> students;

		for(Departement dep : departements){
			students = dep.getStudent();

			for(Students stud : students){
				nbrOfStudent++;
			}
		}
		return nbrOfStudent;
	}
}

public class Aggregation{

	public static void main(String[] args){

		Students s1 = new Students("Mia", 1, "CSE");
		Students s2 = new Students("Priya", 2, "CSE");
		Students s3 = new Students("John", 1, "EE");
		Students s4 = new Students("Rahul", 2, "EE");
		Students s5 = new Students("Mia", 1, "CSE");
		Students s6 = new Students("Priya", 2, "CSE");
		Students s7 = new Students("John", 1, "EE");
		Students s8 = new Students("Rahul", 2, "EE");

		List<Students>  csee_students = new ArrayList<Students>();
		csee_students.add(s1);
		csee_students.add(s2);
		csee_students.add(s5);
		csee_students.add(s6);

		List<Students> ee_students = new ArrayList<Students>();
		ee_students.add(s3);
		ee_students.add(s4);
		ee_students.add(s7);
		ee_students.add(s8);

		Departement csee = new Departement("csee", csee_students);
		Departement ee = new Departement("ee", ee_students);

		List<Departement>  Departements = new ArrayList<Departement>();
		Departements.add(csee);
		Departements.add(ee);

		Institut institus = new Institut("Bretagne", Departements);

		System.out.println("total student in the institut is");
		System.out.print(institus.totalstudent());
	}
}