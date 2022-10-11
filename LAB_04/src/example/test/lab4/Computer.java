package example.test.lab4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


public abstract class Computer {
    private PrintWriter fout;
    private RAM ram;
    private Processor processor;
    private PowerSupply powerSupply;

    private OS os;


    public Computer() throws FileNotFoundException {
        ram = new RAM();
        powerSupply = new PowerSupply();
        processor = new Processor();
        os = new OS();
        fout = new PrintWriter("Log.txt");
    }

    public Computer(int powerValue) throws FileNotFoundException {
        ram = new RAM();
        powerSupply = new PowerSupply(powerValue);
        processor = new Processor();
        os = new OS();
        fout = new PrintWriter("Log.txt");
    }

 void switchOn() {
        powerSupply.turnOn();
        processor.startProcessorWorking();
        os.startOS();
        System.out.println("Computer is switched on!");
        fout.print("Computer is switched on!" + "\n");
        fout.print("Power supply is turned on! Status: " + powerSupply.isTurnedOn() + "\n");
        fout.print("Processor start's working : " + processor.getUsagePercentage() + "\n");
        fout.print("OS start's working! Status: " + os.isStarted() + "\n");
        fout.flush();
    }


    public abstract void switchOff();


    public void increaseRAM(int increaseValue) {
        fout.print("RAM size before increasing : " + ram.getSize() + "\n");
        ram.increaseRAMSize(increaseValue);
        fout.print("RAM size after increasing : " + ram.getSize() + "\n");
    }


    public int getRAMSize() {
        return ram.getSize();
    }


    public String getRAMName() {
        return ram.getName();
    }


    public int getProcessorUsagePercentage() {
        return processor.getUsagePercentage();
    }


    public String getProcessorNameValue() {
        return processor.getNameOfProcessor();
    }


    public int getProcessorCoresValue() {
        return processor.getAmountOfCores();
    }



    public int getPowerSupplyPowerValue() {
        return powerSupply.getPowerValue();
    }


    public String getOSTypeName() {
        return os.getOsType().name();
    }


    public void changeOSType(OSType osTypeValue){
        os.changeOS(osTypeValue);
        fout.print("OS type changed to : " + os.getOsType().name() + "\n");
        fout.flush();
    }


    public PrintWriter getFout() {
        return fout;
    }


    public RAM getRam() {
        return ram;
    }

    public Processor getProcessor() {
        return processor;
    }


    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public OS getOs() {
        return os;
    }


    public void dispose() {
        fout.close();
    }


}