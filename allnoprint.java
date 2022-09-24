/*
print all the no and length bof the array using the method given bellow
*/


class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {90,88,97,86,88};
      //if we want to print the length of the given element
        System.out.println(marks.length);
        // Display the array (naive way)
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
    }
}





/*
using for loop print all th element in array example is given bellow
*/


class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {90,88,97,86,88};
       // System.out.println(marks.length);
        // Display the array (native way)
      //  System.out.println(marks[0]);
        //System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //    System.out.println(marks[3]);
    //    System.out.println(marks[4]);
    for(int i=0;i<marks.length;i++){
    System.out.println(marks[i]);
    }
    }
}



/*
print it using for loop in reversing order in an array
*/


class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {90,88,97,86,88};
       // System.out.println(marks.length);
        // Display the array (native way)
      //  System.out.println(marks[0]);
        //System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //    System.out.println(marks[3]);
    //    System.out.println(marks[4]);
      // display the array in reverse order(using for loop)
    for(int i=marks.length-1;i>=0;i--){
    System.out.println(marks[i]);
    }
    }
}




/*
print it using for-each loop in array
*/



class HelloWorld {
    public static void main(String[] args) {
        int [] marks = {90,88,97,86,88};
       // System.out.println(marks.length);
        // Display the array (native way)
      //  System.out.println(marks[0]);
        //System.out.println(marks[1]);
    //    System.out.println(marks[2]);
    //    System.out.println(marks[3]);
    //    System.out.println(marks[4]);
    for(int element : marks){
    System.out.println(element);
    }
    }
}
