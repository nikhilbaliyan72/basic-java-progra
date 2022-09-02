/*
Writr a java program to convert string into lower case
*/
public class stringpr{
  public static void main (String[] ager){
    String name = " akhil choudhary" ;
    name = name.toLowerCase();
    System.out.println(name);
}
}



/*
write a java program to replace space with under scores
*/

public class stringpr{
  public static void main (String[] ager){
  //  String name = " akhil choudhary" ;
    //name = name.toLowerCase();
    //System.out.println(name);
     String text = " akhil choudhary" ;
    text=text.replace(target" ",replacement"_");
    System.out.println(text);
    
  }
}

/*check double space
*/
public class stringpr{
  public static void main (String[] ager){
  //  String name = " akhil choudhary" ;
    //name = name.toLowerCase();
    //System.out.println(name);
    // String text = " akhil choudhary" ;
   // text=text.replace(target" ",replacement"_");
    //System.out.println(text);
    String myString = " This string contain double and  trippel space";
      System.out.println(myString.indexof("  "));
      System.out.println(myString.indexof("   "));
  }
}
