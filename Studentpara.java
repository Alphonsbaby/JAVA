class Studentpara {  
        private int id;  
        private String name;  
        Studentpara(int i,String n) 
{  
        id = i;  
        name = n;  
        }  
        void display() {
	System.out.println(id+" "+name);
         }  
       
        public static void main(String args[ ]) {  
        Studentpara s1 = new Studentpara(111,"Karan");  
        Studentpara s2 = new Studentpara(222,"Aryan");  
        s1.display();  
        s2.display();  
       }  
    } 