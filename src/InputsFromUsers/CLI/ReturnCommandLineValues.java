package InputsFromUsers.CLI;

import java.util.Arrays;

//return command line parameters in an array:

public class ReturnCommandLineValues {
    public static void main(String[] args){
    for(int i=0;i<=args.length-1;i++){
        System.out.println(Integer.parseInt(args[i]));
    }
    }
}
