/*
 * 
最简单的编程语言

Time Limit:1000MS  Memory Limit:32768K
Total Submit:63 Accepted:28

Description

为了提高工作效率，巨硬公司决定开发一种新型的编程语言。由于是从零开始开发，难度可想而知。不过，即使是当今世界上最强大的编程语言，也不是刚被发明出来就马上拥有强大功能的，它们都是通过慢慢的改进从而逐渐强大起来的。因此公司决定先将该编程语言的最基本部分做出来，以后再渐渐扩充其它功能。该编程语言最基本的部分是计算。作为公司的首席程序设计师，你的任务就是完成该功能。 

Input

输入由两部分组成：变量定义部分和表达式计算部分。在变量定义部分中，每一行只能定义一个变量，并且一定要赋上一个初值。计算部分则是每一行有一个表达式，表达式由变量和操作符组成，符号和变量之间用一个空格分隔，且符号只能取+、-、*这三种，变量定义部分和表达式计算机部分之间用%%%进行分隔，下面是一个例子： 

a = 4 
b = 2 
%%% 
a + b 
a - b

Output

表达式的结果，每行输入一个结果

Sample Input


a = 4
b = 2
c = 1
%%%
a + b + c
a - b - c
a - a
Sample Output


7
1
0
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Stack;
import java.util.TreeMap;
import java.lang.Integer;
public class P1015 {
	static HashMap<String,Integer>map=new HashMap<String,Integer>();
	static String []sa;
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		
		
	while(cin.hasNext()){
		String s=cin.nextLine();
	    if(s.equals("%%%"))
			break;
		sa=s.split("=");	
		
		map.put(sa[0],Integer.parseInt(sa[1]));
		
		
		

	} 

	while(cin.hasNext()){//计算表达式
            String f=cin.nextLine();
           
		System.out.println(compute(f,map));
	}
		
	map.clear();
	}
	cin.close();
}
public static int  compute(String f,HashMap<String,Integer> map) {
//存储上一步运算的值
	int result=0;
	
	//Stack<Integer>stack=new Stack<>();转成后缀表达式
	//char []fs=f.toCharArray();
String []fx=f.split("[+-[*]]*");
String []fsym=f.split("[\\p{Lower}\\p{Upper}]+");
//for(int i=0;i<fsym.length;i++)
	//System.out.print(fsym[i]+" ");
//for(int i=0;i<fx.length;i++)
	//System.out.printf("%s ",fx[i]);
//if(map.get(fx[0])!=null)
String  curx=fx[0];
String cursym=fsym[0];

result=(int)map.get(curx);

for(int i=1;i<fx.length-1;i++){
	curx=fx[i];
cursym=fsym[i-1];
	
	

	if(cursym.equals("+"))
	result+=(int)(map.get(curx));
	if(cursym.equals("-"))
		result-=(int)(map.get(curx));
	
	
	
}



 
return result;


   
	
}
public static Optional<String> emptyOptional() {
return Optional.empty();
}
public static int takenum(String s){//取出数字
	return Integer.parseInt(s.substring(s.indexOf("=")+1));
	
	
}
public static String takesub(String s, String s1){
	return s.substring(s.indexOf("s1")+s1.length()-1);
}
public static void paintMap(String s,Map<String,Integer> map){//统计字符串中的变量名及数值，输入字符串s，和树图名，
                                                                  //=左边作为键，=右边作为键值
	 
	int n=s.indexOf("=");
	String sf=s.substring(0,n);
	String  sl=s.substring(n+1);
	
	
		map.put(sf, Integer.parseInt(sl));
	
}

}
