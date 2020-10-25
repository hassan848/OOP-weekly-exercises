/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;

/**
 *
 * @author hassan
 */
public class CircleInSquare extends CompoundShape{
    
    public CircleInSquare(int x, int y, Color squareColour, Color CircleColour, double radius){
        //int z = (int)(CircleColour);
        
        addDrawable(new FilledSquare((int)(x-radius),(int) (y-radius), squareColour, (int) (radius*2)));
        addDrawable(new FilledCircle((int)(x), (int)(y), CircleColour, radius));
       
        //addDrawable(new Circle(x + 54, y + 54, new Color(0x0885c2), r));
    }
    
}
