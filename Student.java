class Student {  
  private int id;  
  private String name;  
  Student( ) {
     id=1;
     name="Arun";
   }
   void display( ) {
	System.out.println(id+" "+name);
    }  
      
    public static void main(String args[ ]) {  
    Student s1=new Student();  
    s1.display();  
    }  
 } 