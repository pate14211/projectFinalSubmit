/*
 * Rutul Patel
 * Student ID: 991517132
 * Bhaumik Patel
 * Student Id:991536277
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
public class GroupOfCardsTest {
    
     public  GroupOfCardsTest() {
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
     * Test of checkLength method, of class GroupOfCards.
     */
    
    public void testGroupOfCardsBad() 
    {
        System.out.println("checkLength-Bad");
        String givenSize="1234";
        boolean expResult = false;
        boolean result = GroupOfCards.GroupOfCards(givenSize);
        assertEquals(expResult, result); // compares two parameters
    }
      public void testGroupOfCardsGood() 
      {
        System.out.println("GroupOfCards-Good");
       String givenSize="12345678";
        boolean expResult = false;
        boolean result = GroupOfCards.GroupOfCards(givenSize);
        assertEquals(expResult, result); // compares two parameters
      }
       public void testGroupOfCardsBoundary()
       {
        System.out.println("GroupOfCards-Boundary");
        String givenSize="12345678";
        boolean expResult = false;
        boolean result = GroupOfCards.GroupOfCards(givenSize);
        assertEquals(expResult, result); // compares two parameters
       }
       
      
      
}
