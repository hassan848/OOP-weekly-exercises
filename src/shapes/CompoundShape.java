/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapes;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author hassan
 */
public abstract class CompoundShape implements Drawable{
    
    private Collection<Drawable> drawables;
    
    public CompoundShape(){
        this.drawables = new ArrayList<Drawable>();
    }
    
    public void addDrawable(Drawable drawable){
        this.drawables.add(drawable);
    }
    
    public void draw(Graphics g) {
        for (Drawable d : this.drawables){
            d.draw(g);
        }
    }

    public void erase(Graphics g) {
        for (Drawable d : this.drawables) {
            d.erase(g);
        }
    }
    
}
