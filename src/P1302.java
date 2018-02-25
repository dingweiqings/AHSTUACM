import java.util.Scanner;


public class P1302 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		char[] s=cin.nextLine().toCharArray();
		int i=0;
		int k=0;
		for(i=0;i<s.length;i++){
		switch(s[i]){
		case'0':
		case'6':
		case '9':
			k++;
			break;
		case '8':
			k+=2;
			break;
			default:
				;
				
		}
		
		
	}
		System.out.println(k);
	}
	cin.close();
}
}
