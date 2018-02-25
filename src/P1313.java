import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
public class P1313 {
public static void main(String[] args)   {
	try{Scanner cin=new Scanner(new File("poTestData/P1313.txt"));
	while(cin.hasNextLine()){
		p1313(cin.nextInt());
	}
	cin.close();
	}
	catch(IOException e){
	System.out.println(" file scan error"+e);
	}
	
}
public static void p1313(int n){
	int a=n/1000;
	int b=(n%1000)/499;
	System.out.println(String.format("%d %d %d",a,b,67-a-b));
}
}
