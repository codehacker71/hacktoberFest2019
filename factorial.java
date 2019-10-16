/* package codechef; // don't place package name! */



import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{  try 
	   { 
	    Scanner s1=new Scanner(System.in);
	    
		int t=s1.nextInt();
		while(t!=0)
		 {
		     int n=s1.nextInt();
		     BigInteger fact=new BigInteger("1");
		     for(int i =1;i<=n;i++)
		       fact= fact.multiply(BigInteger.valueOf(i));;
		       System.out.println(fact);
		       
		 }
	   }
	   catch(Exception e)
	   {
	      return; 
	   }
		
	}
	 
	
}

