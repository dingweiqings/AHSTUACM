

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class CopyOfCopyOfDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		String ss[] = "AABBCCDDEEFFFA".split("");
		TreeSet<String> index = new TreeSet<String>();
		index.addAll(Arrays.asList(ss));
		for (String s : ss)
			if (map.containsKey(s))
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		System.out.println(map);
		System.out.println(map.keySet());
		for (String s : index)
			System.out.println(String.format("%s %d", s, map.get(s)));

	}
}
