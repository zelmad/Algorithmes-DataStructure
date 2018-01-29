import java.io.*;

public class Association{

	public static void main(String[] args){
		Bank bank = new Bank("Bank populaire");
		Employer employer = new Employer("Aziz");

		System.out.println(employer.getEmployerName()+" est un comptable de la "+bank.getBAnkName());
	}
}
class Bank{

	String name;

	Bank(String name){
		this.name = name;
	}

	public String getBAnkName(){
		return this.name;
	}
}
class Employer{

	String name;
	Employer(String name){
		this.name = name;
	}
	public String getEmployerName(){
		return this.name;
	}

}