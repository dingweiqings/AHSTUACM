import java.util.Arrays;
import java.util.Scanner;

/*
 * ������

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:0 Accepted:0

 Description

 ��n �����ӣ�����i �ĳ���Ϊai����Ҫ����ѡ��3 ����������ܳ������ܳ��������Ρ�����������ܳ������޷���������������0�� 
 //3 �� n �� 100��1 �� ai �� 106



 ����������ݣ���һ��Ϊn , �����n�����ӵĳ���

 Output

 ����������ε�����ܳ�

 Sample Input


 5
 2 3 4 5 10
 4
 4 5 10 20
 Sample Output


 12
 0
 So
 */
public class P1324 {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);

		while (c.hasNext()) {// ����������
			int m = c.nextInt();
			boolean flag = false;
			int[] s = new int[m];// ����m����������
			for(int i=0;i<s.length;i++)
				s[i]=c.nextInt();
			Arrays.sort(s);
			//System.out.println(s[0]);
			int k = 1;
			for (int i = m - 1; i >= 2; i--){
				if (isTri(s[i - 2], s[i - 1], s[i])) {
					flag = true;
					k=i;
					break;
				
				}	
				
			}

			
			if (flag)
				System.out.println(GetPrimeter(s[k- 2], s[k - 1], s[k]));

			if ((k == 1))
				System.out.println('0');
			
		
	}
	}
	static boolean isTri(int a, int b, int c) {
		return a + b > c;
	}
	static int GetPrimeter(int a, int b, int c) {
		return a + b + c;
	}

}
