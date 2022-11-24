import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Monitor extends UnicastRemoteObject implements Product
{
    private int price;
    private String name;
    private String type = "Monitor";
    private String panelType;
    private double size;
    private int refreshRate;

    public Monitor(String name, int price) throws RemoteException
    {
        this.name = name;
        this.price = price;
    }

    public Monitor(String name, int price, String panelType, double size, int refreshRate) throws RemoteException
    {
        this.name = name;
        this.price = price;
        this.panelType = panelType;
        this.size = size;
        this.refreshRate = refreshRate;
    }

    @Override
    public int getPrice() throws RemoteException {
        return this.price;
    }

    @Override
    public void setPrice(int price) throws RemoteException
    {
        this.price = price;
    }

    @Override
    public String getName() throws RemoteException {
        return this.name;
    }

    @Override
    public void setName(String name) throws RemoteException {

    }

}
