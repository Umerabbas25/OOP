package LAB_1;

class Student {
    public String Name;
    public int Age;
    public String Department;
    public String RegistrationNumber;
    public String Section;
    public double CGPA;

    public void Details(){
        System.out.println("LAB_1.Student Name is "+ Name + "\n" + "Age is "+ Age + "\n" + "Department is " + Department + "\n" + "Registration Number is "
                + RegistrationNumber + "\n" + "Section is "+ Section + "\n" +  "Current CGPA is: "+ CGPA );
    }

}

public class UniversityManagmentSystem{

    public static void main(String[] args) {
        Student S1 = new Student();
        S1.Name = "Umer";
        S1.Age = 21;
        S1.Department = "CS";
        S1.RegistrationNumber = "SP23-BAI-053";
        S1.Section = "A";
        S1.CGPA = 3.2;
        S1.Details();

    }
}