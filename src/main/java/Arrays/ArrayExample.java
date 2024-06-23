package Arrays;

public class ArrayExample {
    public static void main(String[] args) {

    } {
        // Syntax: datatype[] arrayName;
        int[] numbers;
        numbers = new int[3]; // [ 0 , 0 , 0 ]

        int[] numbersArr = new int[]{2, 4, 6, 8};  // 4 element int
        int[] numbersArrShortenedSyntax =  {2, 4, 6, 8};  // 4 element int

        String[] stringArray = new String[3];  // [null,null,null]
        char[] letters = {'J','A','V','A'};
ex1();

    }

    // Accessing an array element
    public static void ex1(){
        String[] names = new String[3];
        System.out.println(names.length);
        names[0] = "Fredrik";
        names[names.length - 1] = "Jonas";


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }
    public static void ex2(){

    }
}
