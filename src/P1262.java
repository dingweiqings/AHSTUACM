import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1262 {
public static void main(String[] args) {
	Scanner cin=null;
//	try{
//		cin=new Scanner(new File("TestData/P1262"));
//	}catch(FileNotFoundException e){
//		
//	}
	cin=new Scanner(System.in);
	while(cin.hasNextLine()){
		System.out.println(RPS(cin.nextLine()));
		//RPS(cin.nextLine());
	}
	cin.close();
}

private static String RPS(String s) {//剪刀石头布，返回第一个人的输赢Rock Paper Scissors
	String []ss=s.split("\\s+");
	String r=" ";
   String s1=ss[0];
   String s2=ss[1];
   if(s1.equals("Rocks"))
	   if(s2.equals("Rocks"))
		   r="draw";
	   else if(s2.equals("Papers"))
		   r="lose";
	   else 
		   r="win";
   else if(s1.equals("Papers"))
	   if(s2.equals("Rocks"))
		   r="win";
	   else if(s2.equals("Papers"))
		   r="draw";
	   else 
		   r="lose";
   else
	   if(s2.equals("Rocks"))
		   r="lose";
	   else if(s2.equals("Papers"))
		   r="win";
	   else 
		   r="draw";
	return r;
}
}
