import java.util.Scanner;
public class voting
{
public static void main(String[] args)
{
Scanner input=new Scanner(System.in);
System.out.print("enter your age:");
int age=input.nextInt();
if(age>=18)
{
System.out.println("You are eligible to vote");
}
else
{
System.out.println("You are not eligible to vote");
}
}
}