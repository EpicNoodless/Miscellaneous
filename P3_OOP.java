import java.util.ArrayList;
class Employee {
	public float caculateBounus(float salary) {
    	return((float)0.1 * salary);	
    }
}

class Manager extends Employee {
	@Override
    public float caculateBounus(float salary) {
    	return((float)0.2 * salary);
    }
}

class Intern extends Employee {
	@Override
    public float caculateBounus(float salary) {
    	return((float)0.05 * salary);
    }
}

public class P3_OOP {
	public static void main(String[] args) {
    	ArrayList<Employee> workers = new ArrayList<Employee>();
        Employee newEmployee = new Employee();
        workers.add(newEmployee);
        Manager newManager = new Manager();
    	workers.add(newManager);
        Intern newIntern = new Intern();
    	workers.add(newIntern);
    
        for (Employee x : workers) {
        	float y = x.caculateBounus((float)30);
            System.out.println(y);
        }	
    }
}
