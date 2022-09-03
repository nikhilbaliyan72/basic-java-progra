/*
implemented if elae if in java
*/
public class stringpr{
  public static void main (String[] ager){
    int age;
    System.out.println("enter your age");
    Scanner sc = new scanner(System.in);
    age= sc.nextInt();
    if(age>56){
    System.out.println("you are experienced"); 
    }
    else if(age>46){
         System.out.println("you are semi-experienced");
    }
    else if(age>36){
         System.out.println("you are semi-semi-experienced");
    }
    else{
         System.out.println("you are not experienced");
    }
  }
}
