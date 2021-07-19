package AtmManagement;

import java.awt.*;

import java.awt.event.*;



import javax.swing.*;
import javax.swing.border.Border;

class MKFrame extends JFrame implements ActionListener{
private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
private JComboBox c1,c2,c3,c4,c5;
private JRadioButton r1,r2,r3,r4,r5,r6;
private JTextField t1,t2,t3;
private JButton btn;
private Container c;
	MKFrame(){
		
		
		setTitle("NEW ACCOUNT OPENING FORM");
		setSize(800,800);
		setLocation(300,10);
		c=getContentPane();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.setBackground(Color.WHITE);
		c.setLayout(null);
		
		
		
		
		l1=new JLabel("Form No-");
		l2=new JLabel("Additional Details");
		l3=new JLabel("Religion :");
		l4=new JLabel("Categoary :");
		l5=new JLabel("Income :");
		l6=new JLabel("Qualification:");
		l11=new JLabel("Occupation:");
		l12=new JLabel("Nationality:");
		l7=new JLabel("PAN Number:");
		l8=new JLabel("Aadhar Number:");
		l9=new JLabel("Senior Citizen:");
		l10=new JLabel("Existing Account:");
		
		
		String Religion[]= {"Hindu","Muslim","Buddist","Others"};
		String Category[]= {"General","SC","ST","OBC","Others"};
		String Income[]= {"Null","0-10000","10001-50000","50001-more Above"};
		String Qualification[]= {"Graduate","Non-Graduate"};
		String Occupation[]= {"Student","SelfEmloyed","Saliried","Others"};
		
		
		
		c1=new JComboBox(Religion);
		c2=new JComboBox(Category);
		c3=new JComboBox(Income);
		c4=new JComboBox(Qualification);
		c5=new JComboBox(Occupation);
		
		
		
		t1=new JTextField();
		t2=new JTextField();
		
		t3=new JTextField();
		
		
		
		
		
		
		r1=new JRadioButton("Indian");
		r2=new JRadioButton("Migrate");
		r3=new JRadioButton("Yes");
		r4=new JRadioButton("No");
		r5=new JRadioButton("Yes");
		r6=new JRadioButton("No");
		
		
		
		
		
		
		
		btn=new JButton("Next");
		
		
		
		
		
		
		
		
		
		l1.setBounds(650,2,90,15);
		l2.setBounds(300,50,300,20);
		l3.setBounds(85,115,100,30);
		l4.setBounds(85,165,130,30);
		l5.setBounds(85,215,100,30);
		l6.setBounds(85,265,100,30);
		l11.setBounds(85,315,100,30);
		l12.setBounds(85,365,100,30);
		l7.setBounds(85,415,100,30);
		l8.setBounds(85,465,130,30);
		l9.setBounds(85,515,150,30);
		l10.setBounds(85,565,150,30);

		
		
		
		
c1.setBounds(255,115,400,30);		

c2.setBounds(255,165,400,30);
c3.setBounds(255,215,400,30);
c4.setBounds(255,265,400,30);
c5.setBounds(255,315,400,30);




t1.setBounds(705,2,50,20);
t2.setBounds(255,415,400,30);
t3.setBounds(255,465,400,30);


r1.setBounds(255,365,100,30);
r2.setBounds(405,365,100,30);
r3.setBounds(255,515,100,30);
r4.setBounds(405,515,100,30);
r5.setBounds(255,565,100,30);
r6.setBounds(405,565,100,30);
		



btn.setBounds(602,630,100,30);
		
		Font font = new Font("Arial",Font.BOLD,20);
		l2.setFont(font);
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


		
		
		
		
		c1.setBackground(Color.WHITE);
		c2.setBackground(Color.WHITE);
		c3.setBackground(Color.WHITE);
		c4.setBackground(Color.WHITE);
		c5.setBackground(Color.WHITE);

		r1.setBackground(Color.WHITE);
		r2.setBackground(Color.WHITE);
		r3.setBackground(Color.WHITE);
		r4.setBackground(Color.WHITE);
		r5.setBackground(Color.WHITE);
		r6.setBackground(Color.WHITE);
		
		
		btn.setForeground(Color.WHITE);
		btn.setBackground(Color.BLACK);
		
		
		
		Border border1 = BorderFactory.createLineBorder(Color.BLACK);
		t1.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));


		Border border2 = BorderFactory.createLineBorder(Color.BLACK);
		t2.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));

		Border border3 = BorderFactory.createLineBorder(Color.BLACK);
		t3.setBorder(BorderFactory.createCompoundBorder(border1,
		           BorderFactory.createEmptyBorder(2, 2, 2, 2)));
	
		
		
		
		
		
		
		
		
		
		
		
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
		
		
		
		
		c.add(btn);
		
		
		
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		
		
		
		
		c.add(t1);
		c.add(t2);
		c.add(t3);
		
		
		c.add(r1);
		c.add(r2);
		c.add(r3);
		c.add(r4);
		c.add(r5);
		c.add(r6);
		
		
		btn.addActionListener(this);
		
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String ab=(String)c1.getSelectedItem();
		String bc=(String)c2.getSelectedItem();
		String cd=(String)c3.getSelectedItem();
		String ef=(String)c4.getSelectedItem();
		String gh=(String)c5.getSelectedItem();
		
		
		String f=null;
		if(r1.isSelected()) {
			f="Indian";
		}
		else if(r2.isSelected()) {
			f="Migrate";
		}
		
		
		String a=t2.getText();
		String b=t3.getText();
		String k=t1.getText();
		
		
		String g=null;
		if(r3.isSelected()) {
			g="Yes";
		}
		else if(r4.isSelected()) {
			g="No";
		}
		
		String h=null;
		if(r5.isSelected()) {
			h="Yes";
		}
		else if(r6.isSelected()) {
		h="No";
		}
		
		
		
		try {
			if(t2.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Please Fill All Data");
				
			}
			else {
				DataBase db=new DataBase();
				String u="insert into form2 values('"+k+"','"+ab+"','"+bc+"','"+cd+"','"+ef+"','"+gh+"','"+f+"','"+a+"','"+b+"','"+g+"','"+h+"')";
				db.s.executeUpdate(u);
				
				
				new MCFrame().setVisible(true);
				setVisible(false);
			
			
			}
			
		}catch(Exception e3) {
			e3.printStackTrace();
			
		}
	}
	
}


















public class NewAccountFormPage2 {

	public static void main(String[] args) {
		
MKFrame mk=new MKFrame();
	}

}
