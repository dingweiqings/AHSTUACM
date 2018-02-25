package MathProblems;
import java.util.Scanner;
public class P1009 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
		int a=cin.nextInt();
		int b=cin.nextInt();
		System.out.println(String.format("%d %d", gcd(a,b),lcm(a,b)));
		}
	}
	cin.close();
}

private static int lcm(int a, int b) {//求两个数最小公倍数
	
	return a*b/gcd(a,b);
}

private static int gcd(int a, int b) {//求两个数的最大公约数
	
	return a%b==0?a:gcd(b,a%b);
}
}
