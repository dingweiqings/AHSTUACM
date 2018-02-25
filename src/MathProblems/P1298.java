package MathProblems;

import java.util.Scanner;

public class P1298 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int a = cin.nextInt();
			int n = cin.nextInt();
			
			System.out.println(sum(a, n));
		}
		cin.close();
	}

	private static long sum(int a, int n) {
		long  r = a;
		int[] b = new int[n];
		long cur = b[0] = a;
		for (int i = 1; i < n; i++) {

			r += cur * 10 + a;

			cur = cur * 10 + a;
		}
		return r;
	}
}
