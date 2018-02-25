package tongji;
import java.util.ArrayList;
import java.util.Scanner;

public class CopyOfP1011 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int sum = 0;
			int k = 0;
			int p = 0;

			ArrayList<Integer> listx = new ArrayList();
			ArrayList<Integer> listy = new ArrayList();
			int n = cin.nextInt();// ????????
			while (cin.hasNext()) {

				int x = cin.nextInt();
				listx.add(x);

				int y = cin.nextInt();
				listy.add(y);
				sum += y;
				p = n * n - sum;// ??0

				if (x == 0 && y == 0)
					break;


			}
			for (int i = 0; i < listy.size() - 1; i++) {
				for (int j = 0; j < listy.get(i); j++) {

					System.out.printf("%d ", listx.get(i));
					k++;
					
					
					if (k%n==0) {
						System.out.println();
						
					}
				}
			}for (int m = 0; m < p; m++){
				
				System.out.printf("%c ", '0');
				k++;
				if(k%n==0){//????????????n??
					System.out.println();
				
				}
			}
			System.out.println();
			
		}

		cin.close();
	}
}