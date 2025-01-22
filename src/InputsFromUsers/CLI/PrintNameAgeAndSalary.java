package InputsFromUsers.CLI;

public class PrintNameAgeAndSalary {
    public static void main(String[] args){
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        int salary=Integer.parseInt(args[2]);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
