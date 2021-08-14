import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	        String pattern="D I DD II";
	        String array[]=pattern.split(" ");
	        Stack<Integer>stac=new Stack<>();
	        for(int i=0;i<array.length;i++)
	        {
	            String s="";
	         
	        for(int j=0;j<array[i].length()+1;j++)
	        {
	            if(j==array[i].length())
	            {
	                stac.push(j+1);
	                break;
	            }
	            
	            if(array[i].charAt(j)=='I')
	            {
	                stac.push(j+1);
	                s+=stac.pop();
	            }
	            
	            
	            else
	            {
	                stac.push(j+1);
	           
	            }
	            
	        }
	        
	        while(!stac.isEmpty())
	        {
	            s+=stac.pop();
	        }
	        System.out.println(s);
	    }
	}
	    	
}
