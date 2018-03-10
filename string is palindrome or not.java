import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	int i,flag=0;
	Scanner str=new Scanner(System.in);
	String s1=str.next();
	char[] a=s1.toCharArray();
	int len=s1.length();
	for(i=0;i<len;i++)
	{
		if(a[i]==a[len-i-1])
		{
			System.out.println("palindrome");	
		}
		else
		System.out.println("not palindrome");
		break;
	}

	}
}
