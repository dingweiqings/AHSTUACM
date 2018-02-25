import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1152 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1152"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		cin=new Scanner(System.in);
		
	}
	while(cin.hasNextLine()){
		System.out.println(cin.nextInt()/cin.nextInt());
	}
	cin.close();
		
}
}
