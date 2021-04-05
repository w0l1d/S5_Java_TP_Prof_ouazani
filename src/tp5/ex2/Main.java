package tp5.ex2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		float random_float;
		int max = 100, min = 3;
		String[] colors = {"vert", "noir", "orange", "jaune", "maron", "rouge"}; 
		int ran_int, c, x;
		for(int i = 2; i<26; i++) {
			random_float = (float) (Math.random() * (max - min + 1) + min);
			x = (int)random_float;
			c = (int)(random_float * 10);
			random_float = (float) (x + c*0.1);
			
			ran_int = (int) (Math.random() * (5 - 0 + 1) + 0);
			System.out.println("insert into piece values ("+i+", 'P"+i+"', '"+ colors[ran_int] +"', " +random_float +");");
			
			
		}
		
		
	}

}
