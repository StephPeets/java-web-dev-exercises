package exercises;
import java.util.Locale;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String aliceSentence = ("Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'").toLowerCase(Locale.ROOT);

        System.out.print("Search term: ");

        String searchTerm = input.nextLine().toLowerCase(Locale.ROOT);

        boolean searchResult = aliceSentence.contains(searchTerm);

        System.out.print(searchResult);

        input.close();
    }
}
