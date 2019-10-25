package sk.itsovy.jackanin.school;

public class Teacher extends Person{
    private double salary;

    //CONSTRUCTOR
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        System.out.println("...constructed Teacher");
    }

    //GETTER & SETTER
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
