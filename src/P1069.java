import java.util.Scanner;

/*
A+B(6)

Time Limit:1000MS  Memory Limit:65536K
Total Submit:455 Accepted:337

Description

Your task is to calculate the sum of some integers.

Input

Input contains multiple test cases, and one case one line. Each case starts with an integer N, and then N integers follow in the same line.

Output

For each test case you should output the sum of N integers in one line, and with one line of output for each line in input.

Sample Input


4 1 2 3 4
5 1 2 3 4 5
Sample Output


10
15*/
public class P1069 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	
	while(cin.hasNext()){
		int N=cin.nextInt();
		
		int []s=new int[N];
		int sum=0;
		for(int i:s){
			i=cin.nextInt();
			sum+=i;
		}
		System.out.println(sum);
		
	}
	
}
}
