
/*
 * ������ͳ��

Time Limit:1000MS  Memory Limit:65536K
Total Submit:258 Accepted:173 

Description 

�������ɸ�����������ǵ���Сֵ�����ֵ��ƽ��ֵ��������λ��Ч���֣����뱣֤��Щ����������1000��������

Input 

�������ɸ�����

Output 

������ǵ���Сֵ�����ֵ��ƽ��ֵ��������λ��Ч���֣�

Sample Input 


2 8 3 5 1 7 3 6

Sample Output 


1 8 4.375
 

 */













import java.util.Scanner;


public class P1112 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
int max=0;
int min=65536;
int i=0;
double sum=0.0;
while(cin.hasNext()){

int a=cin.nextInt();
if(a>max)max=a;
if(a<min)min=a;
sum=sum+a;
i++;

}

System.out.printf("%d %d %.3f",min,max,1.0*sum/(double) i);
System.out.println();
		
	cin.close();
	}
	
	
	
}


