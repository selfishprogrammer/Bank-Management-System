package AtmManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

class MCFrame extends JFrame implements ActionListener{
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
	private JRadioButton r1,r2,r3,r4;
	private JCheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7;
	private JTextField t1;
	private JButton btn,btn1;
	Container c;
	MCFrame(){
		
		setTitle("NEW ACCOUNT OPENING FORM");
		setSize(600,600);
		setLocation(300,10);
		c=getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		
		
		l1=new JLabel("Form No-");
		l2=new JLabel("Account Details");
		l3=new JLabel("Account Type:");
		l4=new JLabel("Card Number:");
		l5=new JLabel("XXXX-XXXX-XXXX-1999");
		l6=new JLabel("PIN:");
		l7=new JLabel("XXXX");
		l8=new JLabel("Sevices Required:");
		l9=new JLabel("(Your 16 digit Card Nunber)");
		l10=new JLabel("(4-digit Password)");
		
		
		
		r1=new JRadioButton("Savings Account");
		r2=new JRadioButton("Fixed Deposit Acccount");
		r3=new JRadioButton("Current Acccount");
		r4=new JRadioButton("Rwcuring Deposite Account");
		
		t1=new JTextField();
		t1.setBounds(490,2,70,20);
		
		
		ch1=new JCheckBox("ATM CARD");
		ch2=new JCheckBox("INTERNET BANKING");
		ch3=new JCheckBox("MOBILE BANKING");
		ch4=new JCheckBox("EMAIL ALERTS");
		ch5=new JCheckBox("CHECQUE BOOK");
		ch6=new JCheckBox("E_STATEMENT");
		ch7=new JCheckBox("Conform the Following terms & condition");
		
		
		
		btn=new JButton("SUBMIT");
		btn1=new JButton("CLEAR");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		l1.setBounds(430,2,90,15);
		l2.setBounds(230,50,300,20);
		l3.setBounds(50,115,200,30);
		l4.setBounds(50,225,200,30);
		l9.setBounds(50, 250, 200, 15);
		l5.setBounds(230,225,200,30);
		l6.setBounds(50,290,200,30);
		l10.setBounds(50,305,200,30);
		l7.setBounds(230,290,200,30);
		l8.setBounds(50,340,200,30);
		
		
		
		r1.setBounds(65,150,160,30);
		r2.setBounds(230,150,170,30);
		r3.setBounds(65,175,160,30);
		r4.setBounds(230,175,185,30);
		
		
		
		ch1.setBounds(65,380,160,30);
		ch2.setBounds(230,380,160,30);
		ch3.setBounds(395,380,160,30);
		ch4.setBounds(65,415,160,30);
		ch5.setBounds(230,415,160,30);
		ch6.setBounds(395,415,160,30);
		ch7.setBounds(65,465,500,15);
		
		
		c.add(t1);
		
		
		
		btn.setBounds(65,485,100,30);
		btn1.setBounds(400,485,100,30);

		
		
		
		
		
		
		r1.setBackground(Color.WHITE);
		r2.setBackground(Color.WHITE);
		r3.setBackground(Color.WHITE);
		r4.setBackground(Color.WHITE);
		
		
		ch1.setBackground(Color.WHITE);
		ch2.setBackground(Color.WHITE);
		ch3.setBackground(Color.WHITE);
		ch4.setBackground(Color.WHITE);
		ch5.setBackground(Color.WHITE);
		ch6.setBackground(Color.WHITE);
		ch7.setBackground(Color.WHITE);
	
		ButtonGroup bt=new ButtonGroup();
		
		
		bt.add(r1);
		bt.add(r2);
		bt.add(r3);
		bt.add(r4);
		
		
//		bt.add(ch1);
//		bt.add(ch2);
//		bt.add(ch3);
//		bt.add(ch4);
//		bt.add(ch5);
//		bt.add(ch6);
		
		
		ch1.setSelected(true);
		
		
		btn.setBackground(Color.BLACK);
		btn1.setBackground(Color.BLACK);
		btn.setForeground(Color.WHITE);
		btn1.setForeground(Color.WHITE);
		
		
		
Font font=new Font("Arial",Font.BOLD,20);	
l2.setFont(font);
l3.setFont(new Font("Arial",Font.BOLD,15));
l4.setFont(new Font("Arial",Font.BOLD,15));
l6.setFont(new Font("Arial",Font.BOLD,15));
l8.setFont(new Font("Arial",Font.BOLD,15));
		
		
		
		
		
		
		c.add(l1);
		c.add(l2);
		c.add(l3);
		c.add(l4);
		c.add(l9);
		c.add(l5);
		c.add(l6);
		c.add(l10);
		c.add(l7);
		c.add(l8);
		
		
		
		
		c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(r4);
		c.add(ch1);
		c.add(ch2);
		c.add(ch3);
		c.add(ch4);
		c.add(ch5);
		c.add(ch6);
		c.add(ch7);
		
		
		
		c.add(btn);
		c.add(btn1);
		
		
		btn.addActionListener(this);
		btn1.addActionListener(this);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Random ran=new Random();
		long card=(ran.nextLong() % 90000000L)+ 45678965000000L;
		long card2=Math.abs(card)
				
;
		
		long card3=(ran.nextLong() % 9000L)+ 1000L;
		long card4=Math.abs(card3);
		
		String d=t1.getText();
		
		String a=null;
		if(r1.isSelected()) {
			a="Savings Account";
		}
		else if(r2.isSelected()) {
			a="Fixed Deposite Account";
		}
		else if(r3.isSelected()) {
			a="Current Account";
		}
		else if(r4.isSelected()) {
			a="Recuring Account";
		}
		
		String b="";
		if(ch1.isSelected()) {
			b=b+"ATM CARD";
			
		}
		if(ch2.isSelected()) {
			b=b+"INTERNET BANKING";
			
		}
		if(ch3.isSelected()) {
			b=b+"MOBILE BANKING";
			
		}
		if(ch4.isSelected()) {
			b=b+"EMAIL ALERTS";
			
		}
		if(ch5.isSelected()) {
			b=b+"CHECQUE BOOK";
			
		}
		if(ch6.isSelected()) {
			b=b+"E_STATEMENT";
			
		}
		
		
		
		
		
		
		
		try {
		if(e.getSource()==btn) {
			if(t1.equals("")) {
				JOptionPane.showMessageDialog(null, "Please Conform");
				
			}
			
			else {
				DataBase db=new DataBase();
				String ql="insert into form3 values('"+a+"','"+card2+"','"+card4+"','"+b+"','"+d+"')";
				String ql2="insert into login values('"+card2+"','"+card4+"')";
				db.s.executeUpdate(ql);
				db.s.executeUpdate(ql2);
				JOptionPane.showMessageDialog(null, "Card No :"+card2 + "\n PIN :"+card4);
				
				new TFrame().setVisible(true);
				setVisible(false);
			}
		}
		else if(e.getSource()==btn1) {
			System.exit(0);
		}
		}catch(Exception e4) {
			e4.printStackTrace();
		}
		
	}
	
}
public class NewAccountFormPage3 {

	public static void main(String[] args) {
		MCFrame mcf=new MCFrame();

	}

}
