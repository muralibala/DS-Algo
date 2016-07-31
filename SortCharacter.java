
public class SortCharacter {
	
	public static String sort(String sentence){
		char[] a = sentence.toCharArray();
		int[] b = new int[a.length];
		int maxValue=0;
		for(int i=0; i<a.length;i++){
			b[i] = (int) a[i];
			if(b[i]>maxValue)
				maxValue=b[i];
		}
		int[] c = bucketsort(b,maxValue);
		String s="";
		for(int i=0; i<c.length;i++){
			s += Character.toString((char) c[i]);
			//System.out.print(s);
		}
		return s;
	}
	
	private static int[] bucketsort(int[] arr, int maxValue) {
		int[] bucket = new int[maxValue+1];

		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;
		}

		int outPos = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = 0; j < bucket[i]; j++) {
				arr[outPos++] = i;
			}
		}
		return arr;
	}
}
