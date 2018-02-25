import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1096 {
public static void main(String[] args) {
	Scanner cin=null;
//	try{
//	cin=new Scanner(new File("TestData/P1096"));
//}catch(FileNotFoundException e){
//	e.printStackTrace();
//}
	cin=new Scanner(System.in);
	while(cin.hasNextLine()){
		int a=cin.nextInt();
		int b=cin.nextInt();
		a=(a+b)-(b=a);
		System.out.println(String.format("%d %d ",a,b));
	}
	cin.close();
}
static void swap(int a,int b){
	
}
}
