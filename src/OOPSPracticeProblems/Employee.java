package OOPSPracticeProblems;

public class Employee {
    long salary;
     Employee(long salary){
        this.salary=salary;
    }

    void work(){
    System.out.println("Employee work");
    }

    void getSalary( long salary){
        this.salary=salary;
    }
}

class HRManager extends Employee{
    long salary;

    HRManager(long salary) {
        super(salary);
    }

    @Override
    void work(){
    System.out.println("HR Manager work..");
    }

    void addEmployee(){
    System.out.println("Add Employee");
    }
}
