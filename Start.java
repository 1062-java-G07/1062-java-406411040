package r;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Start {
  JFrame f;
  public static void main(String argv[]) {
    new Start();  
    }
  public Start() {
	  JFrame.setDefaultLookAndFeelDecorated(true);
	  JDialog.setDefaultLookAndFeelDecorated(true);
	  f=new JFrame("JButton1");
	  f.setBounds(0,0,400,300); 
	  f.setVisible(true); 
	  Container cp=f.getContentPane();
	  JButton b1=new JButton("�T�w");
	  cp.add(b1);
	  f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
	  f.addWindowListener(new WindowAdapter() {
	  
      public void windowClosing(WindowEvent e) {
      int result=JOptionPane.showConfirmDialog(f,
                   "�T�w�n�����{����?",
                   "�T�{�T��",
                   JOptionPane.YES_NO_OPTION,
                   JOptionPane.WARNING_MESSAGE);
      if (result==JOptionPane.YES_OPTION) {System.exit(0);}
        
      }    
      });
    }
  }