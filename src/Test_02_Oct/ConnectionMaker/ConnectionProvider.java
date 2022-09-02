package Test_02_Oct.ConnectionMaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static Test_02_Oct.ConnectionMaker.ConnectionNeeds.*;

public class ConnectionProvider {
   public static Connection connection;
    private ConnectionProvider(){

    }
    public static Connection connectionProvider() throws SQLException {
        if(connection == null) {
            connection = DriverManager.getConnection(url,user,password);
        }
        return connection;
    }
}
