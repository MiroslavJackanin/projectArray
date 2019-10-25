package sk.itsovy.jackanin.school;

public class Teacher extends Person implements Employee{
    private double salary;

    //CONSTRUCTOR
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    //GETTER & SETTER
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

}
