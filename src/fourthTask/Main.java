package fourthTask;
import java.util.*;

public class Main {
    private static final String space = "$";
    public static String putSpaces(String[] words, int lengthOfNewString) {
        if (words.length <= 0) {
            System.out.println("Error, length of words must be > 0");
            return "";
        }

        int oldLength = 0;
        for (var v: words) {
            oldLength += v.length();
        }
        if (oldLength > lengthOfNewString) {
            System.out.println("Error, newLength must be newLength => oldLength");
            return "";
        }
        lengthOfNewString -= oldLength;

        String[] arrayOfSpaces;
        if (words.length == 1) {
            String result = "";
            for (int i = 0; i < lengthOfNewString; i++) {
                result += space;
            }
            return result + words[0];
        }

        arrayOfSpaces = new String[words.length - 1];
        Arrays.fill(arrayOfSpaces, "");

        int switcher = 0;
        while (lengthOfNewString > 0) {
            if (switcher > arrayOfSpaces.length - 1) switcher = 0;
            arrayOfSpaces[switcher] += space;   // for most comfortable checking set variable "space" for another char
            switcher++; lengthOfNewString--;
        }

        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (i == words.length - 1)
                result += words[i];
            else
                result += words[i] + arrayOfSpaces[i];
        }
        return result;
    }

    public static void main(String[] args) {
        String argument = args[0];
        int countOfSpaces = Integer.parseInt(args[1]);
        while (argument.indexOf("  ") >= 0) {
            argument = argument.replaceAll("  ", " ");
        }

        String words[] = argument.split(" ");

        String result = putSpaces(words, countOfSpaces);
        System.out.println(result);
    }
}

