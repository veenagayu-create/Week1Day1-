package Week1Day2HomeAssignment;

public class Library {
	
	public String addBook(String bookTitle) {
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	
	public void issueBook() {
		System.out.println("Book issued successfully");
		
	}

	public static void main(String[] args) {
		Library lib =new Library();
		lib.addBook("add");
		lib.issueBook();
	}
}
