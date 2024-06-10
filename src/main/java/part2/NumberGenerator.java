package part2;

import java.util.Random;

public class NumberGenerator {
    int max;
    int min;
public int generateRandomNumberInRange(){
    Random random = new Random();
    return random.nextInt(max - min + 1) + min;
}
    // how to declare and implement it?
    public static int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(1501);

    }
}
