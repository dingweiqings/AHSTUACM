import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Many {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1029"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//cin=new Scanner(System.in);
	while(cin.hasNextLine()){
		int n=cin.nextInt();
		while(n-->0){
			String s=cin.next();
			System.out.println(s);
			
		}
	}
}
}
