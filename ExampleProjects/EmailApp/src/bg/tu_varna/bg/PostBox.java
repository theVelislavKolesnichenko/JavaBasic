package bg.tu_varna.bg;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PostBox {

	private Collection<EMailImpl> inColl;
	private Collection<EMailImpl> outColl;
	
	public PostBox(Collection<EMailImpl> inColl) {
		this.inColl = inColl;
		outColl = new ArrayList<EMailImpl>();
	}
	
	public Collection<EMailImpl> getInColl() {
		return inColl;
	}
	public Collection<EMailImpl> getOutColl() {
		return outColl;
	}
	
	public List<EMailImpl> providerIdSort() {
		Collections.sort((List<EMailImpl>) inColl, new SortById());
		return (List<EMailImpl>) inColl;
	}
	
	public List<EMailImpl> messageSort() {
		Collections.sort((List<EMailImpl>) inColl, new SortByMessage());
		return (List<EMailImpl>) inColl;
	}
	
	public void fillOut(Collection fromColl) {
		outColl.addAll(fromColl);
	}
}
