import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {
        // Create an array to mark the presence of each letter
        boolean[] alphabet = new boolean[26];

        // Convert the sentence to lowercase to handle both cases
        sentence = sentence.toLowerCase();

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            // Check if the character is an alphabet letter
            if ('a' <= currentChar && currentChar <= 'z') {
                int index = currentChar - 'a';
                alphabet[index] = true;
            }
        }

        // Check if all letters from 'a' to 'z' are marked as true
        for (boolean letterPresent : alphabet) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }
}