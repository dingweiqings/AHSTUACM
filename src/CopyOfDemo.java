

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CopyOfDemo {
	public static void main(String[] args) {

		char cs[] = "AABBCCDDEEFFFA".toCharArray();
		int cur = cs[0], cnt = 0;
		for (char c : cs) {
			if (c == cur) {
				++cnt;
			} else {
				System.out.print(String.format("%c%d", cur, cnt));
				cur=c;
				cnt=1;
			}
		}
		System.out.print(String.format("%c%d", cur, cnt));
	}
}
