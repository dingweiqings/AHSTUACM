import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1061 {
public static void main(String[] args) {
	Scanner cin=null;
	try{
		cin=new Scanner(new File("TestData/P1061"));
		
	}catch(FileNotFoundException e){
		cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		int n=cin.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
			a[i]=cin.nextInt();
			System.out.println(lcmn(a));
	}
	cin.close();
	
}
public static int  lcmn(int []a){
	int r=1;
	int i=0;
	while(i<a.length){
		r=lcm(r,a[i]);
		i++;
	}
		
	return r;
}
public static int lcm(int a, int b) {//求两个数最小公倍数
	
	return a*b/gcd(a,b);
}

public static int gcd(int a, int b) {//求两个数的最大公约数
	
	return a%b==0?b:gcd(b,a%b);
	
}
}
