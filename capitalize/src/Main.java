import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static String LetterCapitalize(String str) {
        // code goes here
        String[] array = str.split(" ");
        return Arrays.stream(array).map(item -> Character.toUpperCase(item.charAt(0)) + item.substring(1)).collect(Collectors.joining(" "));
//        return String.join(" ", array);
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterCapitalize(s.nextLine()));
    }

}