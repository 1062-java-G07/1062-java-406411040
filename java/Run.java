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
		JButton b = new JButton("<html>�褸5269�~�t�z�ӤF�@�Ӷ���j�Ǫ�,�Q�n�I�e�a�y,<br>�n���Ѩ����j�Ǫ�,�Ыi�̨̭�U�ڭ�,���M��G�����]�Q...........................");
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