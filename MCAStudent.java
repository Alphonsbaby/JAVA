class MCAStudent
{ 
int rollno; 
 String name;
static String college ="SJCET";

MCAStudent(int r,String n)
{	
rollno = r;	
name = n;	
}
MCAStudent(int r,String n, String c)
{	
rollno = r;	
name = n;	
college=c;
}
void display ()
{
System.out.println(rollno+" "+name+" "+college);
}
public static void main(String args[])
{
MCAStudent s1 = new MCAStudent(111,"Johns");  
s1.display();
MCAStudent s2 = new MCAStudent(222,"Steve","MACE");
s2.display();
s1.display();
}}