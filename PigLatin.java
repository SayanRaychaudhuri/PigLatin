import java.util.*;
public class PigLatin{

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	String english = input.nextLine();
    System.out.println(doStuff(english));
    main(null);
}
public static String doStuff(String word) {
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < word.length(); i++) {
        if (vowels.contains(""+word.charAt(i))) {
            String prefix = word.substring(0, i);
            String suffix = word.substring(i);
            word = suffix + prefix + "ay";
            break;
        }
    }
    return word;
}
}