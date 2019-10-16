/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author yunus
 */
public class ConnectToDB {
    private static Connection con;
    public static Connection getCon() throws ClassNotFoundException, SQLException
    {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl = "jdbc:sqlserver://Toshuiba-PC;" +
        "databaseName=carRental;user=yuntek;password=3604;";
        con = DriverManager.getConnection(connectionUrl);
        return con;
    }
    public String write(String sqlQuerey)// throws ClassNotFoundException, SQLException
    {
System.out.println(sqlQuerey);
        PreparedStatement pstmt;
        String str = null;
        try {
            Connection con = getCon();
            System.out.println(sqlQuerey);
            pstmt = con.prepareStatement(sqlQuerey);
            pstmt.executeUpdate();
            str = "Operation Succesful!";
        } catch (ClassNotFoundException classNotFoundException) {
        } catch (SQLException sQLException) {
        }
        return str;
    }
    
    public ResultSet read(String sqlQuery) //throws ClassNotFoundException, SQLException
    {
        System.out.println(sqlQuery);
        ResultSet result=null;
        try {
            Connection con = getCon();
            System.out.println(sqlQuery);
            Statement st = con.createStatement();
            System.out.println(sqlQuery);
            result = st.executeQuery(sqlQuery);
            System.out.println("Search successful");            
        } catch (ClassNotFoundException | SQLException classNotFoundException) {
            System.out.println("Class not found exception, Search error");
        }
         return result;
         
    }
}
