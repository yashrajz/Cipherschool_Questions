public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
        int myInt = 42;
        double myDouble = 3.14;
        char myChar = 'A';
        boolean myBool = true;

        System.out.println("Before Conversion:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myDouble);
        System.out.println("Char value: " + myChar);
        System.out.println("Boolean value: " + myBool);

        double convertedDouble = myInt;
        int convertedInt = myChar;

        System.out.println("\nAfter Conversion:");
        System.out.println("Converted Double (from int): " + convertedDouble);
        System.out.println("Converted Int (from char): " + convertedInt);
    }
}
