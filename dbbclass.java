/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staffff;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author Mahela Wijekoon
 */
public class dbbclass {
    
    static private Connection  connection;

    public static Connection getConnection() throws Exception{
        if(connection == null){
            //JDBC
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
        }
        return connection;
    }
    
}
