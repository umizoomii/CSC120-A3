//import things for java
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

        //list of (toxic) responses
        String responses[] = {"That sounds kind of toxic", "That's embarrasing", "You should seek help", "Oh...", "Are you sure about that?", "Rethink this.", "You're the problem.", "You're crazy.", "Are you making this up?"};
        List <String> resp = Arrays.asList(responses);
        //ask about the difference between these two methods of creating a list
        List<String> transcript = new ArrayList<String>(); //ask about this

        while (counter < rounds) { //while the conversation is still going:
            counter = counter + 1;
            // Get user's statement / input
            String userInput = sc.nextLine(); 
            transcript.add(userInput);

            //split string to fix mirroring
            String[] words = userInput.split("\\s+");
            boolean keyword = false;
            //for loop that loops through each word in user input
            String response = "";
            for(String word: words) {
                if (word.equals("I")) {
                word = "You";
                keyword = true;
            }
            else if (word.equals("me")) {
                word = "you";
                keyword = true;
            }
            else if (word.equals("am")) {
                word = "are";
                keyword = true;
            }
            else if (word.equals("are")) {
              word = "am";
              keyword = true;
            }
            else if (word.equals("you")) {
              word = "I";
              keyword = true;
            }
            else if (word.equals("my")) {
              word = "your";
              keyword = true;
            }
            else if (word.equals("your")) {
              word = "my";
              keyword = true;
            }
           
            response += " " + word;
          } //end for loop

            if (keyword){
              String compresponse = String.join(" ", response).strip(); 
              if (!userInput.contains("?")) {
                compresponse += "?"; 
              }
              System.out.println(compresponse);
              transcript.add(compresponse);
            }
            else {
              String compresponse = resp.get(rnd.nextInt(8));
              System.out.println(compresponse);
              transcript.add(compresponse);
          }
            
        } //end of while loop
           
        System.out.println("Goodbye!");
        transcript.add("Goodbye!");

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

