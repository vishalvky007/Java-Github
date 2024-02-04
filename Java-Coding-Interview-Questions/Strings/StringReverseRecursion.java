public class StringReverseRecursion {
    
    public static void main(String[] args) {
        
        String s = "Sandy";
        System.out.println(reverseString(s));
    }

    private static String reverseString(String s) {

        if(s==null || s.length()<=1) {
            return s;
        }
        return reverseString(s.substring(1))+s.charAt(0);
    }
}
