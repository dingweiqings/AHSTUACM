import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P1046 {
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String words1 =cin.nextLine();
		String []words=words1.split(" ");
		Map<String, Integer> map = new TreeMap<String, Integer>();
		for (String word : words) {
			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}
		int sum=0;
		for(String key : map.keySet())
			sum+=map.get(key);
		System.out.println(sum);
		for (String key : map.keySet())
			System.out.println(String.format("%s:%d", key, map.get(key)));
	}
}
