package LAB_1;

public class Rectanglerun{
    public static void main(String[] args) {
        Rectangle R1= new Rectangle(20.5,40.6);
//        R1.length = 20.5;
//        R1.width = 40.6;

        System.out.printf("Area of rectangle is: "+ "%.2f",R1.Area());
        System.out.println();
        System.out.printf("Perimter of rectangle is: "+ "%.2f",R1.Permiter());


    }
}

class Rectangle{
    public double length;
    public double width;


    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;

    }

    public double Area(){
         return length*width;
    }

    public double Permiter(){
        return 2*(length+width);
    }




}
