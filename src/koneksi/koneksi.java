package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class koneksi {
    public Connection con;
    public Statement stm; 

    public static Connection config() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/coffeshopjava", "root", "");
            return con;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "koneksi gagal " + e.getMessage());
            return null;
        }
        
    }
}
