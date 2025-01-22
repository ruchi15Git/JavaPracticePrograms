package InputsFromUsers.CLI;

public class CommandLineInputs {
    public static void main(String[] args){
        //input the value in edit configuration in program argument
        /*String age_in=args[0];
        int age=Integer.parseInt(age_in);*/
        int age=Integer.parseInt(args[0]);
        System.out.println(age);
        String name=args[1];
        System.out.println(name);
        //System.out.println(args[2]);// as the program argument given only 2 values- Index 2 out of bounds for length 2
    }
}
