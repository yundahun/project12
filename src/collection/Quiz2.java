package collection;

import java.util.ArrayList;

public class Quiz2 {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();
		
		Book book1 = new Book(1, "먼나라 이웃나라");
		Book book2 = new Book(2, "그리스 로마신화");
		Book book3 = new Book(3, "삼국지");
		
		list.add(book1);
		list.add(book2);
		list.add(book3);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		list.remove(2);
		list.remove(1);
		list.remove(0);
		
		System.out.println(list);
		
	}

}

class Book {
	int bookNum;
	String title;
	
	public Book(int bookNum, String title) {
		super();
		this.bookNum = bookNum;
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", title=" + title + "]";
	}
	
}