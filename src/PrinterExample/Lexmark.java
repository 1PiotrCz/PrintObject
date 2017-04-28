package PrinterExample;

/**
 * Created by Piotr on 2017-04-28.
 */
public class Lexmark implements Printer{
    //public class PrinterExample.Lexmark extends PrinterExample.Printer{

    @Override
    public void print() {

        System.out.println("Printing something - PrinterExample.Lexmark");
    }
}
