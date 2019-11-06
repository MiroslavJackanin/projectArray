package sk.itsovy.jackanin.project;

import jdk.jshell.spi.ExecutionControl;

import java.util.Random;

public class myArray implements ArrayMethods{
    private int arr[];
    private int size;

    //CONSTRUCTOR
    public myArray(int size) {
        if (size<=0){
            System.out.println("Array of size <= 0");
            System.exit(1);
        }
        this.size = size;
        arr=new int[size];
        resetArray();
    }
    public myArray(int[] input){
        if (input==null || input.length==0){
            System.out.println("Cannot declare array");
            System.exit(1);
        }
        this.arr=input;
        this.size=input.length;
    }

    //GETTER & SETTER
    public int getSize() {
        return size;
    }

    //METHODS
    public void resetArray() {
        for (int i=0; i<size; i++)
            arr[i]=0;
    }

    @Override
    public double getAverageValue() {
        return Math.round((sumOfValues(arr)/size) * 100.0) / 100.0;
    }

    @Override
    public int min() {
        int min=arr[0];
        for (int i=1; i<size; i++){
            if (min>arr[i])
                min=arr[i];
        }
        return min;
    }

    @Override
    public int max() {
        int max=arr[0];
        for (int i=1; i<size; i++){
            if (max<arr[i])
                max=arr[i];
        }
        return max;
    }

    @Override
    public int secondMin() {
        if (size<=1){
            System.out.println("Array of size <=1: No second Min");
            System.exit(1);
        }
        int secMin=arr[0];
        for (int i=1; i<size; i++){
            if (secMin>arr[i] && arr[i]!=min())
                secMin=arr[i];
        }
        return secMin;
    }

    @Override
    public int secondMax() {
        if (size<=1){
            System.out.println("Array of size <=1: No second Max");
            System.exit(1);
        }
        int secMax=arr[0];
        for (int i=1; i<size; i++){
            if (secMax<arr[i] && arr[i]!=max())
                secMax=arr[i];
        }
        return secMax;
    }

    @Override
    public void generateValues(int a, int b, boolean duplicates) {
        Random rand=new Random();
        if (duplicates) {
            for (int i = 0; i < size; i++) {
                arr[i]=rand.nextInt(b-a+1)+a;
            }
        } else {
            for (int i=0; i<size; i++) {
                int temp = rand.nextInt(b-a+1)+a;
                int x=0;
                for (int j = 0; j<i; j++)
                    if (arr[j]==temp) {
                        x = 1;
                        break;
                    }
                if (x!=1)
                    arr[i]=temp;
                else
                    i--;
            }
        }
    }

    @Override
    public boolean contains(int value) {
        int temp=0;
        for (int i=0; i<size; i++){
            if (arr[i] == value) {
                temp = 1;
                break;
            }
        }
        return temp==1?true:false;
    }

    @Override
    public int countOfValues(int value) {
        int temp=0;
        for (int i=0; i<size; i++){
            if (value==arr[i])
                temp++;
        }
        return temp;
    }

    @Override
    public int countOfEvenValues() {
        int temp=0, copy=0;
        for (int i=0; i<size; i++){
            if (arr[i]<0){
                copy=arr[i]*-1;
                if (copy%2==0)
                    temp++;
            }
            if (arr[i]%2==0)
                temp++;
        }
        return temp;
    }

    @Override
    public void incrementValues() {
        for (int i=0; i<size;i++){
            arr[i]+=1;
        }
    }

    @Override
    public void sort(boolean asc) {
        if (asc){
            for (int i=0; i<(size)-1; i++){
                for (int j=0; j<(size)-i-1; j++){
                    if (arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }else{
            for (int i=0; i<(size)-1; i++){
                for (int j=0; j<(size)-i-1; j++){
                    if (arr[j]<arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
    }

    @Override
    public double sumOfValues(int[] arr) {
        double sum = 0;
        for (int i=0; i<size; i++)
            sum+=arr[i];
        return sum;
    }

    @Override
    public void addItemOnPosition(int value, int position) {
        int[] array=new int[size+1];
        int temp=0;
        for (int i=0; i<size+1; i++){
            if (position==i+1) {
                array[i] = value;
                temp++;
            }
            else
                array[i]=arr[i-temp];
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    @Override
    public void addItem(int value) {
        int[] array=new int[size+1];
        array[size]=value;

        for (int i=0; i<size; i++){
            array[i]=arr[i];
        }
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
    }

    @Override
    public int[] copy() {
        return arr.clone();
    }

    @Override
    public int getItemOnPosition(int position) {
        return arr[position];
    }

    @Override
    public void printArray() {
        System.out.println();
        for (int i=0; i<size; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
