import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradeBookTest {
	  GradeBook book;
	
	@Before
	public void setUp() throws Exception {
		book = new GradeBook(5);
		book.addScore(50);
		book.addScore(60);
	}

	@After
	public void tearDown() throws Exception {
		book = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(book.toString().equals("50.0 60.0"));
	}
	

	@Test
	public void testSum() {
		assertEquals(110.0, book.sum(), 0.0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(50, book.minimum(), .001);
	}
	@Test 
	public void restFinalScore() {
		assertEquals(60.0, book.finalScore(), .001);
	}
}