import java.util.Scanner;

public class multi
{
    
public static void main(String[] args) 
   
 {
      
  int p, q;
      
  Scanner s = new Scanner(System.in);
       
 System.out.print("Enter number of rows in first matrix:");
   
     p = s.nextInt();
    
    System.out.print("Enter number of columns in first matrix:");
    
    q = s.nextInt();

int a[][] = new int[p][q];

int b[][] = new int[p][q];
int c[][] = new int[p][q];
System.out.println("Enter all the elements of 1 st matrix:");
          
  for (int i = 0; i < p; i++) 
          
  {
        
  for (int j = 0; j < q; j++) 
     
           {
              
      a[i][j] = s.nextInt();
     
           }
        
    }
 
System.out.println("The  Matrix is:");
   
         for (int i = 0; i < p; i++) 
         
   {
                for (int j = 0; j < q; j++) 
              
  {
      
              System.out.print(a[i][j]+" ");
           
    
 }
                
System.out.println("");
     
       }
System.out.println("Enter all the elements of 2 nd matrix:");
          
  for (int i = 0; i < p; i++) 
          
  {
        
  for (int j = 0; j < q; j++) 
     
           {
              
      b[i][j] = s.nextInt();
     
           }
        
    }
 
System.out.println("The  Matrix is:");
   
         for (int i = 0; i < p; i++) 
         
   {
                for (int j = 0; j < q; j++) 
              
  {
      
              System.out.print(b[i][j]+" ");
           
    
 }
                
System.out.println("");
     
       }



for (int i = 0; i < p; i++)
{ 
for (int j = 0; j < q; j++)   

{    
c[i][j]=a[i][j]+b[i][j];
}

}  
System.out.println("Sum of the matrices:-");   
 for (int i = 0; i < p; i++) 
         
   {
                for (int j = 0; j < q; j++) 
              
  {
      
              System.out.print(c[i][j]+" ");
           
    
 }
                
System.out.println("");
     
       }



  }}