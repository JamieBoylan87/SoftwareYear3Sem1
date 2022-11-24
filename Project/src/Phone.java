import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Phone extends UnicastRemoteObject implements Product
{
    private int price;
    private String name;
    private String type = "Phone";
    private String cpu;
    private double screenSize;
    private int ram;

    public Phone(String name, int price) throws RemoteException
    {
        this.name = name;
        this.price = price;
    }

    public Phone(String name, int price, String cpu, double screenSize, int ram) throws RemoteException
    {
        this.name= name;
        this.price = price;
        this.cpu = cpu;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    @Override
    public int getPrice() throws RemoteException {
        return 0;
    }

    @Override
    public void setPrice(int price) throws RemoteException {

    }

    @Override
    public String getName() throws RemoteException {
        return null;
    }

    @Override
    public void setName(String name) throws RemoteException {

    }

}
