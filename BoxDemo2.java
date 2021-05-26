import java.io.*; 
class Box
{
int width;  
int height; 
 int depth;
int volume( )
{
return width*height*depth;
}
}
class BoxDemo2
{ 
public static void main(String a[])
{ 
Box mybox=new Box();  
int vol; 
 mybox.width=10;  
mybox.height=20; 
 mybox.depth=30;
vol= mybox.volume();  
System.out.println(“Volume is”+vol);
}
}