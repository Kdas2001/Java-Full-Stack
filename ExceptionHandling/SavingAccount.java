import java.util.Scanner;
class InsufficientBalanceException extends RuntimeException
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}
class IllegalBankTransactionException extends RuntimeException
 {
	IllegalBankTransactionException(String msg)
	{
		super(msg);
	}
 }
	


		class SavingAccount 
		{ 
		    
		    
		    public static void main(String args[]) 
		    { 
		    	int balance = 0, withdraw, deposit;
		        Scanner sc=new Scanner(System.in);
		        System.out.println("Deposit an amount");
		        deposit=sc.nextInt();
		        balance += deposit;
		        System.out.println("Withdraw an amount");
		        withdraw=sc.nextInt();
		        balance -= withdraw;
                
                if (balance<withdraw)
		        {
		            throw new InsufficientBalanceException("Exceeding Balance"); 
		        }
		        else if(withdraw<0)
		        {
		        	throw new IllegalBankTransactionException("Negative value not allowed");	
		        }
		        else
		        {
		        System.out.println(balance);
		      }
                }
		}
		




