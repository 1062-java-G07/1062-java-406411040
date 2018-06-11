import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;





public  class End implements ActionListener{
	public End(){
		JFrame f = new JFrame("END");
		JButton b = new JButton("恭喜大家過關,想不到吧");
		f.getContentPane().add(b);
		
		
		b.addActionListener(new ActionListener(){	
		public void actionPerformed(ActionEvent e){
		f.setVisible(false);
		
		} 
		});
		b.setBackground(Color.BLUE.brighter());
		
		
		f.setSize(440,700);
		f.show();
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
	}
}
