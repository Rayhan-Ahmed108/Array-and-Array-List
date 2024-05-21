package LargestInArray;

import java.util.Scanner;

public class LargestValue {
    public static void main(String[] args) {
        double []value=new double[10];
        Scanner sc=new Scanner(System.in);
        double [] myArray = new double [10];
        for(int i=0;i<10;i++){
            myArray[i]=sc.nextDouble();
        }
        double largest=0;
        for(int i=0;i<10;i++){
            if(largest<myArray[i]){
                largest=myArray[i];
            }
        }
        System.out.println("Largest value is: "+largest);
        double min=myArray[0];
        for(int i=0;i<10;i++){
            if(min>myArray[i]){
                min=myArray[i];
            }
        }
        System.out.println("min value is: "+min) ;

    }
}
