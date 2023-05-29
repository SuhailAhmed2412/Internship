import java.util.*;

public class Q25 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String str;
            char character;
            System.out.println("Enter the character: ");
            str= input.nextLine();
            character= str.charAt(0);
            if(Character.isAlphabetic(character)) {
                switch (character) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        System.out.println(character+" is a vowel"); break;
                    default:
                        System.out.println(character+" is a consonant");
                }
            }
            else {
                System.out.println("Please enter the valid character");
                main(args);
            }
        }
    }    
}
