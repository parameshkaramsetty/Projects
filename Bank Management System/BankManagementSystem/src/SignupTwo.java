
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import com.toedter.calendar.JDateChooser;


public class SignupTwo extends JFrame implements  ActionListener {

    //global text fields
    JComboBox religion,category,income,education,occupation;
    JTextField aadhar,pan;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
    String formno;
    SignupTwo(String formno){
        // reseting the layout from default value
    	this.formno=formno;
        setLayout(null);

        getContentPane().setBackground(Color.WHITE);// setting pane color

       

        JLabel additionalDetails  = new JLabel("Page 2 : Additional Details");
        additionalDetails.setBounds(290,80,400,30);                
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
        add(additionalDetails);

        JLabel name  = new JLabel("Religion : ");
        name.setBounds(100,140,100,30);
        name.setFont(new Font("Raleway",Font.BOLD,20));
        add(name);
        
        String valReligion[] = {"Hindu","Muslim","Sikh","Christian"};
        
        
         religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);// we need to set this right name label in the pane
        add(religion);

        
        
        
        
        JLabel fname  = new JLabel("Category : ");
        fname.setBounds(100,190,200,30);
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        add(fname);
        String valCategory[] = {"GENERAL","OBC","SC/ST","OTHER"};

         category = new JComboBox(valCategory);
        category.setBounds(300,190,400,30);// we need to set this right name label in the pane
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setBounds(100,240,200,30);
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        add(dob);
        
        String valIncome[] = {"NULL","<1,50,000","<2,50,000","<5,00,000","UPTO 10,00,000","10,00,000" };
         income = new JComboBox(valIncome);
    	income.setBounds(300, 240, 400, 30);
    	add(income); 


        JLabel gender = new JLabel("Educational");
        gender.setBounds(100,290,200,30);
        gender.setFont(new Font("Raleway",Font.BOLD,20));
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setBounds(100,315,200,30);
        email.setFont(new Font("Raleway",Font.BOLD,20));
        add(email);
        
        String eQ[] = {"Non-Graduate","Graduate","Post-Graduate","Ph.D","Doctrate"};
        
         education = new JComboBox(eQ);
        education.setFont(new Font("Raleway",Font.PLAIN,18));
        education.setBounds(300,320,400,30);// we need to set this right name label in the pane
        add(education);

        JLabel marital = new JLabel("Occupation");
        marital.setBounds(100,390,200,30);
        marital.setFont(new Font("Raleway",Font.BOLD,20));
        add(marital);

        String occupationVal[] = {"Salaried","Self-Employed","Business","Student","Retired","Others",};
        
         occupation = new JComboBox(occupationVal);
        occupation.setFont(new Font("Raleway",Font.PLAIN,18));
        occupation.setBounds(300,390,400,30);// we need to set this right name label in the pane
        add(occupation);
        


        JLabel address = new JLabel("PAN Number:");
        address.setBounds(100,440,200,30);
        address.setFont(new Font("Raleway",Font.BOLD,20));
        add(address);

         pan = new JTextField();
         pan.setFont(new Font("Raleway",Font.BOLD,20));
         pan.setBounds(300,440,400,30);
        // we need to set this right name label in the pane
        add(pan);

        JLabel city = new JLabel("Aadhar:");
        city.setBounds(100,490,200,30);
        city.setFont(new Font("Raleway",Font.BOLD,20));
        add(city);

         aadhar = new JTextField();
         aadhar.setFont(new Font("Raleway",Font.BOLD,20));
         aadhar.setBounds(300,490,400,30);
        // we need to set this right name label in the pane
        add(aadhar);

        JLabel state = new JLabel("Senior Citizer:");
        state.setBounds(100,540,200,30);
        state.setFont(new Font("Raleway",Font.BOLD,20));
        add(state);
        
        
        
        syes = new JRadioButton("Yes");
        syes.setFont(new Font("Raleway",Font.BOLD,20));
        syes.setBounds(300,540,100,30);
        syes.setBackground(Color.WHITE);
        // we need to set this right name label in the pane
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setFont(new Font("Raleway",Font.BOLD,20));
        sno.setBackground(Color.WHITE);
        sno.setBounds(450,540,100,30);
        // we need to set this right name label in the pane
        add(sno);
        
        ButtonGroup s = new ButtonGroup();
        s.add(syes);
        s.add(sno);
        
        

        JLabel pincode = new JLabel("Existing Account : ");
        pincode.setBounds(100,590,200,30);
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        add(pincode);
        
        eyes = new JRadioButton("Yes");
        eyes.setFont(new Font("Raleway",Font.BOLD,20));
        eyes.setBounds(300,590,100,30);
        eyes.setBackground(Color.WHITE);
        // we need to set this right name label in the pane
        add(eyes);
        
        eno = new JRadioButton("No");
        eno.setFont(new Font("Raleway",Font.BOLD,20));
        eno.setBounds(450,590,100,30);
        eno.setBackground(Color.WHITE);
        // we need to set this right name label in the pane
        add(eno);
        
        ButtonGroup e = new ButtonGroup();
        e.add(eyes);
        e.add(eno);
        
        

         next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
   
        setTitle("NEW APPLICATION FORM PAGE - 2");
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
//    	String formno;
    	String sreligion = (String)religion.getSelectedItem();
    	String soccupation = (String)occupation.getSelectedItem();
    	String seducation = (String)education.getSelectedItem();
    	String sincome = (String)income.getSelectedItem();
    	String scategory = (String)category.getSelectedItem();
    	
    	String seniorCitizen = null;

        if(syes.isSelected()){
            seniorCitizen="Yes";
        }
        else if(sno.isSelected()){
        	seniorCitizen="No";
        }
        String existingAccount = null;
        if(eyes.isSelected()){
        	existingAccount = "Yes";
        }
        else if(eno.isSelected()){
        	existingAccount = "No";
        }

        String saadhar = aadhar.getText();
        String span = pan.getText();

        try {
            	Conn c = new Conn();
            	String query =  "insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorCitizen+"','"+existingAccount+"')";
            	c.s.executeUpdate(query);
            	setVisible(false);
            	new SignupThree(formno).setVisible(true);
            	
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
