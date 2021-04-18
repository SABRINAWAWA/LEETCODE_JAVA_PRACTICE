import java.util.ArrayList;
import java.util.Collections;

public class TwoSumIII {
	ArrayList<Integer> result;

	/** Initialize your data structure here. */
	public TwoSumIII() {
		result = new ArrayList<Integer>();
	}

	/** Add the number to an internal data structure.. */
	public void add(int number) {
		result.add(number);
	}

	/** Find if there exists any pair of numbers which sum is equal to the value. */
	public boolean find(int value) {
		Collections.sort(result);
		int first = 0;
		int last = result.size() - 1;
		while (first < last) {
			int sum = result.get(first) + result.get(last);
			if (sum == value)
				return true;
			if (sum < value) {
				first++;
			} else {
				last--;
			}
		}
		return false;
	}
}
