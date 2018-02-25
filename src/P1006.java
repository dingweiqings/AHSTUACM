import java.util.TreeSet;
import java.util.Scanner;
public class P1006 {
	public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	TreeSet<Integer>a=new TreeSet<>();
	for(int i=0;i<5;i++)
		a.add(cin.nextInt());
	System.out.printf("%d %d\n",a.first(),a.last());
cin.close();	
	}

}
