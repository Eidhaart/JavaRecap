package Room;

public class LightBulb {

    private boolean glowing;
    private int watt;
    private int lumen;
    private boolean isLed;

    public LightBulb(int watt, int lumen, boolean isLed) {
        this.glowing = false;
        this.watt = watt;
        this.lumen = lumen;
        this.isLed = isLed;
    }

    public void setGlowing(boolean glowing) {
        if (glowing){
            System.out.println("The light bulb is glowing!");
        }else
            System.out.println("The light bulb is not glowing");
        this.glowing = glowing;
    }

    public boolean isGlowing() {

        return glowing;
    }

    public int getWatt() {
        return watt;
    }

    public int getLumen() {
        return lumen;
    }

    public boolean isLed() {
        return isLed;
    }
}
