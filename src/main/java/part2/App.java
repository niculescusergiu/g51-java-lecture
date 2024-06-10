package part2;

public class App {
    public static void main(String[] args) {
        //How to call a static method: ClassName.methodName()
        int result = MathOperations.addition(10, 1);
        System.out.println(result); //Output 11
        MathOperations.addition(10.5,12.5);
        System.out.println(MathOperations.addition(10.5,12.5));
    }

}
