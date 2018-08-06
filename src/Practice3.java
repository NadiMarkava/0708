package practice;

public class Practice3 {

	public static void main(String[] args) {

		int[] arr = { 5, 17, 23, 7, 54, 3 };
		for (int i = 0; i < arr.length; i++) {

			int min = arr[i];
			int min_i = i;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < min) {
					min = arr[j];
					min_i = j;
				}
			}

			if (i != min_i) {
				int tmp = arr[i];
				arr[i] = arr[min_i];
				arr[min_i] = tmp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "  " + " ");
		}
		{
			System.out.println(" ");
		}
		int last = arr.length;

		for (boolean sorted = last == 0; !sorted; --last) {
			sorted = true;
			for (int i = 1; i < last; ++i) {
				if (arr[i - 1] < arr[i]) {
					sorted = false;

					int tmp = arr[i - 1];
					arr[i - 1] = arr[i];
					arr[i] = tmp;

				}
			}
		}
		for (int p = 0; p < arr.length - 1; p++) {
			System.out.print(arr[p] + "  " + " ");
		}

	}
}
