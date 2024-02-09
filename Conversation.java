import java.util.Scanner;

//define class
public class Conversation {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        
        //print first message
        System.out.println("Hi there. I'm Uma. How many rounds would you like to play? ");
        int rounds = sc.nextInt();
        
        //clear input
        sc.nextLine();
        //ask user for input
        System.out.println("Okay. what would u like to say");
        
        int counter = 0;

        while (counter < rounds) {
            counter = counter + 1;
            // Get user's statement / input
            String userInput = sc.nextLine(); 

            // Respond to question
            if (userInput.contains("?")) {
                System.out.println("How interesting...");
            }
            // Respond to statement
            else {
                System.out.println(userInput + "?");
            }


        }
        System.out.println("Goodbye!");
        sc.close();

    }
}
