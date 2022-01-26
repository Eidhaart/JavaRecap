package Inheritance;

public class Main {

    public static void main(String[] args) {

        Dimensions dimensions = new Dimensions(20, 20, 5);

        Case theCase = new Case("220b", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch","Acer",27, new Resolution(2540,1440));

        Motherboard motherboard = new Motherboard("BJ-200","Asus",4,6,"V2,4");

        PC thePC = new PC(theCase,theMonitor,motherboard);

        thePC.powerUp();
    }
}
