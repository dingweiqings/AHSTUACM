package tongji;
import java.util.Arrays;
import java.util.Scanner;
public class P1048 {

public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);

	while(cin.hasNext()){
	   int n=cin.nextInt();
	   int []s=new int[n];
	   quanpai(s,n);
	


		
	}
	cin.close();
}

    static void quanpai(int[] arr,int n){  
        if(n==0){  
            System.out.println(Arrays.toString(arr));             
        }else{  
            for(int i=0;i<n-1;i++){  
                exchange(arr, i, n-1);  
                quanpai(arr,n-1);  
                exchange(arr, n-1, i); 
                System.out.println(Arrays.toString(arr));
            }             
        }  
          
    }
	
static class Char{
	char a;
	char b;
}
public static void exchange(Char ch){//交换两个字母,利用对象操作


	char temp=' ';
	temp=ch.a;
   ch.a=ch.b;
	ch.b=temp;
	
	
}
public static void exchange(int [] ss,int i,int j){//错误
	
	//交换两个字母，无法在主函数中调用，
	//因为char 是基本类型，属于传值调用
    int temp = ss[i];  
    ss[i] = ss[j];  
    ss[j] = temp;  
	
}
}
