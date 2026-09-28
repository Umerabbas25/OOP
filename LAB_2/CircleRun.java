package LAB_2;

public class CircleRun {
    public static void main(String[] args) {
        Circle C1 = new Circle();
        Circle C2 = new Circle(34.0,68.0);

        System.out.printf("Circumference of the circle is: " + "%.2f",C1.circumference());
        System.out.println();
        System.out.printf("Circumference of the circle is: " + "%.2f",C2.circumference());
    }
}


class Circle{
    private double radius;
    private  double diamter;

    public Circle(){
        radius = 23.6;
        diamter  = 46;

    }

    public Circle(double radius, double diamter){
        this.radius = radius;
        this.diamter = diamter;

    }

    public double circumference(){
        return 2*3.14*radius;
    }
}