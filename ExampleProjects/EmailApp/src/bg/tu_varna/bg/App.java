package bg.tu_varna.bg;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) throws IOException {
		
		/*ArrayList<EMailImpl> emails = new ArrayList<EMailImpl>();
		emails.add(new EMailImpl("7-AliBaba@yahoo.bg:=aTest Message 1"));
		emails.add(new EMailImpl("2-AliBaba1@abv.bg:=cvTest Message 2"));
		emails.add(new EMailImpl("3-AliBaba2@gmail.bg:=tyTest Message 3"));
		emails.add(new EMailImpl("4-asdbaasdtkir3@abv.bg:=aaTest Message 4"));
		emails.add(new EMailImpl("5-baasdtkir4@post.bg:=baTest Message 5"));
		emails.add(new EMailImpl("6-asdAliBaba5@abv.bg:=aiTest Message 6"));
		
		PostBox postbox = new PostBox(emails);*/
		
		PostBox postbox = new PostBox("F:\\DevRepository\\JavaBasics\\ExampleProjects\\EmailApp\\src\\bg\\tu_varna\\bg\\dataIn.txt");
		
		List<EMailImpl> sortByID = postbox.providerIdSort();
		Object[] sortByIDToArray = sortByID.toArray();
		String arrayToString1 = Arrays.toString(sortByIDToArray);
		
		System.out.println(arrayToString1);
		
		List<EMailImpl> sortByMessage = postbox.messageSort();
		Object[]  sortByMessageToArray = sortByMessage.toArray();
		String arrayToString2 = Arrays.toString(sortByMessageToArray);
		
		System.out.println(arrayToString2);
		
		postbox.fillOut(postbox.getInColl());
	}
}
