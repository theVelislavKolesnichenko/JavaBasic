package bg.tu_varna.bg;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface IPost {
	void compose(File file) throws IOException;
	List<EMailImpl> getMessaage(File file) throws IOException;
}
