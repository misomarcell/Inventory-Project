import java.util.ArrayList;
public class StorageManager {
	private StoreCapable productStorage;
	
	public void addStorage(StoreCapable storage)
	{
		productStorage = storage;
	}
	
	public void addCDProduct(String name, int price, int track)
	{
		productStorage.storeCDProduct(name, price, track);
	}
	
	public void addBookProduct(String name, int price, int size)
	{
		productStorage.storeBookProduct(name, price, size);
	}
	
	public String listProducts()
	{
		ArrayList<Product> allProducts = new ArrayList<>();
		allProducts = productStorage.getAllProduct();
		
		String stringProducts = "";
		for (Product product : allProducts)
		{
			stringProducts += product.getName() + "\n";
		}
		
		return stringProducts;
	}
	
	public int getTotalProductPrice()
	{
		
		
		return 0;
	}
	
}
