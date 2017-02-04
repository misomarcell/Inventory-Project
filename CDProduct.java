public class CDProduct extends Product{

	public int numOfTracks;
	
	public CDProduct(String name, int price, int tracks)
	{
		super(name, price);
		numOfTracks = tracks;
	}
	
}
