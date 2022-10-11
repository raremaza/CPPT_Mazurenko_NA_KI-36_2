package example.test.lab4;

public class OS {
 
    private OSType osType;


    private boolean isStarted;


    public OS() {
        osType = OSType.WINDOWS;
        isStarted=false;
    }


    public void startOS(){
        isStarted=true;
    }


    public void finishOS(){
        isStarted=false;
    }


    public OSType getOsType(){
        return osType;
    }


    public void changeOS(OSType osTypeValue){
        osType=osTypeValue;
    }

    public boolean isStarted() {
        return isStarted;
    }
}