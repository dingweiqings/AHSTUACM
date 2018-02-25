import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1223 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1223"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		if(b-(a-b)/2.5-c<=0)
			System.out.println("You have slain an enemy");
		else
			System.out.println("You have been slayed");
	}
	cin.close();
}
}
