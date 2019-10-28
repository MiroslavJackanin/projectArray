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
}
