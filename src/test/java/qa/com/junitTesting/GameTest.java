package qa.com.junitTesting;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.model.Game;

public class GameTest{
	
	@Test
	public void NotNullGame_Id() {
		Game testing = new Game();
		assertNotNull(testing.getGame_id());
	}
	
	@Test
	public void testGame_Id() {
		Game testing = new Game();
		testing.setGame_id(50);
		assertEquals(50, testing.getGame_id());		
	}
	
	@Test
	public void testWhite() {
		Game testing = new Game();
		testing.setWhite("w");
		assertEquals("w", testing.getWhite());	
	}
	
	@Test
	public void testBlack() {
		Game testing = new Game();
		testing.setBlack("b");
		assertEquals("b", testing.getBlack());		
	}
	
	@Test
	public void testResult() {
		Game testing = new Game();
		testing.setResult("1-0");
		assertEquals("1-0", testing.getResult());	
	}
	
	@Test
	public void testEco() {
		Game testing = new Game();
		testing.setEco("A01");
		assertEquals("A01", testing.getEco());		
	}
	
	@Test
	public void testNotation() {
		Game testing = new Game();
		testing.setNotation("1. e4");
		assertEquals("1. e4", testing.getNotation());	
	}
		
}
