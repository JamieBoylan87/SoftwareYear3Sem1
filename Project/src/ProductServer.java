import java.io.*;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.*;
import java.util.ArrayList;

public class ProductServer {
    public static void main(String[] args) throws IOException 
    {
        FileOutputStream fileOut;
        System.out.println("server has started");
        ProductList productList = new ProductList();
        try
        {
            FileInputStream fileIn = new FileInputStream("products.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            productList = (ProductList) objectIn.readObject();
            objectIn.close();

            System.out.println("Product List Populated");
            Naming.rebind("rmi://localhost:6600/products", productList);
        }
        catch(Exception e) 
        {
            System.out.println("No file found..Creating new file");
            fileOut = new FileOutputStream("products.ser");
            productList.resetArrayListToDefault();
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(productList);
            objectOut.close();
            System.out.println("Product List Populated");
            Naming.rebind("rmi://localhost:6600/products", productList);
            e.printStackTrace();
        }
    }
}
