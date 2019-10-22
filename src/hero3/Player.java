package hero3;

import java.util.ArrayList;

/**
 *
 * @author Linea
 */
public class Player
{
    private String name;
    private ArrayList<Unit> unitGroupList; 
    
    /**
     * Constructor for player
     * @param name 
     */
    public Player(String name)
    {
        this.name = name;
        this.unitGroupList = new ArrayList<>();
        
    }
    
    public ArrayList<Unit> getUnitList()
    {
        return new ArrayList<Unit>(unitGroupList);
    }
    
    public String isPlayerDead()
    {
        if (unitGroupList.isEmpty())
        {
            return "Player: " + name + " is deaaaaad";
            
        }
        else
        {
            return "You are not dead, yet";
        }
    }
    
    public String getName()
    {
        return name;
    }
    
    
    
    
    
    
    
}
