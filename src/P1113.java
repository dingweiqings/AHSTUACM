/*
λ��

Time Limit:1000MS  Memory Limit:65536K
Total Submit:359 Accepted:297

Description

����һ��������10^9�����������������λ��������12735��λ����5��

Input

����һ��������10^9��������

Output

���������λ��

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
