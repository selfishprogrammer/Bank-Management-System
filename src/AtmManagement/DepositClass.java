package AtmManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.*;
import javax.swing.border.Border;

class Deposit extends JFrame implements ActionListener{
	private JLabel l1,l2;
	private JTextField t1,t2;
	private JButton b1,b2,b3;
	private Container c;
	
	
	Deposit(){
		
		setTitle("DEPOSIT");
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		c=getContentPane();
		c.setBackground(Color.CYAN);
		c.setLayout(null);
		
		
		
		
		l1=new JLabel("PIN:");
		l2=new JLabel("ENTER AMOUNT");
		
	l1.setBounds(300,5,30,30);
	l2.setBounds(110,60,250,30);
	
	Font font=new Font("Arial",Font.BOLD,20);
	l2.setFont(font);
	
	t1=new JTextField();
	t2=new JTextField();
	
	
	t1.setBounds(330,10,40,20);
	t2.setBounds(110,100,160,30);
	
	
	
	
	b1=new JButton("DEPOSIT");
	
	
	b2=new JButton("BACK");
	
	
	b3=new JButton("EXIT");
	
	
	b1.setBounds(110,150,160,30);
	
	b2.setBounds(110,200,160,30);
	
	
	b3.setBounds(110,250,160,30);
	
	
	
	b1.setForeground(Color.WHITE);
	b2.setForeground(Color.WHITE);
	b3.setForeground(Color.WHITE);
	
	b2.setBackground(Color.BLACK);
	b3.setBackground(Color.BLACK);
	b1.setBackground(Color.BLACK);
	
	Border border1 = BorderFactory.createLineBorder(Color.BLACK);
	t1.setBorder(BorderFactory.createCompoundBorder(border1,
	           BorderFactory.createEmptyBorder(2, 2, 2, 2)));


	Border border2 = BorderFactory.createLineBorder(Color.BLACK);
	t2.setBorder(BorderFactory.createCompoundBorder(border1,
	           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

	
	c.add(l1);
	c.add(l2);
	c.add(t1);
	c.add(t2);
	
	c.add(b1);
	c.add(b2);
	c.add(b3);
	
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	setVisible(true)
;	}


	@Override
	public void actionPerformed(ActionEvent e) {
	try {
		String a=t1.getText();
		String b=t2.getText();
		
		
		if(e.getSource()==b2) {
			new TFrame().setVisible(true);
			setVisible(false);
			
		}
		else if(e.getSource()==b3) {
			System.exit(0);
			
		}
		else if(e.getSource()==b1) {
			if(t2.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Fill The Amount");
			}else {
				
			DataBase db=new DataBase();
				
					ResultSet rs=db.s.executeQuery("select * from bank where pin ='"+a+"' ");
					double balance=0;
					if(rs.next()) {
						String pin=rs.getString("pin");
						balance=rs.getDouble("balance");
						double d=Double.parseDouble(b);
						balance +=d;
						
						
						
						String q1="insert into bank values('"+pin+"','"+d+"',null,'"+balance+"')";
						db.s.executeUpdate(q1);
						
						
						
						
					}
					JOptionPane.showMessageDialog(null, "Amount is Deposited Successfully!!!");
					new TFrame().setVisible(true);
					setVisible(false);
					
				
			}
		}
		
	}catch(Exception e1) {
		e1.printStackTrace();
	}
		
		
		
	}
	
}
public class DepositClass {

	public static void main(String[] args) {
	Deposit dp	= new Deposit();

	}

}
