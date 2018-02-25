import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1091 {
public static void main(String[] args) {
Scanner cin=null;
//	try{
//	cin=new Scanner(new File("TestData/P1091"));
//}catch(FileNotFoundException e){
//	e.printStackTrace();
//}
cin=new Scanner(System.in);
while(cin.hasNextLine()){
	int a=cin.nextInt();
	int b=cin.nextInt();
	System.out.println(multi(a,b));
}
cin.close();
}

private static String multi(int a, int b) {
	StringBuffer ra= new StringBuffer(Integer.toString(a));
	StringBuffer rb=new StringBuffer(Integer.toString(b));
	a=Integer.parseInt(ra.reverse().toString());
	b=Integer.parseInt(rb.reverse().toString());
	ra=new StringBuffer(Integer.toString(a*b));
	return ra.reverse().toString();
}
}
