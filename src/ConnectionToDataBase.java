import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

class conn
{
    public static Connection con()
    {
        Properties connectionProps = new Properties();
        connectionProps.put("user", "root");
        connectionProps.put("password", "dbms@M2021");
        
        try 
        {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Javaproject",connectionProps);

           return con;
        } 
        
        catch (SQLException e) 
        {
            e.printStackTrace();
        }
        
        return null;
    }
}
