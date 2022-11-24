import java.io.IOException;
import java.rmi.*;
import java.util.ArrayList;

public class ProductClient
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
         String url = "rmi:///";
         System.out.println("Client has started");
         try
         {
             ProductListInterface productList = (ProductListInterface) Naming.lookup(url + "products");
             ArrayList<Product> products = productList.getList();

             for(Product p : products)
             {
                 System.out.println(p.getPrice());
             }
         }
         catch (NotBoundException e)
         {
             throw new RuntimeException(e);
         }
    }
}
