

/*
 * Time Limit:3000MS  Memory Limit:65536K
 Total Submit:349 Accepted:194 
 Case Time Limit:1000MS 

 Description 

 ����������n ���H��n��=1+1/2+1/3+....+1/n��ֵ������3λ��Ч����

 Input 

 ����������n (n <10^6)

 Output 

 ���H��n��=1+1/2+1/3+....+1/n��ֵ������3λ��Ч����

 Sample Input 


 3
 2
 1

 Sample Output 


 1.833
 1.500
 1.000

 */
import java.util.Scanner;

public class P1118 {
	static double H[] = new double[1000000];
	static {
		H[1] = 1;
		for (int i = 2; i < H.length; i++)
			H[i] = H[i - 1] + 1.0 / i;
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			System.out.printf("%.3f\n", H[cin.nextInt()]);
		}
		cin.close();
	}
}
