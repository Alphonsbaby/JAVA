class Box
{
int width;  int height;  int depth;
}
class BoxDemo
{
public static void main(String a[])
{
Box mybox=new Box();  int vol;  mybox.width=10;  mybox.height=20;  mybox.depth=30;
vol=mybox.width*mybox.height*mybox.depth;
System.out.println("Volume is "+vol);
}
}