package example.test.lab4;


public class PowerSupply {

    private boolean isTurnedOn;
 
    private int powerValue;


    public PowerSupply() {
        isTurnedOn = false;
    }


    public PowerSupply(int pValue) {
        powerValue = pValue;
    }


    public void turnOn(){
        isTurnedOn=true;
    }


    public void turnOff(){
        isTurnedOn=false;
    }


    public int getPowerValue() {
        return powerValue;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}