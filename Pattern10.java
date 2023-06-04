/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	int n=5;
	int m=2*n;
	
	for(int row=0;row<=m;row++)
	{
	    for(int col=0;col<=m;col++)
	    {
	        int indexnum=n-Math.min(Math.min(row,col),Math.min(m-row,m-col));  //Main approach is to find min distance of that index from all 4 corners whatever be the minimum distance that number is printed.
	        
	        System.out.print(" "+indexnum);
	    }
	    System.out.println(" ");
	    
	}
  
}	
	
}

//output:

 5 5 5 5 5 5 5 5 5 5 5 
 5 4 4 4 4 4 4 4 4 4 5 
 5 4 3 3 3 3 3 3 3 4 5 
 5 4 3 2 2 2 2 2 3 4 5 
 5 4 3 2 1 1 1 2 3 4 5 
 5 4 3 2 1 0 1 2 3 4 5 
 5 4 3 2 1 1 1 2 3 4 5 
 5 4 3 2 2 2 2 2 3 4 5 
 5 4 3 3 3 3 3 3 3 4 5 
 5 4 4 4 4 4 4 4 4 4 5 
 5 5 5 5 5 5 5 5 5 5 5 

