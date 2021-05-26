import java.util.Scanner;  
class Box
{
int width;  int height;  int depth;
Scanner so=new Scanner(System.in);
void readData()
{
width =so.nextInt();
height=so.nextInt();  
depth=so.nextInt();
}
void volume( )
{
System.out.println(width*height*depth);	
} 
}
class BoxDemo1
{ public static void main(String a[])

{	
Box mybox=new Box(); 

System.out.println(" Enter width,height, &depth of a Box");
 mybox.readData( ); 
System.out.print("Volume of the box is "); 
 mybox.volume();
}
}