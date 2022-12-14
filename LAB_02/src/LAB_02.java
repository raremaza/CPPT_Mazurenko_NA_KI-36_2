import java.io.*;
import java.util.*;



public class LAB_02 {

    public static void main(String[] args) throws FileNotFoundException {
        int rows;
        char[][] array;
        String symbol;
        Scanner sc = new Scanner(System.in);
        File dataFile = new File("Array.txt");
        PrintWriter fout = new PrintWriter(dataFile);
        System.out.print("Enter the size of the square matrix: ");
        rows = sc.nextInt();
        sc.nextLine();
        array = new char[rows][];
        for (int i = 0; i < rows; i++) {
            if (i < rows / 2) {
                array[i] = new char[i + 1];
            } else {
                array[i] = new char[rows- i];
            }
        }
        System.out.print("\nEnter a placeholder character9: ");
        symbol = sc.nextLine();
        String symbol2 = "x";
        if (symbol.length() == 1) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows; j++) {
                    if(j<array[i].length) {
                        if(i % 2 == 1 && j == 0)
                        {
                            array[i][j] = (char) symbol.codePointAt(0);
                        }
                        else
                        {
                            array[i][j] = (char) symbol2.codePointAt(0);
                        }
                        System.out.print(array[i][j] + "\t");
                        fout.print(array[i][j] + "\t");
                    }
                    else{
                        System.out.print(" " + "\t");
                        fout.print(" " + "\t");
                    }
                }
                System.out.print("\n");
                fout.print("\n");
            }
        } else {
            System.out.print("\nСимвол-заповнювач введено не вірно");
            System.exit(0);
        }
        fout.flush();
        fout.close();
    }
}