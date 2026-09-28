package LAB_1;

public class Carrun {


    public static void main(String[] args) {
        Car C1 = new Car();
        C1.model = "Honda Civic";
        C1.year = 2022;
        C1.speed = 120;
        C1.show_details();
    }
}


class  Car{

    public String model;
    public int year;
    public float speed;

    public void show_details(){
        System.out.println("LAB_1.Car details: " + "\n" + "Model: "  + model + "\n" +"Year: " + year + "\n" + "Speed: "+ speed);

    }

}