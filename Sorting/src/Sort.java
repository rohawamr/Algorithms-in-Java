public class Sort {

	// Buble Sort
	// if in one pass not a single swap occurs then list is already sorted
	// Consider 9 2 3 6 8., only one pass would suffice the result
	// Bubble sort has O(n*n) for n iterations of passes and n comparisons or
	// pass through each n elements
	// https://www.youtube.com/watch?v=8Kp-8OGwphY

	private double a[];
	private int n;

	public Sort(int max) {
		a = new double[max];
		n = 0;

	}

	public void insert(int e) {
		a[n] = e;
		n++;
	}

	public void display() {
		System.out.println();
		for (double i : a) {
			System.out.print(i);
		}
	}

	public void Bubblesort() {
		int in, out;
		int f = 1;
		for (out = n - 1; out > 0 && f == 1; out--) { // pass
			f = 0;
			for (in = 0; in < out; in++) { // compare adjacent elements in the
											// loop
				if (a[in] > a[in + 1]) { // swap if out of order
					swap(in, in + 1);
					f = 1;
				}
			}
		}
	}

	public void swap(int i, int j) {
		double temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public void SelectionSort() {
		int i, j, min;
		for (i = 0; i < n - 1; i++) {
			min = i;
			for (j = i; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(i, min);
			}
		}

	}

	public void InsertionSort() {
		int i, j;
		double e;
		for (i = 1; i < n; i++) {
			j = i;
			e = a[i];
			while (j > 0 && a[j - 1] > e) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = e;
		}
	}

	public void ShellSort() {
		int inner, outer, h = 1;
		double temp;

		while (h < n / 3) {
			h = (h * 3) + 1;
		}

		while (h > 0) {
			for (outer = h; outer < n; outer++) {
				temp = a[outer];
				inner = outer;
				// one subpass (eg 0, 4,8)
				while (inner > h - 1 && a[inner - h] >= temp) {
					a[inner] = a[inner - h];
					inner -= h;
				}
				a[inner] = temp;
			}
			h = (h - 1) / 3;
		}

	}

}
