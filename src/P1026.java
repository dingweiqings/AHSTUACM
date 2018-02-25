import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1026 {
public static void main(String[] args) {
	Scanner cin=null;
	try{
	cin=new Scanner(new File("TestData/P1026"));
	}catch(FileNotFoundException e){
		cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		int m=cin.nextInt();
		int n=cin.nextInt();
		System.out.println(n/15-m/15);
	}
	cin.close();
}
}
