package random;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];
        Random random = new Random();
        for(int i=0;i<10;i++){
            myArray[i] = random.nextInt(100);
        }
        for(int i=0;i<10;i++){
            if((i+1)%2==0){
                System.out.print(myArray[i]+" ");
            }
        }
        System.out.println();

        for(int i=0;i<10;i++){
            if(myArray[i]%2==0){
                System.out.print(myArray[i]+" ");
            }
        }
        System.out.println();

        for(int i=9;i>=0;i--){
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println(myArray[0] + " " + myArray[9]);

    }
}
