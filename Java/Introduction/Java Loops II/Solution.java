import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int disp;
            for(int j = 0; j < n ; j++){
                disp = a;
                for(int k = 0; k<=j ; k++){
                    disp = disp + (int)(Math.pow(2,k))*b;
                }
                System.out.print(disp + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
