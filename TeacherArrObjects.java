import java.util.Scanner;
class EmployeeT
{
    int empid;
    String name;
    float salary;
    String address;
    EmployeeT(){}
    EmployeeT(int empid , String name , float salary , String address)
    {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
class Teacher extends EmployeeT
{
    String department,subject;
    Teacher(int empid , String name , float salary , String address , String department , String subject)
    {
        super(empid , name , salary , address);
        this.department = department;
        this.subject = subject;
    }
    public void display()
    {
        System.out.println("Teacher_id : "+empid);
        System.out.println("Teacher_name : "+name);
        System.out.println("Teacher_salary : "+salary);
        System.out.println("Teacher_address : "+address);
        System.out.println("Teacher_department : "+department);
        System.out.println("Teacher_subject : "+subject);
    }
}
public class TeacherArrObjects
{
    public static void main(String[] args)
    {
        System.out.println("Enter no.of Teachers : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Enter Teacher details : ");
        Teacher teacher[] = new Teacher[n];
        Scanner scT = new Scanner(System.in);
        int tid;
        String name;
        float salary;
        String address;
        String department;
        String subject;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter " + (i+1) + " teacher details : ");
            System.out.println("Enter Teacher_id(integer): ");
            tid = scT.nextInt();
            System.out.println("Enter Teacher_name(String): ");
            name = scT.next();
            System.out.println("Enter Teacher_salary(float): ");
            salary = scT.nextFloat();
            System.out.println("Enter Teacher_address(String): ");
            address = scT.next();
            System.out.println("Enter Teacher_department(String): ");
            department = scT.next();
            System.out.println("Enter Teacher_subject(String): ");
            subject = scT.next();
            Teacher t = new Teacher(tid , name , salary , address , department , subject);
            teacher[i] = t;
        }
        System.out.println("Teachers are : \n ");
        for(Teacher x : teacher)
        {
            x.display();
            System.out.println("\n");          
        }
    }
}
