package tp2.ex2;

public class TestStatic {
	
	public static void main(String[] args) {
		ExStatic obj1 = new ExStatic();
		obj1.n+=4;
		System.out.println(obj1.n);
		
		ExStatic obj2 = new ExStatic();
		System.out.println(obj2.n);
		
		
	}
	
}
