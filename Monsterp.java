import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Monsterp extends JPanel {

	Image im;
	public Monsterp(Image im){
		this.im = im;
		this.setOpaque(true);
	}
	
	public void paintComponent(Graphics g)  
    {  
        super.paintComponents(g);  
        g.drawImage(im,0,0,this.getWidth(),this.getHeight(),this);  
          
    }   
}
