

public class Practice2 {
	public static void main(String a[]) {
		int arr[] = new int[5];
		int j = 0;

		for (int i = 1; i <= 9; i++) {
			if (i % 2 == 1) {
				arr[j] = i;
				System.out.println(i + " - " + j);
				j++;
			}
		}
		int n = 1;
		for (j = 0; j <= 4; j++) {
			if (arr[j] == n) {
				for (int t = j; t < 4; t++) {
					arr[t] = arr[t + 1];
				}
			}
		}
		//int arr2[] = new int[5];
		arr[4] = 0;
		for (int p = 0; p < 5; p++) {
			System.out.print(arr[p] + " - " + p + "," + " ");
		}
	}
}
