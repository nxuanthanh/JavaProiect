package Car;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class KetNoiSQL {

    private Connection con = null;

    public KetNoiSQL() {
        String url = "net.sourceforge.jtds.jdbc.Driver";
        try {
            Class.forName(url);
            String dbUrl = "jdbc:jtds:sqlserver://DESKTOP-66GCCFH:1433/SQLEXPRESS";
            con = DriverManager.getConnection(dbUrl);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet GetResultSet(String Xe) throws SQLException {
        ResultSet rs = null;
        Statement stmt = con.createStatement();
        String sql = "select * from " + Xe;
        rs = stmt.executeQuery(sql);
        return rs;
    }

    public void Close() throws Exception {
        con.close();
    }

    public static void main(String[] args) {
        KetNoiSQL kn = new KetNoiSQL();
        try {
            ResultSet rs = kn.GetResultSet("Xe");//Table Name
            while (rs.next()) {
                System.out.println(rs.getString("Hangxe"));//Field Name
            }
            kn.Close();
        } catch (SQLException ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(KetNoiSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
