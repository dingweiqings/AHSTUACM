package tongji;

/*
 * RLE����

 Time Limit:1000MS  Memory Limit:132768K
 Total Submit:253 Accepted:68

 Description

 �ڼ�����У�ͼ��ͨ�����þ����ʾ�ģ������е�ÿһ��Ԫ�ر�ʾ��ͼ��������Ӧλ���ϵ�����ֵ����Ϊ�˽�Լ�ռ䣬ͼ���ļ�һ�㶼����ֱ�Ӵ洢������У����ǽ���ѹ�����ٴ洢��Ӳ���ϵġ����ڶ��ͼ��ѹ���㷨�У�RLEѹ���㷨��һ��ʹ��Ƶ�ʺܸߵ��㷨������ԭ��Ҳ�򵥣������ǽ�һ����������ͬ����ת��Ϊ�ض��ĸ�ʽ�ﵽѹ����Ŀ�ġ������һ��5*5ͼ��������ǣ� 

 1 1 1 2 2 
 2 2 2 4 8 
 8 8 1 3 3 
 3 3 3 3 9 
 0 0 0 0 0 

 ��ô����RLEѹ����ı�ʾ���£� 

 1 3 
 2 5 
 4 1 
 8 3 
 1 1 
 3 6 
 9 1 

 ��������ǣ���ѹ�����ͼ���ѹ��

 Input

 �������Ϣ������һ��ѹ�����ͼƬ����һ����һ�����������������ͼƬ�Ŀ�ȣ��ٽ���������RLE�����ˡ� 
 RLE��������������ɣ�ÿһ�е���ʽΪ��x y�� 
 ���У�x��y���������Ҷ�С��10000����x��y��Ϊ0ʱ�� ��ʾ��������� 

 Output

 ѹ��ǰ��ͼ���þ����ʾ���ھ����У�ͬһ�������ڵ�����������һ���ո�ָ��� 

 Sample Input


 5
 1 3
 2 5
 4 1
 8 3
 1 1
 3 6
 9 1

 Sample Output


 1 1 1 2 2
 2 2 2 4 8
 8 8 1 3 3
 3 3 3 3 9
 0 0 0 0 0

 */
import java.util.ArrayList;
import java.util.Scanner;

public class P1011 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int sum = 0;//���,�����ص��ܸ���
			int k = 0;//��ѭ�����������ƻ���
			int p = 0;//0�ĸ���
			ArrayList<Integer> listx = new ArrayList();
			ArrayList<Integer> listy = new ArrayList();
			int n = cin.nextInt();// ������
			while (cin.hasNext()) {
				int x = cin.nextInt();
				listx.add(x);
				int y = cin.nextInt();
				listy.add(y);
				
				if (x == 0 && y == 0)
					break;
			}
        RLEsolve(listx,listy,n);

		}

		cin.close();
	}

	public static void RLEsolve(ArrayList<Integer> listRGB,
			ArrayList<Integer> listNUM, int n) {//listRGB,����ֵ����listNUM���ظ������飬n����ά�������RLE
		//ԭ����
		int sum = 0;
		int k = 0;
		int p = 0;
		for (int i = 0; i < listNUM.size(); i++)
		sum += listNUM.get(i);//�����ص��ܸ���
		p = n * n - sum;// ��0
		for (int i = 0; i < listNUM.size() - 1; i++)
			for (int j = 0; j < listNUM.get(i); j++) {
				System.out.printf("%d ", listRGB.get(i));
				k++;
				if (k % n == 0)//���ƻ���
					System.out.println();
			}

		for (int m = 0; m < p; m++) {
			System.out.printf("%c ", '0');//��0
			k++;
			if (k % n == 0) // ����ÿ�����n��
				System.out.println();
		}
		System.out.println();

	}
	  
	 
}
