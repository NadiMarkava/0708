

public class Practice {

	public static void main(String a[]) {
		int arr[] = new int[5];
		int j = 0;

		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 1) {
				arr[j] = i;
				System.out.print(i + " - " + j + "," + " ");
				j++;

			}
		}

		System.out.println();

		int k = 5;

		for (j = 0; j <= 4; j++) {
			if (arr[j] == k) {
				for (int t = j; t < 4; t++) {
					arr[t] = arr[t + 1];
				}
			}
		}
//		 int arr[] = new int[5];
		for (int p = 0; p < 5; p++) {
			System.out.println(arr[p] + " - " + p);
		}
	}
}