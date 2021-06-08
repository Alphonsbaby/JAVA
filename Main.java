class CPU 
{
    double price;
  
  // nested class
    
class Processor{

       
 
     double cores;
       
 String manufacturer;

        
double getCache()
{
           
 return 4.3;
        }
   
 }

    // nested protected class
    
protected class RAM{

        
    double memory;
        
String manufacturer;

      
  double getClockSpeed(){
     
       return 5.5;
      
  }
    }
}


public class Main
 {
    public static void main(String[] args) 
{

            
  CPU cpu = new CPU();

      
 // object of inner class Processor  
     CPU.Processor processor = cpu.new Processor();

      
  // object of inner class RAM  
  CPU.RAM ram = cpu.new RAM();
      
  System.out.println("Processor Cache = " + processor.getCache());
       
 System.out.println("Ram Clock speed = " + ram.getClockSpeed());
   
 }

}