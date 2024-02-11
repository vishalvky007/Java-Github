public class Eight {
    public static void main(String[] args) {
        
        for(int i=0; i<11; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(i>=0 && i<2)
                {
                    System.out.print(" ");
                }
                else if(i>=3 && i<8 )
                {
                    System.out.print("*");
                }
                else if (i>=9 && i<=11)
                {
                    System.out.print(" ");
                }
            }

        }
    }
}
