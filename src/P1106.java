import java.util.Scanner;

public class P1106 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int a, b, c;

		a = cin.nextInt();
		b = cin.nextInt();
		c = cin.nextInt();
		boolean flag=a+b<c||a+c<b||b+c<a;
		long a2=a*a;
		long b2=b*b;
		long c2=c*c;
		if(flag)
			System.out.println("not a triangle");
		if(!flag){
		if(a2+b2==c2||a2+c2==b2||b2+c2==a2)
			System.out.println("yes");
		else 
			System.out.println("no");
		}
	}

}
