package adv.java;
import java.util.*;

public class JAVA_LAB_A4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str;
        System.out.println("Enter a String: ");
        str = scanner.nextLine();
        String punct = ".,!:;\n\t";  // Define punctuation characters
        int start = 0;
        String word = "", revWord = "";
        String togStr = "";

        // Trim and iterate through the string
        str = str.trim() + " ";  // Added space to handle the last word outside loop
       
        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is a punctuation mark
            if (punct.contains(str.charAt(i) + "")) {
                word = str.substring(start, i);  // Extract the word
                start = i + 1;

                StringBuilder sb = new StringBuilder(word.trim());
                char tchar;

                // Check if the word's length is even
                if (sb.length() > 0 && sb.length() % 2 == 0) {
                    // Swap adjacent characters for even-length words
                    for (int j = 1; j < sb.length(); j += 2) {
                        tchar = sb.charAt(j);
                        sb.setCharAt(j, sb.charAt(j - 1));
                        sb.setCharAt(j - 1, tchar);
                    }
                    System.out.println("" + sb);  // Print the swapped word
                }

                // Toggle the case of each character in the word
                StringBuilder capF = new StringBuilder(word);
                for (int j = 0; j < capF.length(); j++) {
                    if (Character.isUpperCase(capF.charAt(j))) {
                        capF.setCharAt(j, Character.toLowerCase(capF.charAt(j)));
                    } else if (Character.isLowerCase(capF.charAt(j))) {
                        capF.setCharAt(j, Character.toUpperCase(capF.charAt(j)));
                    }
                }

                // Append the modified word and the punctuation mark to the result string
                togStr += capF.toString();
                togStr += str.charAt(i);
            }
        }

        // Append the last word after the loop
        String lastWord = str.substring(start).trim();
        if (!lastWord.isEmpty()) {
            StringBuilder sb = new StringBuilder(lastWord);
            char tchar;
            if (sb.length() > 0 && sb.length() % 2 == 0) {
                for (int j = 1; j < sb.length(); j += 2) {
                    tchar = sb.charAt(j);
                    sb.setCharAt(j, sb.charAt(j - 1));
                    sb.setCharAt(j - 1, tchar);
                }
                System.out.println("" + sb);  // Print the swapped word
            }

            // Toggle the case for the last word
            StringBuilder capF = new StringBuilder(lastWord);
            for (int j = 0; j < capF.length(); j++) {
                if (Character.isUpperCase(capF.charAt(j))) {
                    capF.setCharAt(j, Character.toLowerCase(capF.charAt(j)));
                } else if (Character.isLowerCase(capF.charAt(j))) {
                    capF.setCharAt(j, Character.toUpperCase(capF.charAt(j)));
                }
            }
            togStr += capF.toString();  // Add the last modified word
        }

        // Output the final result
        System.out.println("\n" + togStr);
    }
}
