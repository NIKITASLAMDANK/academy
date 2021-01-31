package by.academy.homework2;

import java.util.Scanner;

public class Task0 {
	private static final Scanner scanner = new Scanner(System.in);

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] - arr[j] == k) {
					pairsCount++;
				}
			}
		}
		return pairsCount;
	}

	public static void main(String[] args) {
		String[] nk = scanner.nextLine().split(" ");
		int n = Integer.parseInt(nk[0]);
		int k = Integer.parseInt(nk[1]);
		int[] arr = new int[n];
		String[] arrItems = scanner.nextLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
		}
		int result = pairs(k, arr);
		System.out.println(result);
		scanner.close();
	}
}