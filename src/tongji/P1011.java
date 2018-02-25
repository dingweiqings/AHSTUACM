package tongji;

/*
 * RLE解码

 Time Limit:1000MS  Memory Limit:132768K
 Total Submit:253 Accepted:68

 Description

 在计算机中，图像通常是用矩阵表示的，矩阵中的每一个元素表示了图像中在相应位置上的像素值。而为了节约空间，图像文件一般都不是直接存储在外存中，而是进行压缩后再存储在硬盘上的。在众多的图像压缩算法中，RLE压缩算法是一种使用频率很高的算法，它的原理也简单，就是是将一串连续的相同数据转化为特定的格式达到压缩的目的。如果有一幅5*5图像的内容是： 

 1 1 1 2 2 
 2 2 2 4 8 
 8 8 1 3 3 
 3 3 3 3 9 
 0 0 0 0 0 

 那么，用RLE压缩后的表示如下： 

 1 3 
 2 5 
 4 1 
 8 3 
 1 1 
 3 6 
 9 1 

 你的任务是，将压缩后的图像解压。

 Input

 输入的信息描述了一幅压缩后的图片，第一行是一个整数，代表着这幅图片的宽度，再接下来就是RLE数据了。 
 RLE数据由若干行组成，每一行的形式为：x y， 
 其中，x，y整数，并且都小于10000；当x和y都为0时， 表示输入结束。 

 Output

 压缩前的图像，用矩阵表示，在矩阵中，同一行中相邻的两个数据用一个空格分隔。 

 Sample Input


 5
 1 3
 2 5
 4 1
 8 3
 1 1
 3 6
 9 1

 Sample Output


 1 1 1 2 2
 2 2 2 4 8
 8 8 1 3 3
 3 3 3 3 9
 0 0 0 0 0

 */
import java.util.ArrayList;
import java.util.Scanner;

public class P1011 {
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			int sum = 0;//求和,即像素的总个数
			int k = 0;//内循环次数，控制换行
			int p = 0;//0的个数
			ArrayList<Integer> listx = new ArrayList();
			ArrayList<Integer> listy = new ArrayList();
			int n = cin.nextInt();// 输入宽度
			while (cin.hasNext()) {
				int x = cin.nextInt();
				listx.add(x);
				int y = cin.nextInt();
				listy.add(y);
				
				if (x == 0 && y == 0)
					break;
			}
        RLEsolve(listx,listy,n);

		}

		cin.close();
	}

	public static void RLEsolve(ArrayList<Integer> listRGB,
			ArrayList<Integer> listNUM, int n) {//listRGB,像素值数组listNUM像素个数数组，n矩阵维数，输出RLE
		//原矩阵
		int sum = 0;
		int k = 0;
		int p = 0;
		for (int i = 0; i < listNUM.size(); i++)
		sum += listNUM.get(i);//求像素的总个数
		p = n * n - sum;// 补0
		for (int i = 0; i < listNUM.size() - 1; i++)
			for (int j = 0; j < listNUM.get(i); j++) {
				System.out.printf("%d ", listRGB.get(i));
				k++;
				if (k % n == 0)//控制换行
					System.out.println();
			}

		for (int m = 0; m < p; m++) {
			System.out.printf("%c ", '0');//补0
			k++;
			if (k % n == 0) // 控制每行输出n个
				System.out.println();
		}
		System.out.println();

	}
	  
	 
}
