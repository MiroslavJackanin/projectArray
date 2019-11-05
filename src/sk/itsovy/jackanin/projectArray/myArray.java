package sk.itsovy.jackanin.projectArray;

import java.util.Random;
import java.util.Scanner;

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

    public static void test5(){
        int[] field1=new int[10];
        field1[0]=1;
        for (int i=1; i<10; i++){
            field1[i]=field1[i-1]*2;
        }
        for (int i=0; i<10; i++){
            System.out.print(field1[i]+" ");
        }

        System.out.println();

        int[] field2=new int[10];
        for (int i=0; i<10; i++){
            field2[9-i]=field1[i];
        }
        for (int i=0; i<10; i++){
            System.out.print(field2[i]+" ");
        }
    }

    public static void test6(){
        int[] b={12,38,47,5,29,16,10,112,48,65,75,9};
        int size=0;
        for (int i=0; i<b.length; i++){
            if (b[i]%3!=0){
                size++;
            }
        }
        int[] b3n=new int[size];
        int j=0;
        for (int i=0; i<b.length; i++){
            if (b[i]%3!=0){
                b3n[j]=b[i];
                System.out.print(b3n[j]+" ");
                j++;
            }
        }
        System.out.println();
        int[] c = new int[b.length];
        for (int i=0; i<b.length; i++){
            c[i]=b[i];
            System.out.print(c[i]+" ");
        }

        int[] d = b.clone();

        int[] e = new int[b.length];
        System.arraycopy(b,0, e, 0, b.length);
    }

    public static void test7(){
        Random rand=new Random();
        int [] a = new int[20];
        for (int i=0; i<a.length; i++){
            int count=0, temp;
            temp=rand.nextInt(50)+1;
            for (int j=0; j<i; j++){
                if (temp==a[j]) {
                    count=1; break;
                }
            }
            if (count==0)
                a[i]=temp;
            else {
                i--;
            }
        }
        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void test8(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word=scan.nextLine();
        int length=word.length();
        for (int i=length-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }

    public static void test9(){
        int[] x = new int[]{17, 0, -2, 13, 68, 103, 21, 55, 1};
        for (int i=0; i<(x.length)-1;i++){
            for (int j=i+1; j<(x.length); j++){
                if (x[i]>x[j]){
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        for (int i=0; i<x.length; i++){
            System.out.print(x[i]+" ");
        }
    }

    public static void test10(){
        //Array init
        Random rand=new Random();   //1-80
        int [] arr = new int[20];
        for (int i=0; i<arr.length; i++) {
            int temp = rand.nextInt(80 + 1);
            int x=0;
            for (int j = 0; j<i; j++){
                if (arr[j]==temp){
                    x=1; break;
                }
            }
            if (x!=1){
                arr[i]=temp;
            }else{
                i--;
            }
        }

        //Array sout
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //Array sort
        for (int i=0; i<(arr.length)-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //Array sout
        System.out.println();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public  static void test11(){
        //Array init
        String[] arr={"Monika", "Yelizaveta", "Nikoleta", "Denis", "Patrik", "Miroslav", "Vlado", "Martin", "Ladislav", "Jakub", "Damian", "Tibor", "Jakub", "Jakub", "Peter", "Artem"};

        //Array sout
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        //Array sort
        for (int i=0; i<(arr.length)-1; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i].compareToIgnoreCase(arr[j]) > 0){
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //Array sout
        System.out.println();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void test12(){
        Random rand=new Random();
        int [] arr = new int[20];
        for (int i=0; i<arr.length; i++) {
            int temp = rand.nextInt(80 + 1);
            int x=0;
            for (int j = 0; j<i; j++){
                if (arr[j]==temp){
                    x=1; break;
                }
            }
            if (x!=1){
                arr[i]=temp;
            }else{
                i--;
            }
        }

        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=0; i<(arr.length)-1; i++){
            for (int j=0; j<(arr.length)-i-1; j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.println();
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
