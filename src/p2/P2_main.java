package p2;

public class P2_main {
    public static void main(String[] args) {
        System.out.println(shortenToLowerCase("RindfLeischetikETTierung", 13));
    }

    public static String shortenToLowerCase(String input, int shortenBy) {
        input  = input.substring(0 , input.length() - shortenBy);
        input = input.toLowerCase();
        return input;
    }
}