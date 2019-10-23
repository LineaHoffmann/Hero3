package hero3;

import java.util.ArrayList;

/**
 *
 * @author Linea
 */
public class UnitGroup
{
    private Field position;
    private Player owner;
    private ArrayList<Unit> unitList;

    public UnitGroup(Player owner, Unit unitType, int amount)
    {
        this.owner = owner;
        this.unitList = new ArrayList<Unit>();
        this.position = new Field(-1,-1);
        
        for (int i = 0; i < amount; i++)
        {
            //Creats new object, so we dont refere to same object. 
            unitList.add(new Unit(unitType));       
            
        }
    }
    
    public boolean unitGroupTakeDamage(int damage)
    {
        for (int i = 0; i < unitList.size(); i++)
        {
            //Gives damage to units, and returns damage.???
            damage = unitList.get(i).takeDamage(damage);
            
            
            if(unitList.get(i).takeDamage(damage) == 0)
            {
               //which return? true or false?
            }
            
            
            
            
            
        }
        
    }

    public Field getPosition()
    {
        return position;
    }

    public Player getOwner()
    {
        return owner;
    }

    public ArrayList<Unit> getUnitList()
    {
        return unitList;
    }
    
    
    
}
