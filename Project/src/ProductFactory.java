import java.rmi.RemoteException;

public class ProductFactory {
    public static Product getProduct(String type, String name, int price) throws RemoteException {
        if(type.equalsIgnoreCase("phone"))
        {
            return new Phone(name, price);
        }
        else if (type.equalsIgnoreCase("computer"))
        {
            return new Computer(name, price);
        }
        else if (type.equalsIgnoreCase("monitor"))
        {
            return new Monitor(name, price);
        }
        else
        {
            return null;
        }
    }
}
