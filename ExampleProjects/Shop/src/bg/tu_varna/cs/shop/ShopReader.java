package bg.tu_varna.cs.shop;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface ShopReader {
	void readShopData() throws FileNotFoundException, IOException;
}
