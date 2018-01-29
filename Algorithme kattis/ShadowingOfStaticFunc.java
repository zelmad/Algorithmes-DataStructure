class a{
	static void run(){
		System.out.println("a.run()");
	}
}

class b extends a{
	static void run(){
		System.out.println("b.run()");
	}
}

public class ShadowingOfStaticFunc{
	public static void main(String[] args){
		a nm = new b();
		nm.run();
	}
}