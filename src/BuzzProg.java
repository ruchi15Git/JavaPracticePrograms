import java.io.*;

import static java.util.stream.Collectors.joining;


class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        int i=0;
        for(i=1;i<=n;i++){
        if(i%3==0 && i%5==0){
            System.out.println("FizzBuzz");
        }else if(i%3==0 && i%5!=0){
            System.out.println("Fizz");

        }else if(i%5==0 && i%3!=0){
            System.out.println("Buzz");
        }else if(i%3!=0 && i%5!=0){
            System.out.println(i);
        }
        }

    }

}

public class BuzzProg {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the value of n: ");
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();

    }
}
