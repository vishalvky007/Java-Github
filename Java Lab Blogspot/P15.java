/* Write a Program to convert hours into minutes. */

import java.util.Scanner;

class HoursToMinute {
    
    private float hours, minute;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hours: ");
        hours = sc.nextFloat();
        sc.close();
    }
    
    public float convert() {
        minute = hours * 60;
        
        return minute;
    }
}



public class P15 {
    public static void main(String[] args) {
     
        HoursToMinute x = new HoursToMinute();
        x.input();
        float min = x.convert();
        System.out.println("Number of Minutes is: "+min);
    }
}
