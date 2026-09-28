package LAB_1;

import java.util.Scanner;

public class Timerun {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time T1 =  new Time();
        System.out.println("Enter time: ");
        T1.hour = sc.nextInt();
        System.out.println("Enter minute: ");
        T1.minute = sc.nextInt();
        System.out.println("Enter seconds: ");
        T1.seconds  = sc.nextInt();
        T1.show_time();
    }

}


class  Time{

    public int hour;
    public int minute;
    public int seconds;

    public void show_time(){
        System.out.println("Current LAB_1.Time in Lahore:- " + hour + ":" + minute + ":" + seconds);
    }

}