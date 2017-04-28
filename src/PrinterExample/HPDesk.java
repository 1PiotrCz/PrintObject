package PrinterExample;

/**
 * Created by Piotr on 2017-04-28.
 */
public class HPDesk implements Printer{
    //public class PrinterExample.HPDesk extends PrinterExample.Printer{

    @Override
    public void print() {
        System.out.println("Printing something - HP");
    }
}

