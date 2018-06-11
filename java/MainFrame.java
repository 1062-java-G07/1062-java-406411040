import java.awt.*;

import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener
{
	JPanel monsterp;
	JPanel life;
	BeadPanel beanp;
	JButton button1;
	
	public MainFrame()
	{
		
		super("Painter");
		int width = 440;
		this.setSize(width,700);
		
		
		
		
		
		monsterp = new JPanel();
		life = new JPanel();
		beanp = new BeadPanel();
		monsterp = new Mosterp();
		button1 = new JButton("¤£­n«ö!!!!!!");
		button1.addActionListener(this);
		
		monsterp.setSize(width,250);
		life.setSize(width,30);
		button1.setSize(width,50);
		beanp.setSize(width,400);
		
		monsterp.setBackground(Color.YELLOW);
		life.setBackground(Color.RED);
		beanp.setBackground(Color.WHITE);
		button1.setBackground(Color.WHITE);
		
		monsterp.setLocation(0,30);
		life.setLocation(0,0);
		button1.setLocation(0,250);
		beanp.setLocation(0,300);
		
		this.add(monsterp);
		this.add(life);
		this.add(button1);
		this.add(beanp);
	}
	
	public void actionPerformed(ActionEvent e)
    {
		
        if(e.getSource()==button1)
		{	
        	new End();
		}
	}
	
}