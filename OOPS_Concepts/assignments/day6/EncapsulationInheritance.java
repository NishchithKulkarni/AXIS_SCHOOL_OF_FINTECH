package assignments.day6;
import java.util.*;
class Book{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
class EngineeringBook extends Book{
	private String category;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}
 class EncapsulationInheritance {
	
}
 class BookDetails{
	 public static void main(String[] args) {
		 Book b=new Book();
		 Scanner sc=new Scanner(System.in);
		 int bookno=sc.nextInt();
		 String title=sc.nextLine();
		 String author=sc.nextLine();
		 float price=sc.nextFloat();
		 b.setAuthor(author);
		 b.setBookNo(bookno);
		 b.setPrice(price);
		 b.setTitle(title);
		 System.out.println("Book No:" +b.getBookNo()+"\t"+ "Title:"+b.getTitle()+"\t"+"Author:"+b.getAuthor()+"\t"+b.getPrice());
		 EngineeringBook eb=new EngineeringBook();
		 eb.setCategory("Sciecnce");
	 }
 }
