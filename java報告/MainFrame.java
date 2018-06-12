import java.awt.*;


import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener
{
	JPanel monsterp;
	JPanel life;
	BeadPanel beanp;
	JButton a;
	
	public MainFrame()
	{
		
		super("Painter");
		int width = 440;
		this.setSize(width,700);
		
		monsterp = new JPanel();
		life = new JPanel();
		beanp = new BeadPanel();
		monsterp = new Mosterp();
		a = new JButton("不要按!!!!!!");
		a.addActionListener(this);
		
		monsterp.setSize(440,220);
		life.setSize(width,30);
		a.setSize(width,50);
		beanp.setSize(width,400);
		
		monsterp.setBackground(Color.YELLOW);
		life.setBackground(Color.RED);
		beanp.setBackground(Color.WHITE);
		a.setBackground(Color.WHITE);
		
		monsterp.setLocation(0,30);
		life.setLocation(0,0);
		a.setLocation(0,250);
		beanp.setLocation(0,300);
		
		this.add(monsterp);
		this.add(life);
		this.add(a);
		this.add(beanp);
	}
	
	public void actionPerformed(ActionEvent e)
    {
		
        if(e.getSource()==a)
		{	
        	new End();
		}
	}
	
}