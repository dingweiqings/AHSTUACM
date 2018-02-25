import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class P1025  {
	static HashMap<Character, Character> map = new HashMap<Character, Character>();
	static {
		map.put('A', '2');
		map.put('B', '2');
		map.put('C', '2');
		map.put('D', '3');
		map.put('E', '3');
		map.put('F', '3');
		map.put('G', '4');
		map.put('H', '4');
		map.put('I', '4');
		map.put('J', '5');
		map.put('K', '5');
		map.put('L', '5');
		map.put('M', '6');
		map.put('N', '6');
		map.put('O', '6');
		map.put('P', '7');
		map.put('R', '7');
		map.put('S', '7');
		map.put('T', '8');
		map.put('U', '8');
		map.put('V', '8');
		map.put('W', '9');
		map.put('X', '9');
		map.put('Y', '9');
	}
static TreeMap<String,Integer>tree=new TreeMap<String,Integer>();

	public static void main(String[] args) throws FileNotFoundException {
		// System.out.println(map);
		Scanner cin = null;
		boolean flag=false;
		//cin = new Scanner(System.in);
		cin=new Scanner(new File("P1025"));
		while (cin.hasNextLine()) {
			int n = Integer.parseInt(cin.nextLine());
			while (n-- > 0) {
				String s=trans(cin.nextLine());
				if(!tree.containsKey(s))
				tree.put(s,1);
				else{
					tree.put(s, tree.get(s)+1);
			     flag=true;
				}
			}
			if(!flag)
				System.out.println("No duplicates");
			for(String i:tree.keySet()){
				if(tree.get(i)>1)
			System.out.println(i+' '+tree.get(i));
		  }
		}
		
		
		
		cin.close();
	}


	private static String trans(String s) {
		ArrayList<Character> alist = new ArrayList<Character>();

	

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != '-')
				alist.add(s.charAt(i));
		}
		// System.out.println(alist);

		for (int i = 0; i < alist.size(); i++) {
			if (!"0123456789".contains(alist.get(i).toString()))
				alist.set(i, map.get(alist.get(i)));
		}
		alist.add(3, '-');
		String r=" ";
	   Iterator<Character>iter=alist.iterator();
	   while(iter.hasNext()){
		   r=r+iter.next();
	   }
        return r.trim();


	}
}
