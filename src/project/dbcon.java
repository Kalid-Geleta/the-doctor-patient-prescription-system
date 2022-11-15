package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class dbcon {
    public static  ResultSet dbmethod( String sql, String c) {
        ResultSet rs = null;
        int row;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql:// localhost:3306/pharma", "root", "");
            Statement stmt = conn.createStatement();
            if (c.equals("iu")) {
                row=stmt.executeUpdate(sql);
                System.out.println(row);
                System.out.println("inserted/updated");
                rs=null;

            } else if (c.equals("get")) {
                rs = stmt.executeQuery(sql);


            }

        } catch (Exception ex) {
            System.out.println(ex);
        }

        return rs;
    }

}
