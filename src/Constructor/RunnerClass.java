package Constructor;

public class RunnerClass {
    public static void main(String[] args){
        CarCl carCl=new CarCl();
        System.out.println(carCl.car_name);
        carCl.car_name="Audi";
        System.out.println(carCl.car_name);
        System.out.println("----------------------------------------------------------");
        Employee employee=new Employee();
        System.out.println(employee.emp_nm);
        employee.emp_nm="Ruchi";
        System.out.println(employee.emp_nm);

        System.out.println("----------------------------------------------------------");

        ParametrizeCons parametrizeCons=new ParametrizeCons("Shubham","Nagpur");
        System.out.println(parametrizeCons.name);
        System.out.println(parametrizeCons.address);
        System.out.println(parametrizeCons.age); // this value is default value which is declared under ParametrizeCons.
    }
}
