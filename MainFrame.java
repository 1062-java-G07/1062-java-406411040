package idgf;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainFrame extends JFrame implements ActionListener
{
	Mosterp mosterp;
	JPanel lifep;
	JPanel life;
	BeadPanel beanp;
	JButton button1;
	
	public MainFrame()
	{
		
		super("Painter");
		int width = 440;
		this.setSize(width,700);
		
		lifep = new JPanel();
		life = new JPanel();
		button1 = new JButton("¤£­n«ö");
		button1.addActionListener(this);
		beanp = new BeadPanel();
		mosterp = new Mosterp();
		
		
		
		
		
		mosterp.setSize(width,220);
		life.setSize(width,30);
	
		beanp.setSize(width,400);
		button1.setSize(width,50);
		
		
		mosterp.setBackground(Color.BLACK);
		life.setBackground(Color.RED);
		beanp.setBackground(Color.WHITE);
		button1.setBackground(Color.WHITE);
		
		mosterp.setLocation(0,30);
		life.setLocation(0,0);
		
		beanp.setLocation(0,300);
		button1.setLocation(0,350);
		
		this.add(button1);
		this.add(mosterp);
	
		this.add(life);
	
		
		this.add(beanp);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}