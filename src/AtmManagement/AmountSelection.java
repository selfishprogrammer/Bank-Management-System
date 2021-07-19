package AtmManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class ToFrame extends JFrame{
	private JTextField t1;
	private JLabel l1,l2;
	private JButton b1,b2,b3,b4,b5,b6,b7;
	private Container c;
	
	ToFrame(){
		setTitle("TRANSACTION");
		setBounds(100,100,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		c=getContentPane();
		c.setBackground(Color.white);
		c.setLayout(null);
		
		l1=new JLabel("Select Your Amount");
		l2=new JLabel("PIN:");
		l1.setBounds(90,20,300,30);
		l2.setBounds(300,5,30,30);
		t1=new JTextField();
		t1.setBounds(330,10,40,20);

		
		b1=new JButton("Rs.100");
		b2=new JButton("Rs.500");
		b3=new JButton("Rs.1000");
		b4=new JButton ("Rs.2000");
		b5= new JButton ("Rs.5000");
		b6=new JButton("Rs.10000");
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
		c.add(l2);
		c.add(t1);
		setVisible(true);
	}
	
}
public class AmountSelection {

	public static void main(String[] args) {
		ToFrame to=new ToFrame();
	}

}
