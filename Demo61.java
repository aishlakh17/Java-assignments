import java.util.*;

class Pattern
{
	public void pattern(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch;
		for(i=1;i<=iRow;i++)
		{
			for(j=1,ch='A';j<=iCol;j++,ch++)
			{
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}
	 
	public void pattern1(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch;
		
		for(i=1;i<=iRow;i++)
		{
			if(i%2 ==0)
			{
				for(j=1,ch='a';j<=iCol;j++,ch++)
				{
					System.out.print(ch+"\t");
				}
			}
			else
			{
				for(j=1,ch='A';j<=iCol;j++,ch++)
				{
					System.out.print(ch+"\t");
					
				}
			}
			System.out.println();
		}
	}
	
	public void pattern2(int iRow,int iCol)
	{
		int i=0,j=0;
		char ch;
		for(i=1,ch='A';i<=iRow;i++,ch++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(ch+"\t");
			}
			System.out.println();
		}
	}
	
	public void pattern3(int iRow,int iCol)
	{
		int i=0,j=0;
		
		for(i=iRow;i>0;i--)
		{
			for(j=0;j<iCol;j++)
			{
				System.out.print(i+"\t");
			}
			
			System.out.println();
		}
	}
	
	public void pattern4(int iRow,int iCol)
	{
		int i=0,j=0,iCnt=1;
		for(i=1;i<=iRow;i++)
		{
			for(j=1;j<=iCol;j++)
			{
				System.out.print(iCnt+"\t");
				iCnt++;
			}
		System.out.println();
		}
	}
}

class Demo61
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of rows");
		int iRow=sobj.nextInt();
		System.out.println("Enter number of column");
		int iCol=sobj.nextInt();
		
		Pattern pobj= new Pattern();
		
		pobj.pattern(iRow,iCol);
		System.out.println();
		pobj.pattern1(iRow,iCol);
		System.out.println();
		pobj.pattern2(iRow,iCol);
		System.out.println();
		pobj.pattern3(iRow,iCol);
		System.out.println();
		pobj.pattern4(iRow,iCol);
	}
}
