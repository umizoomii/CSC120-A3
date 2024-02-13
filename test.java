public class test {
    public static void main(String[] args) {
        String s = "I wonder how you are feeling";
        String[] words = s.split("\\s+");
        for(String word: words) {
            //System.out.print(word + ": ");
            if (word.equals("I")) {
                word = "You";
                //System.out.println(word);
            }
            System.out.println(word);
        }
        
    }

    
}
