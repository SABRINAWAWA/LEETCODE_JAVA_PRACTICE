import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// 599. Minimum Index Sum of Two Lists
public class MiniIndexSum {
	public static String[] findRestaurant(String[] list1, String[] list2) {
		ArrayList<String> result = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<>();
		
		if(list1.length>list2.length) {
			return findRestaurant(list2, list1);
		}
		
		for (int i = 0; i < list1.length; i++) {
			hm.put(list1[i], i);
		}
		
		int minSum = Integer.MAX_VALUE;
		
		for (int i = 0; i < list2.length; i++) {
			if (hm.containsKey(list2[i])) {
				int sum = hm.get(list2[i]) + i;
				if (sum < minSum) {
                    result = new ArrayList<>();
                    minSum = sum;
                }
				if (minSum == sum) {
					result.add(list2[i]);
				}
			}
		}
		return result.toArray(new String[result.size()]);
	}

	public static void main(String[] args) {
		String[] list1 = { "Shogun", "Tapioca Express", "Burger King", "KFC" };
		String[] list2 = { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" };
		System.out.println(Arrays.toString(findRestaurant(list1, list2)));
		
		String[] list3= {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list4= {"KFC","Shogun","Burger King"};
		System.out.println(Arrays.toString(findRestaurant(list3, list4)));
		
		String[] list5= {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list6= {"KFC","Burger King","Tapioca Express","Shogun"};
		System.out.println(Arrays.toString(findRestaurant(list5, list6)));
		
		String[] list7= {"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list8= {"KNN","KFC","Burger King","Tapioca Express","Shogun"};
		System.out.println(Arrays.toString(findRestaurant(list7, list8)));
		
		String[] list9= {"KFC"};
		String[] list10= {"KFC"};
		System.out.println(Arrays.toString(findRestaurant(list9, list10)));
	}

}
