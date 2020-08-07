import java.util.*;

class Pattern
{
	public void pattern(String str)
	{
		int i=0,j=0;
		char arr[]=str.toCharArray();
		
		for(i=0;i<arr.length-1;i++)
		{
			for(j=0;j< arr.length;j++)
			{
				if(i>=j)
				{
					System.out.print(arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern1(String str)
	{
		int i=0,j=0;
		char arr[]=str.toCharArray();
		for(i=arr.length-1;i>=0;i--)
		{
			for(j=0;j<arr.length;j++)
			{
				if(j>i)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(arr[j]+"\t");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern2(String str)
	{
		int i=0,j=0;
		char arr[]=str.toCharArray();
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j< arr.length;j++)
			{
				if(i>=j)
				{
					System.out.print(arr[j]+"\t");
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
	}
	
	public void pattern3(String str)
	{
		int i=0,j=0;
		char arr[]=str.toCharArray();
		for(i=arr.length-1;i>=0;i--)
		{
			for(j=0;j<arr.length;j++)
			{
				if(j>i)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print(arr[j]+"\t");
				}
			}
			System.out.println();
		}
		
		for(i=1;i<arr.length;i++)
		{
			for(j=0;j< arr.length;j++)
			{
				if(i>=j)
				{
					System.out.print(arr[j]+"\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			System.out.println();
		}
				
	}
	
	
	public void pattern4(String str)
	{
		int i=0,j=0;
		char arr[]=str.toCharArray();
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j< arr.length;j++)
			{
				if(i>=j)
				{
					System.out.print(arr[j]+"\t");
				}
				else
				{
					System.out.print("#\t");
				}
			}
			System.out.println();
		}
		
		for(i=arr.length-2;i>=0;i--)
		{
			for(j=0;j<arr.length;j++)
			{
				if(j>i)
				{
					System.out.print("#\t");
				}
				else
				{
					System.out.print(arr[j]+"\t");
				}
			}
			System.out.println();
		}		
			
	}
}

class Demo64
{
	public static void main(String arg[])
	{
		Scanner sobj= new Scanner(System.in);
		 
		System.out.println("Enter the string");
		String str=sobj.nextLine();
		
		Pattern pobj= new Pattern();
		
		pobj.pattern(str);
		System.out.println();
		pobj.pattern1(str);
		System.out.println();
		pobj.pattern2(str);
		System.out.println();
		pobj.pattern3(str);
		System.out.println();
		pobj.pattern4(str);
	}
}