
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    // Global Variables - can be accessed from any where
    JButton login,clear,signup;
    JTextField cardTextField;
    JPasswordField pinTextField;


    Login(){
        setTitle("BANK MANAGEMENT SYSTEM");
        setLayout(null);
//		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));//Loading the icon from folder
//        Image i2 = i1.getImage().getScaledInstance(100 , 100, Image.SCALE_DEFAULT); // converting the image icon
//        ImageIcon i3 = new ImageIcon(i2); // Creating ImageIcon
//		JLabel label = new JLabel(i3);// image can be added only by ImageIcon not by label
//        label.setBounds(70,10,100,100); // setting the bounds where the icon should display
//		add(label); // adding the label

        // Jlabel - to write contents into the pane 
        JLabel text = new JLabel("WELCOME TO ADYA BANK");
        add(text);
        text.setBounds(80,40,600,40);// to display into the pane we need to set bounds 
        text.setFont(new Font("Osward",Font.BOLD,38));

        JLabel CardNo = new JLabel("Card No.");
        add(CardNo);
        CardNo.setBounds(120,160,150,40);// to display into the pane we need to set bounds 
        CardNo.setFont(new Font("Raleway",Font.BOLD,28));

         cardTextField = new JTextField();
        cardTextField.setBounds(300,160,230,40);// to make it visible set bounds and add
        cardTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(cardTextField);

        JLabel Pin = new JLabel("Pin");
        add(Pin);
        Pin.setBounds(120,220,150,40);// to display into the pane we need to set bounds 
        Pin.setFont(new Font("Raleway",Font.BOLD,28));

         pinTextField = new JPasswordField();
        pinTextField.setBounds(300,220,230,40);
        pinTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(pinTextField);

        setSize(800,480);// size
		setVisible(true); // setting to visible
		setLocation(350,200); // location to get the prompt

         login = new JButton("Sign In");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);


         clear = new JButton("Reset");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

         signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.WHITE);// background color of frame


    }
    // implement abstract method - for performing actions using listeners
    public void actionPerformed(ActionEvent ae ){
        // for performing actions
        // we need to check which button clicked - to check which event performed - sign in ,sign up , reset
        try {
        	if(ae.getSource()==clear){
                // to reset
                cardTextField.setText("");
                pinTextField.setText("");
            }
            else if(ae.getSource()==login){
            	
            	Conn c = new Conn();
            	String cardno = cardTextField.getText();
            	String pin = pinTextField.getText();
            	String q  = "select * from login where cardno = '"+cardno+"' and pin = '"+pin+"'";
            	
            	ResultSet rs = c.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }

            }
            else if(ae.getSource()==signup){
            	setVisible(false);
            	new SignupOne().setVisible(true);
            }
        }
        catch(Exception e) {
        	System.out.println(e);
        }


    }
    public static void main(String[] args) {
        new Login();
    }
}
