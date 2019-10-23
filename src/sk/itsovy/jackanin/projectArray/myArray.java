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

    public static void test3(){
        int[] arr=new int [12];
        Random rand=new Random();
        int even=0, odd=0;
        for (int i=0; i<arr.length; i++) {
            arr[i] = rand.nextInt(999) + 1;
            System.out.print(arr[i] + " ");
            if (arr[i]%2==0) even++;
            else odd++;
        }
        System.out.println("\n");

        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        double avrg=sum/arr.length;
        System.out.println("Average number is "+avrg);

        int min=arr[0], max=0;
        for (int i=0; i<arr.length; i++){
            if (min>arr[i])
                min=arr[i];
            if (max<arr[i])
                max=arr[i];
        }
        int secondMin=max, secondMax=min;
        for (int i=0; i<arr.length; i++){
            if (secondMin>arr[i] && min!=arr[i])
                secondMin=arr[i];
            if (secondMax<arr[i] && max!=arr[i])
                secondMax=arr[i];
        }
        System.out.println("Smallest number is: "+min);
        System.out.println("Second smallest number is: "+secondMin);
        System.out.println("Biggest number is: "+max);
        System.out.println("Second biggest number is: "+secondMax);
        System.out.println("There's "+even+" even numbers and "+odd+" odd numbers.");
    }

    public static void test4(){
        int[] arr=new int[20];
        arr[0]=1; arr[1]=1;
        for (int i=2; i<20; i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i=0; i<20; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static int[] minmax(int a, int b, int c){
        int[] result=new int[2];
        if (a>b && a>c)
            result[1]=a;
        if (b>a && b>c)
            result[1]=b;
        if (c>a && c>b)
            result[1]=c;

        if (a<b && a<c)
            result[0]=a;
        if (b<a && b<c)
            result[0]=b;
        if (c<a && c<b)
            result[0]=c;

        return result;

    }
}
