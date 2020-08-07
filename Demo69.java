import java.util.*;

class MyArray
{
	public void ArrayReplace(char arr[])
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				arr[i]=(char)(arr[i]+32);
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	
	public int ArrayCountVowels(char arr[])
	{
		int i=0,iCnt=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||
			(arr[i]=='o')||(arr[i]=='u')||(arr[i]=='A')||
			(arr[i]=='E')||(arr[i]=='I')||(arr[i]=='O')||(arr[i]=='U'))
			{
					iCnt++;
			}
		}
		return iCnt;
	}
	
	public int Search(char arr[],char c)
	{
		int i=0,iCnt=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>='A' && arr[i]<='Z')
			{
				arr[i]=(char)(arr[i]+32);
			}
			if((arr[i]== c))
			{
				iCnt++;
			}
			
		}
		return iCnt;
	}
	public int Difference(char arr[])
	{
		int i=0,iCnt=0,iCnt1=0;
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				iCnt1++;
			}
			else if((arr[i]>='a')&&(arr[i]<='z'))
			{
				iCnt++;
			}
		}
		return iCnt1-iCnt;
	}
	
	public void Pattern(int arr[])
	{
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			while(arr[i]>0)
			{
				System.out.print("*\t");
				arr[i]--;
			}
			System.out.println();
		}
	}
}
class Demo69
{
	public static void main(String arg[])
	{
	Scanner sobj=new Scanner(System.in);
	
	//char arr[]={'B','N','e','B','R','C','A','B','i','u'};
	System.out.println("Enter the number.elements");
	int iSize=sobj.nextInt();
	char arr[]=new char[iSize];
	System.out.println("Please enter elements....");
	int i=0;
	for( i=0;i<arr.length;i++)
	{
		char c=sobj.next().charAt(0);
		arr[i]=c;
	}
	for(i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	MyArray mobj=new MyArray();
	//mobj.ArrayReplace(arr);
	System.out.println();
	int iret=0;
	iret=mobj.ArrayCountVowels(arr);
	System.out.println("The vowels are "+iret);
	System.out.println();
	//Scanner sobj=new Scanner(System.in);
		System.out.println("Enter the character to be search");
		char c=sobj.next().charAt(0);
	iret = mobj.Search(arr,c);
	System.out.println("The charcter is occurred "+iret+" times in array");
	// iret=mobj.Difference(arr);
	// System.out.println("The difference is "+iret);
	// System.out.println("Enter the number of elements");
	// int iSize=sobj.nextInt();
		
	// int brr[]=new int[iSize];
	// System.out.println("Enter the elements");
	// for(int i=0;i<brr.length;i++)
	// {
		// brr[i]=sobj.nextInt();
	// }
	// mobj.Pattern(brr);
	// 
	}


}		