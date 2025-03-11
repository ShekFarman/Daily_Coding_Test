
public class Book {
	String Title;
	String Author;
	
	Book(){
		System.out.println("Enter Title and Author Name ");
	}
	
	Book(String titl,String Aut){
		this.Title=titl;
		this.Author=Aut;
	}
	
	void display() {
		System.out.println("Title :"+Title);
		System.out.println("Author"+Author);
	}
 public static void main(String[] args) {
	Book a = new Book();
	Book b = new Book("Kanguva","Tirupur Siva");
	b.display();
}
}
