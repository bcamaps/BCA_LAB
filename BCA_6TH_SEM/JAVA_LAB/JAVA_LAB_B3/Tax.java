package incometaxrmi;

import java.rmi.*;

public interface Tax extends Remote {
    double calTax(double a) throws RemoteException;
}
