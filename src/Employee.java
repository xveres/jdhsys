public class Employee implements Person {
    private String name;
    private int age;
    private String gender;
    private int salary;


    public Employee(String name, int age, String gender, int salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        String info = "Employee Name: " + name + ", Age: " + age + ", Gender: " + gender+ ", Salary: " + salary;

        if (age > 20) {
            int yearsWorked = calculateYearsWorked();
            info += ", Years Worked since 20: " + yearsWorked;
        } else {
            info += ", Years Worked: The employee is under 20";
        }

        return info;
    }


    private int calculateYearsWorked() {
        return age - 20;
    }
}
