import java.util.*;
import java.lang.*;

class Matrices
{
	public void SwapRows(int arr[][],int iRow,int iCol)
	{
		int i=0,j=0,temp=0;
		for(i=0;i<iRow;i=i+2)
		{
			for(j=0;j<iCol;j++)
			{
				temp=arr[i+1][j];
				arr[i+1][j]=arr[i][j];
				arr[i][j]=temp;
			}
		}
	}
	
	public void SwapColumn(int arr[][],int iRow,int iCol)
	{
		int i=0,j=0,temp=0;
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j=j+2)
			{
				temp=arr[i][j+1];
				arr[i][j+1]=arr[i][j];
				arr[i][j]=temp;
			}
		}
	}
	
	public int[][] Transpose(int arr[][],int iRow,int iCol)
	{
		int i=0,j=0;
		int brr[][]=new int[iRow][iCol];
		
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				brr[j][i]=arr[i][j];
			}
		}
		return brr;
	}
	public void TraceAndNormal(int arr[][],int iRow,int iCol)
	{
		int i=0,j=0,Trace=0,iSum=0;
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if(i==j)
				{
					Trace=Trace+arr[i][j];
				}
				iSum=iSum+arr[i][j];
			}
		}
		System.out.print("Trace is "+Trace+" and Noraml of Matrix is "+Math.sqrt(iSum));
	}
	
	public int BorderSum(int arr[][],int iRow,int iCol)
	{
		int i=0,j=0,iSum=0;
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				if((i==0)||(i==iRow-1)||(j==0)||(j==iCol-1))
				{
					iSum=iSum+arr[i][j];
				}
			}
		}
		
		return iSum;
	}
}

class Demo70
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int iRow=sobj.nextInt();
		System.out.println("Enter number of column");
		int iCol=sobj.nextInt();
		int arr[][]=new int[iRow][iCol];
		
		int i=0,j=0;
		System.out.println("Enter elements");
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		for(i=0;i<iRow;i++)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
			
		}
		System.out.println("Swapping of rows");
		Matrices mobj=new Matrices();
		// mobj.SwapRows(arr,iRow,iCol);
		// for(i=0;i<iRow;i++)
		// {
			// for(j=0;j<iCol;j++)
			// {
				// System.out.print(arr[i][j]+"\t");
			// }
			// System.out.println();
			
		// }
		// System.out.println("Swapping of column");
		// mobj.SwapColumn(arr,iRow,iCol);
		// for(i=0;i<iRow;i++)
		// {
			// for(j=0;j<iCol;j++)
			// {
				// System.out.print(arr[i][j]+"\t");
			// }
			// System.out.println();
			
		// }
		// System.out.println("Transpose");
		// int brr[][]=new int[iRow][iCol];
		// brr=mobj.Transpose(arr,iRow,iCol);
		// for(i=0;i<iRow;i++)
		// {
			// for(j=0;j<iCol;j++)
			// {
				// System.out.print(brr[i][j]+"\t");
			// }
			// System.out.println();
			
		// }
		//mobj.TraceAndNormal(arr,iRow,iCol);
		int iret=0;
		iret=mobj.BorderSum(arr,iRow,iCol);
		System.out.println("The sum of order element is "+iret);
	}
}

		