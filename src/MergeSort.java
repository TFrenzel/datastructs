import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;


public class MergeSort {
	public static int[] arr = {6,8,7,5,3,2,4,1,9,12,13,3,5};
    public static void main(String args[]) {
        mergeSort(arr, 0, arr.length-1);
        System.out.println(StringUtils.join(ArrayUtils.toObject(arr), " "));
    }

	private static int[] mergeSort(int[] A, int p, int r) {
		int q;
		if (p<r) {
			q = (p+r)/2;
			mergeSort(A, p, q);
			mergeSort(A, q+1, r);
			merge(A, p, q, r);
		}
		return A;
	}
	
	private static int[] merge(int[] A, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		int[] left = new int[n1 + 1];
		int[] right = new int[n2 + 1];
		int i = 0;
		int j = 0;
		
		for(; i < n1; i++) {
			left[i] = A[p+i+1];
		}
		for(; j < n2; j++) {
			right[j] = A[q+j];
		}
		
		left[i] = Integer.MAX_VALUE;
		right[j] = Integer.MAX_VALUE;
		i = 0; j = 0;
		
		for (int k = p; k < r; k++) {
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
}