package Inheritance;

public class Dog extends Animal{


    public Dog( int body, int size, int wight)
    {
        super("Dog", 1, body, size, wight);
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating");
    }
}
