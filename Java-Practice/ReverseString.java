public class ReverseString {
    public static void main(String[] args) {
        // 1) Using + (string concatenation) operator
        
        String str = "ABCD";
        //String rev = "";

        /*
        int len = str.length(); // 4
        
        for(int i=len-1; i>=0; i--) // 3 2 1 0 -1
        {
            rev=rev + str.charAt(i);
        }

        System.out.println("Reversed string is: "+rev);
        */

        // 2) Using character array
        /*
        char a[] = str.toCharArray();
        int len = a.length;

        for(int i=len-1;i>=0; i--) // 3 2 1 0 -1
        {
            rev = rev + a[i];   // DCBA
        }

        System.out.println("Reversed string is: "+rev);
        */

        // 3) Using StringBuffer class
        StringBuffer sb = new StringBuffer(str);
        StringBuffer revStr= sb.reverse();
        System.out.println(revStr);
    }
}
