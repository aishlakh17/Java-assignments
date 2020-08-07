import java.util.*;

class Number
{
	public boolean Check(int Arr[],int iNo)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i] == iNo)
			{
				break;
			}
		}
		
		if(i != Arr.length)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public int FirstOccurrence(int Arr[],int iNo)
	{
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
			if(Arr[i] == iNo)
			{
				break;
			}
		}
		
		if(i == Arr.length)
		{
			
			System.out.println("The number is not present");
			return -1;
		}
		else
		{
			return i;
		}
	}
	public int LastOccurrence(int Arr[],int iNo)
	{
		int i=0;
		for(i=Arr.length-1;i>0;i--)
		{
			if(Arr[i] == iNo)
			{
				break;
			}
		}
		
		if(Arr[i]==iNo)
		{
			return i;
			
		}
		else
		{
			return -1;
		}
	}
	
	public void Display(int Arr[],int iStart,int iEnd)
	{
		System.out.println("The numbers from range are :");
		for(int i=0;i<Arr.length;i++)
		{
			if((Arr[i]>iStart)&&(Arr[i]<iEnd))
			{
				System.out.print(Arr[i]+"\t");
			}
		}
	}
	
	public int Product(int Arr[])
	{
		int iMult=1,i=0;
		
		for(i=0;i<Arr.length;i++)
		{
			if((Arr[i]%2)!= 0)
			{
				iMult = iMult * Arr[i];
			}
		}
		
		return iMult;
	}
}

class Demo59
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int iSize=sobj.nextInt();
		
		int Arr[]=new int[iSize];
		System.out.println("Enter the elements");
		for(int i=0;i<iSize;i++)
		{
			Arr[i]=sobj.nextInt();
		}
		
		System.out.println("Enter the number to be searched");
		int Value = sobj.nextInt();
		
		Number nobj = new Number();
		boolean bret= false;
		
		//bret = nobj.Check(Arr,Value);
		
		/* if(bret== true)
		{
			System.out.println("The number is present");
		}
		else
		{
			System.out.println("The number is not present");
		} */
		
		int iret = nobj.FirstOccurrence(Arr,Value);
		 System.out.println("The first occurrence of number is at position "+iret);
		 iret=nobj.LastOccurrence(Arr,Value);
		System.out.println("The Last occurrence of number is at position "+iret);
		System.out.println("Enter the Starting point");
		int iStart=sobj.nextInt();
		System.out.println("Enter the ending point");
		int iEnd=sobj.nextInt();
		
		nobj.Display(Arr,iStart,iEnd);
		int i = nobj.Product(Arr);
		System.out.println("The multiplication of odd numbers is "+i);
	}
}
	