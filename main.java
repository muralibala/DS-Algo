import java.util.Arrays;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	private static void maxLenMatchingParen() {
		// TODO Auto-generated method stub
		String strParenExpression="()()()";
		MatchingMaxLenParans.maxLenMatchingParen(strParenExpression);
	}

	private static void matchingParans(){
		String data = "(({1+2}*3))";
		MatchingParans m = new MatchingParans();
		System.out.println(m.IsMatchingParantheses(data));
	}
	
	private static void printAllPaths(){
		PrintBinaryTree.Node root = new PrintBinaryTree.Node(1);
	    root.left = new PrintBinaryTree.Node(2);
	    root.right = new PrintBinaryTree.Node(3);
	    root.left.left = new PrintBinaryTree.Node(4);
	    root.left.right = new PrintBinaryTree.Node(5);
	    root.right.left = new PrintBinaryTree.Node(6);
	    root.right.right = new PrintBinaryTree.Node(7);
        PrintBinaryTree.printAllPaths(root);
	}
	
	private static void mergeSortedArray(){
		// TODO Auto-generated method stub
		int mPlusN[] = { 2, 8, 0, 0, 0, 13, 0, 15, 20 };
		int N[] = { 5, 7, 9, 25 };

		MergeSortedArray.mergeFirstIntoAnother(N, mPlusN);
		for (int i = 0; i <= mPlusN.length - 1; i++)
			System.out.print("" + mPlusN[i] + "\t");
		
	}
	
	private static void findDuplicatesInArray(){
		int arr[]={1,7,4,3,2,7,4};
		FindDuplicatesInArray.find(arr, 7);
	}
	private static void groupNumber() {
		int arr[]={3, 6, 9 ,2, 4, 10, 34, 21, 5};
		arr = GroupNumbers.group(arr);
		 for(int val:arr){
	            System.out.print(val +"  ");
	        }
	}
    private static void sortCharacter() {
		// TODO Auto-generated method stub
    	String sentence = "The quick brown fox jumps over the lazy dog";
    	String s = SortCharacter.sort(sentence);
    	System.out.println(s);    	
	}
    
    public static void quickSort() {
    	int listToSort[] = new int[] {6, 5, 4, 2, 1, 10, 3, 7, 8, 9};
    	Sorting.quickSort(listToSort, 0, listToSort.length - 1);
    }
	
	private static void toRoman() {
		for (int i = 1; i<= 100; i++) {
			System.out.println(i+"\t =\t "+RomanNumber.toRoman(i));
	    }
		int i=43;
		System.out.println(i+"\t =\t "+RomanNumber.toRoman(i));
	}

	private static void subString() {
		int pos = Miscellaneous.subString("HelloWorld", "Wor");
		System.out.println(pos);
	}

	private static void reverse() {
		Miscellaneous.reverseString("Hello World");
		Miscellaneous.reverseNumber(1234);
	}

	private static void multiplyTables() {
		Miscellaneous.multTables(20);
	}

	private static void printOddEven() {
		Miscellaneous.printOdds(10);
		Miscellaneous.printEvens(10);
	}

	private static void fibonaaci() {
		Scanner input=new Scanner(System.in);
       System.out.print("Enter n");
       int n=input.nextInt();
       Miscellaneous.fibonacci2(n);
	}
	private static void powerSet() {
		System.out.println("");
		System.out.println("-------------");
		PowerSet ps = new PowerSet();
		ps.sub("xy");
	}
	
	private static void selectionSort() {
		int listToSort[] = new int[] {4, 5, 6, 2, 1, 7, 10, 3, 8, 9};
		
		Sorting.selectionSort(listToSort);
	}

	private static void bucketSort() {
		int[] arr= {5,3,0,2,4,1,0,5,2,3,1,4};
		int maxValue = 5;
		System.out.println("Before: " + Arrays.toString(arr));
		Sorting.bucketsort(arr, maxValue);
	    System.out.println("After:  " + Arrays.toString(arr));
	}

	private static void towerofHanoi() {
		towerofhanoi t= new towerofhanoi();
		int tr = t.move(10, "A","C", "B");
		System.out.println("Total:" + tr);
	}


	public static int fRec(int k, int n) {
		if (n == k)
			return k;
		else if (n > k)
			return fRec(k, n - k);
		else
			return fRec(k - n, n);
	}
	
	public static int recTest(int a, int b) { 
		if (b==1) 
		return a; 
		return a + recTest(a,b-1); 
	}
	
}
