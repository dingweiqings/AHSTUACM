

import java.util.Scanner;

public class P1116 {
	/*��������

	Time Limit:1000MS  Memory Limit:65536K
	Total Submit:234 Accepted:157 

	Description 

	����һ��������n lt21 ���һ��n�㵹������ ����n=5�������: 
	                     ���� #  һ��                                �ո���         
	######### 1 9 2*n-1             0
	 #######  2 7  2*(n-1)-1        1  
	  #####   3 5  2                 2
	   ###    i    2*(n-i+1)-1       i-1
	    # 
	 
*/
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int i,j,k;
		for( i=1;i<=n;i++){
		 	for(k=1;k<=i-1;k++)
			System.out.print(' ');
			for(j=1;j<=2*(n-i+1)-1;j++)
				
		   System.out.print('#');
			
         System.out.println();
    
     	
		}
	
	}

}
