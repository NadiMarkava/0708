

import java.util.Arrays;

public class Practice4 {

	public static void main(String[] args) {

		String[] array = { "its", "me", "hello", "how", "are", "you" };
		System.out.println(Arrays.toString(array));
		sortingByAbc(array);
//		String s1 = "hallo";
		// System.out.println(Arrays.toString(array));

	}

	public static void sortingByAbc(String[] arr) {
		for (int j = arr.length - 1; j > 0; j--) {
			for (int b = 0; b < j; b++) {
				if (arr[b].compareTo(arr[b + 1]) > 0) {
					String v = arr[b];
					arr[b] = arr[b + 1];
					arr[b + 1] = v;
				}
			}
		}

//		 Arrays.sort(strarr);
//		 System.out.println(Arrays.toString(strarr));
		
		 System.out.println();

		String arrwords[] = { "Welcome", "to", "San francisco", "one", "love" };
		for (int i = 0; i < arrwords.length; i++) {
			for (int j = 0; j < arrwords.length; j++) {
				if (arrwords[i].length() < arrwords[j].length()) {
					String word = arrwords[i];
					arrwords[i] = arrwords[j];
					arrwords[j] = word;
				}
			}
		}
		System.out.println(Arrays.toString(arrwords));

	}
	
}
