/*
 * A+B(8)

Time Limit:1000MS  Memory Limit:65536K
Total Submit:494 Accepted:335

Description

Your task is to calculate the sum of some integers.

Input

Input contains an integer N in the first line, and then N lines follow. Each line starts with a integer M, and then M integers follow in the same line.

Output

For each group of input integers you should output their sum in one line, and you must note that there is a blank line between outputs.

Sample Input


3
4 1 2 3 4
5 1 2 3 4 5
3 1 2 3
Sample Output


10

15

6
 */






import java.util.Scanner;



public class P1071 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	int N=cin.nextInt();
	while(N-->0){
		int m=cin.nextInt();
		int []s=new int[m];
		int sum=0;
		for(int i=0;i<s.length;i++)
			s[i]=cin.nextInt();
		
		for(int i=0;i<s.length;i++)
			sum+=s[i];
		System.out.println(sum);
		System.out.println();
	}
	cin.close();
}
}

