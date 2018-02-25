
import java.util.Arrays;
import java.util.Scanner;
public class P1284 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {

			int n = cin.nextInt();
			int a[] = new int[n];

			for (int i = 0; i < a.length; i++)
				a[i] = cin.nextInt();

			Arrays.sort(a);
			System.out.println(a[a.length - 1]);
			for (int j = 0; j < a.length; j++)
				if (a[j] == a[a.length - 1])
					System.out.printf("%d ", j);
			System.out.println();

		}
		cin.close();
	}
}
