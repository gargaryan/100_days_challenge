import java.util.*;
public class Main
{
    public static  int factorial( int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(); 
		
		
		//find n is prime or not using  wilson theoram
		//wilson theram says  (prime-1)% prime=
		if(factorial(n-1)%n == (n-1))
		{
		    System.out.println(n+"is prime number");
		    
		}
		else
		{
		    System.out.println(n+" is not a prime number");
		}
		
		
		//find n is prime or not using  fermat's theoram
		//fermat's theoram says  a^prime-1% prime=1  where  1<=a<n
		
		if(((int)(Math.pow(2,n-1))-1)%n==0)
		{
		     System.out.println(n+"is prime number");
		}
		else
    	{
    	     System.out.println(n+ " is not a prime number");
    	}
		
		
		
	}
}
