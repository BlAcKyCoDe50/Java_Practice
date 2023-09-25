class exception_handling
   {
     public static void main(String args[])
	{
	   try  {	
		  throw new Error();
		}
	   catch(Throwable e)
		{
		  System.out.print("Throwable");
		}
	   catch(Exception e)
		{
		  System.out.print("Exception");
		}
	}
  }