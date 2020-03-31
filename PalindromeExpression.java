import java.util.Scanner;
class PalindromeExpression
{
	public void palin()
{		
		boolean flag=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		
		str=str.replaceAll("[^a-zA-Z]","").toLowerCase();
		System.out.println(str);
		int length=str.length();
 		for( int i=0;i<=length/2;i++)
		{
			if(str.charAt(i)!=str.charAt((str.length())-i-1))
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
		System.out.println("Not a Palindrome");
		}
		else
		{
		System.out.println("a Palindrome");
		}
}



		public static void main(String args[])
		{
		PalindromeExpression o=new PalindromeExpression();
		o.palin();
		}
}


