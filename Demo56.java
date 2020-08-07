import java.util.*;

class Line
{
	public int CountCapital(String str)
	{
		int Count =0;
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				Count++;
			}
		}
		
		return Count;
	}
	
	public int CountSmall(String str)
	{
		int Count =0;
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]>='a')&&(arr[i]<='z'))
			{
				Count++;
			}
		}
		
		return Count;
	}
	
	public int CountDiff(String str)
	{
			int Difference =  CountSmall(str)- CountCapital(str);
			return Difference;
		
	}
	
	public boolean ChkVowel(String str)
	{
		char arr[]=str.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='o')||(arr[i]=='i')||(arr[i]=='u'))
			{
				return true;
			}
		}
		return false;
	}	
	
	public void Rev(String str)
	{
		char arr[]=str.toCharArray();
		int iStart=0;
		int iEnd=arr.length-1;
		
		char temp;
		
		while(iStart<iEnd)
		{
			temp = arr[iStart];
			arr[iStart]=arr[iEnd];
			arr[iEnd]=temp;
			
			iStart++;
			iEnd--;
		}
		
		System.out.println("After reverse "+new String(arr));
	}
	
}

class Demo56
{
	public static void main(String arg[])
	{
		Scanner sobj= new Scanner(System.in);
		System.out.println("Enter String");
		
		String str= sobj.nextLine();
		
		Line lobj= new Line();
		
		int iret;
		iret=lobj.CountCapital(str);
		System.out.println("The Capital count is "+iret);
		iret=lobj.CountSmall(str);
		System.out.println("The small count is "+iret);
		iret=lobj.CountDiff(str);
		System.out.println("Difference is "+iret);
		boolean bret=false;
		bret=lobj.ChkVowel(str);
		if(bret)
		{
			System.out.println("String Contains vowel");
		}
		else
		{
			System.out.println("String does not contains vowel");
		}
		
		lobj.Rev(str);
	}
}