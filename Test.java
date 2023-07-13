package Lab_3;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter input size n");
			int n = sc.nextInt();
			System.out.println("Enter the choice 1:best case 1:avg case 2:worst case 3:to exit");
			int ch = sc.nextInt();

			QuickSort obj = new QuickSort();
			obj.input(ch, n);
			obj.display();

		}
	}

}
