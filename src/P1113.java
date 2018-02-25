/*
位数

Time Limit:1000MS  Memory Limit:65536K
Total Submit:359 Accepted:297

Description

输入一个不超过10^9的正整数，输出它的位数，例如12735的位数是5，

Input

输入一个不超过10^9的正整数

Output

，输出它的位数

Sample Input


12735
Sample Output


5
Sour*/

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1113 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1113"));
	} catch (FileNotFoundException e) {
	cin=new Scanner(System.in);
	}
	while(cin.hasNext()){
		System.out.println((Long.toString(cin.nextLong()).length()));
	}
	cin.close();
}
}
