package testpckg;

import project1.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestingTest {
	Shoppingcart SC;
 @BeforeEach public void initiate(){
	  SC = new Shoppingcart(); 
 }
	@Test
	void test1() {
	assertTrue(SC.bookcount==0);
	}
	@Test
	void test2() {
		Book B1 = new Book();
		B1.name = "Java Book";
		B1.amount = 1;
		B1.price= 127;
		SC.add(B1);
		assertTrue(SC.bookcount ==1);
		assertTrue(SC.totalvalue ==127);
	}
	@Test
	void test3(){
		Book B1 = new Book();
		B1.name = "Java Book";
		B1.amount = 1;
		B1.price= 127;
		SC.add(B1);
		Book B2 =new Book();
		B2.name = "Web design Book";
		B2.amount = 1;
		B2.price= 100;
		SC.add(B2);
		assertTrue(SC.bookcount == 2);
		assertTrue(SC.totalvalue ==227);
	}
	
	

}
