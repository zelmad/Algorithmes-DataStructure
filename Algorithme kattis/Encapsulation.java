public class Encapsulation{

	public static void main(String[] args){

		TestEncapsulation obj = new TestEncapsulation();
		obj.setName("mostapha");
		obj.setAge(18);
		obj.setRol(2);

		System.out.println("le nom est "+obj.getName());
		System.out.println("l'age de mus est "+obj.getAge());
		System.out.println("le role de mus est "+obj.getRol());

	}
}
class TestEncapsulation{

	public String geeckname;
	public int geeckage;
	public int geeckrol;

	public String getName(){
		return geeckname;
	}
	public int getAge(){
		return geeckage;
	}
	public int getRol(){
		return geeckrol;
	}
	public void setName(String newName){
		geeckname = newName;
	}
	public void setAge(int newage){
		geeckage = newage;
	}
	public void setRol(int newrol){
		geeckrol = newrol;
	}
}
