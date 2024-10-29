public class Student implements Person {
    private String name;
    private int age;
    private String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String getInfo() {
        return "Student Name: " + name + ", Age: " + age + ", Gender: " + gender;
    }
}
