public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "David";
        employee.age = 27;
        employee.phoneNumber = "8997350289";
        employee.address = "123 Rope St, Anytown USA";
        employee.salary = 50000.00;
        employee.specialization = "Java Developer";

        Manager manager = new Manager();
        manager.name = "Dani";
        manager.age = 36;
        manager.phoneNumber = "9043662890";
        manager.address = "456  Shine St, Anytown USA";
        manager.salary = 100000.00;
        manager.department = "Engineering";

        System.out.println("Employee:");
        System.out.println("Name: " + employee.name);
        System.out.println("Age: " + employee.age);
        System.out.println("Phone Number: " + employee.phoneNumber);
        System.out.println("Address: " + employee.address);
        System.out.println("Salary: " + employee.salary);
        System.out.println("Specialization: " + employee.specialization);

        System.out.println("\nManager:");
        System.out.println("Name: " + manager.name);
        System.out.println("Age: " + manager.age);
        System.out.println("Phone Number: " + manager.phoneNumber);
        System.out.println("Address: " + manager.address);
        System.out.println("Salary: " + manager.salary);
        System.out.println("Department: " + manager.department);
    }
}