import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 884. Uncommon Words from Two Sentences
public class UncommonWords {
	public static String[] uncommonFromSentences(String A, String B) {
		String[] str1 = A.split(" ");
		String[] str2 = B.split(" ");
		ArrayList<String> result = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<>();

		if (str1.length < str2.length) {
			uncommonFromSentences(B, A);
		}

		for (int i = 0; i < str1.length; i++) {
			if (hm.containsKey(str1[i])) {
				hm.put(str1[i], hm.get(str1[i]) + 1);
			} else {
				hm.put(str1[i], 1);
			}
		}

		for (int i = 0; i < str2.length; i++) {
			if (hm.containsKey(str2[i])) {
				hm.put(str2[i], hm.get(str2[i]) + 1);
			} else {
				hm.put(str2[i], 1);
			}
		}

		for (HashMap.Entry<String, Integer> entry : hm.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();

			if (value == 1) {
				result.add(key);
			}
		}
		return result.toArray(new String[result.size()]);
	}

	public static void main(String[] args) {
		String A1 = "this apple is sweet";
		String B1 = "this apple is sour";
		System.out.println(Arrays.toString(uncommonFromSentences(A1, B1)));

		String A2 = "apple apple";
		String B2 = "banana";
		System.out.println(Arrays.toString(uncommonFromSentences(A2, B2)));
	}

}
