package AtmManagement;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import javax.swing.border.Border;

class NFrame extends JFrame implements ActionListener{
	
	private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	private JTextField t1,t2,t3,t4,t5,t6,t7;
	private JRadioButton m1,m2,m3,m4,m5,m6;
	private JComboBox c1,c2,c3;
	private JButton btn;
	private Container c;
	Random ran=new Random();
	long card3=(ran.nextLong() % 9000L)+ 1000L;
	long card4=Math.abs(card3);
	
	NFrame(){
		setTitle("NEW ACCOUNT OPENING FORM");
		setSize(800,800);
		setLocation(300,10);
		c=getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		////       CLASSESS  ////
		
		
		l1=new JLabel("APPLICATION FORM NUMBER : "+card4);
		l2=new JLabel("Pesonal Details");
		l3=new JLabel("Name:");
		l4=new JLabel("Father's Name:");
		l5=new JLabel("Date of Birth:");
		l6=new JLabel("Gender:");
		l7=new JLabel("Email Id:");
		l8=new JLabel("Maritial Status:");
		l9=new JLabel("Address:");
		l10=new JLabel("City:");
		l11=new JLabel("Pin Code:");
		l12=new JLabel("State :");
		l13=new JLabel("Day:");
		l14=new JLabel("Month:");
		l15=new JLabel("Year:");
		
		
		
		t1=new JTextField();
		t2=new JTextField();
		t3=new JTextField();
		t4=new JTextField();
		t5=new JTextField();
		t6=new JTextField();
		t7=new JTextField();
		
		
		
		
		
		String day[]= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
		String Month[]= {"January","Febuary","March","April","May","June","July","Augest","September","October","November","December"};
		String Years[]= {"2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005"};
		
		c1=new JComboBox(day);
		c2=new JComboBox(Month);
		c3=new JComboBox(Years);
		
		
		
		
		m1=new JRadioButton("Male");
		m2=new JRadioButton("Female");
		m3=new JRadioButton("Married");
		m4=new JRadioButton("Unmarried");
		m5=new JRadioButton("Others");
		m6=new JRadioButton("Others");
		
		
		
		btn=new JButton("Next");
		
	
		
		
		
		
	
////    						Bounds  						////
		
		
		
	l1.setBounds(185,10,500,30);
	l2.setBounds(330,50,300,20);
	l3.setBounds(85,110,100,30);
	l4.setBounds(85,160,130,30);
	l5.setBounds(85,210,100,30);
	l6.setBounds(85,260,100,30);
	l7.setBounds(85,310,100,30);
	l8.setBounds(85,360,130,30);
	l9.setBounds(85,410,100,30);
	l10.setBounds(85,460,100,30);
	l11.setBounds(85,510,100,30);
	l12.setBounds(85,560,100,30);
	l13.setBounds(255,210,50,30);
	l14.setBounds(360,210,50,30);
	l15.setBounds(475,210,50,30);
	
	
	
	t1.setBounds(255,110,450,30);
	t2.setBounds(255,160,450,30);
	t3.setBounds(255,310,450,30);
	t4.setBounds(255,410,450,30);
	t5.setBounds(255,460,450,30);
	t6.setBounds(255,510,450,30);
	t7.setBounds(255,560,450,30);
	
	
	
	c1.setBounds(295,213,60,25);
	c2.setBounds(410,213,60,25);
	c3.setBounds(515,213,60,25);
	
	
	
	
	
	m1.setBounds(255,265,80,20);
	m2.setBounds(405,265,80,20);
	m6.setBounds(555,265,80,20);
	m3.setBounds(255,365,100,20);
	m4.setBounds(405,365,100,20);
	m5.setBounds(555,365,100,20);
	
	
	
	btn.setBounds(602,630,100,30);
	
		
//////         Font        ///////
		
				
Font font=new Font("Arial",Font.BOLD,25);	
l1.setFont(font);
l2.setFont(new Font("Arial",Font.BOLD,18));
l3.setFont(new Font("Arial",Font.BOLD,15));
l4.setFont(new Font("Arial",Font.BOLD,15));
l5.setFont(new Font("Arial",Font.BOLD,15));
l6.setFont(new Font("Arial",Font.BOLD,15));
l7.setFont(new Font("Arial",Font.BOLD,15));
l8.setFont(new Font("Arial",Font.BOLD,15));

l9.setFont(new Font("Arial",Font.BOLD,15));
l10.setFont(new Font("Arial",Font.BOLD,15));
l11.setFont(new Font("Arial",Font.BOLD,15));
l12.setFont(new Font("Arial",Font.BOLD,15));
l13.setFont(new Font("Arial",Font.BOLD,14));
l14.setFont(new Font("Arial",Font.BOLD,14));
l15.setFont(new Font("Arial",Font.BOLD,14));


//////           Color          //////////////


c1.setBackground(Color.WHITE);
c2.setBackground(Color.WHITE);
c3.setBackground(Color.WHITE);

m1.setBackground(Color.WHITE);
m2.setBackground(Color.WHITE);
m3.setBackground(Color.WHITE);
m4.setBackground(Color.WHITE);
m5.setBackground(Color.WHITE);
m6.setBackground(Color.WHITE);



btn.setForeground(Color.WHITE);
btn.setBackground(Color.BLACK);


//////         Borders                 ///////////



Border border1 = BorderFactory.createLineBorder(Color.BLACK);
t1.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));


