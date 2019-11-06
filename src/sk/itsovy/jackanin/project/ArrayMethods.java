package sk.itsovy.jackanin.project;

public interface ArrayMethods {
    public void resetArray();
    public double getAverageValue();
    public int min();
    public int max();
    public int secondMin();
    public int secondMax();
    public void generateValues(int a, int b, boolean duplicates);
    public boolean contains(int value);
    public int countOfValues(int value);
    public int countOfEvenValues();
    public void incrementValues();
    public void sort(boolean asc);
    public double sumOfValues(int[] arr);
    public void addItemOnPosition(int value, int position);
    public void addItem(int value);
    public int[] copy();
    public int getItemOnPosition(int position);
    public void printArray();
}
