/*
 * Rutul Patel
 * Student ID: 991517132
 * Bhaumik Patel
 * Student ID: 991536277 
 */
package ca.sheridancollege.project;
/**
 *
 * @author Admin
 */
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class PlayerTest {
    
     public PlayerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkLength method, of class PlayerTest.
     */
    
    public void testPlayerBad() 
    {
        System.out.println("Player-Bad");
         String name = "AB";
         boolean expResult = false;
         boolean result = Player.Player(name);
         assertEquals(expResult, result); // compares two parameters
    }
      public void testPlayerGood() 
      {
         System.out.println("Player-Good");
         String name = "ABCDE";
         boolean expResult = false;
         boolean result = Player.Player(name);
         assertEquals(expResult, result); // compares two parameters
      }
       public void testPlayerBoundary() 
       {
         System.out.println("Player-Boundary");
         String name = "ABCD";
         boolean expResult = false;
         boolean result = Player.Player(name);
         assertEquals(expResult, result); // compares two parameters
       }
       
    public void testPlayerIDBad()
    {
         System.out.println("PlayerID-Bad");
         String playerID = "133";
         boolean expResult = false;
         boolean result = Player.getPlayerID(playerID);
         assertEquals(expResult, result); // compares two parameters
    }
      public void testPlayerIDGood() 
      {
         System.out.println("PlayerID-Good");
          String playerID = "13435";
         boolean expResult = false;
         boolean result = Player.getPlayerID(playerID);
         assertEquals(expResult, result); // compares two parameters
      }
       public void testPlayerIDBoundary() 
       {
         System.out.println("PlayerID-Boundary");
          String playerID = "1333";
         boolean expResult = false;
         boolean result = Player.getPlayerID(playerID);
         assertEquals(expResult, result); // compares two parameters
       }
       
   
    
}
