import java.util.*;

class ArrayDemo
{
	public int Difference(int arr[])
	{
		int Even=0,Odd=0,i=0;
		
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]%2)==0)
			{
				Even = Even + arr[i];
			}
			else
			{
				Odd = Odd + arr[i];
			}
		}
		return (Even - Odd);
	}
	
	public void Display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%5)==0)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
	
	public void DisplayEven(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%5)==0&&(arr[i]%2)==0)
			{
				System.out.println(arr[i]+"\t");
			}
		}
	}
	
	public void DivisibleBy3(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%5)==0&&(arr[i]%3)==0)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
	
	
	public void Multiple11(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%11)==0)
			{
				System.out.print(arr[i]+"\t");
			}
		}
	}
	
	
}

class Demo57
{
	public static void main(String arg[])
	{
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int iSize=sobj.nextInt();
		
		int arr[]=new int[iSize];
		
		System.out.println("Enter the elements");
		
		for(int i=0;i<iSize;i++)
		{
			arr[i]=sobj.nextInt();
		}
		
		ArrayDemo aobj=new ArrayDemo();
		
		int iret=aobj.Difference(arr);
		System.out.println("The difference between even element and odd is "+iret);
		
		aobj.Display(arr);
		System.out.println();
		aobj.DisplayEven(arr);
		System.out.println();
		aobj.DivisibleBy3(arr);
		System.out.println();
		aobj.Multiple11(arr);
	}
}