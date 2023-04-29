package methodreferanceexample;

@FunctionalInterface
interface EmployeeEmpty {
    Employee get();
}

@FunctionalInterface
interface EmployeeWithName {
    Employee get(String name);
}

class Employee {
    private String name;

    public Employee() {
        System.out.println("Empty Constructor");
    }

    public Employee(String name) {
        System.out.println("Named Constructor");
        this.name = name;
    }

    @Override
    public String toString() {
        return "name: " + name;
    }
}

public class MethodReferenceExample4 {
    public static void main(String[] args) {
        EmployeeEmpty empEmpty = Employee::new;
        System.out.println("Constructor isn't called yet");
        System.out.println(empEmpty.get());
        EmployeeWithName empWithName = Employee::new;
        System.out.println("Constructor isn't called yet");
        System.out.println(empWithName.get("Java"));
    }
}