package AtmManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

class TFrame extends JFrame implements ActionListener{
	
	private JLabel l1;
	private JButton b1,b2,b3,b4,b5,b6,b7;
	private Container c;
	
	TFrame(){
		setTitle("TRANSACTION");
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		c=getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);
		
		l1=new JLabel("Select Your Transction");
		l1.setBounds(90,20,300,30);
		
		b1=new JButton("DEPOSIT");
		b2=new JButton("CASH WITHDRAWL");
		b3=new JButton("FAST CASH");
		b4=new JButton ("MINI STATEMENT");
		b5= new JButton ("PIN CHANGE");
		b6=new JButton("BALANCE ENQUIRY");
		b7=new JButton("EXIT");
		
		
		b1.setBounds(15,90,150,30);
		b2.setBounds(215,90,150,30);

		b3.setBounds(15,150,150,30);

		b4.setBounds(215,150,150,30);

		b5.setBounds(15,210,150,30);

		b6.setBounds(215,210,150,30);

		b7.setBounds(115,270,150,30);

	
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);
		b7.setForeground(Color.WHITE);
		
		b2.setBackground(Color.BLACK);
		b3.setBackground(Color.BLACK);
		b4.setBackground(Color.BLACK);
		b5.setBackground(Color.BLACK);
		b1.setBackground(Color.BLACK);
		b6.setBackground(Color.BLACK);
		b7.setBackground(Color.BLACK);
		
		
		
		
		
		Font font=new Font("Arial",Font.BOLD,20);
		l1.setFont(font);
		c.add(l1);
		c.add(b1);
		c.add(b2);
		c.add(b3);
		c.add(b4);
		c.add(b5);
		c.add(b6);
		c.add(b7);
		
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b1) {
			new Deposit().setVisible(true);
			setVisible(false);
			
		}
		
		else if(e.getSource()==b2) {
			new Widrawal().setVisible(true);
			setVisible(false);
			
		}
		else if(e.getSource()==b3) {
			new ToFrame().setVisible(true);
			setVisible(false);
			
		}
		else if(e.getSource()==b5) {
			new pchange().setVisible(true);
			setVisible(false);
			
		}
		else if(e.getSource()==b4) {
			new MFrame().setVisible(true);
			setVisible(false);
			
		}
		else if(e.getSource()==b6) {
			String pinn=JOptionPane.showInputDialog("Enter PIN");
			
			DataBase db=new DataBase();
			
			
			try {
				
				ResultSet rs=db.s.executeQuery("SELECT balance FROM bank ORDER BY pin='"+pinn+"'   DESC LIMIT 1");
				if(rs.next()) {
					String balance=rs.getString("balance");
					
					JOptionPane.showMessageDialog(null,"Your Account Balance :"+balance);
				}
				
				
			}catch(Exception e5) {
				e5.printStackTrace();
				
				
			}
			
		}
		else if(e.getSource()==b7) {
			System.exit(0);
		}
		
		
	}
	
}
public class TranscitionClass {

	public static void main(String[] args) {
		
TFrame tf=new TFrame();
	}

}
