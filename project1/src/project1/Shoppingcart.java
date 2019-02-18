package project1;

public class Shoppingcart {
	
	

	public int bookcount;
	public int totalvalue;

	public Shoppingcart() {
	bookcount =0;
	}
	public void add(Book b) {
		bookcount += b.amount;
		totalvalue += b.price;
		
	}

}
