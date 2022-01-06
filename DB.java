package staffff;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class DB {
    static  Connection c;
    public  static Connection con() throws Exception{
    if(c==null){
        Class.forName("com.mysql.jdbc.Driver");
        c = DriverManager.getConnection("jdbc:mysql://localhost:3306/s_m_s_01","dumindu","123");
        }
    return  c;
    
    
    }
    //put data
    public  void putdata(String sql) throws Exception{
       Statement s = con().createStatement();
       s.execute(sql);
       
       
       
    }
    //Get data
    public ResultSet getdata(String sql) throws Exception{
        Statement s = con().createStatement();
        ResultSet rs = s.executeQuery(sql);
        return  rs;
    }

    
    
}
    


