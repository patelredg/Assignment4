package UnitTest;

import game.Player;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
 
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestPlayer {
	@Spy
    private Player playperObj=new Player("DVZ", 1500);
	
	 @Before
	    public void setUp() throws Exception {
	        
	    }
	 @After
	    public void tearDown() throws Exception {
		 
	    }
	 
	 @Test
	 public void playerBalance() {
		 playperObj.setLimit(1500);
		 verify(playperObj,times(1)).setLimit(1500);
		 System.out.println("Player Limit Set Called Successfully");
		 playperObj.balanceExceedsLimitBy(700);
		 verify(playperObj,times(1)).balanceExceedsLimitBy(700);
		 System.out.println("Player Balance Exceeds Limit Successfully");
		 Assert.assertEquals(playperObj.balanceExceedsLimitBy(700), false);
		 Assert.assertNotEquals(playperObj.balanceExceedsLimitBy(1700), true);		 
		 System.out.println("Player Balance Exceed By Limit Execute Successfully");
	 }
	 
	 @Test
	 public void playerWinning(){
		 
		 //Take Bet
		 playperObj.takeBet(0);
		 verify(playperObj,times(1)).takeBet(0);
		 System.out.println("Take Bet Called Successfully");
		 playperObj.balanceExceedsLimitBy(100);
		 Assert.assertNotEquals(playperObj.balanceExceedsLimitBy(100), false);
		 System.out.println("Check Balance Exceed By Limit Successfully");
		 
		 //Player Winning Receive
		 playperObj.receiveWinnings(2000);
		 verify(playperObj,times(1)).receiveWinnings(2000);
		 System.out.println("Recerive winning Called Successfully"); 
	 }
	 
	        
	 
}
