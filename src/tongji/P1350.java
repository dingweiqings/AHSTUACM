package tongji;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P1350 {
	public static void main(String[] args) {
		Scanner cin = null;
		try {
			cin = new Scanner(new File("TestData/P1350"));
		} catch (FileNotFoundException e) {
			cin = new Scanner(System.in);
		}
		while (cin.hasNext()) {
			int n = cin.nextInt();
			int r[] = new int[5];
			while (n-- > 0) {
				int t = cin.nextInt();
				if(t<=100&&t>=0)
					
				t = t / 10;
				switch (t) {
				case 9:
				case 10:
					r[0]++;
					break;// A
				case 8:
					r[1]++;
					break;// B
				case 7:
					r[2]++;
					break;// C
				case 6:
					r[3]++;
					break;// D
				case 0:
				case 1:
				case 2:
				case 3:
				case 4:
				case 5:
					r[4]++;
					break;// E

				default:
					;

				}
			}
			for (int i : r)
				System.out.print(String.format("%d ", i));
			System.out.println();
		}
		cin.close();
	}
}
