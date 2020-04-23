package bg.tu_varna.cs.publisher;

public class Page implements Comparable<Page> {

	private int pageNumber;
	private String content;
	
	public Page(int pageNumber, String content) {
		this.pageNumber = pageNumber;
		this.content = content;
	}
	
	public Page() {
		this(0, "");
	}
	
	public int getPageNumber() {
		return this.pageNumber;
	}
	
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	
	public String getContent() {
		return this.content;
	
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public int compareTo(Page o) {
		// pagr1.compareTo(page2);
		
		Page page1 = this;
		Page page2 = o;
		
		if(page1.getPageNumber() < page2.getPageNumber())
			return -1;
		
		if(page1.getPageNumber() > page2.getPageNumber())
			return 1;
		
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		// page1.equals(page2);
		Page page1 = this;
		Page page2 = (Page) obj;
		
		return page1.getPageNumber() == page2.getPageNumber();
	}
	
	public void changeContent(Page page2) {
		//page1.changeContent(page2);
		Page page1 = this;
		String content1 = page1.getContent();
		page1.setContent(page2.getContent());
		page2.setContent(content1);
	}

	@Override
	public String toString() {
		return "Page N: " + this.getPageNumber() + " Content: "
				+ this.getContent() + "\n";
	}
}
