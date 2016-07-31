
public class Sorting {
	public static void bucketsort(int[] arr, int maxValue) {

		int[] bucket = new int[maxValue + 1];

		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				arr[outPos++] = i;
			}
		}
	}
	
    public static void selectionSort(int[] listToSort) {
        for (int i = 0; i < listToSort.length; i++) {
            for (int j = i + 1; j < listToSort.length; j++) {
                if (listToSort[i] > listToSort[j]) {
                    //swap(listToSort, i, j);
                	int temp = listToSort[i];
                	listToSort[i] = listToSort[j];
                    listToSort[j] = temp;
                    System.out.println("Swapping " + listToSort[i] + " with " +  listToSort[j]);
                }
            }
            print(listToSort);
        }
    }
    
    public static void quickSort(int[] listToSort, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivotIndex = partition(listToSort, low, high);
        quickSort(listToSort, low, pivotIndex - 1);
        quickSort(listToSort, pivotIndex + 1, high);
    }

    public static int partition(int[] listToSort, int low, int high) {
        int pivot = listToSort[low];
        int l = low;
        int h = high;
        while (l < h) {
            while (listToSort[l] < pivot) {
                l++;
            }
            while (listToSort[h] > pivot) {
                h--;
            }
            swap(listToSort, l, h);
        }

        System.out.println("Pivot: " + pivot);
        print(listToSort);
        return h;
    }
    
    /* Common Functions */
    public static void print(int[] listToSort) {
        for (int el : listToSort) {
            System.out.print(el + ",");
        }
        System.out.println();
    }

    public static void swap(int[] listToSort, int iIndex, int jIndex) {
        int temp = listToSort[iIndex];
        listToSort[iIndex] = listToSort[jIndex];
        listToSort[jIndex] = temp;
    }

}
