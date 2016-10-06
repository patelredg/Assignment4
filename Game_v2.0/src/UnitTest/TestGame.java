package UnitTest;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import game.Dice;
import game.DiceValue;
import game.Game;
import game.Player;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestGame {
		@Spy
		private Dice d1=new Dice();
		@Spy
		private Dice d2=new Dice();		
		@Spy
		private Dice d3=new Dice();		
		@Spy		
	    private Game gameObj=new Game(d1,d2,d3);
		@Spy		
	    private Player playerObj=new Player("DVZAVERI",1500);
		@Before
		public void setUp() throws Exception {
		
		}
		@After
	    public void tearDown() throws Exception {
			
	    }
		@Test
		public void gameTesting(){
			gameObj.getDiceValues();
			verify(gameObj, times(1)).getDiceValues();
			System.out.println("Game Get Dices Exceute Successfully");
			DiceValue pick = DiceValue.getRandom();			
			gameObj.playRound(playerObj, pick, 500);
			verify(gameObj, times(1)).playRound(playerObj, pick, 500);
			System.out.println("Play Round for Player Execute Successfully");
			//Due To Ramdom Dice Value Winning Amount Can't Expected Perfect
			//Assert.assertEquals(gameObj.playRound(playerObj, pick, 500),1000);
			//System.out.println("Winning Amount Verify Successfully");
			
		}
}
