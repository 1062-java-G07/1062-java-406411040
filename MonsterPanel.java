import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class MonsterPanel extends BeadPanel{
	private int x = 0, y = 0;
	private int width = 425;
	private int height = 600;
	
	public int getx() {
    	return x;
    }
    public void setx() {
    	this.x = x;
    }
    public int gety() {
    	return y;
    }
    public void sety() {
    	this.y = y;
    }
    public void draw(Graphics g) {
    	
    	g.setColor(Color.BLACK);
		g.fillRect(x, y, width, height);
    	
     }
}
