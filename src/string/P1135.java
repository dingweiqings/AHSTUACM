package string;
import java.util.Scanner;
public class P1135 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	String s=cin.next();	
char []a=s.toCharArray();
for(int i=a.length-1;i>=0;i--)
	System.out.print(a[i]);
	
	cin.close();
}

}
