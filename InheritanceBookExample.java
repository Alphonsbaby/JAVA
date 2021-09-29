/*
Write a program has class Publisher, Book, Literature and Fiction. Read the information
and print the details of books from either the category, using inheritance
 */
import java . util . Scanner ;
class Publisher
{
    String publisher;
    Publisher(String pubi)
    {
        this.publisher=pubi;
        
    }
    
}
class book
{
    String name;
    Publisher publisher;
    book()
    {
    }
    public book(String name,Publisher publisher)
    {
        this.name=name;
        this.publisher=publisher;
        
    }
}
class liter extends book
{
    String lit_type="literature";
    liter(String name,Publisher publisher)
    {
        super(name,publisher);
    }
    void display()
    {
        System.out.println("name;"+super.name);
        System.out.println("type;"+this.lit_type);
        System.out.println("publisher;"+this.publisher.publisher);
    }
}
class fiction extends book
{
  String lit_type="Fiction";
    fiction(String name,Publisher publisher) 
    {
         super(name,publisher);
    }
     void display()
    {
        System.out.println("name;"+super.name);
        System.out.println("type;"+this.lit_type);
        System.out.println("publisher;"+this.publisher.publisher);
    }
}
public class InheritanceBookExample 
{
    public static void main(String[] args)
    {
        Publisher lp=new Publisher("s chand");
        liter l=new liter("as you like",lp);
        l.display();
        Publisher fp=new Publisher("tata");
        fiction f=new fiction ("tempest",fp);
        f.display();
    }
}