

import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class copyp1012 {
	static HashMap<Character, String> map = new HashMap<Character, String>();
	static{
		map.put('0', "0000");
		map.put('1', "0001");
		map.put('2', "0010");
		map.put('3', "0003");
		map.put('4', "0000");
		map.put('5', "0000");
		
		
	}

	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while (cin.hasNext()) {
			char cs[] = cin.nextLine().toCharArray();
			for(char c:cs)
				System.out.println();

		}
		cin.close();
	}

	private static String HexToBinary(String s) {

		return ((new BigInteger(s, 16)).toString(2));
	}
}
