package UnitTest;
import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		TestPlayer testPlayerObj=new TestPlayer();
		TestGame testGameObj=new TestGame();
		//$JUnit-END$
		return suite;
	}

}
