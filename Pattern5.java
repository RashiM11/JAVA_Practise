/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int n=5;
	
		for(int row=0;row<2*n;row++)
		{
		    int totalcolinrows= row>n ? 2*n-row :row;
		    for(int j=0;j<totalcolinrows;j++)
		    {
		        System.out.print("*");
		    }
		 System.out.println(" ");  
	}
}



}
// output: 

 
* 
** 
*** 
**** 
***** 
**** 
*** 
** 
* 
