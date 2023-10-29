import java.util.Scanner;
	class division2 {

		public static void main(String[] args)throws UnsupportedOperationException 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the first no. ");
			int a=sc.nextInt();
			System.out.println("Enter the 2nd no. ");
			int b=sc.nextInt();
			int c;
			try
			{
				c=a/b;
				System.out.println(c);
			}
			catch(ArithmeticException e)
			{
				
			    throw new UnsupportedOperationException("Division by zero");
			    
			}
			finally
			{
				sc.close();
			}

		}

	}



