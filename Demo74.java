import java.util.*;

/* public class Demo74
{
	public static void main(String args[])
	{
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter number of elements\n");
		int iSize=sobj.nextInt();
		
		int arr[][]=new int[iSize][iSize];
		int brr[][]=new int[iSize][iSize];
		int crr[][]=new int[iSize][iSize];
		System.out.println("Enter the elements of 1st array\n");
		
		for(int i=0;i<iSize;i++)
		{
			for(int j=0;j<iSize;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		
		System.out.println("Enter the elements of 2nd array\n");
		
		for(int i=0;i<iSize;i++)
		{
			for(int j=0;j<iSize;j++)
			{
				brr[i][j]=sobj.nextInt();
			}
		}
		
		for(int i=0;i<iSize;i++)
		{
			for(int j=0;j<iSize;j++)
			{
				crr[i][j]=arr[i][j]+brr[i][j];
			}
		}
		
		System.out.println("\n");
		for(int i=0;i<iSize;i++)
		{
			for(int j=0;j<iSize;j++)
			{
				System.out.print(crr[i][j]+"\t");
			}
			System.out.println("\n");
		}
		
	}
}	 */


/**2. Write java program to print below pattern. 
        *
       * *       
	  * * *  
     * * * *     
	* * * * * 
*/
public class Demo74
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter Number f rows");
		int iRows = sobj.nextInt();
		
		int iCol= (2*iRows)-1;
		
		for(int i=iRows;i>=1;i--)
		{
			for(int j=iCol;j>=1;j--)
			{
				if((i%2)!=0 && (j%2)!=0 && (j>=i) &&(i<=j)&&j<=(2*i)+1)
				{
					System.out.print("* ");
				}
				else if((i%2)==0 && (j%2)==0&& (j>=i)&&(i<=j)&& j <=(2*i))
				{
					System.out.print("* ");
				}
				else //if((i%2==0 &&j > 2*iRows)||(i%2 != 0 && j> (2*i)+1))
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
	
