Border border2 = BorderFactory.createLineBorder(Color.BLACK);
t2.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

Border border3 = BorderFactory.createLineBorder(Color.BLACK);
t3.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

Border border4 = BorderFactory.createLineBorder(Color.GRAY);
t4.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

Border border5 = BorderFactory.createLineBorder(Color.GRAY);
t5.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

Border border6 = BorderFactory.createLineBorder(Color.BLACK);
t6.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

Border border7 = BorderFactory.createLineBorder(Color.BLACK);
t7.setBorder(BorderFactory.createCompoundBorder(border1,
           BorderFactory.createEmptyBorder(2, 2, 2, 2)));


////                         Extra ////////////


//ButtonGroup edu=new ButtonGroup();
//
//edu.add(m1);
//edu.add(m2);
//edu.add(m3);
//
//edu.add(m4);
//
//edu.add(m5);
//
//edu.add(m6);



m1.setSelected(true);





////                 Add                  ////
c.add(l1);	
c.add(l2);
c.add(l3);
c.add(l4);
c.add(l5);
c.add(l6);
c.add(l7);
c.add(l8);
c.add(l9);
c.add(l10);
c.add(l11);
c.add(l12);
c.add(l13);
c.add(l14);
c.add(l15);
c.add(c1);
c.add(c2);
c.add(c3);





c.add(t1);
c.add(t2);
c.add(t3);
c.add(t4);
c.add(t5);
c.add(t6);
c.add(t7);




c.add(m1);
c.add(m2);
c.add(m6);
c.add(m3);
c.add(m4);
c.add(m5);



c.add(btn)
;		
		
		
btn.addActionListener(this);		
		
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a=t1.getText();
		String b=t2.getText();
		String da=(String)c1.getSelectedItem();
		String Mo=(String)c2.getSelectedItem();
		String Ye=(String)c3.getSelectedItem();
		String d=null;
		
		if(m1.isSelected()) {
			d="Male";
			
		}
		else if(m2.isSelected()) {
			d="Female";
			
		}
		else if(m5.isSelected()) {
			d="Others";
			
		}
		String m=t3.getText();
		
		String f=null;
		
		if(m3.isSelected()) {
			f="Married";
			
		}
		else if(m4.isSelected()) {
			f="Unmarried";
			
		}
		else if(m4.isSelected()) {
			f="Others";
			
		}
		
		String k=t4.getText();
		String l=t5.getText();
		String n=t6.getText();
		String o=t7.getText();
		
		
		
		try {
		
			if(t1.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill All Data");
			}
			else {
				DataBase db=new DataBase();
				String q1="insert into form1 values('"+a+"','"+b+"','"+da+"','"+Mo+"','"+Ye+"','"+d+"','"+m+"','"+f+"','"+k+"','"+l+"','"+n+"','"+o+"','"+card4+"')";
				db.s.executeUpdate(q1);
			new MKFrame().setVisible(true);
			setVisible(false);
			
			}

			
			
		}catch(Exception e2) {
			e2.printStackTrace();
			
		}
		
			
		
	}
	
	
}
public class NewAccountForm {

	public static void main(String[] args) {
		NFrame nf=new NFrame();

	}

}
