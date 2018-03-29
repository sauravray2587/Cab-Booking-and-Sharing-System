/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal.cab.booking;

// STEP 1: Import required packages
import java.sql.*;
import java.util.*;

public class Tester {
// JDBC driver name and database URL
static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
static final String DB_URL = "jdbc:mysql://localhost:3306/FinalCabBooking";

// Database credentials
static final String USER = "root";
static final String PASS = "root";

public static void main(String[] args) {
    Connection conn = null;
    Statement stmt = null;
     try{
            Class.forName("com.mysql.jdbc.Driver");
            //Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/AMS","root","12321123.");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "INSERT INTO CustomerDetails (Name, EmailID, MobileNumber, AadharCardNumber, Age )" +
        "VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pst;
            pst = conn.prepareStatement(sql);
            pst.setString(1,"Saurav");
            pst.setString(2,"s@gmail.com");
            pst.setString(3,"888888888");
            pst.executeUpdate(); 
            
        }
        catch(ClassNotFoundException | SQLException e){
            System.out.print(e);
            
        }
     
     
}

}
