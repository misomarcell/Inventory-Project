import java.util.ArrayList;

public class StoreCapable {
	private PersistentStore pStore = new PersistentStore();
	
	public ArrayList<Product> getAllProduct()
	{	
		return pStore.productList;
	}
	
	public void storeCDProduct(String name, int price, int track)
	{
		Product cdProduct = new CDProduct(name, price, track);
		pStore.productList.add(cdProduct);
	}
	
	public void storeBookProduct(String name, int price, int size)
	{
		Product bookProduct = new BookProduct(name, price, size);
		pStore.productList.add(bookProduct);
	}
}
