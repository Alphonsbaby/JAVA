import java.util.Scanner;
public class employee
{
    public static void main(String[] args) 
    {
        int count,eno,esalarytemp,flag = 0;

        Scanner scan = new Scanner(System.in);
     
        System.out.print("how many  employees information you want enter :");
        count = scan.nextInt();
        String eName[] = new String[count];
        int salary[] = new int[count];
        int  no[] = new int[count];
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Enter the eno :");
        for(int i = 0; i < count; i++)
        {
            no[i] = scan2.nextInt();
        }
System.out.println("Enter the name :");
        for(int i = 0; i < count; i++)
        {
            eName[i] = scan3.nextLine();
        }
        System.out.println("Enter the salary :");
        for(int i = 0; i < count; i++)
        {
            salary[i] = scan4.nextInt();
        }
      
          Scanner s = new Scanner(System.in);
        System.out.print("Enter the employee number you want to find:");
        int x = s.nextInt();
        for(int i = 0; i < count; i++)
        {
            if(no[i] == x)
            {
                flag = 1;
                break;
            }
            else
            {
                flag = 0;
            }
        }
        if(flag == 1)
        {
            System.out.println("Employee id "+x+" found:");
        }
        else
        {
            System.out.println("Employee id not found");
        }

  scan.close();
        scan2.close();
scan3.close();
scan4.close();
s.close();
        
    }
}
