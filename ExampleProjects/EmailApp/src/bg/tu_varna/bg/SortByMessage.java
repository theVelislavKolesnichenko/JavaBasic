package bg.tu_varna.bg;

import java.util.Comparator;

public class SortByMessage implements Comparator<EMailImpl> {

	@Override
	public int compare(EMailImpl o1, EMailImpl o2) {
		return o1.compareToMessage(o2.getMessage());
	}

}
