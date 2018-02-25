import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1078 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1078"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		int n=cin.nextInt();
		while(n-->0){
			System.out.println(Integer.parseInt(Integer.toString(cin.nextInt()).substring(1)));
		}
	}
	cin.close();
}
}
