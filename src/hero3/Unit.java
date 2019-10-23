/**
 * Contains data about the a UnitGroup. 
 */
package hero3;

/**
 *
 * @author Linea
 */
public class Unit
{
    private int attatck;
    private int defence;
    private int damange;
    private int healthPoints;
    private int speed;
    private String name;

    
    public Unit(int attatck, int defence, int damange, int healthPoints, int speed, String name)
    {
        this.attatck = attatck;
        this.defence = defence;
        this.damange = damange;
        this.healthPoints = healthPoints;
        this.speed = speed;
        this.name = name;
    }

    
    //bruges til at kopiere en unit. 
    /**
     * Tager en hel unit, laver en kopi af unit
     * @param unitType 
     */
    public Unit(Unit unitType)
    {
        
    }
    
    //How the fuck does this game work?
    // move to own class? Battle class?
    public int takeDamage(int damange)
    {
        //return 0, when all damage is used
        if (healthPoints >= damange)
        {
            healthPoints = healthPoints- damange;
            return 0;
            
        }     
        else
        {
            // return remaining damage
            healthPoints = healthPoints - damange;
            damange = damange - healthPoints; //
            return damange;
            
        }
        
        
    }
    
    
    
    

    public int getAttatck()
    {
        return attatck;
    }

    public int getDefence()
    {
        return defence;
    }

    public int getDamange()
    {
        return damange;
    }

    public int getHealthPoints()
    {
        return healthPoints;
    }

    public int getSpeed()
    {
        return speed;
    }

    public String getName()
    {
        return name;
    }
    
    
    
}
