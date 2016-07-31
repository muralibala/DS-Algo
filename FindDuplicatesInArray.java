
public class FindDuplicatesInArray {
	
	  
	  public static void find(int[] bucket, int num) {
	    
	    int sortedNum[] = new int[10];
	    
	    for (int ctr=0; ctr<num;ctr++) { 
	      sortedNum[bucket[ctr]]++;
	    }
	    
	    int x=0;
		while(sortedNum[x]!=0) {
	        System.out.print((x) + " ");
	        sortedNum[x]--;  
	      }
	    
	    for (int x1=0; x1<=num; x1++) { //printing sorted numbers
	      while(sortedNum[x1]!=0) {
	        System.out.print((x1) + " ");
	        sortedNum[x1]--;  
	      }
	    }
	    
	  }
	
}
