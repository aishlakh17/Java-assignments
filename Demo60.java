import java.util.*;

class StringDemo
{
	public String StrNCatX(String src,String dest,int iCnt)
	{
		char arr[]=dest.toCharArray();
		char crr[]=new char[iCnt];
		for(int i=0;i< iCnt;i++)
		{
			crr[i]=arr[i];
		}
		dest = new String(crr);
		String abc=src+dest;
		return abc;		 
	}
	
	public boolean StrCmpX(String src, String dest)
	{
		char arr[]=src.toCharArray();
		char brr[]=dest.toCharArray();
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i] != brr[i])
			{
				break;
			}
		}
		
		if(i== arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean StrNCmpX(String src,String dest,int iCnt)
	{
		char arr[]=dest.toCharArray();
		char crr[]=new char[iCnt];
		int i=0;
		for( i=0;i< iCnt;i++)
		{
			crr[i]=arr[i];
		}
		dest = new String(crr);
		
		for(i=0;i<iCnt;i++)
		{
			if(arr[i] != crr[i])
			{
				break;
			}
		}
		
		if(i == iCnt)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	public String StrRevTogX(String str)
	{
		char arr[]=str.toCharArray();
		int iStart=0;
		int iEnd = arr.length-1;
		
		char temp;
		
		for(iStart=0,iEnd=arr.length-1;iStart<iEnd;iStart++,iEnd--)
		{
			if((arr[iStart] >='A')&&(arr[iStart]<='Z'))
			{
				arr[iStart] = (char)(arr[iStart] + 32);
			}
			else if((arr[iStart] >='a')&&(arr[iStart]<='z'))
			{
				arr[iStart] =(char)(arr[iStart] - 32);
			}
			if((arr[iEnd]>='A')&&(arr[iEnd]<='Z'))
			{
				arr[iEnd]=(char)(arr[iEnd] + 32);
			}
			else if((arr[iEnd] >='a')&&(arr[iEnd]<='z'))
			{
				arr[iEnd]=(char)(arr[iEnd] - 32);
			}
			
			
			temp = arr[iStart];
			arr[iStart]=arr[iEnd];
			arr[iEnd]=temp;
		}
		return(new String(arr));
	}
	
	
	public boolean StrPalindrome(String str)
	{
		char arr[]=str.toCharArray();
		int iStart=0;
		int iEnd = arr.length-1;
		
		while(iStart<iEnd)
		{
			if((arr[iStart]>='A')&&(arr[iStart]<='Z'))
			{
				arr[iStart]=(char)(arr[iStart]+32);
			}
			if((arr[iStart]>='a')&&(arr[iStart]<='z'))
			{
				arr[iStart]=(char)(arr[iStart]-32);
			}
			if(arr[iStart] != arr[iEnd])
			{
				return false;
			}
			iStart++;
			iEnd--;
		}
		return true;
	}	
}

class Demo60
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter first string");
		String src= sobj.nextLine();
		
		// System.out.println("Enter Second string");
		// String dest= sobj.nextLine();
		
		// System.out.println("Enter the number ");
		// int icnt= sobj.nextInt();
		
		 StringDemo sdobj = new StringDemo();
		// String abc = sdobj.StrNCatX(src,dest,icnt);
		
		//System.out.println("After Concatenation "+abc);
		
		// boolean bret=false;
		//bret= sdobj.StrCmpX(src,dest);
		// bret=sdobj.StrNCmpX(src,dest,icnt);
		// if(bret)
		// {
			// System.out.println("Strings are equal");
		// }
		// else
		// {
			// System.out.println("Strings are not equal");
		// }

		String abc = sdobj.StrRevTogX(src);
		System.out.println("After reverse and toggling "+abc);
		boolean bret = sdobj.StrPalindrome(str);
		if(bret)
		{
			System.out.println("String is pallindrome");
		}
		else
		{
			System.out.println("String is not pallindrome");
		}
	}
}