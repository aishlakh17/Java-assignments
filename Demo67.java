import java.util.*;
class MyArray
{
	public int DiffArray(int arr1[],int arr2[])
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
		return iSum1-iSum2;
		
	}
	
	public void MinArray(int arr1[],int arr2[])
	{
		int i=0,imin1=arr1[0],imin2=arr2[0];
		for(i=0;i<arr1.length;i++)
		{
			if(imin1>arr1[i])
			{
				imin1=arr1[i];
			}
		}
		for(i=0;i<arr2.length;i++)
		{
			if(imin2>arr2[i])
			{
				imin2=arr2[i];
			}
		}
		
		System.out.println(imin1+"\t"+imin2);
	}
	
	public int[] CopyArrayRev(int arr[])
	{
		int crr[]=new int[arr.length];
		int i=0,ipos=0;
		for(i=arr.length-1,ipos=0;i>=0;i--,ipos++)
		{
			crr[ipos]=arr[i];
		}
		return crr;
	}
	
	public int[] CopyArray(int arr[])
	{
		int crr[]=new int[arr.length];
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			crr[i]=arr[i];
		}
		return crr;
	}
	public boolean ChkPallindrome(int arr[])
	{
		int iStart=0,iEnd=arr.length-1;
		while(iStart<=iEnd)
		{
			if(arr[iStart] !=arr[iEnd])
			{
				break;
			}
			iStart++;
			iEnd--;
		}
		
		if(iStart>iEnd)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
}

class Demo67
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
		
		// System.out.println("Enter number of elements for second array");
		// int iSize2=sobj.nextInt();
		
		// int arr2[]=new int[iSize2];
		// System.out.println("Enter the elements");
		// for(i=0;i<iSize2;i++)
		// {
			// arr2[i]=sobj.nextInt();
		// }
		
		MyArray mobj= new MyArray();
		int iret=0;
		// iret = mobj.DiffArray(arr1,arr2);
		// System.out.println("The difference is "+iret);
		//mobj.MinArray(arr1,arr2);
		// int brr[]=new int[arr1.length];
		// brr=mobj.CopyArrayRev(arr1);
		
		// for(i=0;i<brr.length;i++)
		// {
			// System.out.print(brr[i]+"\t");
		// }
		// System.out.println();
		// brr=mobj.CopyArray(arr1);
		
		// for(i=0;i<brr.length;i++)
		// {
			// System.out.print(brr[i]+"\t");
		// }
		boolean bret=mobj.ChkPallindrome(arr1);
		if(bret)
		{
			System.out.println("The array is pallindrome");
		}
		else
		{
			System.out.println("The array is not pallindrome");
		}
	}
}