import com.sun.xml.internal.ws.util.StringUtils;

public class MergeSort {
    public static void main(String args[]) {
        int[] arr = {6,8,7,5,3,2,4,1,9,12,13,3,5};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(StringUtils.join(ArrayUtils.toObject(arr), " "));
    }

	private static void mergeSort(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		
	}
}