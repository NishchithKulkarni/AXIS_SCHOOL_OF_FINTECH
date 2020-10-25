package com.book.util;

import java.util.Scanner;

public class BookStore extends Book{
	public BookStore(String bookId, String title, String author, String category, float price) {
		super(bookId, title, author, category, price);
	}
	public BookStore() {
		// TODO Auto-generated constructor stub
	}
	private static int noofbooks=0;
	private static Book[] books=new Book[20];
	public static void addBook(Book book) {
		books[noofbooks++]=book;
	}
	public void searchByTitle(String title) {
		for(Book book:books) {
			if(book==null) {
				continue;
			}
			if(book.getTitle().equals(title)) {
				System.out.println("Book found:" +book.getBookId());
			}
		}
	}
	public void searchByAuthor(String author) {
		for(Book book:books) {
			if(book==null) {
				continue;
			}
			if(book.getAuthor().equals(author)) {
				System.out.println("Book ID:"+book.getBookId()+"Book Title :"+book.getTitle()+"Book Category"+book.getCategory()+"Author:" +book.getAuthor());
			}
		}
	}
	public void displayAll() {
		for(Book book:books) {
			if(book==null) {
				continue;
			}
			System.out.println("Book ID:"+book.getBookId()+"Book Title :"+book.getTitle()+"Book Category"+book.getCategory()+"Author:" +book.getAuthor());
		}
	}
	public void update(String bookID) {
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		System.out.println("1. Update Title"+"\n"+"2. Update Author"+"\n"+"3.Update Category"+"\n4.Update Price");
		switch(option) {
		case 1:
				for(Book i:books) {
					if(i==null) {
						continue;
					}
				if(i.getBookId().equals(bookID)) {
					System.out.println("Enter title");
					i.setTitle(sc.next());
					break;
				}
		}
		case 2:
			for(Book i:books) {
				if(i==null) {
					continue;
				}
			if(i.getBookId().equals(bookID)) {
				System.out.println("Enter Author");
				i.setAuthor(sc.next());
				break;
			}
	}
		case 3:
			for(Book i:books) {
				if(i==null) {
					continue;
				}
			if(i.getBookId().equals(bookID)) {
				System.out.println("Enter Category");
				i.setCategory(sc.next());
				break;
			}
	}
		case 4:
			for(Book i:books) {
				if(i==null) {
					continue;
				}
			if(i.getBookId().equals(bookID)) {
				System.out.println("Enter title");
				i.setPrice(sc.nextFloat());
				break;
			}
	}
			default:
				System.out.println("Enter valid input");
	}
sc.close();	
}
}
