import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Computer extends UnicastRemoteObject implements Product
{
    private int price;
    private String name;
    private String type = "Computer";
    private String gpu;
    private double clockSpeed;
    private int ram;

    public Computer(String name, int price) throws RemoteException
    {
        this.name = name;
        this.price = price;
    }

    public Computer(String name, int price, String gpu, double clockSpeed, int ram) throws RemoteException
    {
        this.name= name;
        this.price = price;
        this.gpu = gpu;
        this.clockSpeed = clockSpeed;
        this.ram = ram;
    }

    public int getPrice() throws RemoteException {
        return price;
    }

    public void setPrice(int price) throws RemoteException
    {
        this.price = price;
    }

    public String getName() throws RemoteException {
        return this.name;
    }

    public void setName(String name) throws RemoteException
    {
        this.name = name;
    }
}
