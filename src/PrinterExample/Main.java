package PrinterExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotr on 2017-04-28.
 */
public class Main {
    public static void main(String[] args) {
        List<Printer> printers = new ArrayList<>();
        printers.add(new HPDesk());
        printers.add(new Lexmark());


//        PrinterExample.Printer hp = new PrinterExample.HPDesk();
//        hp.print();

        for (Printer printer : printers) {
            printer.print();
        }


    }
}
