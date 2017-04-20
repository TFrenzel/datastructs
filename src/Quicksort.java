public class Quicksort {

	public static void sort(int[] array) {
		sort(array, 0, array.length - 1);
	}

	public static void sort(int[] array, int p, int r) {
		if (array == null || array.length == 0)
			return;
		if (p < r) {
			int q = partition(array, p, r);
			sort(array, p, q - 1);
			sort(array, q + 1, r);
		}
	}

	public static int partition(int[] array, int left, int right) {
		int pivot = array[right];
		int i = left - 1;
		for (int j = left; j < right; j++) {
			if (array[j] <= pivot) {
				i++;
				swap(array, i, j);
			}
		}
		swap(array, i + 1, right);
		return i + 1;
	}

	public static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		int[] array = { 5, 4, 8, 2, 1, 10, 9, 3 };
		Quicksort.sort(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

}