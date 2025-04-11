package ENUM;

import static ENUM.Days.*;

public class MainClass {
    public static void main(String[] args){
        Days days= MONDAY;
        System.out.println(days);
        System.out.println(Days.TUESDAY.getDay());
        Day today=Day.FRIDAY;
        switch (today){
            case MONDAY:{ System.out.println(MONDAY.getDay());
            break;
            }
            case TUESDAY:{ System.out.println(TUESDAY.getDay());
                break;
            }
            case WEDNESDAY:{ System.out.println(WEDNESDAY.getDay());
                break;
            }
            case THURSDAY:{ System.out.println(THURSDAY.getDay());
                break;
            }
            case FRIDAY:{ System.out.println(FRIDAY.getDay());
                break;
            }
            case SATURDAY:{ System.out.println(SATURDAY.getDay());
                break;
            }
            default:{
                System.out.println("not a valid day");
            }
        }

    }
}
