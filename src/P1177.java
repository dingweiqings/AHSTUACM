
import java.util.Scanner;


public class P1177 {
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

