
public class Driver {
	public static void main(String[] args) {
		StockItem st = new StockItem();
		for (int i = 0; i < 5; i++) {
			st.GetStockItemFromUser();
			st.SaveStockItem();
		}
		st.DisplayAllItems();

// 		TRY THESE
//		st.RetrieveStockItem();
//		System.out.println(st.RetrievePrice());
//		System.out.println(st.RetrieveDescription());
	}

}

