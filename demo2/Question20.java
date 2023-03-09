package Com.ojas.test2;

public class Question20 {

	static void rightRotate(int a[], int n, int k) {

		k = k % n;

		for (int i = 0; i < n; i++) {
			if (i < k) {

				System.out.print(a[n + i - k] + " ");
			} else {

				System.out.print(a[i - k] + " ");
			}
		}
		System.out.println();
	}

	public static void main(String args[]) {
		int Array[] = { 1, 2, 3, 4, 5, 6, 7  };
		int N = Array.length;

		int K = 2;
		rightRotate(Array, N, K);

	}
}
