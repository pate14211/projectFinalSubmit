/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;

/**
 * The class that models your game. You should create a more specific
 * child of this class and instantiate the methods given.
 * @author dancye, 2018
 */
public abstract class Game 
{
    private  String gameName;//the title of the game
    private String players;// the players of the game
    
    public static boolean  Game(String givenName)
    {
        if(givenName.length()>=3){
                return true;
            }
            return false;
     }

    /**
     * @return the gameName
     */
    public static boolean getGameName(String gameName) 
    {
         if(gameName.length()>3){
                return true;
            }
            return false;
    }
    
     /**
     * @return the players of this game
     */
    public static boolean  getPlayers(String playerName) 
    {
       if(playerName.length()>=4){
                return true;
            }
            return false;
    }

    /**
     * @param players the players of this game
     */
    public void setPlayers(String players) 
    {
        this.players = players;
    }
    
    /**
     * Play the game. This might be one method or many method calls depending
     * on your game.
     */
    public abstract void play();
    
    /**
     * When the game is over, use this method to declare and display a winning
     * player.
     */
    public abstract void declareWinner();

	/**
	 * 
	 * @param name
	 * @param Id
	 */
	public boolean searchPlayer(String name, String Id) {
		// TODO - implement Game.searchPlayer
		throw new UnsupportedOperationException();
	}

	public void addPlayer(String name, String Id) {
		// TODO - implement Game.addPlayer
		throw new UnsupportedOperationException();
	}

	public  int score(int score) {
		// TODO - implement Game.score
		throw new UnsupportedOperationException();
	}

	public int winnerPrice(int price) {
		// TODO - implement Game.winnerPrice
		throw new UnsupportedOperationException();
	}

   
    
}//end class
