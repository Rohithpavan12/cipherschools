public class PrimitiveDataTypesDemo {
    public static void main(String[] args) {
 
        int intValue = 100;
        double doubleValue = 25.75;
        char charValue = 'A';
        boolean booleanValue = true;
        System.out.println("Initial values:");
        System.out.println("Integer value: " + intValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Character value: " + charValue);
        System.out.println("Boolean value: " + booleanValue);
        double intToDouble = intValue;
        int charToInt = charValue;
        System.out.println("\nAfter type conversion:");
        System.out.println("Integer to Double: " + intToDouble);
        System.out.println("Character to Integer: " + charToInt);
    }
}
