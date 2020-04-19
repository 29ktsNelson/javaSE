package day4;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle();
	}

	public static void triangle() {
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
