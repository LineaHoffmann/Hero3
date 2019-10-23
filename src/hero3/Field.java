package hero3;

import java.awt.Point;

/**
 *
 * @author Linea
 */
public class Field
{
//  private static Point mapSize = new Point(1, 1);
    
    private final int x;
    private final int y;
    private UnitGroup ug = null;

    public Field(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    

    public UnitGroup getUg()
    {
        return ug;
    }
    
    
    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
    
    
    
}
