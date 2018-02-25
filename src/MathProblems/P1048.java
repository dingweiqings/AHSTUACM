package MathProblems;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
public class P1048 {
public static void main(String[] args)  {
       
       Scanner   cin = null;
    		 try {
				cin=  new Scanner(new FileReader("TestData/P1048"));
			} catch (FileNotFoundException e) {
				cin=new Scanner(System.in);
			}    
       //cin=new Scanner(System.in);
        while (cin.hasNextLine()) {
            int n=cin.nextInt();
            int []a=new  int[n];
            for(int i=0;i<a.length;i++)
              a[i]=cin.nextInt();
          
           
           String b=Arrays.toString(a);
        //System.out.println(permutation("",b));
           permutation("",b);
          //for(int i=0;i<b.length();i++)
        	  ///System.out.print(b.charAt(i));
        
        }  
        
        
        
        cin.close(); 
    }

	  public static void  permutation(String begin, String end) {

		        
		      }
		  }
		

/*public static String allPai(char []a,int j){
//StringBuffer s=new StringBuffer();
String s="";
j--;
if (j==0)
	s=a[j]+"";
else{
s=allPai(a,j-1)+a[j]+" ";
//s2=a[j]+allPai(a,j-1)+" ";

}
return s;
}*/
 


 