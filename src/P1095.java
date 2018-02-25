import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1095 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1095"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		System.out.println(reverse(cin.next()));
	}
	cin.close();
			
}

private static int reverse(String s) {
	StringBuffer sb=new StringBuffer(s);

	return 	Integer.parseInt(sb.reverse().toString());
}
}
