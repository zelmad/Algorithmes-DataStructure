import java.util.*;

public class Dog{
	String name;
	String breed;
	int age;
	String color;
	public Dog(String name, String breed, int age, String color){
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	public String getname(){
		return name;
	}
	public String getbreed(){
		return breed;
	}
	public int getage(){
		return age;
	}
	public String getcolor(){
		return color;
	}
	@Override
	public String toString(){
		return("hi my name is " +this.getname()+" and my breed is "+this.getbreed()+" and i have "+this.getage()+" years old, my color is "+this.color);
	}

	public static void main(String[] args){
		Dog linda = new Dog("linda", "zel", 6, "reed");
		System.out.println(linda.toString());
	}
}