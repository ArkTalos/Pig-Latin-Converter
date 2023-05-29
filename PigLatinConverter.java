import java.util.Scanner;

public class PigLatinConverter {
        public static void main(String[] args) {
                Scanner stringScanner = new Scanner(System.in);
                String userInput;
                String firstLetter;
                String restOfWord;
                String vowels = "aeiouAEIOU";
                int index;

                System.out.println("Enter a sentence to convert to Pig Latin:");
                userInput = stringScanner.nextLine();

                // separate words in a sentence by spaces
                String[] words = userInput.split(" ");

                // loop through each word in the sentence
                for (index = 0; index < words.length; index++) {
                        firstLetter = words[index].substring(0,1);
                        restOfWord = words[index].substring(1);

                        // if the first letter is a vowel, add "way" to the end of the word
                        if (vowels.contains(firstLetter)) {
                                System.out.print(words[index] + "way ");
                        }
                        // if the first letter is a consonant, move the first letter to the end of the word and add "ay"
                        else {
                                System.out.print(restOfWord + firstLetter + "ay ");
                        }
                }
    }
}

