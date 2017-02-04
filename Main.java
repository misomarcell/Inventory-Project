public class Main {

	public static void main(String[] args) {
		StorageManager sManager = new StorageManager();
		StoreCapable store = new StoreCapable();
		sManager.addStorage(store);
        sManager.addCDProduct("Hotline Miami OST", 2500, 50);
        sManager.addBookProduct("Mein Kampf - Harcom", 1090, 500);
        
        System.out.println(sManager.listProducts());
        System.out.println(sManager.getTotalProductPrice());

	}

}
