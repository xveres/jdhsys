public class Main {
    public static void main(String[] args) {

        Person student = new Student("Greta", 20, "Hill");
        Person employee = new Employee("Ján", 30, "Muž",5000);

        System.out.println(student.getInfo());
        System.out.println(employee.getInfo());
    }
}