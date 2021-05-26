import java.io.*;
class stream
{
public static void main(String args[]) throws Exception
{


BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
System.out.println("enter the number");
String c=br.readLine();
int a=Integer.parseInt(c);
System.out.println("enter the 2 nd number");
String str=br.readLine();
int b=Integer.parseInt(str);
int sum=a+b;
System.out.println("Sum is::::"+sum);

}
}