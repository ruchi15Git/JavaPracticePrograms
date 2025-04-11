package ENUM;

public enum Days {
    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"), THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    private String day;

    Days(String day) {
        this.day=day;
    }
     String getDay(){
        return this.day;
     }

}
