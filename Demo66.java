import java.util.*;

class MyArray
{
	public void Display(int arr1[],int arr2[])
	{
		int i=0;
		for(i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+"\t");
		}
		System.out.println();
		for(i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+"\t");
		}
	}
	public void Display1(int arr1[],int arr2[])
	{
		int i=0;
		for(i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2 == 0)
			{
			System.out.print(arr1[i]+"\t");
			}
		}
		System.out.println();
		for(i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2 == 0)
			{
			System.out.print(arr2[i]+"\t");
			}
		}
	}
	public void Display2(int arr1[],int arr2[])
	{
		int i=0;
		for(i=0;i<arr1.length;i++)
		{
			if(arr1[i]%2 != 0)
			{
			System.out.print(arr1[i]+"\t");
			}
		}
		System.out.println();
		for(i=0;i<arr2.length;i++)
		{
			if(arr2[i]%2 != 0)
			{
			System.out.print(arr2[i]+"\t");
			}
		}
	}
	public int[] ArrayConcate(int arr1[],int iSize1,int arr2[],int iSize2)
	{
		int i=0;
		int crr[]=new int[iSize1+iSize2];
		
		for(i=0;i<iSize1;i++)
		{
			crr[i]=arr1[i];
		}
		int ipos=0;
		for(ipos=0,i=iSize1;i<crr.length;i++,ipos++)
		{
			
			crr[i]=arr2[ipos];
		}
		return crr;
	}
	
	
	public void SumArray(int arr1[],int arr2[])
	{
		int i=0,iSum1=0,iSum2=0;
		for(i=0;i<arr1.length;i++)
		{
			iSum1=iSum1+arr1[i];
		}
		for(i=0;i<arr2.length;i++)
		{
			iSum2=iSum2+arr2[i];
		}
		System.out.print(iSum1+"\t"+iSum2);
		
	}
}
class Demo66
{
	public static void main(String arg[])
	{
		Scanner sobj= new Scanner(System.in);
		
		System.out.println("Enter number of elements for first array");
		int iSize1=sobj.nextInt();
		
		int arr1[]=new int[iSize1];
		int i=0;
		System.out.println("Enter the elements");
		for(i=0;i<iSize1;i++)
		{
			arr1[i]=sobj.nextInt();
		}
		
		System.out.println("Enter number of elements for second array");
		int iSize2=sobj.nextInt();
		
		int arr2[]=new int[iSize2];
		System.out.println("Enter the elements");
		for(i=0;i<iSize2;i++)
		{
			arr2[i]=sobj.nextInt();
		}
		
		MyArray mobj= new MyArray();
		// mobj.Display(arr1,arr2);
		
		// System.out.println();
		// mobj.Display1(arr1,arr2);
		// System.out.println();
		//mobj.Display2(arr1,arr2);
		int arr[]=new int[iSize1+iSize2];
		arr=mobj.ArrayConcate(arr1,iSize1,arr2,iSize2);
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		mobj.SumArray(arr1,arr2);
	}
}