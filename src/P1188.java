/*

��λ��

Time Limit:1000MS  Memory Limit:65536K
Total Submit:253 Accepted:139

Description

��λ�����壺һ�����ݰ���С�����˳���������У������м�λ�õ�һ�����������м��������ݵ�ƽ������. 
����һ�����������������λ������������м���������ƽ����������ȡ�����ɣ�����Ҫʹ�ø������� 

Input

�ó����������������ݣ�ÿһ��������ݵĵ�һ��ΪN���������������ݰ��������ݸ�����1<=N<=10000. 
����N��ΪN�����ݵ����룬N=0ʱ��������

Output

�����λ����ÿһ������������һ��

Sample Input


4
10 30 20 40
3
40 30 50
4
1 2 3 4
0
Sample Output


25
40
2*/
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
public class P1188 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1188"));
	} catch (FileNotFoundException e) {
       cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
		
int n=cin.nextInt();
if(n==0)
	break;
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=cin.nextInt();
Arrays.sort(a);
if(n%2!=0)
	System.out.println(a[(n-1)/2]);
else
	System.out.println((a[n/2]+a[n/2-1])/2);


	}
	cin.close();
		
}


}

