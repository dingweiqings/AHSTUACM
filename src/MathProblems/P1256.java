package MathProblems;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1256 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1256"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//cin=new Scanner(System.in);
	while(cin.hasNextLine()){
		//int a=Integer.parseInt(cin.next(),16);
		
		//int b=Integer.parseInt(cin.next(),16);
		int a=cin.nextInt(16);
		int b=cin.nextInt(16);
		System.out.println(add(a,b));
	}
	
	cin.close();
}

private static String add(int a, int b) {
	int r=0;
	r=a+b;//先将a,b,转成十进制，再十进制加法运算，结果为十进制
	//return r;
	return Integer.toHexString(r).toUpperCase();
}
}
