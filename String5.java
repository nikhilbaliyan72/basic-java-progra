/*
return a substring form from start to and
*/
public class my_5_string{
  public static void main(String[] args){
    String name= "Nikhil";
    System.out.println(name.substring(3));
  }
}


/*
another method
*/
public class my_6_string{
  public static void main(String[] args){
    String name= "Nikhil";
    System.out.println(name.substring(1,5));
  }
}




/*
Return a new string after replace r with p.Happy is returned in this case.
*/
public class my_7_string{
  public static void main(String[] args){
    String name= "Nikhil";
  //  System.out.println(name.substring(1,5));
    System.out.println(name.replace(oldchar:'r',newchar:'p'));
  }
}


/*
another type
*/
public class my_7_string{
  public static void main(String[] args){
    String name= "Nikhil";
  //  System.out.println(name.substring(1,5));
    //System.out.println(name.replace(oldchar:'r',newchar:'p'));
     System.out.println(name.replace(target:"r",:replacement"ier"));
  }
}


/*
return true if name start with string"Ni" true in this case
*/
public class my_7_string{
  public static void main(String[] args){
    String name= "Nikhil";
  //  System.out.println(name.substring(1,5));
    //System.out.println(name.replace(oldchar:'r',newchar:'p'));
    // System.out.println(name.replace(target:"r",:replacement"ier"));
  System.out.println(name.replace(name.startWith("nik")));
  }
}


/*
end with
*/
public class my_7_string{
  public static void main(String[] args){
    String name= "Nikhil";
  //  System.out.println(name.substring(1,5));
    //System.out.println(name.replace(oldchar:'r',newchar:'p'));
    // System.out.println(name.replace(target:"r",:replacement"ier"));
  System.out.println(name.replace(name.endWith("il")));
