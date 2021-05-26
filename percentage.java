import java.util.Scanner;
public class percentage
{
    public static void main(String[] args) 
    {
        int n, count = 0, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the mark:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
          total = total + a[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
    }
}
