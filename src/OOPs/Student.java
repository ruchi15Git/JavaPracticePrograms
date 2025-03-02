package OOPs;

public class Student {
    public static void main(String[] args){
        StudentDetails studentDetails=new StudentDetails("Anjali",1,"IF-red");
        studentDetails.printStudentDetails();
    }
}

class StudentDetails{
    String name;
    int roleNum;
    String section;

    StudentDetails(String name, int roleNum, String section){
        this.name=name;
        this.roleNum=roleNum;
        this.section=section;
    }

    public void printStudentDetails(){
        System.out.println("Print student details.");
        System.out.println("Name: "+name+" , "+"Roll Number: "+roleNum+" , "+"Section: "+section);
    }
}