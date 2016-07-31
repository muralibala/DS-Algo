
public class MergeSortedArray {
	
	public static void moveFirstToEnd(int[] array) {
		
		int i=0;
		int j=array.length-1;
		for(i=array.length-1;i>=0;i--){
			if(array[i]!=0){
				array[j]=array[i];
				j--;
			}
		}
	}
	public static void mergeFirstIntoAnother(int[] intArrShort,int[] intArrLong) {
		
		int i=intArrShort.length;
		int j=0;
		int k=0;
		
		moveFirstToEnd(intArrLong);
		
		while(k<intArrLong.length){
			
		if( ( i<intArrLong.length  &&  intArrLong[i]<=intArrShort[j] ) || ( j==intArrShort.length ) ){
			
			intArrLong[k]=intArrLong[i];
			k++;
			i++;
		}
		else{
			
			intArrLong[k]=intArrShort[j];
			k++;
			j++;
		}
		
	  }
	}
}
