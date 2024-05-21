package loop1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArray = new int[10];
        for(int i=0;i<10;i++){
            myArray[i] = in.nextInt();
        }
        for(int i=9;i>=0;i--){
            System.out.println(myArray[i]);
        }
    }
}
