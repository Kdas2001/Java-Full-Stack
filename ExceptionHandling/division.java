import java.util.Scanner;
class division {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			System.out.println("Division by zero");
			e.printStackTrace();
		}
		finally
		{
			sc.close();
		}

	}

}
