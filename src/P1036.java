import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1036 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1036"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		int n=cin.nextInt();
		
		while(n-->0){
		System.out.println(toBin(cin.nextInt()));	
		}
		
	}
	cin.close();
}

private static String toBin(int n) {
	String s=Integer.toBinaryString(n);
	
	String r=" ";
	int i=0;
	r=r.trim();
	while(i<32-s.length()){
		r=r+'0';
	    i++;
	}
	return r+s;
}
}
