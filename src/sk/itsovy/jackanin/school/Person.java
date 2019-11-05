package sk.itsovy.jackanin.school;

import java.util.Random;

public class Person {
    private String name;
    private int age;

    //CONSTRUCTOR
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //GETTER & SETTER
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //METHODS
    public static void test1(){
        Random rnd=new Random();

        System.out.println("__STUDENTS");
        Student[] arr1=new Student[5];
        for (int i=0; i<arr1.length; i++){
            arr1[i]=new Student("student"+i, rnd.nextInt(16)+10, "1N");
        }
        for (Student temp: arr1){
            System.out.println(temp.getName()+" "+temp.getAge()+" "+temp.getGroup());
        }
        System.out.println("  Minors are:");
        for (Student temp: arr1){
            if (temp.getAge()<18)
                System.out.println(temp.getName()+" "+temp.getAge()+" "+temp.getGroup());
        }

        System.out.println("\n__TEACHERS");
        Teacher[] arr2=new Teacher[8];
        for (int i=0; i<arr2.length; i++){
            arr2[i]=new Teacher("teacher"+i, rnd.nextInt(43)+18, rnd.nextInt(501)+500);
        }
        for (Teacher temp: arr2){
            System.out.println(temp.getName()+" "+temp.getAge()+" "+temp.getSalary());
        }
        System.out.println("  With salary:");
        for (Teacher temp: arr2){
            if (temp.getSalary()>765 && temp.getSalary()<935)
                System.out.println(temp.getName()+" "+temp.getAge()+" "+temp.getSalary());
        }
    }

    public static void test2(){
        String[] names={"Ivan","Peter","Erik","Zuzana","Leo","Viliam"};
        for (int i=0; i<names.length; i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
        for (String name: names){
            System.out.print(name+" ");
        }

        System.out.println("\n    only with 'a' in name");
        for (int i=0; i<names.length; i++){
            if (names[i].contains("a") || names[i].contains("A"))
                System.out.print(names[i]+" ");
        }
        System.out.println();
        for (int i=0; i<names.length; i++){
            for (int j=0; j<names[i].length(); j++){
                if (names[i].charAt(j)=='a' || names[i].charAt(j)=='A'){
                    System.out.print(names[i]+" ");
                    break;
                }
            }
        }

        System.out.println("\n    only the longest name");
        int longest=0;
        int shortest=names[0].length();
        for (int i=0; i<names.length; i++){
            if (names[i].length() > longest)
                longest=names[i].length();
            if (names[i].length()<shortest)
                shortest=names[i].length();
        }
        for (int i=0; i<names.length; i++){
            if (names[i].length()==longest)
                System.out.print(names[i]+" ");
        }

        System.out.println("\n    only the shortest name");
        for (int i=0; i<names.length; i++){
            if (names[i].length()==shortest)
                System.out.print(names[i]+" ");
        }

        System.out.println("\n    write upper case");
        for (int i=0; i<names.length; i++){
            System.out.print(names[i].toUpperCase()+" ");
        }

        System.out.println("\n miss vowels");
        String vowels="aeiou";
        for (int i=0; i<names.length; i++){
            String name=names[i];
            for (int j=0; j<name.length(); j++){
                String c=String.valueOf(name.charAt(j));
                if ("AEIOUYaeiouy".contains(c))
                    System.out.print(".");
                else
                    System.out.print(c);
            }
            System.out.print("  ");
        }
    }
}
