import java.io.*;
class cmdtest
{
public static void main(String args[])
{
System.out.println(args[0]); 
System.out.println(args[1]);
System.out.println(args[2]);
int sum=Integer.parseInt(args[0])+Integer.parseInt(args[1])+Integer.parseInt(args[2]);
System.out.println("Sum of values :"+sum+"----");
int count=args.length;
System.out.println("length of values :"+count+"----");
}
}