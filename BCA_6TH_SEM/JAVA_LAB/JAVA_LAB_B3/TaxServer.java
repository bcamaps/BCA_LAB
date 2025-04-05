package incometaxrmi;

import java.rmi.*;
import java.rmi.registry.*;

public class TaxServer {
    public static void main(String args[]) {
        try {
            TaxImpl timpl = new TaxImpl();
            Registry reg = LocateRegistry.createRegistry(18888);
            reg.rebind("TaxServer", timpl);
            System.out.println("Server is running.......");
        } catch (RemoteException e) {
            System.out.println("Exception in server!! ..... " + e);
        }
    }
}
