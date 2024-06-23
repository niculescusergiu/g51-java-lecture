package Arrays;

import java.util.Scanner;

public class ArraysWorkshop {
    private String[] names;
    private int size;

    public ArraysWorkshop() {
        names = new String[10];
        size = 0;
    }

    public static void main(String[] args) {
        ArraysWorkshop nameStorage = new ArraysWorkshop();
        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Enter a name (first last) or 'print' to display all names:");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("print")) {
                nameStorage.printNames();
            } else {
                if (nameStorage.add(input)) {
                    System.out.println("Name added successfully.");
                } else {
                    System.out.println("Name already exists or invalid format.");
                }
            }
        }
    }


    public String find(final String fullName) {
        for (int i = 0; i < size; i++) {
            if (names[i].equals(fullName)) {
                return names[i];
            }
        }
        return null;
    }

    // Add method
    public boolean add(final String fullName) {
        if (!isValidName(fullName)) {
            return false;
        }

        if (find(fullName) != null) {
            return false;
        }

        if (size == names.length) {
            resizeArray();
        }

        names[size] = fullName;
        size++;
        return true;
    }

    private boolean isValidName(String name) {
        String[] parts = name.split(" ");
        return parts.length == 2;
    }

    private void resizeArray() {
        String[] newNames = new String[names.length * 2];
        System.arraycopy(names, 0, newNames, 0, names.length);
        names = newNames;
    }

    private void printNames() {
        if (size == 0) {
            System.out.println("No names stored.");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }
    }
}