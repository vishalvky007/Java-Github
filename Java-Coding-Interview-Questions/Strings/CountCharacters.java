// Write a Java program to find number of words in a sentence 
// and corresponding character count.

/*
Ex: "Hello World" -> 'H','E','L','L','O','','W','O','R','L','D'
Hello -> 5
World -> 5

Here we have to find out number of words in a sentence and the
corresponding character count of each word.
*/

public class CountCharacters {

    static void count(String str) {
        // Create an Char array of given String
        char[] ch = str.toCharArray();
        for(int i=0; i<ch.length; i++) {
            // Declare an String with empty initialization
            String s = "";

            // When the character is not space
            while(i < ch.length && ch[i]!=' ') {
                
                // concat with the declared String
                s = s + ch[i];  // ""+'H','E','L','L','O'
                i++;
            }
            if(s.length() > 0) 
                System.out.println(s+"->"+s.length());
        }
    }

    public static void main(String[] args) {
        String str = "I'm learning Strings";
        count(str);
    }
}
