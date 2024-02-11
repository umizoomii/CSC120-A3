import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

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
        //initialize random class
        Random rnd = new Random();

        //list of responses
        String responses[] = {"That sounds kind of toxic", "That's embarrasing", "You should seek help", "Oh...", "Are you sure about that?", "Rethink this."};
        List <String> resp = Arrays.asList(responses);
        
        //set up empty list for transcript
        //String transcript[] = {"The transcript", "another sentence"};
        //List <String> tr = Arrays.asList(transcript);

        List<String> transcript = new ArrayList<String>();
        while (counter < rounds) { //while the conversation is still going:
            counter = counter + 1;
            // Get user's statement / input
            String userInput = sc.nextLine(); 
            transcript.add(userInput);

            
            //System.out.println(tr);

            // Respond to question
            if (userInput.contains("?")) {
                String compresponse = resp.get(rnd.nextInt(5));
                System.out.println(compresponse);
                transcript.add(compresponse);
            }
            // Respond to statement
            else { //if it does not contain a question mark:
              if (userInput.contains("I")|
              userInput.contains("me") |
              userInput.contains("am") |
              userInput.contains("you") |
              userInput.contains("my") |
              userInput.contains("your") 
              ) {
                if (userInput.contains("I")) {
                  String compresponse = userInput.replace("I", "You") + "?";
                  System.out.println(compresponse);
                  transcript.add(compresponse);
            }
                if (userInput.contains("me")) {
                  String compresponse = userInput.replace("me", "you") + "?";
                  System.out.println(compresponse);
                  transcript.add(compresponse);
            }
                if (userInput.contains("am")) {
                  String compresponse = userInput.replace("am", "are") + "?";
                  System.out.println(compresponse);
                  transcript.add(compresponse);
            }
                if (userInput.contains("you")) {
                  String compresponse = userInput.replace("you", "I") + "?";
                  System.out.println(compresponse);
                  transcript.add(compresponse);
            }
                if (userInput.contains("my")) {
                  String compresponse = userInput.replace("my", "your") + "?";
                  System.out.println(compresponse);
                  transcript.add(compresponse);
            }
                if (userInput.contains("your")) {
                  String compresponse = userInput.replace("your", "my") + "?";
                  System.out.println(compresponse);
                  transcript.add(compresponse);
            }    
            }
            else { //semicolon tells program statement is over
              String compresponse = resp.get(rnd.nextInt(5));
              System.out.println(compresponse);
              transcript.add(compresponse);
            }
         }
         
         

        }
        
        System.out.println("Goodbye!");

        //print transcript line by line
        System.out.println(" ");
        System.out.println("Transcript: ");
        for (String element: transcript) {
          System.out.println(element);
        }
        //System.out.println(transcript);
        sc.close();

    }
}
