package sk.itsovy.jackanin.projectArray;

import java.util.Random;

public class myArray {

    public static void test1(){
        int[] arr=new int[7];
        for (int i=1; i<=7; i++)
            arr[i - 1] = i;
        for (int i=6; i>=0; i--)
            System.out.print(arr[i]+" ");
    }

    public static void test2(){
        int[] arr=new int[10];
        Random rand=new Random();
        for (int i=0; i<=9; i++){
            arr[i]=rand.nextInt(90)+10;
        }
        int i=0;
        while(i<=9){
            if (arr[i]%2==0)
                System.out.print(arr[i]+" ");
            i++;
        }
        System.out.println();
        i=9;
        do{
            System.out.print(arr[i]+" ");
            i--;
        }while(i>=0);
    }
}
