

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<String> books = new ArrayList<>();

	public void removeBook(String bookName) {
	       if (books.remove(bookName)) {
	           System.out.println(bookName + " removed from library.");
	       } else {
	           System.out.println(bookName + " not found in library.");
	       }


	}
}
