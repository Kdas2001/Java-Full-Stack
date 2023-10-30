import java.util.*;

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String dept;
    private int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int compareTo(Employee that) {
        return Integer.compare(this.id, that.id);
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + dept + ", Salary: " + salary;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return dept;
    }

    public int getSalary() {
        return salary;
    }
}

public class EmployeeTreeSet {
    public static void main(String[] args) {
        TreeSet<Employee> ts = new TreeSet<>();
        ts.add(new Employee(101, "Parth Sen", "HR", 6000));
        ts.add(new Employee(102, "John Murmu", "Finance", 7500));
        ts.add(new Employee(103, "Krittika Das", "IT", 9000));
        ts.add(new Employee(104, "Ayush Khurana", "Manager", 7000));
        ts.add(new Employee(105, "Anshul Mehera", "Accounts", 5000));
        ts.add(new Employee(106, "Pranjali Das", "Social Media Manager", 8000));
        ts.add(new Employee(107, "Neha Dhupia", "Project Manager", 6500));
        ts.add(new Employee(108, "Koushik Bose", "CEO", 8500));
        ts.add(new Employee(109, "Sagnik Haldar", "Trainee", 2000));
        ts.add(new Employee(110, "Krittika Das", "Sales", 4000));
        Scanner sc = new Scanner(System.in);
        System.out.println("Run Application:");
        System.out.println("a) ID");
        System.out.println("b) Name");
        System.out.println("c) Department");
        System.out.println("d) Salary");
        System.out.print("Your choice: ");
        String ch = sc.nextLine();
        if (ch.equals("a")) {
            for (Employee employee : ts) {
                System.out.println(employee);
            }
        } else if (ch.equals("b")) {
            TreeSet<Employee> sortedByName = new TreeSet<>(Comparator.comparing(Employee::getName));
            sortedByName.addAll(ts);
            for (Employee employee : sortedByName) {
                System.out.println(employee);
            }
        } else if (ch.equals("c")) {
            TreeSet<Employee> sortedByDepartment = new TreeSet<>(Comparator.comparing(Employee::getDepartment));
            sortedByDepartment.addAll(ts);
            for (Employee employee : sortedByDepartment) {
                System.out.println(employee);
            }
        } else if (ch.equals("d")) {
            TreeSet<Employee> sortedBySalary = new TreeSet<>(Comparator.comparing(Employee::getSalary));
            sortedBySalary.addAll(ts);
            for (Employee employee : sortedBySalary) {
                System.out.println(employee);
            }
        } else {
            System.out.println("Invalid choice");
        }
        sc.close();
    }
}