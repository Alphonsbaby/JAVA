import java.util.*;

public class Products
{
int pcode;
String pname;
int price;

Products()
{
pcode=0;
pname=null;
price=0;
}


 
public static void cal(int a,int b,int c)
{
int p1=a;
int p2=b;
int p3=c;
float lowest;
if(p1<p2)
{
if(p3<p1) 
{
lowest = p3;
} 
else 
{
lowest = p1;
}
} 
else 
{
if(p2<p3) 
{
lowest = p2;
} 
else
{
lowest = p3;
}
}
System.out.println("The lowest price among the 3 Product is : "+lowest);
}
public static void main(String args[])
{
Scanner s = new Scanner(System.in);
Products p1= new Products();
Products p2= new Products();
Products p3= new Products();

System.out.print("Enter the Product 1 Code : ");
p1.pcode =s.nextInt();
System.out.print("Enter the Product 1 Name : ");
p1.pname = s.next();
System.out.print("Enter the Product 1 Price : ");
p1.price=s.nextInt();
System.out.print("Enter the product 2 Code : ");
p2.pcode =s.nextInt();
System.out.print("Enter the Product 2 Name : ");
p2.pname = s.next();
System.out.print("Enter the Product 2 Price : ");
p2.price = s.nextInt();
System.out.print("Enter the Product 3 Code : ");
p3.pcode =s.nextInt();
System.out.print("Enter the Product 3 Name : ");
p3.pname = s.next();
System.out.print("Enter the Product 3 Price : ");
p3.price = s.nextInt();
Products.cal(p1.price,p2.price,p3.price);
}
}