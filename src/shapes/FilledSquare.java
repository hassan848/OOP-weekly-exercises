/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author childm
 */
public class FilledSquare extends Shape {
    
    protected int side;
    
    public FilledSquare(int x, int y, Color color, int side) {
        super(x, y, color);
        this.side = side;
    }
    
    protected void paint(Graphics g) {
        g.fillRect(x, y, side, side);
    }
}
