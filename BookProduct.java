public class BookProduct extends Product{

	public int pageSize;
	
	public BookProduct(String name, int price, int size)
	{
		super(name, price);
		pageSize = size;
	}
}
