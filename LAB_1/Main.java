package LAB_1;

class Hello {
    String Name;
    int age;

    public void hello() {
        System.out.println("LAB_1.Hello My name is " + Name +  " and my age is "+  age);
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("LAB_1.Hello, World!");

        Hello h1 = new Hello();
        Hello h2 = new Hello();
        h1.Name = "Umer Abbas";
        h2.Name = "Adeel";
        h1.age = 21;
        h2.age = 22;
        h1.hello();
        h2.hello();
    }
}
