package string;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
public class P1125 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1125"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	while(cin.hasNext())
		System.out.println(upper(cin.nextLine()));
	
	cin.close();
}

private static String upper(String s) {
	
	return s.toUpperCase();
}
}
