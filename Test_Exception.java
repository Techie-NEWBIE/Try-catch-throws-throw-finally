import java.io.*;
class Exception
{
 void testMethod(int num)throws IOException,ArithmeticException
	{
		if(num==1)
			throw new IOException("IOException occured");
		else
			throw new ArithmeticException("Arithmetic Exception");
	}
}
class Test_Exception
{
	public static void main(String args[])
	{
	try
		{
			Exception obj=new Exception();
			obj.testMethod(1);
		}
	catch(IOException ax)
	{
		System.out.println(ax);
	}
	catch(ArithmeticException ae)
	{
		System.out.println(ae);
	}
	finally
	{
		System.out.println("Finally block");
	}
		System.out.println("The rest of code continues");
	}
}