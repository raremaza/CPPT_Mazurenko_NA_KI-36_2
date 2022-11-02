package example.test.lab5;

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;


/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 *
 */
public class EquationsApp {
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                try
                {
                    Equations eq = new Equations();
                    out.print("Enter X: ");
                    fout.print(eq.calculate(in.nextInt()));
                }
                finally
                {
                    // Цей блок виконається за будь-яких обставин
                    fout.flush();
                    fout.close();
                }
            }
            catch (CalcException ex)
            {
                // Блок перехоплює помилки обчислень виразу
                out.print(ex.getMessage());
            }
            finally
            {
                // Цей блок виконається за будь-яких обставин
                fout.flush();
                fout.close();
                out.println("\nFinally");
            }
        }
        catch (FileNotFoundException ex)
        {
            // Блок перехоплює помилки роботи з файлом навіть якщо вони
            // виникли у блоці finally
            out.print("Exception reason: Perhaps wrong file path");
        }
    }
}