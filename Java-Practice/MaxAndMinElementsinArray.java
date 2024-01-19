public class MaxAndMinElementsinArray {
    public static void main(String[] args) {

        int a[] = { 50, 30, 40, 20, 60,2};

        int max = a[0]; // 50

        for (int i = 1; i<a. length; i++) {
            if (a[i] > max) // 60>50
            { 
                max = a[i]; // 50  60 
            }
        }

        System.out.println("Maximum element is: "+max);

        int min = a[0];
        for(int i= 1;i<a.length;i++) 
        {
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Minimum element is :"+min);

    }
}
