import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class fakeMainFrame extends JFrame 
{
	
	Container ct;
	Monsterp picture;
	JPanel monsterp;
	JPanel life;
	BeadPanel beanp;
	JButton button1,button2;
	
	public fakeMainFrame()
	{
		super("理由伯我愛你");
		int width = 440;
		this.setSize(width,700);
		
		ct = this.getContentPane();
		this.setLayout(null);
		
		picture = new Monsterp((new ImageIcon("20170316-329467_bm.jpg")).getImage());
		picture.setBounds(0,0,440,270);
		ct.add(picture);
		
		monsterp = new JPanel();
		life = new JPanel();
		beanp = new BeadPanel();
		monsterp.setSize(width,270);
		life.setSize(width,30);
		

		beanp.setSize(width,400);
		monsterp.setBackground(Color.BLACK);
		life.setBackground(Color.RED);
		beanp.setBackground(Color.WHITE);
		
		monsterp.setLocation(0,30);
		life.setLocation(0,0);
		beanp.setLocation(0,300);
		
		this.add(monsterp);
		this.add(life);
		this.add(beanp);
		
	}
	
}