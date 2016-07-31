import java.io.BufferedReader;
import java.io.FileReader;

public class Miscellaneous {

	public static void reverseString(String stringtoReverse)
	{
		String[] s = stringtoReverse.split("");
		String newString="";
		for(int i = s.length; i >0; i--)
		{
			System.out.println(s[i-1]);
			newString += s[i-1];
		}
		System.out.println(newString);
	}
	
	public static int subString(String str, String tofind){
		int ret=0;
		String[] s = str.split("");
		String[] f = tofind.split("");
		for (int i=0;  i< s.length; i++)
		{
			//System.out.println(s[i] + " " + f[0]);
			if(s[i].toString().equals(f[0].toString()))
			{
				System.out.println("Found " + s[i] + " at " + i);
				ret = i;
				for(int j=0; j< f.length; j++)
				{
					System.out.println("Found " + s[i+j] + " " + f[j]);
					if(!s[i + j].toString().equals(f[j].toString()))
					{
						ret=0;
						break;
					}
				}	
			}
			
		}
		return ret;
	}
	
	public static int reverseNumber(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            System.out.println(number + "\t" + remainder);
            reverse = reverse*10 + remainder;
            System.out.println(reverse);
            number = number/10;
          
        }while(number > 0);
      
        return reverse;
    }

	public static boolean isPalindrome(char[] word){
	    int i1 = 0;
	    int i2 = word.length - 1;
	    while (i2 > i1) {
	        if (word[i1] != word[i2]) {
	            return false;
	        }
	        ++i1;
	        --i2;
	    }
	    return true;
	}
	
	public static boolean isPalindrome(String str) {
	    return str.equals(new StringBuffer().append(str).reverse().toString());
	}
	
	public static final String Empty = "";
	static Boolean isPalindromeRecursion(String strInput)
    {
        if (strInput.length() >0)    
            strInput = strInput.replace(".", Empty).replace(" ", Empty).replace(",", Empty).toLowerCase();
        
        if (strInput.length() == 1 || strInput.length() == 0 )  
            return true;

        if (strInput.charAt(0) != strInput.charAt(strInput.length() - 1))
            return false;
        else
            return isPalindrome(strInput.substring(1, strInput.length() - 2));

    }
	
	//write function to multiply 2 tables
	public static void multTables ( int max )
    {
        for ( int i = 1; i <= max; i++ ) {
            for ( int j = 1; j <= max; j++ ) {
                System.out.print ( String.format ( "%4d", j * i ));
            }
            System.out.println();
        }
    }	
	
	//Example 5:  Write function to print the odd numbers from 1 to 99.
    public static void printOdds(int max) {
        for (int i = 1; i < max; i += 2) {
            System.out.println ( i );
        }
    }
    
    //Write function to print Even numbers
    public static void printEvens(int max) {
        for (int i = 2; i < max; i += 2) {
            System.out.println ( i );
        }
    }
    
    //Example 6:  Find the largest int value in an int array.
        public static int largest ( int[] input ) {
        int max = Integer.MIN_VALUE;
        for ( int i = 0; i < input.length; i++ ) {
            if ( input[i] > max ) max = input[i];
            }
            return max;
        }

      //  Example 4:  Write a function that sums up integers from a text file, one int per line.

            public static void sumFile ( String name ) {
                try {
                    int total = 0;
                    BufferedReader in = new BufferedReader ( new FileReader ( name ));
                    for ( String s = in.readLine(); s != null; s = in.readLine() ) {
                        total += Integer.parseInt ( s );
                    }
                    System.out.println ( total );
                    in.close();
                }
                catch ( Exception xc ) {
                    xc.printStackTrace();
                }
            }

	public static void fibonacci2(int n) {

		int count = 1;
		int c = 1, b = 1, a = 0;
		while (count <= n) {
			c = b + a;
			System.out.print(c);
			System.out.println();
			a = b;
			b = c;
			count++;
		}
	}  
	
	public int fibonacci(int n) {
		  if(n==0)
		    return 0;
		  if(n==1)
		    return 1;
		  
		  return fibonacci(n-1) + fibonacci(n-2);
		  
	}
	/*We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).
bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
*/
	public int bunnyEars2(int bunnies) {
		  int count=0;
		  if(bunnies==0)
		    return 0;
		  
		  if(bunnies % 2 ==0)
		    count= 3;
		  else if(bunnies % 2 !=0)
		    count= 2;
		  
		  return count + bunnyEars2(bunnies-1);
		  
		}

	
	/*
	 * 
	 * We have triangle made of blocks. The topmost row has 1 block, the next row down has 2 blocks, the next row has 3 blocks, and so on. Compute recursively (no loops or multiplication) the total number of blocks in such a triangle with the given number of rows.
		triangle(0) → 0
		triangle(1) → 1
		triangle(2) → 3

	 */
	public int triangle(int rows) {
		  if(rows==0)
		    return 0;
		  
		  if(rows==1)
		    return 1;
		    
		  return rows + triangle(rows-1);
		}

	
	
	
	/*
	Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

			sumDigits(126) → 9
			sumDigits(49) → 13
			sumDigits(12) → 3
	 */
	
	public int sumDigits(int n) {
		  int a=0;
		  
		  if(n==0)
		    return 0;
		    
		  if(n>=10) {
		    a = n % 10;
		    n = n/10;
		  }
		  else
		    return n;
		    
		  return a + sumDigits(n);
		  
		}

	//Your teacher has given you the task of drawing a staircase structure. 
	//Being an expert programmer, you decided to make a program to draw it for you instead. 
	//Given the required height, can you print a staircase as shown in the example?
	//Print a staircase of height  that consists of # symbols and spaces. For example for , here's a staircase of that height:

	static void printStaircase(int n) {
        String t = "";
        for(int i =1; i<=n; i++){
            t=new String(" ", n-i) + new String("#", i);
            System.out.println(t);
        }
    }
	
	
	/*
	 * Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
		count7(717) → 2
		count7(7) → 1
		count7(123) → 0
	 */
	public int count7(int n) {
		  int count=0;
		  
		  if(n==7){
		    count = 1;
		    return count;
		  }
		  if(n>10){
		    if(n %10 ==7){
		      count=1;
		    }
		    n = n/10;
		  }
		  else
		    return 0;
		    
		  return count + count7(n);
		}
	
	/*
	 * Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit, 
	 * except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4. 
	 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
		count8(8) → 1
		count8(818) → 2
		count8(8818) → 4

	 */
public int count8(int n) {
	  int count=0;
	  
	  if(n==8){
	    count = 1;
	    return count;
	  }
	  
	  if(n>10){
	    if(n%100 == 88 && n%10 == 8){
	      count=2;
	    }
	    else if(n%10 == 8){
	      count=1;
	    }
	    n = n/10;
	  }
	  else
	    return 0;
	    
	  return count + count8(n);

	}
}
