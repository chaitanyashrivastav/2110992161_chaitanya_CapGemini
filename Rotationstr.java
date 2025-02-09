//ABCDE
//EABCD
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//import java.util.*;
//class Rotationstr {
  //  public static void main(String[] args) {
    //   Scanner sc=new Scanner(System.in);
      // String str1=sc.nextLine();
      //String str2=sc.nextLine();
      
      //if(str1.length()!=str2.length()){
      //   System.out.println("false");
      //}
      //String con=str1+str1;
      //System.out.println(con.);
    //}
//}
//abcde eabcd
//abcde  abcde
 
 //con=abcdeabcde
 // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Rotationstr {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       String str1=sc.nextLine();
     // String str2=sc.nextLine();
      
    //   if(str1.length()!=str2.length()){
    //      System.out.println("false");
    //   }
      String con=str1;
      String output=con.charAt(con.length()-1)+con.substring(0,con.length()-1);
      System.out.println(output);
    }
}

