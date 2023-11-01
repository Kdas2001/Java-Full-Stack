import java.util.HashSet;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
   

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    
    public double getSalary() {
        return salary;
    }

   

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        
    }
   
    @Override
    public String toString() {
        return "Employee: " + name + " (ID: " + id + ")";
    }
}

public class EmployeeHashSet
{
    public static void main(String[] args) {
        HashSet<Employee> employeeSet = new HashSet<>();
        
        employeeSet.add(new Employee(101, "Parth Sen", "HR", 6000.0));
        employeeSet.add(new Employee(102, "John Murmu", "Finance", 7500.0));
        employeeSet.add(new Employee(103, "Mrittika Das", "IT", 9000.0));
        employeeSet.add(new Employee(104, "Ayush Khurana", "Manager", 7000.0));
        employeeSet.add(new Employee(105, "Anshul Mehera", "Accounts", 5000.0));
        employeeSet.add(new Employee(106, "Pranjali Das", "Social Media Manager", 8000.0));
        employeeSet.add(new Employee(107, "Neha Dhupia", "Project Manager", 6500.0));
        employeeSet.add(new Employee(108, "Koushik Bose", "CEO", 8500.0));
        employeeSet.add(new Employee(109, "Sagnik Haldar", "Trainee", 2000.0));
        employeeSet.add(new Employee(110, "Krittika Das", "Sales", 4000.0));

        for (Employee employee : employeeSet) {
            System.out.println(employee);
            employee.displayDetails();
            System.out.println();
        }
    }
}
