package Arrays;

import java.util.Arrays;
import java.util.Comparator;

public class arrayexample2 {
    private String[] names ={
            "Nisse", "Olle", "Erik", "Simon", "Sofia", "Selma", "Ulf", "Fredrik"
    };
    public String findName(String nameToFind) {
        for(String name : names) {
            if(name.equalsIgnoreCase(nameToFind)) {
                return name;
            }
        }
        return "Error: No match";
    }

    public static void main(String[] args) {
      String[] words = {"Banana", "Cherry", "Date", "Apple"};
      Arrays.sort(words);
        Comparator<String> caseInsensitiveOrder = String.CASE_INSENSITIVE_ORDER;
        int index = Arrays.binarySearch(words, "cherry", caseInsensitiveOrder);
        System.out.println(index);

        System.out.println();

        int[] array1 = {1, 2, 3, 4};
        int[] array2 = Arrays.copyOf(array1, array1.length + 2);
        array2[4] = 5;
        array2[5] = 6;

        for(int number : array2) {
            System.out.println(number);
        }
    }
}
