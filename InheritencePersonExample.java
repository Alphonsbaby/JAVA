/* 
Create a class ‘Person’ with data members Name, Gender, Address, Age and a constructor
to initialize the data members and another class ‘Employee’ that inherits the properties of
class Person and also contains its own data members like Empid, Company_name,
Qualification, Salary and its own constructor. Create another class ‘Teacher’ that inherits
the properties of class Employee and contains its own data members like Subject,
Department, Teacherid and also contain constructors and methods to display the data
members. Use array of objects to display details of N teachers. */

 import java . util . Scanner ;
class Person
{
String Name, Gender , Address ;
protected int Age; 
public Person ()
{} 
public Person ( String n, String g , String addr , int a)
{ 
    this .Name = n;
this . Gender = g ;
this . Address =addr ;
this .Age = a ;
}
public void displayPerson()
{
System.out.println("Name: "+Name);
System.out.println("Gender : " +Gender );
System.out.println("Address : " +Address );
System.out.println("Age: " +Age );
}
}
class Employee extends Person
{ 
    int Empid, Salary ;
String Companyname , Qualification ; 
public Employee()
{ } 
public Employee( String n, String g , String addr , int a ,
	int eid ,	String cname ,	String qual , int sal )
{
super(n, g , addr , a );
Empid = eid ;
Companyname = cname ;
Qualification = qual ;
Salary = sal ;
}
public void displayEmployee ()
{ 
    super . displayPerson ();
System . out . println ("Empid: "+Empid);
System . out . println ("Company name: " + Companyname );
System . out . println (" Qualification :" + Qualification );
System . out . println ("Salary :" + Salary );
}
}
class Teacher1 extends Employee 
{ 
    String Subject , Department ;
    int Teacherid ;
public Teacher1( String n, String g , String addr , int a , int eid , String cname , String qual , int sal ,
String sub , String dept , int tid )
{ 
    super(n, g , addr , a , eid , cname , qual , sal ); 
    Subject = sub ;
Department = dept ;
Teacherid = tid ;
}
public void displayTeacher ()
{
    super . displayEmployee ();
System . out . println ("Teacher id : "+Teacherid );
System . out . println ("Subject : " + Subject );
System . out . println ("Department : " + Department );
}
}
public class InheritencePersonExample 
{ 
    public static void main( String args [])
    {
System . out . println ("Enter  number of teachers" );
Scanner sc = new Scanner (System . in );
int N = sc . nextInt ();
Teacher1 [ ] teacher1s = new Teacher1 [N] ;
Scanner scs = new Scanner (System . in ); 
for ( int i = 0; i<N; i++){
	System . out . println ("Enter name of	the teacher . " );
String name = scs . nextLine ();
	System . out . println ("Enter gender of	the teacher . " );
String gen = scs . next ();
	System . out . println ("Enter address	of	the teacher . " );
String addr = scs . nextLine ();
System . out . println ("Enter age of the teacher . " );
int ag = sc . nextInt ();
System . out . println ("EnterEmpid of the teacher . " ); 
int eid = sc . nextInt ();
System . out . println ("EnterCompany name. " );
String cn = scs . nextLine ();
	System . out . println ("Enterqualification	of	the teacher . " );
	String	quali = scs . nextLine ();
System . out . println ("Entersalary the teacher . " );
int sal = sc . nextInt ();

System . out . println ("EnterTeacher id" );
int tid = sc . nextInt ();
	System . out . println ("EnterSubject	the teacher . " );
String sub = scs . nextLine ();
System . out . println ("EnterDepartment of the teacher . "); 
String dept = scs . nextLine ();
Teacher1 t = new Teacher1(name, gen , addr , ag , eid , cn , quali , sub , dept , tid );
teacher1s [ i ] = t ;
}
	for (Teacher1 t :	teacher1s )
        {
t . displayTeacher ();
}
}
}
















/*
import java.util.Scanner;
class personq
{
    int age;
    String name,address,gender;
    personq(String name , String address , String gender , int age)
    {
      this.name=name;
      this.address=address;
      this.gender=gender;
      this.age=age;
      
     }
    
}
class employeq extends personq
{
int empid;
int salary;
String companyname;
String qualification;
employeq(String gender , String name , int age, String address , String companyname , String qualification , int salary, int empid)      
   {
    super(gender,name,age,address);
    this.companyname=companyname;
    this.qualification=qualification;
    this.salary=salary;
    this.empid=empid;
   }
}
class teacherq extends employeq
{
    String subject,department;
    int teacherid;
    teacherq(String gender , String name , int age, String address , String companyname , String qualification , int salary, int empid , String subject , String department , int teacherid)
    {
      super(gender,name,age,address,companyname,qualification,salary,empid); 
      this.subject=subject;
      this.department=department;
      this.teacherid=teacherid;
    }
    
    void display()
    {
        System.out.println("employee id"+empid);
        System.out.println("employee name"+name);
        System.out.println("employee gender"+gender);
        System.out.println("employee age"+age);
        System.out.println("employee address"+address);
        System.out.println("employee companyname"+companyname);
        System.out.println("employee qualification"+qualification);
        System.out.print("employee salary"+salary);
        System.out.println("employee subject"+subject);
        System.out.println("employee department"+department);
        System.out.println("employee teacherid"+teacherid);
        
        
        
    }
    
}
class inheritancePersonExample 
{
    public static void main (String[] arg)
            
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the limit of teachers");
        n=s.nextInt();
        teacherq teacher[]=new teacherq[n];
        
        
        
    }
}