/*Description

现在，有一行括号序列，请你检查这行括号是否配对。

Input

第一行输入一个数N（0

Output

每组输入数据的输出占一行，如果该字符串中所含的括号是配对的，则输出Yes,如果不配对则输出No 

Sample Input


3
[(])
(])
([[]()])
Sample Output


No
No
Yes*/
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class P1029 {
	static Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) {
		Scanner cin = null;
		try {
			cin = new Scanner(new File("TestData/P1029"));
		} catch (FileNotFoundException e) {
			
			cin = new Scanner(System.in);
		}
//cin=new Scanner(System.in);
		while (cin.hasNextLine()) {
			int n = cin.nextInt();
			String s=" ";
			while (n--> 0){
			s=cin.next();
				//System.out.println(s);
			if (match(s) == true)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
		}

		cin.close();

	}

	private static boolean match(String s) {
		Stack<Character> stack = new Stack<Character>();
		boolean match = true;
		char[] exp = s.trim().toCharArray();
		int i = 0;
		while (i < exp.length && match) {
			switch (exp[i]) {
			case'}':
				if(stack.empty()==true)
					match=false;
				else if(stack.peek()=='{')
					stack.pop();
				else
					match=false;
				break;
			case ')':
				if (stack.empty() == true)
					match = false;
				else if (stack.peek() == '(')
					stack.pop();
				else
					match = false;
				break;
			case ']':
				if (stack.empty() == true)
					match = false;
				else if (stack.peek() == '[')
					stack.pop();
				else
					match = false;
				break;
			case'{':
				stack.push('{');
				break;
			case '(':
				stack.push('(');
				break;
			case '[':
				stack.push('[');
				break;
              default:
            	  ;
			}
			i++;

		}
		if (stack.empty() != true)
			match = false;
		stack.clear(); 
		return match;
		
	}
}
