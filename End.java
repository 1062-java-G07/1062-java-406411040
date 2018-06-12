import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;





public  class End implements ActionListener{
	public End(){
		//JPanel imagep;
		JFrame f;
		JButton a;
		
		f = new JFrame("END");
		//imagep = new JPanel();
		//imagep = new ImageTest();
		
		a = new JButton("想不到吧!恭喜大家過關!!!!!");
		ImageIcon icon = new ImageIcon("c://123.jpg");    
		//JLabel b = new JLabel(icon,SwingConstants.CENTER);
		f.getContentPane().add(a);
		
		
		
		
		
		a.addActionListener(new ActionListener(){	
		public void actionPerformed(ActionEvent e){
		} 
		});
		
		/*imagep.setLocation(0,0);
		imagep.setVisible(true);
		imagep.setSize(440,700);
		*/
		
		a.setBackground(Color.BLUE.brighter());
		
		
		f.setSize(440,700);
		f.show();
		
	}

	

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
