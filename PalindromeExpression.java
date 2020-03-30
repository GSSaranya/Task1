import java.util.Scanner;
class PalindromeExpression
{
	public static void main(String args[])
{
			Scanner sc=new Scanner(System.in);
			String  str;
			System.out.println("Enter the String:");
			str=sc.nextLine();
			str=str.toLowerCase();
			 str=str.replaceAll("(\\W)","");
			
			System.out.println(str);
			int length=str.length();
 		for( int i=0;i<=length/2;i++)
		{
		
		if(str.charAt(i)!=str.charAt((str.length())-i-1))
		{
		System.out.println("NOT A PALINDROME");
		}
		System.out.println(" A PALINDROME");
		}
		
}
}