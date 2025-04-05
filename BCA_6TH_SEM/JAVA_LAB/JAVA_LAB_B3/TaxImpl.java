package incometaxrmi;

import java.rmi.server.*;
import java.rmi.*;

public class TaxImpl extends UnicastRemoteObject implements Tax {
    public TaxImpl() throws RemoteException {
    }

    public double calTax(double income) throws RemoteException {
        double t;
        if (income <= 300000)
            t = 0.0;
        else if (income > 300000 && income <= 600000)
            t = 0.05 * (income - 300000);
        else if (income > 600000 && income <= 900000)
            t = 0.10 * (income - 600000);
        else if (income > 900000 && income <= 1200000)
            t = 0.15 * (income - 900000);
        else if (income > 1200000 && income <= 1500000)
            t = 0.20 * (income - 1200000);
        else
            t = 0.30 * (income - 1500000);
        return t;
    }
}
