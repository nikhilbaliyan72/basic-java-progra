/*
find the length of the string using .length keyword in java
*/
public class my_4_string{
  public static void main(String[] args){
    String name= "Nikhil";
    //System.out.println(name);
    int value = name.length;
    System.out.println(value);
  }
}
  
  
  
  /*
convert string into lower case
*/


public class my_4_string{
  public static void main(String[] args){
    String name= "Nikhil";
    //System.out.println(name);
   // int value = name.length;
    //System.out.println(value);
    
    String lstring = name.toLowerCase();
    System.out.println(lstring);
  }
}




 /*
convert string into upper case
*/


public class my_4_string{
  public static void main(String[] args){
    String name= "Nikhil";
    //System.out.println(name);
   // int value = name.length;
   // System.out.println(value);
    
   // String lstring = name.toLowerCase();
   // System.out.println(lstring);
    
    String ustring = name.toUpperCase();
   System.out.println(ustring);
  }
}


 /*
convert string into trim string
*/



public class my_4_string{
  public static void main(String[] args){
    String nonTrimmedString="     Nikhil     ";
    System.out.println(nonTrimmedString);
    String trimmedString = nonTrimmedString.trim();
    System.out.println(trimmedstring);
  }
}



    
