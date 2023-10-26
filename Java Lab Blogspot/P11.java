import java.util.Scanner;

public class P11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        System.out.print("Enter marks of Out: ");
        int outof = sc.nextInt();

        Student S1 = new Student(n,outof);
        S1.input();
        float percent = S1.calcPercentage();

        System.out.println("Your Percentage in 12th is: "+percent+"%");
        sc.close();
    }
}

class Student {

    private int n;
    private int outof;
    private float[] marks;

    Student(int n, int outof) {
        this.n = n;
        this.outof = outof;
        marks = new float[n];
    }

    public void input() {

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Marks in Subject-" + (i + 1) + " : ");
            marks[i] = sc.nextFloat();
        }
        sc.close();
    }

    public float calcPercentage() {

        float sum = 0;
        for(int i=0; i<n; i++) 
        {
            sum = sum + marks[i];
        }
        float percentage = ((sum/(outof*n))*100);
        
        return percentage;
    }

}
