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
        System.out.println("Okay. What's on your mind?");
        
        int counter = 0;

        while (counter < rounds) { //while the conversation is still going:
            counter = counter + 1;
            // Get user's statement / input
            String userInput = sc.nextLine(); 

            // Respond to question
            if (userInput.contains("?")) {
                System.out.println("How interesting...");
            }
            // Respond to statement
            else { //monster if statements
              //put this in a function called mirror? that way you can use it for questions too
              if (userInput.contains("I")) {
                System.out.println(userInput.replace("I", "You") + "?");
            }
              if (userInput.contains("me")) {
                System.out.println(userInput.replace("me", "you") + "?");
            }
              if (userInput.contains("am")) {
                System.out.println(userInput.replace("am", "are") + "?");
            }
              if (userInput.contains("you")) {
                System.out.println(userInput.replace("am", "are") + "?");
            }
              if (userInput.contains("my")) {
                System.out.println(userInput.replace("my", "your") + "?");
            }
              if (userInput.contains("your")) {
                System.out.println(userInput.replace("your", "my") + "?");
            }
              else {
                System.out.println("Oh...seek help maybe."); //add random choice from list here
            }
            
          }


        }
        System.out.println("Goodbye!");
        sc.close();

    }
}
