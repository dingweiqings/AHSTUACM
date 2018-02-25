import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1107 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1107"));
	} catch (FileNotFoundException e) {
       cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
		if(isLeapYear(cin.nextInt()))
			System.out.println("yes");
		else 
			System.out.println("no");
	}
		
}

private static boolean isLeapYear(int n) {
if(n%4==0&&n%100!=0||n%400==0)
	return true;
	return false;
}
}
