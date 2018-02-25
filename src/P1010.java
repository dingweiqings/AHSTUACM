import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class P1010 {
public static void main(String[] args) {
	Scanner cin=null;
	int x=0;
	int y=0;
	int m=0;
	int n=0;
	int l=0;
//			try{
//				cin=new Scanner(new File("TestData/P1010"));
//			}catch(FileNotFoundException e){
//				e.printStackTrace();
//			}
			//System.out.println(4%5);
			cin=new Scanner(System.in);
			while(cin.hasNextLine()){
				x=cin.nextInt();
				y=cin.nextInt();
				m=cin.nextInt();
				n=cin.nextInt();
				l=cin.nextInt();
				System.out.println(fdating(x,y,m,n,l));
			}
			cin.close();
}

private static String fdating(int x, int y, int m, int n, int l) {
	int r=0;
	int a=x-y;
	int b=n-m;
	int t=0;
    if(a%l==b%l||b==0) 
    return "Impossible";
    
    	if(a<0)
      while(b*r%l-l!=a){
    	  r++;
    	  if(r*m+x>2100000000||r<0)
    		  break;
      }
    	else
    		while(b*r%l!=a){
    			r++;
    	    	 if(r*m+x>2100000000||r<0)
    	    		 break;
    		}
  	  if(r*m+x>2100000000||r<0)
		 
    	return "Impossible";
	return String.valueOf(r);
}
}
