/*
print the star pattern in java the pattern is given bellow
****
***
**
*
                                                    */


class HelloWorld {
    public static void main(String[] args) {
        int n=4;
        for (int i=n;i>0;i--){
            for (int j=0;j<i;j++){
              //we doesnt use print ln here because if we use println here so new line is come after every star
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
