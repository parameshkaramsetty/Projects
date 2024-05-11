
import java.sql.*;
public class Conn {

    // register the driver
    // create connection 
    // create statement
    //execute query
    // close the connection
	Connection c ;
    Statement s;
    public Conn() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","1234");
            s = c.createStatement();
            
            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
    public static void main(String[] args){
        new Conn();
    }

}