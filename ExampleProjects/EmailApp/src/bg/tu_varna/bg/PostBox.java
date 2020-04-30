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

public class PostBox implements IPost {

	private Collection<EMailImpl> inColl;
	private Collection<EMailImpl> outColl;
	
	public PostBox(Collection<EMailImpl> inColl) {
		this.inColl = inColl;
		outColl = new ArrayList<EMailImpl>();
	}
	
	public PostBox(String filename) throws IOException {
		this.inColl = new ArrayList<EMailImpl>();
		this.outColl = new ArrayList<EMailImpl>();
		
		File file = new File(filename);
		
		this.inColl = getMessaage(file);
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
	
	public void fillOut(Collection<EMailImpl> fromColl) {
		outColl.addAll(fromColl);
	}

	@Override
	public void compose(File file) throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		BufferedWriter writer = new BufferedWriter(fileWriter);
		
		for(EMailImpl message : outColl) {
			writer.append(message.toString());
		}
		
		writer.close();
	}

	@Override
	public List<EMailImpl> getMessaage(File file) throws IOException {
		
		FileReader fileReader = new FileReader(file);
		BufferedReader reader = new BufferedReader(fileReader);
		
		ArrayList<EMailImpl> emails = new ArrayList<EMailImpl>();
		
		String line;
		while ((line = reader.readLine()) != null) {
			emails.add(new EMailImpl(line));
		}
		
		reader.close();
		
		return emails;
	}
}
