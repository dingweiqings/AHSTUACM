package waitToDoBetter;


import java.util.Scanner;

/*
 * 
 C语言合法标识符

 Time Limit:1000MS  Memory Limit:65536K
 Total Submit:137 Accepted:70

 Description

 输入一个字符串，判断其是否是C的合法标识符。

 Input

 输入数据包含多个测试实例，数据的第一行是一个整数n,表示测试实例的个数，然后是n行输入数据，每行是一个长度不超过150的字符串。

 Output

 对于每组输入数据，输出一行。如果输入数据是C的合法标识符，则输出"yes"，否则，输出“no”。
 3
12ajf
fi8x_a
ff  ai_2
 *
 */
public class P1050 {

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		boolean flag=false;
		boolean flag1=false;
		int k=1;
		while (N-- > 0) {//先判断再自减
			  if(k-->0)
			cin.nextLine();//用来接收回车符,不加这一行第一个字符串是空串，
			                   //会产生越界
			String s = cin.nextLine();
			/*if (s.charAt(0)>='0'&&s.charAt(0)<='9'){
			System.out.println("no");
			flag1=false;
		continue;
		}*/
			if(s.indexOf(' ')!=-1){
				System.out.println("no");//该方法返回此字符串中第一次出现指定字符处的索引，
				 flag1=false;                         //如果此字符串中没有这样的字符，则返回 -1。返回值类型为int型。 
			continue;
			}
			//System.out.println(s);
			
		
			char[] b= s.toCharArray();
		
           if(b[0] >= '0'&& b[0] <= '9'){
              flag1=false;
            	System.out.println("no");
            continue;
            }
			
			for (int i = 0; i < s.length(); i++) {
				
			
				if (b[i] == '_' || (b[i] >= 'A' && b[i] <= 'Z')
						|| (b[i] >= 'a' && b[i] <= 'z'))
				flag1=true;


			}
			
	if(flag1) System.out.println("yes");
		
		}
	}
		
}
