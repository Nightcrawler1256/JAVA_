import java.util.Locale;

public class L134 {
    public static void main(String[] args) {
        String s="navin";
        String s1="great";
        String s2="navin";
        System.out.println(s.length()); // to find the length of the string
        System.out.println(s.toLowerCase(Locale.ROOT));  // to change the string into lower-case
        System.out.println(s.toUpperCase(Locale.ROOT)); // to change the string into UPPERCASE
        System.out.println(s.indexOf("i"));   // to find the index of any character in the string
        System.out.println(s.charAt(3));   // to find the character at that index
        System.out.println(s.equals(s1));   // to compare the two string objects
        System.out.println(s.equals(s2));
    }
}
