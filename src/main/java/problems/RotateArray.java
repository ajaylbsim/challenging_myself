/**
 * @Ajay Mishra
 */
package problems;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };
		print(arr);
		rotate(arr, 3, gcd(5, 3));
	}

	public static void rotate(int[] array, int d, int gcd) {
		int n = array.length;
		for (int i = 0; i < gcd; i++) {
			int temp = array[i];
			int j = i;
			while (true) {
				int k = j + d;
				if (k >= n)
					k = k - n;

				array[j] = array[k];
				if (k == i)
					break;
				j = k;
			}
			array[j] = temp;
		}

		print(array);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);

	}
}
