package bg.tu_varna.cs.publisher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements BookEditor {

	private List<Page> pages;
	
	public Book(int pageCount, String title) {
		this.pages = new ArrayList<Page>(pageCount);
		
		// title page
		this.pages.add(new Page(1, title));
		
		// book content pages
		for(int i = 1; i < pageCount; i++) {
			this.pages.add(new Page(i + 1, ""));
		}
	}
	
	public Book() {
		this(1, "");
	}
	
	public void addPage(Page page) {
		this.pages.add(page);
	}
	
	public void changePage(Page page) {
		for(Page p : this.pages) {
			if(p.equals(page)) {
				p = page;
				break;
			}
		}
	}
	//index: 0, 1, 2, 3, 4, 5, 6, 7, 8
	//pageN: 1, 3, 4, 5, 6, 7, 8, 9, 10
	public void removePage1(int pageNumber) {
		for(int i = 0; i < this.pages.size(); i++) {
			Page page = this.pages.get(i);
			if(page.getPageNumber() == pageNumber) {
				this.pages.remove(i);
				i--;
			} else if(page.getPageNumber() > pageNumber) {
				page.setPageNumber(page.getPageNumber() - 1);
			}
		}
	}
	
	public void removePage2(int pageNumber) {
		for(int i = 0; i < this.pages.size(); i++) {
			Page page = this.pages.get(i);
			if(page.getPageNumber() == pageNumber) {
				this.pages.remove(i);
				for(int j = i - 1; j < this.pages.size(); j++) {
					this.pages.get(j).setPageNumber(page.getPageNumber() - 1);
				}
				break;
			}
		}
	}
	
	public void removePage3(int pageNumber) {
		this.pages.remove(pageNumber-1);
		for(int i = pageNumber - 1; i < this.pages.size(); i++) {
			Page page = this.pages.get(i);
			page.setPageNumber(page.getPageNumber() - 1);
		}
	}
	
	public void swap(Page firstPage, Page secondPage) throws Exception {
		firstPage.changeContent(secondPage);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(pages.toArray());
	}

	@Override
	public void genereteBook(String title, int numberPages) {
		Book book = new Book(numberPages, title);
		this.pages = book.pages;
	}

	@Override
	public void swapPages(int firstPN, int secondPN) throws Exception {
		Page firstPage = this.pages.get(firstPN - 1);
		Page secondPage = this.pages.get(secondPN - 1);
		this.swap(firstPage, secondPage);
	}
	
}
