import java.util.Scanner;

public class Solution {

    public static boolean isSmall(String str, char[] min, int iStr, int iOut, int k)
    {
        if(str.charAt(iStr) < min[iOut])
            return true;
        else if(str.charAt(iStr) == min[iOut]) {
            if(iOut+1 == k)
                return false;
            return isSmall(str, min, iStr + 1, iOut + 1, k);
        }else
            return false;
    }
    public static String getSmall( String str, int k)
    {
        char[] min = new char[k];
        for(int i = 0; i < k; i++)
            min[i] = 'z';
        for(int i = 0; i <= str.length() - k; i++)
        {
            if(isSmall(str, min, i, 0, k))
            {
                for(int j = 0; j < k; j++)
                    min[j] = str.charAt(i+j);
            }
        }
        return String.copyValueOf(min);
    }

    public static boolean isBig(String str, char[] max, int iStr, int iOut, int k)
    {
        if(str.charAt(iStr) > max[iOut])
            return true;
        else if(str.charAt(iStr) == max[iOut]) {
            if (iOut+1 == k)
                return false;
            return isBig(str, max, iStr + 1, iOut + 1, k);
        } else
            return false;
    }

    public static String getLarge(String str, int k)
    {
        char[] max = new char[k];
        for(int i = 0; i < k; i++)
            max[i] = 'A';
        for(int i = 0; i <= str.length() - k; i++)
        {
            if(isBig(str, max, i, 0, k))
            {
                for(int j = 0; j < k; j++)
                    max[j] = str.charAt(i+j);
            }
        }
        return String.copyValueOf(max);

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int k = scan.nextInt();
        String min = getSmall(str, k);
        String max = getLarge(str, k);
        System.out.println("Max String: " + max + "\nMin String: " + min);
    }
}