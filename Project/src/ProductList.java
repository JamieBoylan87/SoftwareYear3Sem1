import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class ProductList extends UnicastRemoteObject implements ProductListInterface{

    private ArrayList<Product> products;

    public ProductList() throws RemoteException {
        products= new ArrayList();
        // TODO Auto-generated constructor stub
    }
    @Override
    public void addToList(Product p) throws RemoteException {
        products.add(p);

    }

    @Override
    public ArrayList<Product> getList() throws RemoteException {
        // TODO Auto-generated method stub
        return products;
    }

    public void resetArrayListToDefault() throws RemoteException {
        products.add(ProductFactory.getProduct("Computer", "Toshiba", 250));
        products.add(ProductFactory.getProduct("Computer", "Acer", 500));
        products.add(ProductFactory.getProduct("Computer", "Lenovo", 1000));
        products.add(ProductFactory.getProduct("Computer", "Alienware", 1250));
        products.add(ProductFactory.getProduct("Computer", "Intel", 700));

        products.add(ProductFactory.getProduct("Phone", "Samsung", 300));
        products.add(ProductFactory.getProduct("Phone", "IPhone", 1000));
        products.add(ProductFactory.getProduct("Phone", "Nokia", 50));
        products.add(ProductFactory.getProduct("Phone", "Google", 400));
        products.add(ProductFactory.getProduct("Phone", "Oppo", 200));

        products.add(ProductFactory.getProduct("Monitor", "HP", 150));
        products.add(ProductFactory.getProduct("Monitor", "Acer", 400));
        products.add(ProductFactory.getProduct("Monitor", "Dell", 350));
        products.add(ProductFactory.getProduct("Monitor", "LG", 300));
        products.add(ProductFactory.getProduct("Monitor", "Samsung", 800));
    }

}