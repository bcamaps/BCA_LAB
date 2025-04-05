package incometaxrmi;

import java.util.*;
import java.rmi.registry.*;

public class TaxClient {
    public static void main(String args[]) {
        try {
            double d;
            Scanner sc = new Scanner(System.in);
            Registry reg = LocateRegistry.getRegistry(18888);
            Tax t = (Tax) reg.lookup("TaxServer");
            System.out.println("Enter the Income:");
            d = sc.nextDouble();
            System.out.println("The calculated tax amount is = " + t.calTax(d));
        } catch (Exception e) {
            System.out.println("Exception in Client..... " + e);
        }
    }
}
