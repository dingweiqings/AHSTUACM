/*��˼�

Time Limit:1000MS  Memory Limit:65536K
Total Submit:334 Accepted:181

Description

��ÿ�춼Ҫ��ȥ��ˣ����ǻ����󣬶����ǮҲ������һ�������׻��˶���Ǯ����һ�ʺ�Ϳ�ʡ����ں��ˣ���Ϊ�ö��ӣ�Ů����������Ը����ó�����һ���ˣ��Ǻǡ�

Input

���뺬��һЩ�����飬ÿ�����ݰ������֣��ִ�����������������λ���ۣ�һ��Ϊdouble�������͵��ۣ�double��������ʾ�����Ԫ��������ˣ�ÿ�����ݵĲ˼۾����������ϵ��۰������֡������͵���֮�䶼�пո�����ġ� 
ע�⣺�������ļ���������EOF���������롣

Output

֧���˼۵�ʱ��������С֧����λ�ǽǣ�����������֧����ʱ�������������ķ����ѷ�ͷȥ������������һ������Ϊ�ǵĲ˼������� 

Sample Input


���  1  2
�޲�  2  1.5
����  2  4.2
Sample Output


13.4*/




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1154 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1154"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	double s=0.0;
	while(cin.hasNextLine()){
		String ss=cin.nextLine();
		String [] s1=ss.split("\\s+");
	    //System.out.println(s1[0]);
	 int a=Integer.parseInt(s1[1]);
	 double b=Double.parseDouble(s1[2]);
	 s=s+sumcai(a,b);

	}
	System.out.println(s);
}

private static double sumcai(int a, double b) {
	double s=0.0;
	s=a*b;
	return s;
}
}
