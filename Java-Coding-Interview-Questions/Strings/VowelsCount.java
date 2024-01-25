import java.util.Scanner;

public class VowelsCount {

    public static void main(String[] args) {
        System.out.print("Enter some string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] chars = str.toCharArray();

        int count=0;

        for(char c : chars) {
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println("Number of vowels: "+count);
        sc.close();
    }
}
