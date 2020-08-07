import java.util.*;

class MyArray
{
	public void ReverseArray(int arr[])
	{
		int i=0,iDigit=0,iRev=0;
		for(i=0;i<arr.length;i++)
		{
			iRev=0;
			while(arr[i]>0)
			{
			iDigit=arr[i]%10;
			iRev=iRev*10+iDigit;
			arr[i]=arr[i]/10;
			}
			arr[i]=iRev;
		}		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	public void SumArray(int arr[])
	{
		int i=0,iDigit=0,iSum=0;
		for(i=0;i<arr.length;i++)
		{
			iSum=0;
			while(arr[i]>0)
			{
				iDigit=arr[i]%10;
				iSum=iSum+iDigit;
				arr[i]=arr[i]/10;
			}
			arr[i]=iSum;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	public int ArrayCapital(char arr[])
	{
		int i=0,iCnt=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
	}
	public void Percentage(float arr[])
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] < 35)
			{
				System.out.println(arr[i]+"\t Fail");
			}
			else if(arr[i] < 50)
			{
				System.out.println(arr[i]+"\t Pass class");
			}
			else if(arr[i] < 60)
			{
				System.out.println(arr[i]+"\t Second class");
			}
			else if(arr[i] < 70)
			{
				System.out.println(arr[i]+"\t First class");
			}
			else if(arr[i]>=70)
			{
				System.out.println(arr[i]+"\t First class with distinction");
			}
		}
	}
				
}

class Demo68
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements array");
		int iSize=sobj.nextInt();
		
		// int arr[]=new int[iSize];
		// int i=0;
		// System.out.println("Enter the elements");
		// for(i=0;i<iSize;i++)
		// {
			// arr[i]=sobj.nextInt();
		// }
		
		MyArray mobj=new MyArray();
		// mobj.ReverseArray(arr);
		// System.out.println();
		// mobj.SumArray(arr);
		
		// char arr[]={'b','N','j','B','R','b','A','d','G','G'};
		
		// char arr[]=new char[iSize];
		// for(int i=0;i<arr.length;i++)
		// {
			// arr[i]=sobj.next();
		// }
		int iret=0;
		iret=mobj.ArrayCapital(arr);
		System.out.println("The capital charactes are "+iret);
		
		// float arr[]=new float[iSize];
		// System.out.println("Enter the elements");
		// for(int i=0;i<iSize;i++)
		// {
			// arr[i]=sobj.nextFloat();
		// }
		
		// mobj.Percentage(arr);
	}
}