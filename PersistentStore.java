import java.util.ArrayList;

public class PersistentStore extends Store{
	public ArrayList<Product> productList = new ArrayList<>();
	
	public void createProduct(String type, String name, int priice, int size)
	{
		
	}
	
	/*public ArrayList<Product> loadProducts()
	{
		
	}*/
	
	public void store(Product product)
	{
		productList.add(product);
	}
}
