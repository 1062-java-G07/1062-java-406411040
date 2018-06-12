import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class Run extends JFrame{

	
	public Run(){
		JFrame f = new JFrame("START");
		JButton b = new JButton("<html>西元5269年宇宙來了一個黃色大怪物,想要侵占地球,<br>要打敗那隻大怪物,請勇者們協助我們,不然後果不堪設想...........................");
		f.getContentPane().add(b);
		
		
		b.addActionListener(new ActionListener(){	
		public void actionPerformed(ActionEvent e){
		f.setVisible(false);
		new RunTest();
		} 
		});
		
		f.setSize(440,700);
		f.show();
		
	}
	public static void main(String[]args){
		new Run();
	}

	class RunTest{
		public RunTest(){
			MainFrame a = new MainFrame();
			
			a.setVisible(true);
		}
	}
	
	
	
	
}