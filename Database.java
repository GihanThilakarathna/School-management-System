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
 * @author Ishara Fernando
 */
public class Database {
    public static Connection connect()
    {
        Connection c = null;
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        return c;
    }
    
}
