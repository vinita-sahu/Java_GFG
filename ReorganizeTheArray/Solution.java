import java.util.Scanner;

public class Solution {

    public static void largestNumber(int i, int j,char[] max,String s,int k)
    {
        if(i <= s.length()-k && j < k) {
            if (s.charAt(i) > max[j]) {
                int temp = i;
                for (int m = 0; m < k; m++) {
                    max[m] = s.charAt(temp);
                    temp++;
                }
                largestNumber(i + 1, j, max, s, k);
            } else if (s.charAt(i) == max[j]) {
                largestNumber(i + 1, j + 1, max, s, k);
            } //else {
                largestNumber(i + 1, 0, max, s, k);
            //}
        }
    }
    public static void leastNumber(int i, int j,char[] min,String s,int k)
    {
        if(i <= s.length()-k && j < k) {
            if (s.charAt(i) < min[j]) {
                int temp = i;
                for (int m = 0; m < k; m++) {
                    min[m] = s.charAt(temp);
                    temp++;
                }
                leastNumber(i + 1, j, min, s, k);
            } else if (s.charAt(i) == min[j]) {
                leastNumber(i + 1, j + 1, min, s, k);
            } //else {
            leastNumber(i + 1, 0, min, s, k);
            //}
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        char[] max = new char[k];
        char[] min = new char[k];
        for(int i = 0; i<k; i++) {max[i] = 'A';}
        for(int i = 0; i<k; i++) {min[i] = 'z';}
        largestNumber(0,0,max,s,k);
        leastNumber(0,0,min,s,k);
        System.out.println(String.copyValueOf(max) + "\n" + String.copyValueOf(min));
        //System.out.println(min);
    }
}