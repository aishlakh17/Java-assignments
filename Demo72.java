import java.util.*;

/* class Demo72
{
	int maxDiff(int arr[],int arr_size)
	{
		int max =0,min=0;
		min=arr[0];
		int result=0;
		for(int i=0;i<5;i++)
		{
			if(max<arr[i]);
			{
				max=arr[i];
			}
			int a= max-min;
			if (a >result)
			{
				result=a;
			}
			
		}
		return result;
	  }

	public static void main(String args[])
	{
		Demo72 dobj = new Demo72();
		int arr[]={2,3,10,6,4,8,1};
		System.out.println("Maximum difference is "+dobj.maxDiff(arr,5));
	}
}
 */
 
 /* class Demo72
 {
	 void productArray(int arr[],int n)
	 {
		 int iMult[]=new int[n];
		 int iprod=1;
		 
		 for(int i=0;i<n;i++)
		 { 
			iMult[i]=1;
			 for(int j=0;j<n;j++)
			 {
				 if(i != j)
				 {
					 iMult[i]=arr[j]*iMult[i];
				 }
			 }
			 System.out.print(iMult[i]+"\t");
		 }	 
	 }
	 public static void main(String arg[])
	 {
		 Demo72 dobj = new Demo72();
		 
		 int arr[]={10,3,5,6,2};
		 // int n= arr.length();
		 System.out.println("The product array is :");
		 dobj.productArray(arr,5);
	 }
 } */
	
class Demo72
{
	static void segregateEvenOdd(int arr[])
	{
		int brr[]=new int[7];
		int n=7;
		
		for(int i=0;i<7;i++)
		{
			if(arr[i]%2 == 0)
			{
				brr[i]=arr[i];
			}
			else if(arr[i]%2 !=0)
			{
				brr[n-1]=arr[i];
				n--;
			}
		}
		System.out.print("Array after segregattion:");
		for(int i=0;i<7;i++)
		{
			System.out.print(brr[i]+" ");
		}
	}
	
	public static void main(String arg[])
	{
		int arr[]={12,34,45,9,8,90,3};
		
		Demo72 dobj=new Demo72();
		dobj.segregateEvenOdd(arr);
	}
}
	 
