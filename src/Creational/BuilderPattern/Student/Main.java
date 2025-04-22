package BuilderPattern.Student;

public class Main {
    public static void main(String[] args) {

        //option 1:
        //@ apparently construction of student builder could be improved
        /*StudentBuilder sb = new StudentBuilder()
                                .setAge(10)
                                .setName("Ramesh")
                                .setGender("Male");

        Student s1 = new Student(sb);*/

        //@ but here the client is doing too many things - instead of creating the student alone, he is also creating the student builder
        //@ how to improve this?
        //@ option 2
        Student s1 = Student.getStudentBuilder().setName("Ramesh").setAge(10).setGender("Male").build();
        System.out.println(s1.toString());

    }
}
