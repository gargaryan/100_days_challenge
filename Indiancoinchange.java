import java.util.*;
public class Main
{
    public static int indiancoinchnage(int []indiancoin,int amount)
    {
         
	    int countnumberofcoin=0;
	    while(amount>0)
	    {
	        int index=Arrays.binarySearch(indiancoin,amount);
	        if(index<0)
	        {
	            index=Math.abs(index)-2;
	            
	        }
	        amount=amount-indiancoin[index];
	        countnumberofcoin++;
	    }
	    return countnumberofcoin;
    }
	public static void main(String[] args) 
	{
	    int indiancoin[]={1,2,5,10,20,50,100,200,500,2000};
	    int amount=39;
	    System.out.println(indiancoinchnage(indiancoin,amount));
	}
	  
}
