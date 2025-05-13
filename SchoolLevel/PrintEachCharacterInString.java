
import java.util.Scanner;

class PrintEachCharacterInString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        // Method 1 -- toCharArray
        // char[] c = input.toCharArray();

        // for (char d : c) {
        //     System.out.println(d);
        // }

        // Method 2 -- chatAt
        // for(int i=0; i<input.length(); i++){
        //     System.out.println(input.charAt(i));
        // }

        //Method 3 -- split
        
        String[] inputArr = input.split("");
        for (String string : inputArr) {
            System.out.println(string);
        }


        sc.close();
    }
}