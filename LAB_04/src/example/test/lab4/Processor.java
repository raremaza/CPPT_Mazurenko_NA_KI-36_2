package example.test.lab4;

public class Processor {
  
    private int amountOfCores;
 
    private String nameOfProcessor;

   
    private int usagePercentage;


    public Processor(int pAmountOfCores, String pNameOfProcessor) {
        amountOfCores = pAmountOfCores;
        nameOfProcessor = pNameOfProcessor;
        usagePercentage = 0;
    }


    public Processor() {
        nameOfProcessor = "Intel Core i5";
        amountOfCores = 6;
    }


    public int getAmountOfCores() {
        return amountOfCores;
    }


    public String getNameOfProcessor() {
        return nameOfProcessor;
    }


    public void startProcessorWorking(){
        usagePercentage= (int) ((Math.random() * (100 - 5)) + 5);
    }


    public void finishProcessorWorking(){
        usagePercentage= 0;
    }


    public int getUsagePercentage() {
        return usagePercentage;
    }
}