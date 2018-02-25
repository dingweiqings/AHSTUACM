import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1128 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int n=10;
	int a[]=new int[n];
	while(cin.hasNext()){
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
		Arrays.sort(a);
		for(int i:a)
			System.out.print(i+" ");
		System.out.println();
	}
		
	cin.close();
}
}
