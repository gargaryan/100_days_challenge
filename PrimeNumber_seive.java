import java.util.*;
public class Main
{
    // we have to calculate the  prime number between 2 and range
    public  static void primenumber(int range)
    {
        int seive[]=new int[range+1];
        Arrays.fill(seive,1);
        for(int i=2;i*i<=range;i++)
        {
            if(seive[i]==1)
            {
                for(int j=2*i;j<=range;j=j+i)
                {
                    seive[j]=0;
                }
            }
        }
        
        //print all prime number
        for(int i=2;i<seive.length;i++)
        {
            if(seive[i]==1)
            System.out.println(i);
        }
        
    }
	public static void main(String[] args) {
	    
	    primenumber(30);
	}
}
