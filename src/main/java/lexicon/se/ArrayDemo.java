package lexicon.se;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] StringArrays = new String[3]; // [null, null,null]
        int [] numbers = new int[]{2, 4,6,8};  // [2, 4, 6,8]
        char[] letters = {'J','A','V','A'};
          sortNumber();
    }
      public static void ex1(){
        String[] names = new String [3];  // [ null, null, null]
          System.out.println(names.length);
          System.out.println("------------");
          names[0] = "Fredrik";  // [Fredrik, null,null]
          names[2] = "Jonas";  // [Fredrik, null,jonas]
          System.out.println(names[0]);
          System.out.println(names[1]);
          System.out.println(names[2]);

      }
      public static void ex2(){
        int [] numbers = {5,2,3,4,7};
          System.out.println(numbers.length);
          System.out.println("---------");
          printArray(numbers);
       /*   for (int i = 0; i< numbers.length; i++){
              System.out.println(numbers[i]);

          }*/
          numbers[1]= 4;
          System.out.println("-----------");
          printArray(numbers);

         /* for (int i = 0; i < numbers.length; i++){
              System.out.println(numbers[i]);
          }*/
          // numbers[5] = 10; // throws exception -> java.lang.ArrayIndexOutOfBoundsException

      }
       public static void printArray(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
       }
          public static void ex3(){
        String[][] bord = new String[3][3];
        // ["O", "x", "x"]
              // [null,null,null]
              // [null, null, null]
              bord[0][0] = " O";
              bord[0][1] ="x";
              bord[0][2] = "x";

              bord[1][0] = "O" ;
              bord[1][1] = "x";
              bord[1][2] = "x";

              bord[2][0] = "O";
              bord[2][1] = "x";
              bord[2][2] = "x";
              for (int i = 0 ; i < bord.length;i++){
                  for (int j = 0; j< bord[i].length; j++){
                      System.out.print(bord[i][j] + "\t");

                  }
                  System.out.println("\n");
              }
          }
           public static void ex4(){
        int [] numbers = {2,3,5,6};
        // we can  iterate forward & backward
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

       // we can only iterate from start to end
        for (int number : numbers){
            System.out.println(number);
        }
           }
           public static void sortNumber(){
        int [] numbers = {5,2, 3, 4,7};
                // {2, 5, 3, 4,7}
               // {2, 3 , 5, 4, 7}
               // {2, 3, 4, 5, 7}
               for (int i = 0; i < numbers.length; i++){
                   for (int j = i + 1; j< numbers.length; j++){
                       // compare each element of the array to all remaining elements
                       if(numbers[i] > numbers[j]){  // 5 > 2
                           int tmp = numbers[i];
                           numbers[i] = numbers[j];
                           numbers[j] = tmp;
                       }
                   }
               }
               for (int number : numbers){
                   System.out.println(number);
               }
           }
}

