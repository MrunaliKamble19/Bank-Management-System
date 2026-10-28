package Bank.Management.System;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;


public class SignUp extends JFrame implements ActionListener{

	JTextField textField, textFname, textEmail, textMs, textAdd, textCity, textPin, textState;
	JRadioButton r1, r2, r3, r4, r5;
	JButton next;
	JLabel label1, label2, label3, name, Fname, DOB;
	JDateChooser dateChooser;
	Random ran = new Random();
	long first4 = (ran.nextLong()%9000L)+1000L;
	String first = " " + Math.abs(first4);
	
	SignUp(){
		
		super("APPLICATION FORM");
		
		// Bank logo is added.
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
		Image i2 = i1.getImage().getScaledInstance(100,100,Image.	SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel image = new JLabel(i3);
		image.setBounds(25,10,100,100);
		add(image);
		
		//Application form
		label1 = new JLabel("APPLICATION FORM NO."+ first);
		label1.setForeground(Color.black);
		label1.setFont(new Font("Raleway",Font.BOLD,40));
		label1.setBounds(160,20,600,40);
		add(label1);
		
		label2 = new JLabel("Page 1");
		label2.setForeground(Color.black);
		label2.setFont(new Font("Ralway",Font.BOLD,30));
		label2.setBounds(330,70,600,30);
		add(label2);
		
		label3 = new JLabel("Personal Details");
		label3.setForeground(Color.black);
		label3.setFont(new Font("Ralway",Font.BOLD,22));
		label3.setBounds(290,100,600,30);
		add(label3);
		
		//name input
		name = new JLabel("Name :");
		name.setFont(new Font("Ralway",Font.BOLD,22));
		name.setBounds(100,190,100,30);
		add(name);
		
		textField = new JTextField();
		textField.setFont(new Font("Ralway",Font.BOLD,14));
		textField.setBounds(300,190,400,30);
		add(textField);
		
		
		//Father's name input
		Fname = new JLabel("Father's Name :");
		Fname.setFont(new Font("Ralway",Font.BOLD,22));
		Fname.setBounds(100,240,200,30);
		add(Fname);
		
		textFname = new JTextField();
		textFname.setFont(new Font("Raleway",Font.BOLD,14));
		textFname.setBounds(300,240,400,30);
		add(textFname);	
		
		//Date of birth input
		DOB = new JLabel("Date of Birth :");
		DOB.setFont(new Font("Ralway",Font.BOLD,22));
		DOB.setBounds(100,340,200,30);
		add(DOB);
		
		dateChooser = new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300,340,400,30);
		add(dateChooser);
		
		JLabel labelG = new JLabel("Gender :");
		labelG.setFont(new Font("Ralway",Font.BOLD,22));	
		labelG.setBounds(100,290,200,30);
		add(labelG);
		
		r1 = new JRadioButton("Male");
		r1.setFont(new Font("Ralway",Font.BOLD,15));
		r1.setBackground(new Color(222,255,228));
		r1.setBounds(300,290,60,30);
		add(r1);
		
		r2 = new JRadioButton("Female");
		r2.setFont(new Font("Ralway",Font.BOLD,15));
		r2.setBackground(new Color(222,255,228));
		r2.setBounds(450,290,90,30);
		add(r2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(r1);
		buttonGroup.add(r2);
		
		JLabel labelEmail = new JLabel("Email :");
		labelEmail.setFont(new Font("Ralway",Font.BOLD,22));
		labelEmail.setBackground(new Color(222,255,228));
		labelEmail.setBounds(100,390,200,30);
		add(labelEmail);	
		
		textEmail = new JTextField();
		textEmail.setFont(new Font("Ralway",Font.BOLD,14));
		textEmail.setBounds(300,390,400,30);
		add(textEmail);
		
		JLabel labelMs = new JLabel("Married status :");
		labelMs.setFont(new Font("Ralway",Font.BOLD,22));
		labelMs.setBackground(new Color(222,255,228));
		labelMs.setBounds(100,440,200,30);
		add(labelMs);	
		
		r3 = new JRadioButton("Married");
		r3.setFont(new Font("Ralway",Font.BOLD,15));
		r3.setBackground(new Color(222,255,228));
		r3.setBounds(300,440,100,30);
		add(r3);
		
		r4 = new JRadioButton("Un-Married");
		r4.setFont(new Font("Ralway",Font.BOLD,15));
		r4.setBackground(new Color(222,255,228));
		r4.setBounds(450,440,150,30);
		add(r4);	
		
		r5 = new JRadioButton("Other");
		r5.setFont(new Font("Ralway",Font.BOLD,15));
		r5.setBackground(new Color(222,255,228));
		r5.setBounds(600,440,100,30);
		add(r5);
		
		ButtonGroup buttonMGroup = new ButtonGroup();
		buttonMGroup.add(r3);
		buttonMGroup.add(r4);
		buttonMGroup.add(r5);
		
		
		JLabel labelAdd = new JLabel("Address :");
		labelAdd.setFont(new Font("Ralway",Font.BOLD,22));
		labelAdd.setBackground(new Color(222,255,228));
		labelAdd.setBounds(100,490,200,30);
		add(labelAdd);	
		
		textAdd = new JTextField();
		textAdd.setFont(new Font("Ralway",Font.BOLD,14));
		textAdd.setBounds(300,490,400,30);
		add(textAdd);	
		
		JLabel labelCity = new JLabel("City :");
		labelCity.setFont(new Font("Ralway",Font.BOLD,22));
		labelCity.setBackground(new Color(222,255,228));
		labelCity.setBounds(100,540,200,30);
		add(labelCity);	
		
		textCity = new JTextField();
		textCity.setFont(new Font("Ralway",Font.BOLD,14));
		textCity.setBounds(300,540,400,30);
		add(textCity);
		
		JLabel labelPin = new JLabel("PIN :");
		labelPin.setFont(new Font("Ralway",Font.BOLD,22));
		labelPin.setBackground(new Color(222,255,228));
		labelPin.setBounds(100,590,200,30);
		add(labelPin);	
		
		textPin = new JTextField();
		textPin.setFont(new Font("Ralway",Font.BOLD,14));
		textPin.setBounds(300,590,400,30);
		add(textPin);
		
		JLabel labelState = new JLabel("Sate :");
		labelState.setFont(new Font("Ralway",Font.BOLD,22));
		labelState.setBackground(new Color(222,255,228));
		labelState.setBounds(100,640,200,30);
		add(labelState);	
		
		textState = new JTextField();
		textState.setFont(new Font("Ralway",Font.BOLD,14));
		textState.setBounds(300,640,400,30);
		add(textState);
		
		next = new JButton("Next");
		next.setFont(new Font("Ralway",Font.BOLD,15));
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setBounds(620,710,80,30);
		next.addActionListener(this);
		add(next);		
		
		
		// This is used to make the blank project portion.
		getContentPane().setBackground(new Color(222,255,228));
		setLayout(null);
		setSize(850,800);
		setLocation(360,40);
		setVisible(true); // it should be at the last , helps to make above content visible.
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	
		String formno = first;
		String name = textField.getText();
		String fname = textFname.getText();
		String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

		String gender = null;
		if (r1.isSelected()) {
		    gender = "Male";
		} else if (r2.isSelected()) {
		    gender = "Female";
		}

		String email = textEmail.getText();

		String marital = null;
		if (r3.isSelected()) {
		    marital = "Married";
		} else if (r4.isSelected()) {
		    marital = "Unmarried";
		} else if (r5.isSelected()) {
		    marital = "Other";
		}

		String address = textAdd.getText();
		String city = textCity.getText();
		String pincode = textPin.getText();
		String state = textState.getText();
		
		try {
			if(textField.getText().equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the details.");
			}
			else {
				Conn conn1 = new Conn();
				String q = "insert into  signup values('"++"')"
			}
		}
		catch(Exception E){
			E.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new SignUp() ;
	}
}
