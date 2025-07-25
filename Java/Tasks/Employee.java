package Tasks;

public class Employee {
    
    static int count = 0;

    
    public Employee() {
        count++; 
    }

    
    public static void printEmployeeCount() {
        System.out.println("Total number of employees: " + count);
    }

    
    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        
        Employee.printEmployeeCount();
    }
}

