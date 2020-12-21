import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        smallest=s;
        for(int i=0;i<=(s.length()-k);i++)
        {
            String s1=s.substring(i,(k+i));
            if(s1.compareTo(smallest)<0)
            {
                smallest=s1;
            }
            if(s1.compareTo(largest)>0)
            {
                largest=s1;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}