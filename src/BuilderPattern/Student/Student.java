package BuilderPattern.Student;

public class Student {

    private int age;

    private String name;

    private String gender;

    private double psp;

    public Student(StudentBuilder studentBuilder)
    {
        this.age = studentBuilder.getAge();
        this.name = studentBuilder.getName();
        this.gender = studentBuilder.getGender();
        this.psp = studentBuilder.getPsp();
    }

    //@ getters
    public String getName() {
        return name;
    }

    public double getPsp() {
        return psp;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public static StudentBuilder getStudentBuilder(){
        return new StudentBuilder();
    }

    //@ inner class
    static class StudentBuilder {

        //@ builder has all the attributes of the Class that it would want to build
        //@ all the attributes of studnet are accessible here
        private int age;

        private String name;

        private String gender;

        private double psp;

        //@ builder has the setters
        //! all the validation can be done here in the builder setters
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        //@ getters
        public double getPsp() {
            return psp;
        }

        public String getName() {
            return name;
        }

        public String getGender() {
            return gender;

        }

        public int getAge() {
            return age;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String toString()
    {
        return "Student [age=" + age + ", name=" + name + ", gender=" + gender + ", psp="+psp+"]";
    }

}
