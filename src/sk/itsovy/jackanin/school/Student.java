package sk.itsovy.jackanin.school;

public class Student extends Person{
    private String group;

    //CONSTRUCTOR
    public Student(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    //GETTER & SETTER
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }

}
