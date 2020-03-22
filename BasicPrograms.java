import java.util.*;
import java.io.*;
class BasicPrograms
{  
	Scanner sc=new Scanner(System.in);
	public void Palindrome()
	{
		String str,rev = "";
        	System.out.println("Enter a string:");
        	str=sc.nextLine();
 		int length=str.length();
 		for( int i=length-1;i>=0; i--)
		{
        		rev=rev+str.charAt(i);
		}
 		if (str.equals(rev))
		{
         		System.out.println(str+" is a palindrome");
		}	
        	else
		{
        		System.out.println(str+" is not a palindrome");
		}
 	}

	public void SortingArray()
	{
		int count,temp;
    		System.out.print("Enter number of elements you want in the array:");
        	int length=sc.nextInt();
    		int num[]=new int[length];
        	System.out.println("Enter array elements:");
        	for(int i=0;i<length;i++) 
        	{
           		num[i] = sc.nextInt();
        	}	
        
        	for(int i=0;i<length;i++) 
        	{
            		for(int j=i+1;j<length;j++) 
			{ 
                		if (num[i]>num[j]) 
                		{
                   			temp=num[i];
                   	 		num[i]=num[j];
                    	 		num[j]=temp;
                		}
            		}
        	}
       		System.out.print("Array Elements in Ascending Order:");
        	for(int i=0;i<num.length;i++) 
        	{
           		 System.out.print(num[i]+", ");
        	}	
	}

	public void FindDuplicate()
	{
		System.out.print("Enter number of elements you want in the array:");
        	int length=sc.nextInt();
    		int arr[]=new int[length];
		System.out.println("Enter array elements:");
        	for(int i=0;i<length;i++) 
        	{
         	   arr[i]=sc.nextInt();
        	}
		
		
		System.out.println("Duplicate elements in given array:");
        	for(inti=0;i<arr.length;i++) 
		{  
        	    for(intj=i+1;j<arr.length;j++) 
			{  
                		if(arr[i]==arr[j])  
				{
					System.out.println(arr[j]+","); 
				}
			}
		}
		
	}
	

	public static void main(String args[])
	{
		BasicPrograms o=new BasicPrograms();
		
		
		
			System.out.println("\n Enter your choice:");
			System.out.println("1.Palindrome or Not");
			System.out.println("2.Sorting an Array");
			System.out.println("3.Find Duplication");
			System.out.println("4.exit");
			Scanner scn=new Scanner(System.in);
			int ch=scn.nextInt();
			switch(ch)
				{
				case 1:
					o.Palindrome();
				break;
				case 2:
					o.SortingArray();
				break;
				case 3:
					o.FindDuplicate();
				break;
				case 4:
				break;
				default:
					System.out.println("Enter Valid choice");
			
				}
			
		
		
	}
}
	


