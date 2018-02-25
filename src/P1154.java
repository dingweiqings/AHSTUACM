/*算菜价

Time Limit:1000MS  Memory Limit:65536K
Total Submit:334 Accepted:181

Description

妈每天都要出去买菜，但是回来后，兜里的钱也懒得数一数，到底花了多少钱真是一笔糊涂帐。现在好了，作为好儿子（女儿）的你可以给她用程序算一下了，呵呵。

Input

输入含有一些数据组，每组数据包括菜种（字串），数量（计量单位不论，一律为double型数）和单价（double型数，表示人民币元数），因此，每组数据的菜价就是数量乘上单价啊。菜种、数量和单价之间都有空格隔开的。 
注意：程序以文件结束符“EOF”结束输入。

Output

支付菜价的时候，由于最小支付单位是角，所以总是在支付的时候采用四舍五入的方法把分头去掉。最后，请输出一个精度为角的菜价总量。 

Sample Input


青菜  1  2
罗卜  2  1.5
鸡腿  2  4.2
Sample Output


13.4*/




import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1154 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1154"));
	} catch (FileNotFoundException e) {
		cin=new Scanner(System.in);
	}
	double s=0.0;
	while(cin.hasNextLine()){
		String ss=cin.nextLine();
		String [] s1=ss.split("\\s+");
	    //System.out.println(s1[0]);
	 int a=Integer.parseInt(s1[1]);
	 double b=Double.parseDouble(s1[2]);
	 s=s+sumcai(a,b);

	}
	System.out.println(s);
}

private static double sumcai(int a, double b) {
	double s=0.0;
	s=a*b;
	return s;
}
}
