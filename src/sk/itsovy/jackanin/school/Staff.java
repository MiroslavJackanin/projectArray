package sk.itsovy.jackanin.school;

public class Staff extends Person{
    private String position;

    //CONSTRUCTOR
    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    //GETTER & SETTER
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

}
