package MathProblems;
import java.util.Scanner;
public class P1348 {
public static void main(String[] args) {
for(Scanner cin=new Scanner(System.in);cin.hasNext();aDivB(cin.nextInt(),cin.nextInt()));
}

private static void aDivB(int a, int b) {

	if(a%b!=0)
		System.out.println(String.format("%.2f",1.0*a/b));
     else
		System.out.println(String.format("%d",a/b));
	
	
}
}
