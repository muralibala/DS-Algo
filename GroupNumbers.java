
public class GroupNumbers {
	public static int[] group(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int tmp;
		while (i < j) {
			if(isEven(arr[i]) && isOdd(arr[j])) {
				i++;
				j--;
			} else if(!isEven(arr[i]) && !isOdd(arr[j])) {
				tmp = arr[i];
				arr[i] = arr[j];
				arr[j] = tmp;
			} else if(isEven(arr[i])){
				i++;
			} else {
				j--;
			}
		}
		return arr;
	}
	
	public static boolean isOdd(int i) {
        return (i & 1) != 0;
    }
    public static boolean isEven(int i) {
        return (i & 1) == 0;
    }
    
	private static void swap(int pos1, int pos2, int[] arr) {
        int temp = arr[pos1];
        arr[pos1]= arr[pos2];
        arr[pos2]= temp;
    }
}
