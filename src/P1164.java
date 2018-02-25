import java.util.Arrays;
import java.util.Scanner;

public class P1164 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);

		while (cin.hasNext()) {
			double[] s = new double[3];
			for (int i = 0; i < s.length; i++)
				s[i] = cin.nextDouble();// 先对a,b，c排序，再判断
			
			Arrays.sort(s);
			if(s[0]+s[1]>s[2]){
			// for(int j=0;j<a.length;j++)
			// System.out.print(a[j]+' ');//从0到n-1升序排列

			double a = s[0] * s[0];
			double b = s[1] * s[1];
			double c = s[2] * s[2];
JudgeTriangle(a,b,c);
			}
		}

	}
static void JudgeTriangle(double a,double b,double c){
	if(a+b<c)
		System.out.println("Obtuse Triangle");
	if(a+b==c)
		System.out.println("Rect Triangle");
	if(a+b>c)
		System.out.println("Actue Triangle");
}
}

