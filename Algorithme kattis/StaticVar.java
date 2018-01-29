public class StaticVar{

	static int a = m1();
	static int b;
	static int r = 1;
	static{
		System.out.println("je suis un amazigh");
		b = r*10;
	}
	static int m1(){

		System.out.println("je ne suis que fier de l'etre");
		return 12;
	}
	public static void main(String[]args){
		System.out.println(a + " sded ");
	}
}