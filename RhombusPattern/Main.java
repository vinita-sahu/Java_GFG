public class Main {
    public static void main(String[] arg) {
        int n = 10;
        for(int i = 1; i <= n; i++)
        {
            for(int j = n-i; j >= 1 ; j--)
            {
                System.out.print(" ");
            }
            for(int j = 1 ; j <= n; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }


    }
}