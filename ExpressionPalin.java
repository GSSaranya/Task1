import java.util.Scanner;
class ExpressionPalin
{
public boolean palin(String str)
{
str=str.replaceAll("[\\W]","").toLowerCase();
int length=str.length();
for(int i=0;i<=length/2;i++)
{
if(str.charAt(i)!=str.charAt(str.length()-i-1))
{
return false;
}
}
return true;
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the String:");
String str=sc.nextLine();
ExpressionPalin p=new ExpressionPalin();
boolean result=p.palin(str);
if(result==true)
{
System.out.println("Palindrome");
}
else
{
System.out.println("not palin");
}
} 
}