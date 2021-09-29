import java.util.Scanner;
public class OverloadShapeArea
{
    void calculateArea(float x)
    {
        System.out.println("Area of the square :"+x*x+"sq_units");
    }
    void calculateArea(float x,float y)
    {
        System.out.println("Area of the rectangle :"+x*y+"sq_units");
    }
    void calculateArea(double r)
    {
        double area = 3.14*r*r;
        System.out.println("Area of the circle :"+area+"sq_units");
    }
    public static void main(String args[])
    {
        OverloadShapeArea obj = new OverloadShapeArea();
        System.out.println("Enter the sides of a square :");
        Scanner sc = new Scanner(System.in);
        float side = sc.nextFloat();
        obj.calculateArea(side);
        System.out.println("Enter the sides of the rectangle :");
        float side1 = sc.nextFloat();
        float side2 = sc.nextFloat();
        obj.calculateArea(side1,side2);
        System.out.println("enter the radius of the circle : ");
        double rad = sc.nextDouble();
        obj.calculateArea(rad);
    }
}
