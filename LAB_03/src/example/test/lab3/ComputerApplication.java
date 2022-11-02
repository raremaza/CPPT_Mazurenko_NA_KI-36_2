package example.test.lab3;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ComputerApplication {

    public static void main(String[] args) throws FileNotFoundException {
        Computer computer = new Computer(850);
        computer.switchOn();
        System.out.println("RAM size: "+ computer.getRAMSize()+" GB");
        System.out.println("RAM name: "+computer.getRAMName());
        System.out.println("Processor cores value: "+computer.getProcessorCoresValue());
        System.out.println("Processor name: "+computer.getProcessorNameValue());
        System.out.println("Power Supply value: "+computer.getPowerSupplyPowerValue()+" W");
        System.out.println("Processor usage percentage: "+computer.getProcessorUsagePercentage()+ "%");
        System.out.println("Operating System name: "+computer.getOSTypeName());
        computer.changeOSType(OSType.LINUX);
        computer.switchOff();
        computer.increaseRAM(8);
        computer.dispose();

        ArrayList<Computer> computers = new ArrayList<Computer>();

        computers.add(new Computer(800));
        computers.add(new Computer(900));
        computers.add(new Computer(600));
        computers.add(new Computer(900));
        computers.add(new Computer(400));
        computers.add(new Computer(880));

        int n = 0;
        for(int i = 0; i < computers.size(); i++) {
            if(computers.get(i).getPowerSupplyPowerValue() < 850) {
                n++;
            }
        }
        System.out.println(n);
    }
}



/*package example.test.lab3;

import java.io.FileNotFoundException;


public class ComputerApplication {

    public static void main(String[] args) throws FileNotFoundException {
        Computer computer = new Computer(850);
        
        
        main1() ;
        public static void main1() {Computer computer4 = new Computer(450);
        ArrayList<Computer> computers;
        computers.add(new Computer (450))
        computers.add(new Computer1 (550))
        computers.add(new Computer2 (650))
      /*  computer.switchOn();
        System.out.println("RAM size: "+ computer.getRAMSize()+" GB");
        System.out.println("RAM name: "+computer.getRAMName());
        System.out.println("Processor cores value: "+computer.getProcessorCoresValue());
        System.out.println("Processor name: "+computer.getProcessorNameValue());
        System.out.println("Power Supply value: "+computer.getPowerSupplyPowerValue()+" W");
        System.out.println("Processor usage percentage: "+computer.getProcessorUsagePercentage()+ "%");
        System.out.println("Operating System name: "+computer.getOSTypeName());
        computer.changeOSType(OSType.LINUX);
        computer.switchOff();
        computer.increaseRAM(8);
        computer.dispose(); */
        /*     Computer computer1 = new Computer(650);
        Computer computer2 = new Computer(550);
        Computer computer3 = new Computer(450);
        Computer computer4 = new Computer(850);
        main1() ;
        int n = 0;
        if (computer1.getPowerSupplyPowerValue() < 850) 
         n++;
        if (computer2.getPowerSupplyPowerValue() < 850) 
         n++;
        if (computer3.getPowerSupplyPowerValue() < 850) 
         n++;
        if (computer4.getPowerSupplyPowerValue() < 850) 
         n++;
        System.out.println(n); */
   /* }
    main1() ;
    public static void main1() {Computer computer4 = new Computer(450);
    ArrayList<Computer> computers;
    computers.add(new Computer (450))
    computers.add(new Computer1 (550))
    computers.add(new Computer2 (650))
    } 
} */