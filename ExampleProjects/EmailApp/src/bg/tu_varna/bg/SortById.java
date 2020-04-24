package bg.tu_varna.bg;

import java.util.Comparator;

public class SortById implements Comparator<EMailImpl> {

	@Override
	public int compare(EMailImpl o1, EMailImpl o2) {
		return o1.compareToId(o2.getUsername());
	}

}
