import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                //Complete this line
                int sLen = s1.length();
                int iLen = String.valueOf(x).length();
                if(sLen<15){
                    System.out.print(s1);
                    int len = 15 - sLen;
                    for(int j =0; j<len ; j++){
                        System.out.print(" ");
                    }
                }
                if(iLen<3){
                    int len = 3 - iLen;
                    for(int j =0; j<len ; j++){
                        System.out.print("0");
                    }
                    System.out.println(x);
                }
                else
                    System.out.println(x);
            }
            System.out.println("================================");

    }
}



