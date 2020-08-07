import java.util.*;

class Pattern
{
	public void pattern(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				if((j>=i)&&(j<=i))
				{
					System.out.print("#\t");
				}
				else
				{
					System.out .print("*\t");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern1(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				if(i<j)
				{
					System.out.print("@\t");
				}
				else if((j>=i)&&(j<=i))
				{
					System.out.print("#\t");
				}
				else
				{
					System.out .print("*\t");
				}
			}
			System.out.println();
		}
	}
	public void pattern2(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				if(((j>=i)&&(j<=i))||(i==1)||(i==iRow)||(j==1)||(j==iCol))
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
	public void pattern3(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=iRow;i>=1;i--)
		{
			for(j=1;j<=iCol;j++)
			{
				if(((j>=i)&&(j<=i))||(i==1)||(i==iRow)||(j==1)||(j==iCol))
				{
					System.out.print("*\t");
				}
				else if(i<j)
				{
					System.out.print("$\t");
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
	}
	public void pattern4(int iRow,int iCol)
	{
		int i=0,j=0;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				if((i==j)||(i==1)||(i==iRow)||(j==1)||(j==iCol))
				{
					System.out.print(j+"\t");
				}
				else
				{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}
}

class Demo65
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int iRow = sobj.nextInt();
		
		System.out.println("Enter number of column");
		int iCol=sobj.nextInt();
		
		Pattern pobj= new Pattern();
		
		// pobj.pattern(iRow,iCol);
		// System.out.println();
		// pobj.pattern1(iRow,iCol);
		// System.out.println();
		// pobj.pattern2(iRow,iCol);
		// System.out.println();
		//pobj.pattern3(iRow,iCol);
		pobj.pattern4(iRow,iCol);
	}
}

