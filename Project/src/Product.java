import java.rmi.*;

public interface Product extends Remote
{
    public abstract int getPrice() throws RemoteException;
    public abstract void setPrice(int price) throws RemoteException;
    public abstract String getName() throws RemoteException;
    public abstract void setName(String name) throws RemoteException;
}
