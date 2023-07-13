package Lab_3;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
	private int a[];
	private int n;
	Scanner sc = new Scanner(System.in);

	public void input(int x) {
		System.out.println("Enter n");
		n = sc.nextInt();
		a = new int[n];

		switch (x) {
		case 1:
			// for average case and best case
			Random r = new Random();
			for (int i = 0; i < n; i++) {
				a[i] = r.nextInt(n);
			}
			break;
		case 2:
			// for worst case i.e ascending/descending order
			for (int i = 0; i < n; i++) {
				a[i] = i + 1;
			}
			break;
		default:
			System.exit(0);
		}

		display();

		long start = System.nanoTime();
		quickSort(a, 0, n - 1);
		long stop = System.nanoTime();

		System.out.println(stop - start);

	}

	public void quickSort(int[] a, int low, int high) {
		if (low >= high)
			return;
		int k = partition(a, low, high);
		quickSort(a, low, k - 1);
		quickSort(a, k + 1, high);

	}

	public int partition(int[] a, int low, int high) {
		int key = a[low];
		int i = low;
		int j = high + 1;

		while (i <= j) {
			while (key >= a[i])
				i++;
			while (key < a[j])
				j--;
			if (i < j)
				exchange(a, i, j);
		}

		exchange(a, low, j);

		return j;
	}

	public void exchange(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void display() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
