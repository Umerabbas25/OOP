package LAB_2;

public class DistanceRun {
    public static void main(String[] args) {



    }
}

class Distance{

    private  double feet;
    private  double inch;



    public Distance(){
        feet = 25;
        inch = 24;
    }

    public Distance(double feet, double inch){
        this.feet = feet;
        this.inch = inch;
    }



    // Getters and Setters
    public double getFeet() {
        return feet;
    }

    public void setFeet(double feet) {
        this.feet = feet;
    }

    public double getInch() {
        return inch;
    }

    public void setInch(double inch) {
        this.inch = inch;
    }



    public  void Display(){
        System.out.println("Feets: "+ feet + "Inch: " + inch );
    }

}
