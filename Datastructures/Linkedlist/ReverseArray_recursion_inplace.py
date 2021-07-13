public class Main

{
    private static void   reverse(int n, int ci, int arr[])
    {
        if(ci>n/2)
        {
            return;
        }
    
        if(ci<=n/2) 
        {
            
            int temp=arr[n-1-ci];
            arr[n-1-ci]=arr[ci];
            arr[ci]=temp; 
            reverse(n,ci+1,arr);
                                        
            return;
        }
        
        return ;
    }
	public static void main(String[] args) {
	     int arr[]={1,2,3,4,5,6};
	      reverse(6,0,arr);
	    for(int i:arr)
	    {
	        System.out.print(i+" ");
	    }
	}
}
