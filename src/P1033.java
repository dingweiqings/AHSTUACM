import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P1033 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1033"));
	} catch (FileNotFoundException e) {
	cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		int n=cin.nextInt();
		int a=0;int b=0;
		while(n-->0){
			a=cin.nextInt();
			b=cin.nextInt();
			if((b/2-a)>0&&(b/2-a)%1==0&&(2*a-b/2)>0)
				System.out.println(String.format("%d %d",2*a-b/2,b/2-a));
			else 
				System.out.println("No answer");
		}
		
	}
	cin.close();
}

}
