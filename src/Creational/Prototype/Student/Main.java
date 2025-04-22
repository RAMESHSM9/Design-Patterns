package Prototype.Student;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 23);

        Student s2 = s1.copy();

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Student s3 = new IntelligentStudent("J", 23, 150);
        Student s4 = s3.copy();
        System.out.println(s3.equals(s4));
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
    }
}
