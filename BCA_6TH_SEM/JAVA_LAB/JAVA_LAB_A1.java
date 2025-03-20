package JAVA_LAB_A1;

import java.util.Scanner;

public class JAVA_LAB_A1 {
    public enum Units {
        ZERO(""), ONE("One"), TWO("Two"), THREE("Three"), FOUR("Four"),
        FIVE("Five"), SIX("Six"), SEVEN("Seven"), EIGHT("Eight"), NINE("Nine");

        private final String word;

        Units(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }

    public enum Teens {
        ELEVEN("Eleven"), TWELVE("Twelve"), THIRTEEN("Thirteen"), FOURTEEN("Fourteen"),
        FIFTEEN("Fifteen"), SIXTEEN("Sixteen"), SEVENTEEN("Seventeen"), EIGHTEEN("Eighteen"), NINETEEN("Nineteen");

        private final String word;

        Teens(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }

    public enum Tens {
        TEN("Ten"), TWENTY("Twenty"), THIRTY("Thirty"), FORTY("Forty"),
        FIFTY("Fifty"), SIXTY("Sixty"), SEVENTY("Seventy"), EIGHTY("Eighty"), NINETY("Ninety");

        private final String word;

        Tens(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }

    public enum Thousands {
        THOUSAND("Thousand"), TEN_THOUSAND("Ten Thousand");

        private final String word;

        Thousands(String word) {
            this.word = word;
        }

        public String getWord() {
            return word;
        }
    }

    public static String convertToWords(int number) {
        if (number < 0 || number > 99999) {
            return "Number out of range (0-99999)";
        }

        StringBuilder result = new StringBuilder();
        int thousands = number / 1000;
        int remainder = number % 1000;

        if (thousands > 0) {
            result.append(convertToWordsHelper(thousands)).append(" ").append(Thousands.THOUSAND.getWord()).append(" ");
        }

        if (remainder > 0) {
            result.append(convertToWordsHelper(remainder));
        }

        return result.toString().trim();
    }

    private static String convertToWordsHelper(int number) {
        StringBuilder words = new StringBuilder();

        int hundreds = number / 100;
        int remainder = number % 100;

        if (hundreds > 0) {
            words.append(Units.values()[hundreds].getWord()).append(" Hundred ");
            if (remainder > 0) {
                words.append("and ");
            }
        }

        if (remainder >= 11 && remainder <= 19) { // Handle teens separately
            words.append(Teens.values()[remainder - 11].getWord());
        } else {
            int tens = remainder / 10;
            int units = remainder % 10;

            if (tens > 0) {
                words.append(Tens.values()[tens - 1].getWord()).append(" ");
            }
            if (units > 0) {
                words.append(Units.values()[units].getWord());
            }
        }

        return words.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println("Enter Number to convert into words:");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // Fixed the syntax error
        System.out.println(number + " in words: " + convertToWords(number));
        sc.close(); // Close scanner to avoid resource leak
    }
}