

import java.util.HashMap;
import java.util.TreeMap;

public class Demo {
	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		String ss[] = "AABB".split("");
		for (String s : ss)
			if (map.containsKey(s))
				map.put(s, map.get(s) + 1);
			else
				map.put(s, 1);
		System.out.println("192 384 576\n"+"219 438 657\n"+"273 546 819\n"+"327 654 981");
		System.out.println(map);
		System.out.println(map.keySet());
		for (String s : map.keySet())
			System.out.println(String.format("%s %d", s, map.get(s)));

	}
}
