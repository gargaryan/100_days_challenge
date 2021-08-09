import java.util.*;
public class Main
{
	public static void main(String[] args) {
		//stock span problem  spans means chtra chaaya.  left  me kitee chote value of stock  par shadow jayegi.
		int stocks[]={100, 80, 60, 70, 60, 75, 85};
		int  spans[]= new int[stocks.length];
		spans[0]=1;// bevause for 0 index there  will be no value left of that 
		Stack<Integer> stac=new Stack<>();
		stac.push(0);
		for(int curr=1;curr<stocks.length;curr++)
		{
		    while(!stac.isEmpty() && stocks[curr]>stocks[stac.peek()])
		    {
		        stac.pop();
		    }
		    spans[curr]= stac.isEmpty()? curr+1: curr-stac.peek();//  curr+1  only when  series in increasing order
		                                                            // 10 20 30 40 50
		    stac.push(curr);
		}
		for(int val:spans)
		{
		    System.out.print(val+" ");
		}
	}
	
}
