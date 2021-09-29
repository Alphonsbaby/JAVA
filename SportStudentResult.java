/*
Create classes Student and Sports. Create another class Result inherited from Student and
Sports. Display the academic and sports score of a student
 */

interface student
{
    int score=10;
    void displayscore();
}
interface sports
{
    int score=25;
    void displaysportscore();
    
}
class result implements student,sports
{
    public void displayscore()
    {
        System.out.println("acadamic score"+student.score);
    }
    public void displaysportscore()
    {
        System.out.println("sport score"+sports.score);
    }
}
public class SportStudentResult
{
    public static void main(String[]args)
    {
        result r=new result();
        r.displayscore();
        r.displaysportscore();
    }
}