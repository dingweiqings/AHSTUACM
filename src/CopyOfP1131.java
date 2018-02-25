
/*
 * �������

Time Limit:2000MS  Memory Limit:65536K
Total Submit:306 Accepted:165 

Description 

��һ���������У�2/1��3/2��5/3��8/5��13/8 �������� 
����һ��������������ǰn��֮��(n<20)��

Input 

����Ϊһ����������ʾҪ���ǰ��������

Output 

�Ը��������ǰn��ĺ�

Sample Input 


��������:
2

Sample Output 


�������:
3.500
 

 */
import java.util.Scanner;
public class CopyOfP1131 {

	static double h[]=new double[30];
static double H[]=new double[30];
	static{
	

		h[0]=2.0/1.0;
		h[1]=3.0/2.0;
		for(int i=2;i<30;i++)
			h[i]=1+1.0/h[i-1];

	}
	static{
		
		H[0]=h[0];
		for(int i=1;i<H.length;i++)
			H[i]=h[i]+H[i-1];
	}
public static void main(String[] args) {

	
	
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){

		System.out.printf("%.3f\n",H[cin.nextInt()-1]);
		
		
	}
	cin.close();
}
}
