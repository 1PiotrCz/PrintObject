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


//        Printer hp = new HPDesk();
//        hp.print();

        for (Printer printer : printers) {
            printer.print();
        }
    }
}
