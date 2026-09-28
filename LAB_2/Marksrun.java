package LAB_2;

public class Marksrun {
    public static void main(String[] args) {
    Marks m1 = new Marks();
    Marks m2 = new Marks(12,3,4);
    System.out.println(m1.get_sum());
        System.out.println(m2.get_sum());
    }
}

class Marks{

public double marks1;
public double marks2;
public double marks3;


public Marks(){
    marks1 =50;
    marks2 = 100;
    marks3 = 400;
}

public Marks(int marks1, int marks2, int marks3){
    this.marks1 = marks1;
    this.marks2 = marks2;
    this.marks3 = marks3;
}


public double get_sum(){
    double sum = marks1+marks2+marks3;
    return sum;
}

}
