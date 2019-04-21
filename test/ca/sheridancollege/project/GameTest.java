/*
 * Rutul Patel
 * Student ID: 991517132
 * Bhaumik Patel 
 * Student Id: 991536277
 */
package ca.sheridancollege.project;
/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
public class GameTest {
    
     public GameTest() {
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
     * Test of checkLength method, of class GameTest.
     */
    
    public void testGameBad() 
    {
        System.out.println("Game-Bad");
        String givenName = "AB";
        boolean expResult = false;
        boolean result = Game.Game(givenName);
        assertEquals(expResult, result); // compares two parameters
    }
      public void testGameGood() 
      {
          System.out.println("Game-Good");
        String givenName = "ABCD";
        boolean expResult = false;
        boolean result = Game.Game(givenName);
        assertEquals(expResult, result); // compares two parameters
      }
       public void testGameBoundary() 
       {
            System.out.println("Game-Boundarys");
        String givenName = "AbC";
        boolean expResult = false;
        boolean result = Game.Game(givenName);
        assertEquals(expResult, result); // compares two parameters
       }
       
     public void testGameNameBad() 
     {
        System.out.println("GameName-Bad");
        String gameName = "UN";
        boolean expResult = false;
        boolean result = Game.getGameName(gameName);
        assertEquals(expResult, result); // compares two parameters
     }
      public void testGameNameGood() 
      {
        System.out.println("GameName-Good");
        String gameName = "UNO1";
        boolean expResult = false;
        boolean result = Game.getGameName(gameName);
        assertEquals(expResult, result); // compares two parameters
      }
       public void testGameNameBoundary() 
       {
           System.out.println("GameName-Boundary");
        String gameName = "UNO";
        boolean expResult = false;
        boolean result = Game.getGameName(gameName);
        assertEquals(expResult, result); // compares two parameters
       }
       
     public void testPlayerBad()
     {
         System.out.println("Player-Bad");
        String players="abc";
        boolean expResult = false;
        boolean result = Game.getPlayers(players);
        assertEquals(expResult, result); // compares two parameters
     }
      public void testPlayerGood() 
      {
          System.out.println("Player-Good");
      String players="abcde";
        boolean expResult = false;
        boolean result = Game.getPlayers(players);
        assertEquals(expResult, result); // compares two parameters
      }
       public void testPlayerBoundary() 
       {
         System.out.println("Player-Boundary");
      String players="abcd";
        boolean expResult = false;
        boolean result = Game.getPlayers(players);
        assertEquals(expResult, result); // compares two parameters
       }
    
}
