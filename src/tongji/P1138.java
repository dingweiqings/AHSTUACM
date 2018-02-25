package tongji;
/*
 * 游程编码

Time Limit:1000MS  Memory Limit:65536K
Total Submit:138 Accepted:67

Description

游程编码又称“运行长度编码”或“行程长度编码”，是一种统计编码，该编码属于无损压缩编码。对于二值图有效。 　　RLE行程长度编码概述　　目前, 压缩技术已经广泛应用于各种软件、声音、影像格式等领域。总的来说, 有两种截然不同的图像格式压缩类型: 有损压缩和无损压缩[1]。有损压缩利用视觉识别的原理可以大大地压缩文件的数据, 但是会影响图像质量。无损压缩的基本原理是相同的颜色信息只需保存一次, 可以删除一些重复数据, 大大减少要在磁盘上保存的图像的容量。无损压缩方法的优点是能够比较好地保存图像的质量, 但是相对有损压缩来说这种方法的压缩率是比较低的。常用的无损压缩算法有 RLE、LZW 等。 RLE 压缩算法的基本原理　　RLE(Run- Length Encoding 行程长度编码)压缩算法是Windows 系统中使用的一种图像文件压缩方法, 其基本思想是: 将一扫描行中颜色值相同的相邻像素用两个字节来表示, 第一个字节是一个计数值, 用于指定像素重复的次数; 第二个字节是具体像素的值[2]。主要通过压缩除掉数据中的冗余字节或字节中的冗余位,从而达到减少文件所占空间的目的。 
例如, 有一表示颜色像素值的字符串RRRRRGGBBBBBB,用 RLE 压缩方法压缩后可用 5R2G6B 来代替,显然后者的串长度比前者的串长度小得多。译码时按照与编码时采用的相同规则进行, 还原后得到的数据与压缩前的数据完全相同。因此, RLE 是无损压缩技术。 

Input

输入的第一行是一个整数N表示有N组测试数据。 
接下来N行，每行都有一个字符串。(由小写字母组成且长度小于1000)

Output

编码后的字符串。

Sample Input


2
aabbbb
iiiiillllovvveeeeeeeaaaccccccccmmmmmmmmmm
Sample Output


2a4b
5i4l1o3v7e3a8c10m
Hint
 */


import java.util.Scanner;

public class P1138 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
		String s=cin.next();
		
       
        System.out.println(RLEcount(s)); 
       
		}
		
	}
	cin.close();
}
public static String  RLEcount(String s){//游程编码实现，输入字符串，
	s=s+s.charAt(s.length()-1);//先扩加字符串最后一个元素
	boolean flag=false;//控制内层循环
	StringBuffer sr=new StringBuffer();
char []chs=s.toLowerCase().toCharArray();//转成数组

int k=0;//重复数字计数变量
for(int i=0;i<chs.length;i=i+k){
	flag=false;
	for(int j=i;j<chs.length-1  /*不能小于chs.length,否则会越界*/;j++){
		if((j==chs.length-2)||chs[j]!=chs[j+1]){
			k=j-i+1;
			sr.append(k);//写入字符重复个数
			sr.append(chs[i]);//写入字符
	        flag=true;
		}
			
			if(flag)
				break;//控制内层循环退出
	}
	
}

return sr.toString();//将sr转成String 类型返回
}

}

		
