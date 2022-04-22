import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome  to the Cipher App");
        System.out.println("Please enter a message");
        String word = scanner.nextLine();

        MessageCipher messageCipher = new MessageCipher();
        System.out.println("Your Ciphered Word is:");
        System.out.println(messageCipher.cipherWord(word));

    }
}

