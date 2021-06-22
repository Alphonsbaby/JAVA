public class StringExample{  
public static void main(String args[]){  
String s1="java";
char ch[]={'s','t','r','i','n','g','s'};  
String s2=new String(ch);
String s3=new String("example");
System.out.println(s2);  
System.out.println(s3);  
int length =s2.length();
System.out.println("The length of the String \""+s2+"\" is: " +length);
s2=s2.concat(" is immutable so assign it explicitly");  
System.out.println(s2);
char s=s1.charAt(2);
System.out.println(s);
System.out.println(s1.compareTo(s2));
int firstIndex = s2.indexOf('s');
    System.out.println("First occurrence of char 's'" +
                       " is found at : " + firstIndex);
int lastIndex = s2.lastIndexOf('s');
    System.out.println("Last occurrence of char 's' is" +
                       " found at : " + lastIndex);
String s4="javatpoint is a very good website";  
String replaceString=s4.replace('a','e');//replaces all occurrences of 'a' to 'e'  
System.out.println(replaceString); 
String  sample = String.valueOf(ch, 0, 3);
 
        System.out.println(sample);
}}  