/*
计算a的立方

Time Limit:1000MS  Memory Limit:65536K
Total Submit:456 Accepted:309

Description

计算a的立方

Input

1 
2 
3

Output

1 
8 
27

Sample Input


1
2
3
Sample Output


Hint

1 
8 
27*/



import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1124 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1124"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
		int a=cin.nextInt();
		System.out.println(a*a*a);
	}
}
}
