
import java.io.*;

class ManhattanTest {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the value of N");
		int N = Integer.parseInt(br.readLine());
		
		ManhattanTest.fizzBuzz(N);
	}

	public static void fizzBuzz(int N) throws IOException {

		for (int i = 0; i <= N; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.println("Manhattan associates");
			} else {
				if ((i % 3) == 0) {
					System.out.println("Manhattan");
				}
				if ((i % 5) == 0) {
					System.out.println("associates");
				}
				if ((i % 3 != 0) && (i % 5 != 0)) {
					System.out.println(i);
				}

			}
		}

	}
}