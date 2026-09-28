package LAB_1;

class CourseResult{
    public String studentname;
    public String coursename;
    public String grade;

    public void display(){
        System.out.println("Student name is : " + studentname + " Course name is: "+  coursename + " Grade is: "+ grade );
    }
}


public class CourseResultRun{
    public static void main(String[] args) {
    CourseResult c1 =  new CourseResult();
    CourseResult c2 = new CourseResult();


    c1.coursename = "OOP";
    c1.studentname = "Umer";
    c1.grade = "A+";

    c2.coursename = " PF";
    c2.studentname = "Adeel";
    c2.grade = "A+";
    c1.display();
    c2.display();
    }
}