package LAB_3;

import java.util.Scanner;

public class EmployeeRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee E1= new Employee();
        System.out.println("Enter employee id: ");
        int id = sc.nextInt();
        E1.setEmployee_id(id);

        System.out.println("Enter employee name: ");
        String name  = sc.next();
        E1.setEmployee_name(name);

        E1.Designation = "Manager";


        System.out.println("ID: "+ E1.getEmployee_id());
        System.out.println("Name: "+ E1.getEmployee_name());
        E1.Display_Designation();

    }


}

class Employee{

    private int employee_id;
    private String employee_name;
    public String Designation;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public void Display_Designation(){
        System.out.println("Employee Designation: "+ Designation );
    }

}