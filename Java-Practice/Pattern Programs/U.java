public class U {
    public static void main(String[] args) {

        for(int i=0; i<11; i++)
        {
            for(int j=0; j<2; j++)
            {
                System.out.print("**");
            }
            for(int k=0; k<6; k++)
            {
                if(i>=0 && i<9)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("**");
                }
            }
            for(int l=0; l<2; l++)
            {
                System.out.print("**");
            }
            System.out.println();
        }
    }
}