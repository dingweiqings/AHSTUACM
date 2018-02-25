import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class P1076 {
public static void main(String[] args) {
	Scanner cin=null;
	try {
		cin=new Scanner(new File("TestData/P1076"));
	} catch (FileNotFoundException e) {
	cin=new Scanner(System.in);
	}
	
	int a[]=new int[26];
	while(cin.hasNext()){
		int n=cin.nextInt();
		while(n-->0){
		encoding(cin.next());
		
		
	}
	}
	cin.close();
}


public static void encoding(String s) {
	//字符串编码，按照字符串原始顺序对于连续的字符输出kX的格式，非连续的字符均输入X
	//如ADCCDC,输出AD2CDC,AXFEE输出AXF2E
	
char sch[]=s.toUpperCase().toCharArray();
int j=1;
for(int i=0;i<sch.length;i+=j){

	char cur=sch[i];
	j=1;

	while(i!=sch.length-1&&sch[i+j]==cur){
		j++;
		if(i+j==sch.length)
			break;
		
	}
	if(j==1)
		System.out.print(String.format("%c",sch[i]));
	else
		System.out.print(String.format("%d%c",j,sch[i]));

}
System.out.println();

}
}
