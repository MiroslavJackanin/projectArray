package sk.itsovy.jackanin.school;

public class Person {
    private String name;
    private int age;

    //CONSTRUCTOR
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("...constructed Person");
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

}
