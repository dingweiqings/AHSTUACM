/*
 * 字符统计

Time Limit:1000MS  Memory Limit:65536K
Total Submit:189 Accepted:69 

Description 

给出一串字符，要求统计出里面的字母、数字、空格以及其他字符的个数。 
字母:A, B, ..., Z、a, b, ..., z组成 
数字:0, 1, ..., 9 
空格:" "(不包括引号) 
剩下的可打印字符全为其他字符。

Input 

测试数据有多组。 
每一行为一组数据(长度不超过100000)。 
数据至文件结束(EOF)为止。

Output 

每组输入对应一行输出。 
包括四个整数a b c d，分别代表字母、数字、空格和其他字符的个数。

Sample Input 


LOL3 ，

Sample Output 


3 1 1 1

Source 
 

 */





import java.util.Scanner;

public class P1206 {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
	
		while(cin.hasNext()){
			int letters=0,numbers=0,space=0,others=0;
			String ss=cin.nextLine();
			for(int i=0;i<ss.length();i++){
				if((ss.charAt(i)>='a'&&ss.charAt(i)<='z')||(ss.charAt(i)>='A'&&ss.charAt(i)<='Z'))
					letters++;
				else if(ss.charAt(i)==' ')
				space++;
				else if(ss.charAt(i)>='0'&&ss.charAt(i)<='9')
				numbers++;
			else 
				others++;
			}
			/*char[]chs=s.toCharArray();
			for(char ch:chs )
				if(ch>='a'&&ch<='z')*/
			System.out.printf("%d %d %d %d\n",letters,numbers,space,others);
			
		}
		
	}
}
