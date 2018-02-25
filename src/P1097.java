import java.util.Arrays;
import java.util.Scanner;
public class P1097 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int []a=new int[3];
		for(int i=0;i<a.length;i++)
			a[i]=cin.nextInt();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		System.out.print(String.format("%d ",a[i]));
		System.out.println();
	}
	cin.close();
}
}
