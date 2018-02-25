import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class P1057 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1057"));
	} catch (FileNotFoundException e) {
cin=new Scanner(System.in);
	}
while(cin.hasNextLine()){
	int n=cin.nextInt();
	double sum=0.0;
	int []a=new int[n];
	int i=0;
	while(i<n){
	  a[i]=cin.nextInt();
		i++;
	}
	Arrays.sort(a);
	for(i=1;i<a.length-1;i++)
		sum+=a[i];
	System.out.printf("%.2f\n",1.0*sum/(a.length-2));
}
	cin.close();
}
}
