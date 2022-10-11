package example.test.lab3;

public class RAM {

    private int size;


    private String name;


    public RAM(int psSize, String pName) {
        size = psSize;
        name = pName;
    }


    public RAM() {
        size = 8;
        name="Kingston DDR4";
    }


    public int getSize() {
        return size;
    }


    public String getName() {
        return name;
    }


    public void increaseRAMSize(int increaseValue) {
        size += increaseValue;
    }

}