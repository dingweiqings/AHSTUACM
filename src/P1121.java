/*Time Limit:1000MS  Memory Limit:65536K
Total Submit:278 Accepted:97

Description

输入正整数a,b,c 0 < a, b < 10^6,c< 100输出a/b的小数形式，精确到小数点后的c位,例如a=1 b=6 c=4输出应该是0.1667

Input

输入正整数a,b,c

Output

输出a/b的小数形式，精确到小数点后的c位,例如a=1 b=6 c=4输出应该是0.1667

Sample Input


1 6 4
1 2 20
Sample Output


0.1667
0.50000000000000000000*/
 

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1121 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1121"));
	} catch (FileNotFoundException e) {
	cin=new Scanner(System.in);
	}
	while(cin.hasNextLine()){
		easy(cin.nextInt(),cin.nextInt(),cin.nextInt());
	}
	cin.close();
}

private static void easy(int a, int b, int n) {//计算分数a/b,数值，保留n位
	StringBuffer s=new StringBuffer();
	int  t=a/b;
	s=s.append(t);
	s.append(".");
	
	for(int i=0;i<=n;i++){
		a=(a%b)*10;
		t=(a/b);
		s.append(t);
	}
	
	if("56789".indexOf(s.charAt(s.length()-1))>=0){
		s.deleteCharAt(s.length()-1);
		int end=Integer.parseInt(s.charAt(s.length()-1)+"");
			end++;	
		s.replace(s.length()-1, s.length()-1, end+"");
		s.deleteCharAt(s.length()-1);
	}
	else
		s.deleteCharAt(s.length()-1);
		
		System.out.println(s.toString());
}

		
}
