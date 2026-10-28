package Bank.Management.System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.awt.Color;
import java.awt.Image;

public class Login extends JFrame implements ActionListener {
		
		JLabel label1, label2, label3 ;// For creating labels like card no. , pin.
		JTextField textField2;// card no..
		JPasswordField passwordField3;// used for pin.
		JButton button1, button2, button3;
		
		
		Login(){
			super("Bank Management System");
			
			// Bank logo is added.
			ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
			Image i2 = i1.getImage().getScaledInstance(100,100,Image.	SCALE_DEFAULT);
			ImageIcon i3 = new ImageIcon(i2);
			JLabel image = new JLabel(i3);
			image.setBounds(360,10,100,100);
			add(image);
			
			// Bottom card img is added.
			ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
			Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
			ImageIcon ii3 = new ImageIcon(ii2);
			JLabel iimage = new JLabel(ii3);
			iimage.setBounds(630,350,100,100);
			add(iimage);
			
			// Welcome to atm text code.
			label1 = new JLabel("WELCOME TO ATM");
			label1.setForeground(Color.WHITE);
			label1.setFont(new Font("AvantGarde",Font.BOLD,40));
			label1.setBounds(230,125,450,40);
			add(label1);
			
			label2 = new JLabel("Card No.:");
			label2.setForeground(Color.WHITE);
			label2.setFont(new Font("Ralway",Font.BOLD,30));
			label2.setBounds(150,190,375,30);
			add(label2);
			
			//Taking input in card number.
			textField2 = new JTextField(15);
			textField2.setBounds(325,190,230,30);
			textField2.setFont(new Font("Arial",Font.BOLD,14));
			add(textField2);
			
			label3 = new JLabel("PIN:");
			label3.setForeground(Color.WHITE);
			label3.setFont(new Font("Ralway",Font.BOLD,30));
			label3.setBounds(150,250,375,30);
			add(label3);
			
			//Taking password in PIN.
			passwordField3 = new JPasswordField(15);
			passwordField3.setBounds(325,250,230,30);
			passwordField3.setFont(new Font("Arial",Font.BOLD,14));
			add(passwordField3);
			
			//Creating buttons for sign-in.
			button1 = new JButton("SIGN-IN");
			button1.setForeground(Color.WHITE);
			button1.setBackground(Color.black);
			button1.setBounds(300,300,100,30);
			button1.setFont(new Font("Arial",Font.BOLD,14));
			button1.addActionListener(this);
			add(button1);
			
			button2 = new JButton("CLEAR");
			button2.setForeground(Color.WHITE);
			button2.setBackground(Color.black);
			button2.setBounds(430,300,100,30);
			button2.setFont(new Font("Arial",Font.BOLD,14));
			button2.addActionListener(this);
			add(button2);
			
			button3 = new JButton("SIGN-UP");
			button3.setForeground(Color.WHITE);
			button3.setBackground(Color.black);
			button3.setBounds(300,350,230,30);
			button3.setFont(new Font("Arial",Font.BOLD,14));
			button3.addActionListener(this);
			add(button3);
			
			
			
			//background img , should be at bottom. While coding.
			ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
			Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
			ImageIcon iii3 = new ImageIcon(iii2);
			JLabel iiimage = new JLabel(iii3);
			iiimage.setBounds(0,0,850,480);
			add(iiimage);
			
			// This is used to make the blank project portion.
			setLayout(null);
			setSize(850,480);
			setLocation(450,150);
			setVisible(true); // it should be at the last , helps to make above content visible.
		}
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				if(e.getSource()==button1) {
					
				}else if(e.getSource()==button2) {
					textField2.setText("");
					passwordField3.setText("");
				}else if(e.getSource()==button3) {
					
				}
			}catch(Exception E) {
				E.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			new Login();
		}
}
