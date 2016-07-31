
public class PowerSet {
	 String str ;
	 
	public void sub(String set){
		str=set;
		System.out.print("{");
		System.out.print("{}");
		for(int i = 0; i< str.length();i++){ //traverse through all characters
			powerSet("",i);
			//System.out.print("R:" + i);
        }
		System.out.print("}");
	}
	
	private void powerSet(String substr,int index)
    {
        String s = ""+str.charAt(index); 
        s = substr+s; 
        System.out.print("{" + s + "}"); 

        for(int i=index+1;i<str.length();i++)
        	powerSet(s,i); 

    }
}
