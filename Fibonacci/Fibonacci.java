import java.util.Scanner;

public class Fibonacci {

    public static void feb(int p, int c, int n)
    {
        if(n==0)
        {
            return;
        }
      //  System.out.println(c);
        feb(c,p+c, n-1);
        System.out.println(c);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        feb(0 , 1, num);
//        System.out.println(c);
//        num--;
//        while(num>0)
//        {
//            temp =  p + c;
//            p = c;
//            c = temp;
//            System.out.println(c);
//            num--;
//        }


    }
}
