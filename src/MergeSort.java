import java.util.Random;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;


public class MergeSort {
    public static void main(String args[]) {
    	int arrSize = 30;
    	
		int[] arr = randomGen(arrSize);
        arr = mergeSort(arr, 0, arr.length - 1);
        System.out.println("Answer: " + StringUtils.join(ArrayUtils.toObject(arr), " "));
    }

	private static int[] mergeSort(int[] A, int p, int r) {
		int q;
		if (p < r) {
			q = (p+r)/2;
			A = mergeSort(A, p, q);
			A = mergeSort(A, q + 1, r);
			A = merge(A, p, q, r);
		}
		return A;
	}
	
	private static int[] merge(int[] A, int p, int q, int r) {

		int n1 = (q - p) + 1;
		int n2 = r - q;
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		int i = 0;
		int j = 0;
		
		for(; i < n1; i++) {
			left[i] = A[p+i];
		}
		for(; j < n2; j++) {
			right[j] = A[q+j+1];
		}
		
		left[i] = Integer.MAX_VALUE;
		right[j] = Integer.MAX_VALUE;
		i = 0; j = 0;

		for (int k = p; k <= r; k++) {
			if (left[i] > right[j]) {
				A[k] = right[j];
				j++;
			} else {
				A[k] = left[i];
				i++;
			}
		}
		return A;
	}

	private static int[] randomGen (int maxSize) {
		Random rand = new Random();
		int[] arr = new int [maxSize];
		for (int i = 0; i < maxSize; i++) {
			arr[i] = rand.nextInt(1000);
		}
        System.out.println("Generated: " + StringUtils.join(ArrayUtils.toObject(arr), " "));
		return arr;
	}
}