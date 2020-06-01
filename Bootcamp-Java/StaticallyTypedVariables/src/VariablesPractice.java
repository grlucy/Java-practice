public class VariablesPractice {
    public static void main(String[] args) {
        int integerOne = 4;
        double doubleOne = 7.99;
        double sumOne = integerOne + doubleOne;

        // Sum of int and double is double
        System.out.println("sumOne:");
        System.out.println(sumOne);

        String name = "Robert";
        String newName = integerOne + name;

        // Sum of int and String is String (concatenated)
        System.out.println("newName:");
        System.out.println(newName);
    }
}
