/*
 * �ַ�ͳ��

Time Limit:1000MS  Memory Limit:65536K
Total Submit:189 Accepted:69 

Description 

����һ���ַ���Ҫ��ͳ�Ƴ��������ĸ�����֡��ո��Լ������ַ��ĸ����� 
��ĸ:A, B, ..., Z��a, b, ..., z��� 
����:0, 1, ..., 9 
�ո�:" "(����������) 
ʣ�µĿɴ�ӡ�ַ�ȫΪ�����ַ���

Input 

���������ж��顣 
ÿһ��Ϊһ������(���Ȳ�����100000)�� 
�������ļ�����(EOF)Ϊֹ��

Output 

ÿ�������Ӧһ������� 
�����ĸ�����a b c d���ֱ������ĸ�����֡��ո�������ַ��ĸ�����

Sample Input 


LOL3 ��

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
