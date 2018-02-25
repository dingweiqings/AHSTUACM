import java.util.Scanner ;
public class P1056 {
public static void main(String[] args) {
	Scanner cin=new Scanner(System.in);
	while(cin.hasNext()){
		int a[]=new int[6];
		int k=0;
		for(int i=0;i<a.length;i++){
			a[i]=cin.nextInt();
			if(a[i]==0)
				k++;
		}
		if(k==6)
			break;
		int kx=a[0]-a[2];
		int ky=a[1]-a[3];
		if(kx*(a[5]-a[1])-ky*(a[4]-a[0])>0)
			System.out.println(1);
		else
			System.out.println(0);
		
	}
	cin.close();
}
}
