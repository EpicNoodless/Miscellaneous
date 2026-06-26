abstract class Person {
	String name;
    int age;
    public abstract String role();
}

interface Gradeable {
	public void getGrade();
}

interface Teachable {
	public void assignHomework();
}

class Student extends Person implements Gradeable {
    @Override
    public String role() {
    	return("My role is to Learn!");
    }
    @Override
    public void getGrade() {
    }
}

class Teacher extends Person implements Teachable {
	@Override
    public String role() {
    	return ("My role is to Teach!");
    }    
        
	@Override
    public void assignHomework() {
    }
}

class TeachingAssistant extends Person implements Gradeable, Teachable {
	@Override
    public String role() {
    	return ("My role is to learn how to Teach!");
    }    
	@Override
    public void getGrade() {
    }
    
    @Override
    public void assignHomework() {
    }
}

public class P1_OOP {
	Student student = new Student();
    Teacher teacher = new Teacher();
    TeachingAssistant teachAssistant = new TeachingAssistant();
    public void printRole(Person person) {
        System.out.println(person.role());
	}
     public static void main(String[] args) {
       P1_OOP main = new P1_OOP();
       main.printRole(new Student());
       main.printRole(new Teacher());
       main.printRole(new TeachingAssistant());
     }
}
