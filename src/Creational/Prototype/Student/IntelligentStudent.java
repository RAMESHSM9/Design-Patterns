package Prototype.Student;

public class IntelligentStudent extends Student{

    private int iq;

    public IntelligentStudent(String name, int age, int iq) {
        super(name, age);
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent copy()
    {
        return new IntelligentStudent(this);
    }
}
