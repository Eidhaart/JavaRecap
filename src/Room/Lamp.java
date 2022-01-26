package Room;

public class Lamp {

    private LightBulb lightBulb;
    private boolean isOn;

    public Lamp(LightBulb lightBulb) {
        this.lightBulb = lightBulb;
        this.isOn = false;
    }

    public void turnOn(){
        this.isOn = true;
        System.out.println("The lamp is powered on");
        lightBulb.setGlowing(true);
    }

    public void turnOff(){
        if (!isOn){
            System.out.println("The lamp is already off");
        }else {
            this.isOn = false;
            System.out.println("Turning lamp off");
        }
    }
}
