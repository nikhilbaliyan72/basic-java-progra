/*
use of break in for loop in java how thw use of break statement is implies in java
*/



class breakstatement {
    public static void main(String[] args) {
        for (int i=0;i<10;i++){
        System.out.println(i);
         System.out.println("java is great");
         if(i==3){
              System.out.println("end the loop");
              break;
         }
        }
    }
}





/*
implement the break statement using while loop example is given bellow
*/


class whileloop {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
        System.out.println(i);
         System.out.println("java is great");
         if(i==3){
           // this line is not compersary
              System.out.println("end the loop");
              break;
         }
         i++;
        }
      //this line is not important 
     System.out.println("loop end here");    
    }
}




/*
implement the break statement after implement the do while loop 
*/



class dowhile {
    public static void main(String[] args) {
        int i=0;
       do{
        System.out.println(i);
         System.out.println("java is great");
         if(i==3){
             System.out.println("end the loop");
             break;
         }
         i++;
        } while(i<=10);
     System.out.println("loop end here");    
    }
}


/*
using continue statement for loop[ in java example are given bellow
*/



class forloop {
    public static void main(String[] args) {
      for (int i=0;i<10;i++){
      if(i==2){
          System.out.println("ending the loop");
          continue;
      }
      System.out.println(i);
      System.out.println("java is great");
      }
    }
}




/*
continue statement using do while loop example is given bellow
*/




class dowhile {
    public static void main(String[] args) {
        int i=0;
       do{
       i++;
         if(i==3){
             System.out.println("end the loop");
             continue;
         }
          System.out.println(i);
         System.out.println("java is great");
        // i++;
        } while(i<=10);
     System.out.println("loop end here");    
    }
}






/*
continue statement using ehile loop example is given bellow
*/



class while_3 {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
        i++;
         if(i==3){
           // this line is not compersary
              System.out.println("end the loop");
              continue;
         }
         System.out.println(i);
         System.out.println("java is great");
        // i++;
        }
      //this line is not important 
     System.out.println("loop end here");    
    }
}
