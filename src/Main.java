import java.util.ArrayList;
import java.util.List;

/**
 * Created by Piotr on 2017-04-28.
 */
public class Main {
    public static void main(String[] args) {
        List<Printer> printers = new ArrayList<>();
        printers.add(new Printer("HP", "Desk", 99, 80));
        printers.add(new Printer("HP", "Desk", 80, 80));
        printers.add(new Printer("HP", "Desk", 99, 80));

        for (Printer printer : printers){
            System.out.println(printer);
        }

        Integer integerOne  = new Integer(5);
        Integer integerTwo  = new Integer(5);

        // if (integerOne == integerTwo){ // not the same
//        if (integerOne.equals(integerTwo)){ //the same
//            System.out.println("Takie same");
//        } else {
//            System.out.println("Nie są takie same");
//        }

        if (printers.get(0).equals(printers.get(1))){
            System.out.println("Są takie same");
        }


        System.out.println("Hashcode dla HP0: " + printers.get(0).hashCode());
        System.out.println("Hashcode dla HP1: " + printers.get(1).hashCode());
    }
}
