package tp1;

public class Main {


	public void triangle(int n) {
		int[][] m = new int[n][];
		for (int i =0; i<n; i++)
			m[i] = new int[i+1];

		System.out.println(" ");
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++){
				if (i==j || j==0)
					m[i][j] = 1;
				else
					m[i][j] = m[i-1][j-1] + m[i-1][j];
				System.out.print(m[i][j]);
			}
			System.out.println(" ");
		}



	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
