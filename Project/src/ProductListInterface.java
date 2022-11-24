import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

public interface ProductListInterface extends Remote{

    public void addToList(Product p) throws RemoteException;
    public ArrayList<Product> getList() throws RemoteException;
}
