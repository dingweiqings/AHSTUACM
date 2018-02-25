package MathProblems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1130 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1130"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	cin.close();
	
}
}