package waitToDoBetter;

import java.util.Scanner;
/*
���������

Time Limit:1000MS  Memory Limit:65536K
Total Submit:216 Accepted:118

Description

���������㣬��ʾһ�������ε��������㣬���������������������ε����

Input

ÿ����һ��������ݣ���6������x1,y1,x2,y2,x3,y3�ֱ��ʾ������ĺ������ꡣ������ֵ����0��10000֮�䣩 
����0 0 0 0 0 0��ʾ������� 
�������ݲ�����10000��

Output

�����������������������ε�����������ȷ��С�����1λ����ʹ������ҲҪ���һλС��λ��

Sample Input


0 0 1 1 1 3
0 1 1 0 0 0
0 0 0 0 0 0
Sample Output


1.0
0.5*/

public class P1117 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
int [] s=new int[6];//��������
while(cin.hasNext()){
       
for(int i=0;i<s.length;i++)
   s[i]=cin.nextInt(); //����
int count=0;
 for(int i:s)//java�����forѭ��,ѭ��������������������
	 if(i==0)
		 count++;
	if(count==s.length)	 //Ҫ��0 0 0 0 0 0��β
	break;

int k=0;
for(int j:s)
	if(j>=0&&j<=10000)//�жϺϷ���
		k++;
if(k==s.length){
double a=(double)GetDistance(s[0],s[1],s[2],s[3]);//�������
double b=(double)GetDistance(s[0],s[1],s[4],s[5]);
double c=(double)GetDistance(s[2],s[3],s[4],s[5]);
if(a+b>c&&a+c>b&&b+c>a)
System.out.printf("%.1f\n",GetArea(a,b,c));//�������


}
}


	cin.close();

}
private static double GetArea(double a, double b,
		double c) {
	double s=(a+b+c)/2.0;
	return Math.sqrt(s*(s-a)*(s-b)*(s-c));
	
}

private static double GetDistance(int x1,int y1,int x2,  int y2) {
return Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
	
}
}

