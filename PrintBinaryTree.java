
public class PrintBinaryTree {
	public static class Node{
		int val;
		Node left,right;
		public Node(int a) {val=a;}
	}
	
	public static void printAllPaths(Node root){
		printPaths(root,"");
	}
	private static void printPaths(Node n, String str) {
		if(n.left==null && n.right==null) {
			System.out.println(str+" "+n.val);
			return;
		}
		printPaths(n.left,str+" "+n.val);
		printPaths(n.right,str+" "+n.val);
	}
}
