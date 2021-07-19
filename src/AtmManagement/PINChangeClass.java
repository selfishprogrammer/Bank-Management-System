package AtmManagement;

import javax.swing.*;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



class pchange extends JFrame implements ActionListener{
	private JLabel l1,l2,l3,l4;
	private JTextField t1,t2,t3;
	private JButton b1,b2;
	private Container c;
	
pchange(){
	
	setTitle("PIN CHANGE");
	setBounds(100,100,400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);

	c=getContentPane();
	c.setBackground(Color.CYAN);
	c.setLayout(null);
	
	
	l2=new JLabel("CHANGE YOUR PIN");
	l1=new JLabel("Current PIN:");
	l3=new JLabel("New PIN:");
	l4=new JLabel("Re-Enter New PIN:");
	
	t1=new JTextField();
	t2=new JTextField();
	t3=new JTextField();
	
	b1=new JButton("SAVE");
	b2=new JButton("BACK");
	
	

	b1.setBounds(15,225,150,30);

	b2.setBounds(215,225,150,30);
	
	
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	
	
	b2.setBackground(Color.BLACK);
	b1.setBackground(Color.BLACK);

	
	
	t1.setBounds(170,115,200,25);
	t2.setBounds(170,145,200,25);
	t3.setBounds(170,175,200,25);
	

l2.setBounds(100,60,250,30);
l1.setBounds(50,110,250,30);
l3.setBounds(50,140,250,30);
l4.setBounds(50,170,250,30);

Font font=new Font("Arial",Font.BOLD,20);
l2.setFont(font);

	
	c.add(l2);
	c.add(l1);
	c.add(l3);
	c.add(l4);
	c.add(t1);
	c.add(t2);
	c.add(t3);
	c.add(b1);
	c.add(b2);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	
	setVisible(true);
}

@Override
public void actionPerformed(ActionEvent e) {
	try {
		String a=t1.getText();
		String b=t2.getText();
		String c=t3.getText();
		
		if(e.getSource()==b2) {
			
			new MFrame().setVisible(true);
			setVisible(false);
		}
		
		else if(e.getSource()==b1) {
			
			if(t1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Enter Your PIN");
			}
			if(t2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Enter Your New PIN");
			}
			if(t3.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Re-Enter Your New PIN");
			}
			if(t2.getText().equals(t3.getText())) {
				
				DataBase db=new DataBase();
				
				String q="update bank set pin ='"+b+"' where pin = '"+a+"' ";
				String q1="update login set pin ='"+b+"' where pin = '"+a+"' ";
				String q2="update form3 set pin ='"+b+"' where pin = '"+a+"' ";
				
				
				db.s.executeUpdate(q);
				db.s.executeUpdate(q1);
				db.s.executeUpdate(q2);
				
			}
			
			else {
				JOptionPane.showMessageDialog(null, "Your PIN dint Matches");
			}
			
			
			new TFrame().setVisible(true);
			setVisible(false);
		}
		
		
	}catch(Exception e1) {
		e1.printStackTrace();
		
	}
	
}
}
public class PINChangeClass {

	public static void main(String[] args) {
		
pchange pc=new pchange();
	}

}
