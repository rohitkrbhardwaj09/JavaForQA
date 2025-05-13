
import java.util.Scanner;

public class ConsonentAndVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String Input: ");
        String input = sc.nextLine();

        char[] c = input.toCharArray();


        for (char chr : c) {
            switch (chr) {
                case 1:
                    
                    break;
                default:
                    throw new AssertionError();
            }
        }

        sc.close();
    }
}
