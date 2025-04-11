package ENUM;

public class EnumExample {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
    public static void main(String[] args){
       Day d=Day.FRIDAY;
       System.out.println(d);
    }
}
