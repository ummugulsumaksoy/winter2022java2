package day26exception;

public class EQ04 {
    public static void main(String[] args) {
    String str="123";
    convertStringToInteger(str); //124

    String s="123a";
    convertStringToInteger(s); //NumberFormatException ==> For input string: "123a"

    }
    public static void convertStringToInteger(String str) {
        try {
            System.out.println(Integer.parseInt(str) + 1); // If I am able to do addition, that means I am sure it converted String to integer
        } catch (NumberFormatException e) {
            System.err.println("String could not be inverted to an int ==> " + e.getMessage());
        }
    }
}
