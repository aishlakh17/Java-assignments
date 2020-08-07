import java.util.*;

class Digit
{
	public int CountEven(int iNo)
	{
		int count=0,iDigit=0;
		if(iNo<0)
		{
			iNo=-iNo;
			
		}

		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2 == 0)
			{
				count++;
			}
			iNo=iNo/10;
		}
		
		return count;
	}
	public int CountOdd(int iNo)
	{
		int count=0,iDigit=0;
		if(iNo<0)
		{
			iNo=-iNo;
			
		}

		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit%2 != 0)
			{
				count++;
			}
			iNo=iNo/10;
		}
		
		return count;
	}
	public int CountRange(int iNo)
	{
		int count=0,iDigit=0;
		if(iNo<0)
		{
			iNo=-iNo;
			
		}

		while(iNo>0)
		{
			iDigit=iNo%10;
			if((iDigit>3)&&(iDigit<7))
			{
				count++;
			}
			iNo=iNo/10;
		}
		
		return count;
	}
	
	public int Multiply(int iNo)
	{
		int iMult=1,iDigit=0;
		if(iNo<0)
		{
			iNo=-iNo;
			
		}

		while(iNo>0)
		{
			iDigit=iNo%10;
			if(iDigit>0)
			{
				iMult=iMult*iDigit;
			}
			iNo=iNo/10;
		}
		
		return iMult;
	}
	
	public int CountDiff(int iNo)
	{
		int iDigit=0,Even=0,Odd=0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo>0)
		{
			iDigit = iNo%10;
			if(iDigit%2 == 0)
			{
				Even= Even+ iDigit;
			}
			else
			{
				Odd = Odd+ iDigit;
			}
			iNo = iNo/10;
		}
		
		return (Even-Odd);
	}		
}

class Demo58
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter the numbber");
		int Value = sobj.nextInt();
		
		Digit dobj= new Digit();
		int iret=dobj.CountEven(Value);
		System.out.println("The Even digits are "+iret);
		iret=dobj.CountOdd(Value);
		System.out.println("The Ogg Digits are "+iret);
		iret=dobj.CountRange(Value);
		System.out.println("The digits between 3 and 7 are "+iret);
		iret=dobj.Multiply(Value);
		System.out.println("The multiplication of all digits is "+iret);
		iret=dobj.CountDiff(Value);
		System.out.println("The Difference is "+iret);

	}
}