package magicbill;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ActionDao {

    public static Connection getDBConnection() {
//    String url = "jdbc:derby://localhost:1527/MagicBill";
        String url = "jdbc:derby:./MagicBill";
        String userid = "magicbill";
        String password = "magicbill";
        Connection con = null;
        try {
            //GENERATED ALWAYS AS IDENTITY (START WITH 1,INCREMENT BY 1)
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            con = DriverManager.getConnection(url, userid, password);
        } catch (SQLException ex) {
            Logger.getLogger(ActionDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ActionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
