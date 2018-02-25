import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class P1045 {//输入n个数，删除其中重复的
public static void main(String[] args) {
	Scanner cin=null;
	cin=new Scanner(System.in);
	while(cin.hasNext()){
		int n=cin.nextInt();
		TreeSet<Integer> tree=new TreeSet<Integer>();
		for(int i=0;i<n;i++)
			tree.add(cin.nextInt());
		//System.out.println(tree);
		Iterator<Integer>it= tree.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
	
	cin.close();
}
}
