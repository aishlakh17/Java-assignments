import java.util.*;
import java.io.*;

class DemoLL
{
	public static void main(String ar[])
	{
		try
		{
			LinkedList<String> lobj = new LinkedList<String>();
			
			//Insert at Last
			
			lobj.add("Demo");
			lobj.add("Hello");
			
			//Insert at First
			
			lobj.addFirst("ABC");
			
			//Insert at Position
			
			lobj.add(1,"xyz");
			System.out.println("LinkedList :");
			System.out.println(lobj);
			
			//update the data
			lobj.set(1,"PQR");
			System.out.println(lobj);
			
			//remove from position
			lobj.remove(2);
			System.out.println(lobj);
			
			//remove first element
			lobj.removeFirst();
			System.out.println(lobj);
			
			//remove Last element
			lobj.removeLast();
			System.out.println(lobj);
			
			//Search first occurrence
			System.out.println("Index:"+lobj.indexOf("PQR"));
			
			//Search last occurrence
			System.out.println("LastIndex :"+lobj.lastIndexOf("PQR"));
			
			System.out.println("Size :"+lobj.size());
			
			Iterator iobj = lobj.iterator();
			while(iobj.hasNext())
			{
				System.out.println(iobj.next());
			}
		
		}
		catch(Exception e)
		{
			System.out.println("Inside catch");
		}
	}
}

			