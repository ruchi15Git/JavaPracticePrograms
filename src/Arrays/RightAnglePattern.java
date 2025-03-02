package Arrays;

public class RightAnglePattern {
    public static void main(String[] args){
        int rows;
        int column;
        for(rows=0;rows<=5;rows++){
            for(column=0;column<=rows;column++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
