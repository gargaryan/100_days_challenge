public class Main
{
    private static boolean canplaced(int []pages,int numSt, int maxcap)
    {
        int numberstudent=1;
        int readpage=0;
        int booknum=0;
        while(booknum<pages.length)
        {
            if(pages[booknum]+readpage <=maxcap)  
            {
                readpage+=pages[booknum];
                booknum++;
            }
            else{
                numberstudent++;
                readpage=0;
            }
            if( numberstudent>numSt)
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
	    int pages[]={10,20,30,40};
	    int numSt=2;
	    int left=0, right=100;
	    while(right>left+1)
	    {
	        int mid=(left+right)/2;//max caapcity
	        if(canplaced(pages,numSt,mid))
	        {
	            right=mid;
	        }
	        else{
	            left=mid;
	        }
	    }
	    System.out.println(right);
	    
	    
	}
}
