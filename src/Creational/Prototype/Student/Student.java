package Prototype.Student;

public class Student {

    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public  Student(Student student)
    {
        this.name = student.name;
        this.age = student.age;
    }

    //@ this must overriden in every derived class
    public Student copy()
    {
        return new Student(this);
    }

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
